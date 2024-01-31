import local.m5.Llibre;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void test1(){
        /* Exemple de test esperant resultats enters */
        Llibre prova1 = new Llibre();

        // Esperem 1 i el resultat es 1
        int resultat = prova1.comptarLletres("Hola",'H');
        Assertions.assertEquals(1,resultat);

        //Passem directament la funció
        Assertions.assertEquals(2, prova1.comptarLletres("HolHa",'H'));

    }

    @Test
    @DisplayName("Test de Booleans")
    public void test2(){
        /*  Exemple de test esperant retorns booleans */


        Llibre prova2 = new Llibre();
        boolean resultat = prova2.sonIguals("Hola","hola");
        // esperem : false i resultat ??
        Assertions.assertEquals(false,resultat,"Ha funcionat ??");

        // esperem : false
        Assertions.assertFalse(resultat);

        // esperem : true
        // Assertions.assertTrue(resultat);
        //Assertions.fail("Fallo del test");
    }
}
