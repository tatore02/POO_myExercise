import java.util.Scanner;

public class contaPersone {

    public contaPersone(){
        persone = 0;
    }

    public void add(){
        this.persone++;
    }

    public void reset(){
        this.persone = 0;
    }

    public int getPersone(){
        return this.persone;
    }

    private int persone;
}

class a{
    public static void main(String args[]){
        contaPersone count = new contaPersone();

        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Inserire comando: ");
            int n = scanner.nextInt();
            if(n == 1)
                count.add();
            else if(n == 0)
                count.reset();
            else {
                System.out.println("Numero persone " + count.getPersone());
                break;
            }
        }
    }
}
