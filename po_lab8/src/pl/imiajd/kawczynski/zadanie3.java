package pl.imiajd.kawczynski;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class zadanie3 {

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();
        try
        {
            File file = new File("C:\\2022 studia\\PRZEDMIOTY\\PO\\lab\\po_lab8\\src\\pl\\imiajd\\kawczynski\\zad3.txt");
            Scanner s = new Scanner(file);
            while(s.hasNextLine())
            {
                lista.add(s.nextLine());
            }
            s.close();
        }
        catch (FileNotFoundException f)
        {
            System.out.println("Plik nie istnieje");
            f.printStackTrace();
        }

        System.out.println("\nLISTA PRZED POSORTOWANIEM : ");
        System.out.println(lista);

        lista.sort(Comparator.naturalOrder());
        System.out.println("\nLISTA PO SORTOWANIU : ");
        System.out.println(lista);

    }
}
