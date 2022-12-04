package Calcolatrice;

import javax.swing.*;
import java.awt.*;


public class Frame extends JFrame {

    private JTextField textField;

    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button0;
    private JButton buttonAdd;
    private JButton buttonSub;
    private JButton buttonMul;
    private JButton buttonDiv;
    private JButton buttonTot;
    private JButton buttonDoc;
    private JButton buttonCanc;

    public Frame(){
        this.setLayout(new BorderLayout());
        this.setSize(300,500);
        this.setResizable(false);

        //textField = new JTextField();
        //this.add(textField,BorderLayout.NORTH);

        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        button0 = new JButton("0");
        buttonAdd = new JButton("+");
        buttonSub = new JButton("-");
        buttonMul = new JButton("*");
        buttonDiv = new JButton("/");
        buttonTot = new JButton("=");
        buttonDoc = new JButton(".");
        buttonCanc = new JButton("CANC");

        this.add(button7);
        this.add(button8);
        this.add(button9);
        this.add(buttonAdd);

        this.add(button4);
        this.add(button5);
        this.add(button6);
        this.add(buttonSub);

        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(buttonMul);

        this.add(button0);
        //this.add(buttonDoc);
        this.add(buttonCanc);
        this.add(buttonTot);
        this.add(buttonDiv);
    }


}
