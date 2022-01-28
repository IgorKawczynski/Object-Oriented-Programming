import java.util.LinkedList;

public class funkcje {

    public static void redukuj(LinkedList<String> pracownicy, int n){
        for(int i=n-1; i<= pracownicy.size()-1; i=i+(n-1)){
            pracownicy.remove(i);
        }
    }

    public static<T> void redukuj_gen(LinkedList<T> pracownicy, int n) {
        for (int i = n - 1; i <= pracownicy.size() - 1; i = i + (n - 1)) {
            pracownicy.remove(i);
        }
    }

    public static void odwroc(LinkedList<String> lista1) {
        for (int i = 0, j=lista1.size()-1; i<=lista1.size()-1 & j>=lista1.size()/2; i++, j--) {
            String temp = lista1.get(i);
            lista1.set(i, lista1.get(j));
            lista1.set(j, temp);
        }
    }
}
