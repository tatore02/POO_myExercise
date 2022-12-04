package es2;

public class Scaleno extends Triangolo{
    private final int a;
    private final int b;
    private int c;

    public Scaleno(int a,int b,int c){
        this.a = a;
        this.b = b;
        this.c = c;

        if(isTriangolo(a,b,c))
            super.computePerimetro(a,b,c);
    }

    @Override
    public int getPerimetro() {
        return super.getPerimetro();
    }
}
