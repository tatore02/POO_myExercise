package Grafica;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Cerchio extends JComponent {
    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        Ellipse2D.Double ellipse = new Ellipse2D.Double(5,5,20,20);
        g2.fill(ellipse);
        g2.draw(ellipse);
    }
}
