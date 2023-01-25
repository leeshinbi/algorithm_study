package SERVER;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
 
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
 
public class serverGUI extends JFrame implements ActionListener {
 
    private static final long serialVersionUID = 1L;
    private JTextArea area = new JTextArea(40, 25);
    private JTextField field = new JTextField(25);
    private serverbasic server = new serverbasic();
 
    public serverGUI() throws IOException {
 
        add(area, BorderLayout.CENTER);
        add(field, BorderLayout.SOUTH);
        field.addActionListener(this);
 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setBounds(200, 100, 300, 300);
        setTitle("서버창");
 
        server.setGui(this);
        server.set();
    }
 
    public static void main(String[] args) throws IOException {
        new serverGUI();
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
        String message = "서버 : " + field.getText() + "\n";
        System.out.print(message); 
        server.sendMessage(message);
        field.setText("");
    }
 
    public void appendmessage(String message) {
    	area.append(message);
    }
 
}
