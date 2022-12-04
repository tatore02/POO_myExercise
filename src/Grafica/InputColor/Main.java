package Grafica.InputColor;

import java.awt.Color;

/*
Generare un quadrato
del colore specificato
dall’utente al centro del frame
 */

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        String input;
        input = JOptionPane.showInputDialog("Red:");
        int red = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Green:");
        int green = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Blue:");
        int blue = Integer.parseInt(input);

        Color color = new Color(red,green,blue);
        RectangleComponent rectangleComponent = new RectangleComponent(color);
        frame.add(rectangleComponent);
        frame.setVisible(true);
    }
}
