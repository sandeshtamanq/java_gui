package practice;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class RadioButton extends JFrame implements ActionListener {
    JButton button;
    JCheckBox checkBox;
    JLabel lbl;

    RadioButton(){
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        button = new JButton("Submit");
        checkBox = new JCheckBox();
        lbl = new JLabel();

        checkBox.setText("Iam not robot");

        button.addActionListener(this);
        add(checkBox);
        add(button);
        add(lbl);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            if(checkBox.isSelected()){
                lbl.setText("Congratulations you are not a robot");
            }else{
                lbl.setText("Oh no you are a robot");
            }
            
        }
    }

    public static void main(String[] args){
        new RadioButton();
    }
}
