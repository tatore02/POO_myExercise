package Grafica;

import javax.swing.*;
import java.awt.*;

public class Rettangolo extends JComponent {
    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        Rectangle rectangle = new java.awt.Rectangle(5,5,20,20);
        g2.draw(rectangle);
    }
}
