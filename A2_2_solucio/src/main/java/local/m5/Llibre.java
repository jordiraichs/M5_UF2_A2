package local.m5;

public class Llibre {
    /**
     * Cerca el nobre de lletres indicades en un string
     * @param txt string a cercar les lletres
     * @param lletra char a cercar dins l'string
     * @return int , el nombre de vegades que surt la lletra a l'string.
     */
    public static int comptarLletres(String txt, char lletra){
        int i, comptar;
        i = 0;
        txt = txt.toLowerCase();
        lletra = Character.toLowerCase(lletra);
        comptar = 0;

        while (i<txt.length()) {
            if(txt.charAt(i)== lletra) comptar = comptar + 1;
            i = i + 1;
        }
        return comptar;
    }

    public static boolean sonIguals(String a, String b){
        if(a.equals(b)){
            return true;
        } else {
            return false;
        }
    }

}

