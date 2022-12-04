package Grafica;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My frame");
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Cerchio cerchio = new Cerchio();
        frame.add(cerchio);

        frame.setVisible(true);
    }
}
