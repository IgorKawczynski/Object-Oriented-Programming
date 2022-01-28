package Zadanie1;
import java.util.PriorityQueue;
import java.util.Scanner;

public class listaZadanTest {

    public static void start(){
        System.out.println("""
                               PROGRAM DO ZADANIA 1 :
                NAPISZ ,,dodaj priorytet opis'', aby dodać kolejne zadanie
                NAPISZ ,,następne'', aby usunąć najbardziej pilne zadanie
                NAPISZ ,,zakoncz'', aby zakończyć program
                """);
    }
    public static String odNowa(){
        System.out.println("WPISZ NOWE POLECENIE: ");
        Scanner nowy = new Scanner(System.in);
        return nowy.nextLine();
    }

    public static void zadanie1() {

        zadaniaKolejka lista_zadan = new zadaniaKolejka();

        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        String wynik = "";

        while(!wynik.equals("zakoncz")) {

            wynik = odNowa();

            switch (wynik) {
                case "dodaj priorytet opis" -> {
                    System.out.println("Wpisz priorytet dodawanego zadania: ");
                    int prioritet = scan1.nextInt();
                    System.out.println("Wpisz opis dodawanego zadania: ");
                    String opiss = scan2.nextLine();
                    lista_zadan.dodaj(prioritet, opiss);
                }
                case "następne" -> {
                    System.out.println("Usuwam zadanie o najmniejszym priorytecie...\n ");
                    lista_zadan.usun();
                }
                case "zakoncz" -> System.out.println("Dziękuję, program kończy swoje działanie.\n ");
                default -> throw new RuntimeException("""
                        PROSZĘ WPISAĆ POPRAWNE POLECENIE, WYBIERZ JEDNO Z PONIŻSZYCH :\s
                        NAPISZ ,,dodaj priorytet opis'', aby dodać kolejne zadanie
                        NAPISZ ,,następne'', aby usunąć najbardziej pilne zadanie
                        NAPISZ ,,zakoncz'', aby zakończyć program
                        """);
            }
        }
        System.out.println("OSTATECZNA POSTAĆ KOLEJKI ZADAŃ TO : \n");
        lista_zadan.wypisz();
    }


    public static void main(String[] args) {

        start();

        zadanie1();

    }
}

//
//    String wynik = scan1.nextLine();
//        while(!wynik.equals("zakoncz")) {
//                if (wynik.equals("dodaj priorytet opis")) {
//                System.out.println("Wpisz priorytet dodawanego zadania: ");
//                int prioritet = scan1.nextInt();
//                System.out.println("Wpisz opis dodawanego zadania: ");
//                String opiss = scan2.nextLine();
//                lista_zadan.dodaj(prioritet, opiss);
//                odNowa(wynik);
//                }
//                if (wynik.equals("następne")) {
//                System.out.println("Usuwam zadanie o najmniejszym priorytecie...\n ");
//                lista_zadan.usun();
//                odNowa(wynik);
//                }
//                else
//                throw new RuntimeException("""
//                    PROSZĘ WPISAĆ POPRAWNE POLECENIE, WYBIERZ JEDNO Z PONIŻSZYCH :\s
//                    NAPISZ ,,dodaj priorytet opis'', aby dodać kolejne zadanie
//                    NAPISZ ,,następne'', aby usunąć najbardziej pilne zadanie
//                    NAPISZ ,,zakoncz'', aby zakończyć program
//                    """);
//                }
//                System.out.println("Dziękuję, program kończy swoje działanie.\n ");
//                lista_zadan.wypisz();
//                }