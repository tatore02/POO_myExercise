package Grafica.Car;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class Car {

    private int xLeft;
    private int yTop;
    private final int WIDTH = 60;
    private final int HEIGHT = 30;

    public Car(int x,int y){
        this.xLeft = x;
        this.yTop = y;
    }

    public void draw(Graphics2D g2){
        Rectangle rectangle = new Rectangle(xLeft,yTop+10,60,10);

        Ellipse2D cerchio1 = new Ellipse2D.Double(xLeft+10,yTop+20,10,10);
        Ellipse2D cerchio2 = new Ellipse2D.Double(xLeft+40,yTop+20,10,10);

        Point2D.Double p1 = new Point2D.Double(xLeft+10,yTop+10);
        Point2D.Double p2 = new Point2D.Double(xLeft+20,yTop);
        Point2D.Double p3 = new Point2D.Double(xLeft+40,yTop);
        Point2D.Double p4 = new Point2D.Double(xLeft+50,yTop+10);

        Line2D.Double l1 = new Line2D.Double(p1,p2);
        Line2D.Double l2 = new Line2D.Double(p2,p3);
        Line2D.Double l3 = new Line2D.Double(p3,p4);

        g2.draw(rectangle);
        g2.draw(cerchio1);
        g2.draw(cerchio2);
        g2.draw(l1);
        g2.draw(l2);
        g2.draw(l3);
    }

    public int getWIDHT(){
        return this.WIDTH;
    }

    public int getHEIGHT(){
        return this.HEIGHT;
    }
}
