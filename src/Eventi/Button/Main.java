package Eventi.Button;

import Eventi.Button.ClickListener;

import java.awt.event.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("Click me!");
        frame.add(button);

        ActionListener listener = new ClickListener();
        button.addActionListener(listener);

        frame.setSize(400,400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
