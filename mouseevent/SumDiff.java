package mouseevent;
import javax.swing.*;

import java.awt.GridLayout;
import java.awt.event.*;

public class SumDiff extends JFrame implements MouseListener{
    JLabel lblnum1, lblnum2, lblresult;
    JTextField num1txt, num2txt;
    
    SumDiff(){
        setTitle("Sum and Difference");
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3,2));

        lblnum1 = new JLabel("Number 1");
        lblnum2 = new JLabel("Number 2");
        num1txt = new JTextField();
        num2txt = new JTextField();
        lblresult = new JLabel("Result");


        add(lblnum1);
        add(num1txt);
        add(lblnum2);
        add(num2txt);
        add(lblresult);
        addMouseListener(this);
    

        setVisible(true);

        

    }
    public void mouseClicked(MouseEvent e){
        
    }
    public void mousePressed(MouseEvent e){
        int result = Integer.parseInt(num1txt.getText()) +Integer.parseInt(num2txt.getText());
        lblresult.setText("Result " + result);

    }
    public void mouseReleased(MouseEvent e){
        int result = Integer.parseInt(num1txt.getText()) - Integer.parseInt(num2txt.getText());
        lblresult.setText("Result " + result);
    }
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}

    public static void main(String[] args){
        new SumDiff();
    }
}  
