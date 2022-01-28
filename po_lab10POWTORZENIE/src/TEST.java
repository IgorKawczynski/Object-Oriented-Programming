import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Stack;

public class TEST {

    public static void main(String[] args) {

        LinkedList<String> pracownicy1 = new LinkedList<>();
        pracownicy1.add("Wiesio1");
        pracownicy1.add("Wiesio2");
        pracownicy1.add("Wiesio3");
        pracownicy1.add("Wiesio4");
        pracownicy1.add("Wiesio5");
        pracownicy1.add("Wiesio6");
        pracownicy1.add("Wiesio7");
        pracownicy1.add("Wiesio8");

        System.out.println(pracownicy1.toString());

        funkcje.redukuj(pracownicy1, 2);

        System.out.println(pracownicy1.toString());

        LinkedList<LocalDate> daty1 = new LinkedList<>();
        daty1.add(LocalDate.of(2001, 11, 10));
        daty1.add(LocalDate.of(2004, 11, 10));
        daty1.add(LocalDate.of(2002, 11, 10));
        daty1.add(LocalDate.of(2005, 11, 10));
        daty1.add(LocalDate.of(2006, 11, 10));


        System.out.println(daty1.toString());

        funkcje.redukuj_gen(daty1, 3);

        System.out.println(daty1.toString());

        funkcje.odwroc(pracownicy1);

        System.out.println(pracownicy1.toString());

        Stack<Integer> stos2 = new Stack<>();

        int x = 2015;
        int len = Integer.toString(x).length();
        for(int i=0; i<len; i++){
            int y = x%10;
            x = x/10;
            stos2.add(y);
        }

        StringBuilder napis = new StringBuilder();

        for(Integer i: stos2){
            napis.append(stos2.append(i).append(" ");
        }

        System.out.println(stos2.toString());
        System.out.println(napis);



    }
}
