package Zadanie_2_3;
import java.util.Scanner;

public class Zadanie2_Test {

    public static void main(String[] args) {

        START.start();

        Scanner scan1 = new Scanner(System.in);
        Student_List lista_studentow = new Student_List();
        String input = "";
        while (!input.equals("koniec")) {
            System.out.print("Wpisz komende: ");
            input = scan1.nextLine();
            String[] inputArr = input.split(" "); // wykorzystanie tablicy do wypisania komendy,a nastepnie danych
            switch (inputArr[0]) {
                case "NOWY" -> lista_studentow.dodaj_student(inputArr[1], inputArr[2]);
                case "USUN" -> lista_studentow.usun_student(Integer.parseInt(inputArr[1]));
                case "DODAJ_OCENE" -> lista_studentow.dodaj_ocena(Integer.parseInt(inputArr[1]), inputArr[2]);
                case "ZMIEN_OCENE" -> lista_studentow.zmien_ocena(Integer.parseInt(inputArr[1]), inputArr[2]);
                case "POKAZ" -> lista_studentow.wyswietl();
                case "ZAKONCZ" -> input = "koniec";
                default -> {
                    System.out.println("Niepoprawna komenda!");
                    System.out.println("""
                            Dostępne komendy (w {} proszę wpisać dane):
                                                        
                            NOWY {imie} {nazwisko} : aby dodać studenta o podanym imieniu i nazwisku
                            USUN {indeks} : aby usunąc studenta o danym indeksie
                            DODAJ_OCENE {indeks} {ocena} : aby dodać(zmienić) ocenę studenta o danym indeksie
                            ZMIEN_OCENE {indeks} {ocena} : aby zmienić ocenę studenta o danym indeksie
                            POKAZ : aby wyświetlić listę studentów
                            ZAKONCZ - wychodzi z programu
                            """);
                }
            }
        }
    }
}
