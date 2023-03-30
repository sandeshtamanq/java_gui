package loginform;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ModelQuestion extends JFrame implements ActionListener, KeyListener {
    JTextField uid;
    JLabel lbluid, lblpassword;
    JPasswordField password;
    JButton btnOk;
    JButton btncancel;
    public ModelQuestion(){
        setTitle("Login");
        setSize(1000,200);
        setLayout(new GridLayout(3,2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lbluid = new JLabel("Username");
        uid = new JTextField(10);
        lblpassword = new JLabel("Password");
        password = new JPasswordField();
        btnOk = new JButton("Login");
        btncancel = new JButton("Cancel");

        add(lbluid);
        add(uid);
        add(lblpassword);
        add(password);
        add(btnOk);
        add(btncancel);

        btnOk.addActionListener(this);
        btncancel.addActionListener(this);
        uid.addKeyListener(this);
        password.addKeyListener(this);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btnOk){
            loginUser();
        } else if(e.getSource() == btncancel){
            clearText();
        }
    }

    public void keyPressed(KeyEvent e){
        if(e.getKeyChar() =='l' || e.getKeyChar() == 'L'){
            loginUser();
        }else if(e.getKeyChar() == 'c' || e.getKeyChar() == 'C'){
            clearText();
        }
    }

    public void keyTyped(KeyEvent e){}

    public void keyReleased(KeyEvent e){

    }

    public void loginUser(){
        JOptionPane.showMessageDialog(this, "Logged in successfully!");
    }

    public void clearText(){
        uid.setText("");
        password.setText("");
    }

    public static void main(String[] args){
        new ModelQuestion();
    }
}
