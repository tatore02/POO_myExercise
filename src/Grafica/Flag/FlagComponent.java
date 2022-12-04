package Grafica.Flag;

import javax.swing.*;
import java.awt.*;

public class FlagComponent extends JComponent {

    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;

        Flag flag = new Flag(getWidth()/2 - 75,getHeight()/2 - 50);
        flag.draw(g2);
    }
}
