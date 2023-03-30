package practice;


import javax.swing.*;
import java.awt.*;

public class GridBagLayoutExample extends JFrame {

   public GridBagLayoutExample() {
      // Set the layout manager for the frame
    //   setSize(700,500);
      setLayout(new GridBagLayout());
      // Create constraints for the components
      GridBagConstraints constraints = new GridBagConstraints();

      // Add a label to the top row of the grid
      JLabel nameLabel = new JLabel("Name:");
      constraints.gridx = 0;
      constraints.gridy = 0;
      constraints.insets = new Insets(10, 10, 10, 10); // Add some padding
      add(nameLabel, constraints);

      // Add a text field to the top row of the grid
      JTextField nameField = new JTextField();
      constraints.gridx = 1;
      constraints.gridy = 0;
      constraints.fill = GridBagConstraints.HORIZONTAL;
      add(nameField, constraints);

      // Add a label to the second row of the grid
      JLabel addressLabel = new JLabel("Address:");
      constraints.gridx = 0;
      constraints.gridy = 1;
      add(addressLabel, constraints);

      // Add a text area to the second row of the grid
      JTextArea addressArea = new JTextArea(5, 20);
      constraints.gridx = 1;
      constraints.gridy = 1;
      constraints.fill = GridBagConstraints.BOTH;
      add(addressArea, constraints);

      // Add a button to the bottom right corner of the grid
      JButton submitButton = new JButton("Submit");
      constraints.gridx = 1;
      constraints.gridy = 2;
      constraints.anchor = GridBagConstraints.EAST;
      add(submitButton, constraints);

      // Set some properties for the frame
      setTitle("GridBagLayout Example");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      pack();
      setVisible(true);
   }

   public static void main(String[] args) {
      new GridBagLayoutExample();
   }
}