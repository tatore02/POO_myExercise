package Grafica.Flag;

import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class Flag {

    private int x;
    private int y;
    public int WIDTH = 50;  //di ogni rettangolo non della bandiera
    public int HEIGHT = 100;

    public Flag(int x,int y){
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics2D g2){
        Rectangle r1 = new Rectangle(x,y,WIDTH,HEIGHT);
        Rectangle r2 = new Rectangle(x + WIDTH,y,WIDTH,HEIGHT);
        Rectangle r3 = new Rectangle(x + WIDTH*2,y,WIDTH,HEIGHT);

        Point2D.Double p1 = new Point2D.Double(x,y);
        Point2D.Double p2 = new Point2D.Double(x + WIDTH*3,y);
        Point2D.Double p3 = new Point2D.Double(x + WIDTH*3,y+HEIGHT);
        Point2D.Double p4 = new Point2D.Double(x,y+HEIGHT);

        Line2D.Double l1 = new Line2D.Double(p1,p2);
        Line2D.Double l2 = new Line2D.Double(p2,p3);
        Line2D.Double l3 = new Line2D.Double(p3,p4);
        Line2D.Double l4 = new Line2D.Double(p1,p4);

        g2.draw(r1);
        g2.draw(r2);
        g2.draw(r3);

        g2.setColor(Color.GREEN);
        g2.fill(r1);
        g2.setColor(Color.WHITE);
        g2.fill(r2);
        g2.setColor(Color.RED);
        g2.fill(r3);

        g2.setColor(Color.BLACK);
        g2.draw(l1);
        g2.draw(l2);
        g2.draw(l3);
        g2.draw(l4);
    }
}
