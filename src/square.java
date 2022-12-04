/*Scrivere un programma che inizializzi una variabile square con un rettangolo il cui
angolo superiore sinistro abbia coordinate (10,20) ed i cui lati abbiano lunghezza 40.
Sostituire poi il contenuto di square con un rettangolo avente le stesse dimensioni
ma angolo superiore sinistro posizionato nel punto (20,20).
*/
import java.awt.*;

public class square {
    public static void main(String[] args) {
        Rectangle square = new Rectangle(10,20,40,40);
        System.out.println(square);
        int newX = 20;
        int newY = 20;
        square.translate(newX - square.x,newY - square.y);
        System.out.println(square);
    }
}