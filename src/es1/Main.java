package es1;

/*
Scrivi un programma che simuli il lancio di un dado e di una moneta stampandone il risultato;
con e senza l'utilizzo di una classe astratta che rappresenti i comportamenti comuni
degli oggetti dado e moneta istanziati.
*/

public class Main {
    public static void main(String[] args) {
        Dado dado = new Dado();
        Moneta moneta = new Moneta();

        dado.lancia();
        moneta.lancia();

        dado.print();
        moneta.print();
    }
}
