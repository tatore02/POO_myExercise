package Grafica.Car;

import Grafica.Car.Car;

import javax.swing.*;
import java.awt.*;

public class CarComponent extends JComponent{
    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;

        Car c1 = new Car(0,getHeight()/2 - 15);

        c1.draw(g2);
    }
}
