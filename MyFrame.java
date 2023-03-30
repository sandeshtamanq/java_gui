import javax.swing.*;
import java.awt.event.*;
public class MyFrame extends JFrame implements ActionListener{
    JButton button;
    MyFrame(){
        button = new JButton();
        button.setBounds(100,100,200,100);
        button.addActionListener(this);
        button.setText("Click Me!");
        button.setFocusable(false);
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setTitle("Login Form");
        this.add(button);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            System.out.println("Poo");
        }
    }
}