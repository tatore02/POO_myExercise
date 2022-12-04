package Grafica.Flag;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlagComponent flagComponent = new FlagComponent();
        frame.add(flagComponent);

        frame.setVisible(true);
    }
}
