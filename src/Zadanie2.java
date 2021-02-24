import java.util.Arrays;

public class Zadanie2 {

    //Napisz program, w ktorym zostanie utworzona 10-elementowa tablica liczb typu int.
    //Za pomoca petli for uzupelnij tablice wartosciami od 101 do 110. Wyswietl tablice.
    public static void main(String[] args) {
        int[] numbers = new int[10];

        for (int i = 0; i<10; i++) {

            numbers [i] = 101 + i;

            System.out.println("element "+ i +"="+ numbers[i]);
        }
    }
}
