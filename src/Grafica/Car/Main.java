package Grafica.Car;

import Grafica.Cerchio;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("My frame");
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CarComponent carComponent = new CarComponent();
        frame.add(carComponent);

        frame.setVisible(true);
    }
}
