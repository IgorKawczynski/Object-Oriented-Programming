package Z3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class fileSort {

    public static void main(String[] args){

        //należy podać przykładowy katalog :
        File plik = new File("C://2022 studia//PRZEDMIOTY//PO//lab");

        File[] pliki = plik.listFiles();

        if(pliki == null) {
            System.out.println("\n Błędna ścieżka do pliku. Proszę podać odpowiednią ścieżkę do pliku !");
            System.exit(1);
        }


        System.out.println("\nWSZYSTKIE KATALOGI I PLIKI W PODANYM FOLDERZE:");
        System.out.println(Arrays.toString(pliki));


        Comparator<File> odKatalogu = Comparator.comparing(File::isDirectory);
        Comparator<File> odPliku = Comparator.comparing(File::isFile);
//        Comparator<File> odNazwy = Comparator.comparing(File::getName);


        ArrayList<File> posortowane_pliki = Arrays.stream(pliki).collect(Collectors.toCollection(ArrayList::new));
        System.out.println("\nWSZYSTKIE KATALOGI I PLIKI W PODANYM FOLDERZE POSORTOWANE " +
                "(wg. tego, czy są katalogiem, następnie czy są plikiem, a ostatenicze są" +
                " posortowane według nazwy w podanej grupie:");


        posortowane_pliki.sort(odKatalogu.thenComparing(odPliku).reversed());
        System.out.println(posortowane_pliki);


        //        dla tablicy [] :
        //        ArrayList<File> posortowane_pliki = Arrays.stream(pliki).sorted(Comparator.comparing(File::isDirectory).thenComparing(File::isFile).thenComparing(File::getName)).collect(Collectors.toCollection(ArrayList::new));
        //        System.out.println("WSZYSTKIE KATALOGI I PLIKI W PODANYM FOLDERZE POSORTOWANE (wg. tego, czy są katalogiem, następnie czy są plikiem, a ostatenicze są posortowane według nazwy w podanej grupie");
        //        System.out.println(posortowane_pliki);

    }
}
