package local.m5;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        String texte = "HolHH";
        char lletra = 'H';

        Llibre prova = new Llibre();

        int resultat = prova.comptarLletres(texte,lletra);

        System.out.println("Numbre de  " + lletra + " és :" + resultat);

    }


}

