package es1;
import java.util.Random;

//1 = testa
//0 = croce

public class Moneta extends Lancio {

    private int a;

    public Moneta(){
        this.a = 1;
    }

    @Override
    public void lancia(){
        Random random = new Random();
        this.a = random.nextInt(1);
    }

    @Override
    public void print(){
        if(a == 1)
            System.out.println("Testa");
        else    System.out.println("Croce");
    }

}
