public class Car {

    public Car(String modello,String marca,int serbatoio,double km_a_l){
        this.modello = modello;
        this.marca = marca;
        this.serbatoio = serbatoio;
        this.km_a_l = km_a_l;
    }

    public double autonomia(){
        return this.serbatoio * this.km_a_l;
    }

    private String modello;
    private String marca;
    private int serbatoio;
    private double km_a_l;
}
