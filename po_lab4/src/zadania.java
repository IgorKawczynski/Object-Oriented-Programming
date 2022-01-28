import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class zadania {

    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> c = new ArrayList<>(a);
        c.addAll(b);
        return c;
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
        int max_size = Math.max(a.size(), b.size());
        ArrayList<Integer> c = new ArrayList<>(max_size);
        for(int i=0; i<max_size; i++){
            if(i<a.size())
                c.add(a.get(i));
            if(i<b.size())
                c.add(b.get(i));
        }
        return c;
    }
// PROSTA METODA Z GOTOWYMI FUNKCJAMI
//    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b) {
//        a.sort(Comparator.naturalOrder());
//        b.sort(Comparator.naturalOrder());
//        ArrayList<Integer> c = new ArrayList<>(a.size() + b.size());
//        c.addAll(a);
//        c.addAll(b);
//        c.sort(Comparator.naturalOrder());
//        return c;
//    }

    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b) {
        a.sort(Comparator.naturalOrder());
        b.sort(Comparator.naturalOrder());
        ArrayList<Integer> c = new ArrayList<>(a.size() + b.size());
        int i=0, j=0;
        while(i<a.size() && j<b.size()){
            if(a.get(i)>=b.get(j)){
                c.add(b.get(j));
                j++;
            }
            else{
                c.add(a.get(i));
                i++;
            }
        }
        while(i<a.size()){
            c.add(a.get(i));
            i++;
        }
        while(j<b.size()){
            c.add(b.get(j));
            j++;
        }
        return c;
    }

    public static ArrayList<Integer> reversed(ArrayList<Integer> a){
        ArrayList<Integer> b = new ArrayList<>(a.size());
        for(int i=a.size(); i>0; i--){
            b.add(a.get(i-1));
        }
        return b;
    }
    //nie do konca wydajne poprzez dodawanie elementow, a nastepnie kasowanie ich
    public static void  reverse(ArrayList<Integer> a){
        for(int i=a.size(); i>0; i--){
            a.add(a.get(i-1));
        }
        for(int j=0; j<a.size(); j++){
            a.remove(a.get(j));
        }
    }

    public static void main(String[] args){

        System.out.println("\nZAD 1 : ");
        ArrayList<Integer> x1 = new ArrayList<>();
        x1.add(2);
        x1.add(3);
        x1.add(4);
        x1.add(5);
        System.out.println("TABLICA X1 :");
        for(int i : x1){
            System.out.println(i);
        }
        ArrayList<Integer> x2 = new ArrayList<>();
        x2.add(6);
        x2.add(7);
        x2.add(8);
        x2.add(9);
        x2.add(10);
        x2.add(11);
        System.out.println("\nTABLICA X2 :");
        for(int i : x2){
            System.out.println(i);
        }
        ArrayList<Integer> x3 = new ArrayList<>();
        x3 = append(x1, x2);
        System.out.println("\nTABLICA X1 I X2 POLACZONE :  :");
        for(int i : x3){
            System.out.println(i);
        }
        System.out.println("\nZAD 2 : ");
        ArrayList<Integer> x4 = new ArrayList<>();
        x4 = merge(x1, x2);
        System.out.println("\nTABLICA X1 I X2 POLACZONE NAPRZEMIAN :  :");
        for(int i : x4){
            System.out.println(i);
        }
        System.out.println("\nZAD 3 : ");
        ArrayList<Integer> x5 = new ArrayList<>();
        x5.add(4);
        x5.add(0);
        x5.add(6);
        x5.add(7);
        x5.add(9);
        ArrayList<Integer> x6 = new ArrayList<>();
        x6.add(9);
        x6.add(7);
        x6.add(0);
        x6.add(1);
        ArrayList<Integer> x7 = new ArrayList<>();
        x7 = mergeSorted(x5, x6);
        System.out.println("\nPOSORTOWANA TABLICA Z ELEMENTAMI Z TABLICY X5 i X6 : ");
        for(int i : x7){
            System.out.println(i);
        }
        System.out.println("\nZAD 4 : ");
        ArrayList<Integer> x8 = new ArrayList<>();
        x8 = reversed(x7);
        System.out.println("\nODWROCONA TABLICA X7 : ");
        for(int i : x8){
            System.out.println(i);
        }
        System.out.println("\nZAD 5 : ");
        reverse(x8);
        System.out.println("\nODWROCONA TABLICA X8 : ");
        for(int i : x8){
            System.out.println(i);
        }
    }
}
