package Eventi.Interaction;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

public class Main{
    static int count = 0;
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(3);

        JPanel panel = new JPanel();
        frame.add(panel);

        JLabel labelInfo = new JLabel("Aggiungi:");
        panel.add(labelInfo);

        JTextField textField = new JTextField(8);
        panel.add(textField);

        JButton button = new JButton("ADD");
        panel.add(button);

        JLabel label = new JLabel("Count: " + getCount());
        panel.add(label);

        class addCountClick implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e) {
                int adder = Integer.parseInt(textField.getText());
                addCount2(adder);
                label.setText("Count: " + getCount());
            }
        }
        ActionListener listener = new addCountClick();
        button.addActionListener(listener);

        frame.setVisible(true);
    }

    public static int getCount(){
        return count;
    }

    public static void addCount(){
        count++;
    }

    public static void addCount2(int adder){
        count += adder;
    }
}
