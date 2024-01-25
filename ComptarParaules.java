
public class ComptarParaules{
    
    public static void main(String[] args) {
        String texte;
        char lletra;
        int resultat;

        texte = "text de prova";
        lletra = 'w';
        resultat = comptarLletres(texte, lletra);
        System.out.println(" total de " + lletra + " en tenim " + resultat); 

    }

    public static int comptarLletres(String txt, char lletra){
        
        int i, comptar;
        i = 0;
        comptar = 0;
        while (i<txt.length()) {
            if(txt.charAt(i)== lletra) comptar = comptar + 1;
            i = i + 1;
        }
        return comptar;
    }
}