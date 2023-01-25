package CLIENT;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
 
public class clientbasic {
 
    private Socket socket;
    private DataInputStream input;
    private DataOutputStream output;
    private clientGUI gui;
    private String message;
    private String studentID;
 
    public final void setGui(clientGUI gui) {
        this.gui = gui;
    }
 
    public void connect() {
        try {
            socket = new Socket("127.0.0.1", 7777); 
            System.out.println("서버가 연결되었습니다!");
 
            output = new DataOutputStream(socket.getOutputStream());
            input = new DataInputStream(socket.getInputStream());
 
            output.writeUTF(studentID); 
            System.out.println("유저 : 메시지 전송완료!");
            while (input != null) {
            	message = input.readUTF();
                gui.appendmessage(message);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
    public static void main(String[] args) {
    	clientbasic Clientbasic = new clientbasic();
    	Clientbasic.connect();
    }
 
    public void sendMessage(String message2) {
        try {
            output.writeUTF(message2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
    public void setstudentID(String studentID) {
        this.studentID = studentID;
    }
 
}
