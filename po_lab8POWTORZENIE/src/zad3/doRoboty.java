package zad3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class doRoboty {

    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<String> wezogarnij = new ArrayList<>();
        File file1 = new File("zadanko3.txt");
        Scanner scan1 = new Scanner(file1);
        while(scan1.hasNextLine()){
            wezogarnij.add(scan1.nextLine());
        }
        scan1.close();
        for(String s: wezogarnij){
            System.out.println(s);
        }


        String s = (String) wezogarnij;
        System.out.println(s);
    }
}
