package es2;

public class Isoscele extends Triangolo{

    private int a;
    private int b;

    public Isoscele(int a, int b){
        this.a = a;
        this.b = b;

        if(isTriangolo(a,b,b))
            super.computePerimetro(a,b,b);
    }

    @Override
    public int getPerimetro() {
        return super.getPerimetro();
    }
}
