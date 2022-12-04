package Eventi.Rectangle;

import java.awt.Rectangle;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class RectangleComponent extends JComponent {

    private Rectangle rectangle;

    public RectangleComponent(){
        Rectangle rectangle = new Rectangle(100,100,20,20);
        this.rectangle = rectangle;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(rectangle);
    }

    public void moveTo(int x,int y){
        rectangle.setLocation(x,y);
        repaint();
    }

    //fare un main
}
