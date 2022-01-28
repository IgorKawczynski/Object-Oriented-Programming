// Program wykorzystujący zbiór typu HashSet
// w celu pokazania wszystkich słów odczytanych z pliku o rozszerzeniu TXT

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WordsInHashSetDemo
{
    public static void main(String[] args) throws FileNotFoundException {

        // Klasa HashSet implementuje interfejs Set
        Set<String> words = new HashSet<>();
        long totalTime = 0;

        File file1 = new File("alice30.txt");
        Scanner in = new Scanner(file1);
        while (in.hasNext()) {
            String word = in.next();
            long callTime = System.currentTimeMillis();
            words.add(word);
            callTime = System.currentTimeMillis() - callTime;
            totalTime += callTime;
        }

        Iterator<String> iter = words.iterator();
        for (int j = 1; j <= 20; ++j) {
            System.out.println(iter.next());
        }

        System.out.println(". . .\n");
        System.out.println("PROGRAM WYKONANY PRZY POMOCY HashSetu :");
        System.out.println(words.size() + " unikalnych słów. " + totalTime + " milisekund.");
    }
}
