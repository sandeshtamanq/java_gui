package practice;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleInterest extends JFrame implements ActionListener {
    
    JLabel lblprincipal, lblrate, lbltime, lblresult;
    JTextField principal,rate,time;
    JButton btnSubmit;

    SimpleInterest(){
        // setSize(500,300);
        setTitle("Simple Interest");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4,2));
        
        lblprincipal = new JLabel("Principal");
        lblrate = new JLabel("Rate");
        lbltime = new JLabel("Time");
        lblresult = new JLabel("Result");
        principal = new JTextField();
        rate = new JTextField();
        time = new JTextField();
        btnSubmit = new JButton("Calculate");
        
        add(lblprincipal);
        add(principal);
        add(lbltime);
        add(time);
        add(lblrate);
        add(rate);
        add(btnSubmit);
        add(lblresult);
        btnSubmit.addActionListener(this);
        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btnSubmit){
            int p = Integer.parseInt(principal.getText());
            int t = Integer.parseInt(time.getText());
            int r = Integer.parseInt(rate.getText());

            int i = (p*t*r)/100;

            lblresult.setText("Result " + i);
        }
    }

    public static void main(String[] args){
        new SimpleInterest();
    }
}
