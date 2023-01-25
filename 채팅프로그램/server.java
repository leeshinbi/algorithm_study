package SERVER;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
 
public class serverbasic {
 
    private ServerSocket serverSocket;
    private Socket socket;
    private serverGUI gui;
    private String message;
 
    
    private Map<String, DataOutputStream> information = new HashMap<String, DataOutputStream>();
 
    public final void setGui(serverGUI gui) { 
        this.gui = gui;
    }
 
    public void set() throws IOException {
        Collections.synchronizedMap(information); 
        
        serverSocket = new ServerSocket(7777); 
        while (true) { 
            System.out.println("서버를 기다리는 중!");
            socket = serverSocket.accept(); 
            System.out.println(socket.getInetAddress() + "에서 접속했습니다. \n");
            Receiver receiver = new Receiver(socket); 
            receiver.start();
        }
    }
 
    public static void main(String[] args) throws IOException {
    	serverbasic ServerBasic = new serverbasic();
    	ServerBasic.set();
    }
 
 
    public void inClient(String id, DataOutputStream output) throws IOException { 
        sendMessage(id + "님이 접속했습니다. \n"); 
        information.put(id, output);
    }
  
    public void outClient(String id) { 
        sendMessage(id + "님이 나갔습니다. \n");
        information.remove(id);  
    }
 
    
    public void sendMessage(String message) {
        Iterator<String> st = information.keySet().iterator();
        String key = "";
        while (st.hasNext()) {
            key = st.next();
            try {
            	information.get(key).writeUTF(message);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
 
    class Receiver extends Thread {
        private DataInputStream input;
        private DataOutputStream output;
        private String id;
 
        public Receiver(Socket socket) throws IOException {
            output = new DataOutputStream(socket.getOutputStream()); 
            input = new DataInputStream(socket.getInputStream());
            id = input.readUTF();
            inClient(id, output);
        }
 
        public void run() {
            try {
                while (input != null) {
                	message = input.readUTF();
                    sendMessage(message);
                    gui.appendmessage(message);
                }
            } catch (IOException e) {
            	
                outClient(id);
            }
        }
    }
}
