package CLIENT;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;
 
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
 
public class clientGUI extends JFrame implements ActionListener {
 
    private static final long serialVersionUID = 1L;
    private JTextArea area = new JTextArea(40, 25);
    private JTextField field = new JTextField(25);
    private clientbasic client = new clientbasic();
    private static String ID;
 
    public clientGUI() {
 
        add(area, BorderLayout.CENTER);
        add(field, BorderLayout.SOUTH);
        field.addActionListener(this);
 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setBounds(700, 100, 300, 300);
        setTitle("유저창"); 
 
        client.setGui(this);
        client.setstudentID(ID);
        client.connect();
    }
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("당신의 학번을 입력해주세요: ");
        ID = scanner.nextLine();
        scanner.close();
 
        new clientGUI();
 
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
        String message = ID + ":" + field.getText() + "\n"; 
        client.sendMessage(message); 
        field.setText("");
    }
 
    public void appendmessage(String message) {
        area.append(message);
    }
 
}
