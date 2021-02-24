import java.util.Arrays;

public class Zadanie3 {
    //Napisz program, w ktorym zostanie utworzona 10 elementowa tablica typu boolean.
    //Komorkom o indeksie parzystym przypisz wartosc true, a nieparzystym false.
    //Zero jest parzyste.
    //Tablice wyswietl.
    public static void main(String[] args) {
        boolean[]  tablica = new boolean[10];



         for (int i = 0; i < 10; i++) {

             if (i % 2 == 0)
                 tablica[i]=true;
             else
                 tablica[i]=false;


             System.out.println("element "+ i +"="+ tablica[i]);

         }



        System.out.println("koniec");
    }
}