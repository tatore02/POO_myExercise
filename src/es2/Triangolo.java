package es2;

public class Triangolo {

    private int perimetro = 0;

    public boolean isTriangolo(int a,int b,int c){
        if(((a+b) > c) && ((a+c) > b) && ((b+c) > a))
            return true;
        else return false;
    }

    public void computePerimetro(int a,int b,int c){
        this.perimetro = a+b+c;
    }

    public int getPerimetro(){
        return this.perimetro;
    }
}
