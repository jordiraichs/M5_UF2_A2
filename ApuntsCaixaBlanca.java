
public class ApuntsCaixaBlanca{
    
    public static void main(String[] args) {

      System.out.println(comptarLletres("AHola a totsa", 'a'));

    }

    public static int comptarLletres(String text, char lletra){
        
        int n = 0;
        int comptar = 0;
        int longitud = text.length();

        if(longitud > 0){
            do{
                if (lletra == text.charAt(n)){
                    comptar ++;
                }
                n++;
                longitud --;
            } while(longitud>0);
        }
        return comptar;
    }
}