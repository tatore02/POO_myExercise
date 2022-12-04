package es1;
import java.util.Random;

public class Dado extends Lancio {

    private int n;

    public Dado(){
        this.n = 0;
    }

    @Override
    public void lancia() {
        Random random = new Random();
        this.n = random.nextInt(1,7);
    }

    @Override
    public void print(){
        System.out.println(n);
    }

}
