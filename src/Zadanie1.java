import java.util.Arrays;

public class Zadanie1 {
    public static void main(String[] args) {
        //Utworz 15 elementowa tablice typu int wypelniona wlasnymi wartosciami z przedzialu od 0 do 5
        //Oblicz ilosc wystapien dla poszczegolnych liczb
        //Wyswietl uzyskane wyniki
        int[] tablica = new int[]
                {
                        1, 2, 1, 1, 1,
                        1, 2, 3, 1, 0,
                        1, 2, 1, 1, 0
                };

        int licznik0 = 0;
        int licznik1 = 0 ;
        int licznik2 = 0 ;
        int licznik3 = 0 ;
        int licznik4 = 0 ;
        int licznik5 = 0;

        for (int i = 0; i < 15; i++) {


            switch (tablica[i]) {
                case 0:
                    licznik0++;
                    break;
                case 1:
                    licznik1++;
                    break;
                case 2:
                    licznik2++;
                    break;
                case 3:
                    licznik3++;
                    break;
                case 4:
                    licznik4++;
                    break;
                case 5:
                    licznik5++;
                    break;

            }//switch

        }//for


        System.out.println("licznik 0 = " + licznik0);
        System.out.println("licznik 1 = " + licznik1);
        System.out.println("licznik 2 = " + licznik2);
        System.out.println("licznik 3 = " + licznik3);
        System.out.println("licznik 4 = " + licznik4);
        System.out.println("licznik 5 = " + licznik5);
        int tester = licznik0 + licznik1 + licznik2 + licznik3 + licznik4 + licznik5;
        System.out.println("Suma licznikow =" + tester );


    } //main

}