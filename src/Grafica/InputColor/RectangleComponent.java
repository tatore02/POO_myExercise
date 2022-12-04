package Grafica.InputColor;

import javax.swing.*;
import java.awt.*;

public class RectangleComponent extends JComponent {

    private Color color;

    public RectangleComponent(Color color){
        this.color = color;
    }

    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(color);

        Rectangle rectangle = new Rectangle(getWidth()/2 - 50,getHeight()/2 - 50,100,100);
        g2.fill(rectangle);
    }
}
