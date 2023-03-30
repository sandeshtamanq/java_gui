package loginform;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginForm extends JFrame implements ActionListener, KeyListener {
    private JLabel lblUserId, lblPassword;
    private JTextField txtUserId;
    private JPasswordField txtPassword;
    private JButton btnOK, btnCancel;

    public LoginForm() {
        super("Login Form");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));
        
        lblUserId = new JLabel("User Id:");
        lblPassword = new JLabel("Password:");
        txtUserId = new JTextField(10);
        txtPassword = new JPasswordField(10);
        btnOK = new JButton("OK");
        btnCancel = new JButton("Cancel");

        add(lblUserId);
        add(txtUserId);
        add(lblPassword);
        add(txtPassword);
        add(btnOK);
        add(btnCancel);

        btnOK.addActionListener(this);
        btnCancel.addActionListener(this);
        txtUserId.addKeyListener(this);
        txtPassword.addKeyListener(this);
        
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnOK) {
            performLogin();
        } else if (e.getSource() == btnCancel) {
            clearFields();
        }
    }

    public void keyTyped(KeyEvent e) {}

    public void keyPressed(KeyEvent e) {
        if (e.getKeyChar() == 'l' || e.getKeyChar() == 'L') {
            performLogin();
        } else if (e.getKeyChar() == 'c' || e.getKeyChar() == 'C') {
            clearFields();
            txtUserId.requestFocus();
        }
    }

    public void keyReleased(KeyEvent e) {}

    private void performLogin() {
        // TODO: Check if the user ID and password are correct in the database
        JOptionPane.showMessageDialog(this, "Logged in successfully!");
    }

    private void clearFields() {
        txtUserId.setText("");
        txtPassword.setText("");
    }

    public static void main(String[] args) {
        new LoginForm();
    }
}