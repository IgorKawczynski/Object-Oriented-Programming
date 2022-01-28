package Zadanie_2_3;

public class START {

    public static void start(){
        System.out.println("""
                 ------PROGRAM DO ZADANIA 2-------
                Dostępne komendy (w {} proszę wpisać dane) :\s
                NOWY {imie} {nazwisko} : aby dodać studenta o podanym imieniu i nazwisku\s
                USUN {indeks} : aby usunąc studenta o podanym indeksie\s
                DODAJ_OCENE {ocena} : aby dodać(zmienić) ocenę studenta o danym indeksie\s
                ZMIEN_OCENE {indeks} {ocena} : aby zmienić ocenę studenta o danym indeksie\s
                POKAZ : aby wyświetlić listę studentów\s
                ZAKONCZ - wychodzi z programu\s
                """);
    }

}
