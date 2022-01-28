import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class stosiwo {

    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);
        String wynik = "";
        Stack<String> stos1 = new Stack<>();
        while(!wynik.endsWith(".")){
            wynik = scan1.next();
            stos1.add(scan1.next());
            }
        for(String s: stos1){
            System.out.print(s + " ");
        }


    }
}
