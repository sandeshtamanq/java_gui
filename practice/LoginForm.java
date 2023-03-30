package practice;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class LoginForm extends JFrame implements ActionListener, KeyListener {
    JLabel lblnum1, lblnum2, lblresult;
    JTextField number1, number2;
    JButton btnproduct;

    LoginForm(){
        setSize(500,500);
        setTitle("Login Form");
        setLayout(new GridLayout(3,2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lblnum1 = new JLabel("Number1:");
        lblnum2 = new JLabel("Number2:");
        number1 = new JTextField();
        number2 = new JTextField();
        btnproduct = new JButton("Product");
        lblresult = new JLabel("Result:");

        add(lblnum1);
        add(number1);
        add(lblnum2);
        add(number2);
        add(btnproduct);
        add(lblresult);
        btnproduct.addActionListener(this);
        number1.addKeyListener(this);
        number2.addKeyListener(this);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btnproduct){
            int num1 = Integer.parseInt(number1.getText());
            int num2 = Integer.parseInt(number2.getText());
            int product = num1 * num2;
            lblresult.setText("Result:" + product);

        }
    }

    @Override
    public void keyPressed(KeyEvent e){
        if(e.getKeyChar() == 'm'){
            int num1 = Integer.parseInt(number1.getText());
            int num2 = Integer.parseInt(number2.getText());
            int product = num1 * num2;
            lblresult.setText("Result:" + product);
        }   
        else if(e.getKeyChar() == 'c'){
            number1.setText("");
            number2.setText("");
            number1.requestFocus();

        }
    }

    @Override
    public void keyReleased(KeyEvent e){
        
    }

    @Override
    public void keyTyped(KeyEvent e){
        
    }

    public static void main(String[] args){
        new LoginForm();
    }
}
