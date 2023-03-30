package loginform;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login {
    public static void main(String[] args){
        // new MyFrame();
        new KeyFrames();
    }
}

class MyFrame extends JFrame implements ActionListener{
    JButton submit;
    JLabel label;
    JTextField userText;
    MyFrame(){
        JLabel user = new JLabel();
        user.setText("Username");
        this.add(user);

        userText = new JTextField(40);
        this.add(userText);

        JLabel password = new JLabel();
        password.setText("Password");
        this.add(password);
        JPasswordField userPassword = new JPasswordField(40);
        this.add(userPassword);

        submit = new JButton("Submit");
        submit.addActionListener(this);
        this.add(submit);
        label = new JLabel();
        label.setVisible(false);
        this.add(label);
        this.setSize(550,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == submit){
            label.setText(userText.getText());
            label.setVisible(true);
            System.out.println(userText.getText());
        }
    }
}

class KeyFrames extends JFrame implements KeyListener{

    KeyFrames(){
        JTextField userId = new JTextField();
        userId.setPreferredSize(new Dimension(450,30));
        this.add(userId);
        JTextField userPassword = new JPasswordField();
        userPassword.setPreferredSize(new Dimension(450,30));
        this.add(userPassword);
        this.setSize(500,700);
        this.addKeyListener(this);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    @Override
    public void keyTyped(KeyEvent e){
        // if(e.getKeyChar() == 'I'){
        //     System.out.println("Hello");
        // }
    }

    @Override
    public void keyPressed(KeyEvent e){
        if(e.getKeyChar() == 'l'){
            System.out.println("Hello");
        }
        
    }

    @Override
    public void keyReleased(KeyEvent e){
            System.out.print(e.getKeyChar());
    }

}
