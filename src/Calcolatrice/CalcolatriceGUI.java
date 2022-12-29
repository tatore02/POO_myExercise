package Calcolatrice;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CalcolatriceGUI extends JFrame{
    private JTextArea textArea;
    private JButton zero;
    private JButton one;
    private JButton two;
    private JButton three;
    private JButton four;
    private JButton five;
    private JButton six;
    private JButton seven;
    private JButton eight;
    private JButton nine;
    private JButton c;
    private JButton canc;
    private JButton coma;
    private JButton plus;
    private JButton sub;
    private JButton product;
    private JButton divide;
    private JButton equal;
    private JPanel myPanel;

    private FileWriter tmpW = new FileWriter("tmp.txt");
    private FileReader tmpR = new FileReader("tmp.txt");

    public CalcolatriceGUI() throws IOException {
        this.setContentPane(myPanel);
        this.setSize(400,500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //INIZIO: numeri input
        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("0");
            }
        });
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("1");
            }
        });
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("2");
            }
        });
        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("3");
            }
        });
        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("4");
            }
        });
        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("5");
            }
        });
        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("6");
            }
        });
        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("7");
            }
        });
        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("8");
            }
        });
        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("9");
            }
        });
        //FINE: numeri input

        //Cancella un carattere
        c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tmp = textArea.getText();
                tmp = tmp.substring(0,tmp.length()-1);
                textArea.setText(tmp);
            }
        });

        //addizione
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    tmpW.write(textArea.getText() + "+");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        //uguale
        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
    }

    public static void main(String[] args) throws IOException {
        JFrame frame = new CalcolatriceGUI();
        frame.setVisible(true);
    }
}
