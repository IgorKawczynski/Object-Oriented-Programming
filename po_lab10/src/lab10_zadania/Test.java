package lab10_zadania;

import kawczynski.*;
import java.util.*;

public class Test {

    public static void redukuj(LinkedList<String> pracownicy, int n){
        if(n>0){
            for(int i=n-1; i<pracownicy.size(); i=i+(n-1)){
                pracownicy.remove(i);
            }
        }
    }

    public static <T> void redukuj_generic(LinkedList<T> pracownicy, int n){
        if(n>0){
            for(int i=n-1; i<pracownicy.size(); i=i+(n-1)){
                pracownicy.remove(i);
            }
        }
    }


/* METODA ODWROC WYKORZYSTUJACA GOTOWA FUNKCJE Z KLASY COLLECTIONS*/
//    public static void odwroc(LinkedList<String> lista){
//        Collections.reverse(lista);
//    }
//
//    public static <T> void odwroc_generic(LinkedList<T> lista){
//        Collections.reverse(lista);
//    }

/* METODA ODWROC WYKORZYSTUJACA 2 TABLICE */
//    public static void odwroc(LinkedList<String> lista){
//        LinkedList<String> temp_lista = new LinkedList<>(lista);
//        for(int i=0, j=temp_lista.size()-1; i<lista.size() & j>=0; i++, j--){
//            lista.set(i, temp_lista.get(j));
//        }
//    }
//
//    public static <T> void odwroc_generic(LinkedList<T> lista){
//        LinkedList<T> temp_lista = new LinkedList<>(lista);
//        for(int i=0, j=temp_lista.size()-1; i<lista.size() & j>=0; i++, j--){
//            lista.set(i, temp_lista.get(j));
//        }
//    }

/* METODA ODWROC BEZ KOPIOWANIA LISTY */
    public static void odwroc(LinkedList<String> lista){
        for(int i=0, j=lista.size()-1; i<lista.size()-1 & j>=lista.size()/2; i++, j--){
            String temp = lista.get(i);
            lista.set(i, lista.get(j));
            lista.set(j, temp);
        }
    }

    public static <T> void odwroc_generic(LinkedList<T> lista){
        for(int i=0, j=lista.size()-1; i<lista.size()-1 & j>=lista.size()/2; i++, j--){
            T temp = lista.get(i);
            lista.set(i, lista.get(j));
            lista.set(j, temp);
        }
    }

    public static <T extends Iterable<?>> void print(T t){
        Iterator<?> iterator1 = t.iterator();
        while(iterator1.hasNext()){
            System.out.print(iterator1.next());
            if(iterator1.hasNext())
                System.out.print(", ");
        }
    }

    public static void main(String[] args)
    {
        // ZAD1
        System.out.println("\n ZADANIE 1 : ");
        LinkedList<String> pracownicy1 = new LinkedList<String>();
        pracownicy1.add("Kowalewski");
        pracownicy1.add("Amantowiak");
        pracownicy1.add("Mostowski");
        pracownicy1.add("Kawczyski");
        pracownicy1.add("Trebetkowski");
        pracownicy1.add("Wiertalak");
        pracownicy1.add("Urwis");
        pracownicy1.add("Polak");
        pracownicy1.add("Ikarczewski");
        pracownicy1.add("Bolszak");

        System.out.println("-----LISTA NAZWISK PRACOWNIKÓW PRZED ZREDUKOWANIEM-----");
        for(String p : pracownicy1){
            System.out.println(p);
        }

        redukuj(pracownicy1, 2);

        System.out.println("\n");
        System.out.println("-----LISTA NAZWISK PRACOWNIKÓW PO ZREDUKOWANIU CO DRUGI-----");
        for(String p : pracownicy1){
            System.out.println(p);
        }


        // ZAD2
        System.out.println("\n ZADANIE 2 : ");
        List<String> pracownicy_vectra=new ArrayList<String>();
        pracownicy_vectra.add("Brzeczeszczykiewicz");
        pracownicy_vectra.add("Najman");
        List<String> pracownicy_orange=new ArrayList<String>();
        pracownicy_orange.add("Borkowski");
        pracownicy_orange.add("Apodyktowski");
        List<String> pracownicy_tmobile=new ArrayList<String>();
        pracownicy_tmobile.add("Piotrowski");
        pracownicy_tmobile.add("Bolczak");
        List<String> pracownicy_heyah=new ArrayList<String>();
        pracownicy_heyah.add("Majkut");
        pracownicy_heyah.add("Ziombel");

        LinkedList<Object> lista_pracownikow = new LinkedList<>();
        lista_pracownikow.add(pracownicy_vectra);
        lista_pracownikow.add(pracownicy_orange);
        lista_pracownikow.add(pracownicy_tmobile);
        lista_pracownikow.add(pracownicy_heyah);

        System.out.println("\n----------LISTA PRACOWNIKOW PRZED ZREDUKOWANIEM (METODA GENERYCZNA): ----------");
        for(Object l: lista_pracownikow){
            System.out.println(l);
        }

        redukuj_generic(lista_pracownikow, 2);


        System.out.println("\n----------LISTA PRACOWNIKOW PO ZREDUKOWANIU CO 2 (METODA GENERYCZNA): ----------");
        for(Object l: lista_pracownikow){
            System.out.println(l);
        }


        // 2GI PRZYKŁAD DO ZADANIA 2 ( GOTOWA KLASA ,,OSOBA'' Z POPRZEDNICH LABÓW )
        Osoba osoba1 = new Osoba("Lemański", 1988, 10, 11);
        Osoba osoba2 = new Osoba("Opalewski", 1966, 10, 11);
        Osoba osoba3 = new Osoba("Adriano", 1846, 10, 11);
        Osoba osoba4 = new Osoba("Mnogowska", 1412, 10, 11);
        Osoba osoba5 = new Osoba("Ybuin", 159, 10, 11);
        Osoba osoba6 = new Osoba("Wiertalak", 2023, 10, 11);
        Osoba osoba7 = new Osoba("Ziemowit", 749, 10, 11);
        LinkedList<Osoba> lista_pracownikow2 = new LinkedList<>();
        lista_pracownikow2.add(osoba1);
        lista_pracownikow2.add(osoba2);
        lista_pracownikow2.add(osoba3);
        lista_pracownikow2.add(osoba4);
        lista_pracownikow2.add(osoba5);
        lista_pracownikow2.add(osoba6);
        lista_pracownikow2.add(osoba7);

        System.out.println("\n----------LISTA OSÓB PRZED ZREDUKOWANIEM (METODA GENERYCZNA): ----------");
        for(Osoba o: lista_pracownikow2){
            System.out.println(o);
        }

        redukuj_generic(lista_pracownikow2, 1);


        System.out.println("\n----------LISTA OSÓB PO ZREDUKOWANIU CO 1 (METODA GENERYCZNA): ----------");
        for(Osoba o2: lista_pracownikow2){
            System.out.println(o2);
        }


        // ZAD3
        System.out.println("\n ZADANIE 3 : ");
        LinkedList<String> lista_pracownikow3 = new LinkedList<>();
        lista_pracownikow3.add("Kowalewski");
        lista_pracownikow3.add("Amantowiak");
        lista_pracownikow3.add("Mostowski");
        lista_pracownikow3.add("Kawczyski");
        lista_pracownikow3.add("Trebetkowski");

        System.out.println("\n----------LISTA OSÓB PRZED ODWROCENIEM: ----------");
        for(String s3: lista_pracownikow3){
            System.out.println(s3);
        }

        odwroc(lista_pracownikow3);


        System.out.println("\n----------LISTA OSÓB PO ODWROCENIU: ----------");
        for(String s33: lista_pracownikow3){
            System.out.println(s33);
        }


        // ZAD 4
        System.out.println("\n ZADANIE 4 : ");
        LinkedList<Osoba> lista_pracownikow4 = new LinkedList<>();
        lista_pracownikow4.add(osoba1);
        lista_pracownikow4.add(osoba2);
        lista_pracownikow4.add(osoba3);
        lista_pracownikow4.add(osoba4);

        System.out.println("\n----------LISTA OSÓB PRZED ODWROCENIEM (METODA GENERYCZNA): ----------");
        for(Osoba s4: lista_pracownikow4){
            System.out.println(s4);
        }

        odwroc_generic(lista_pracownikow4);


        System.out.println("\n----------LISTA OSÓB PO ODWROCENIU (METODA GENERYCZNA): ----------");
        for(Osoba s44: lista_pracownikow4){
            System.out.println(s44);
        }

        // ZAD 5
        System.out.println("\n ZADANIE 5 : ");
        Stack<String> stos1 = new Stack<>();
        Stack<String> stos11 = new Stack<>();
        Stack<String> stos2 = new Stack<>();
        stos1.add("Ala");
        stos1.add("ma");
        stos1.add("kota.");
        stos11.add("Jej");
        stos11.add("kot");
        stos11.add("lubi");
        stos11.add("myszy.");
        System.out.println(stos1);
        System.out.println(stos11);
        Collections.reverse(stos1);
        for(String s5: stos1){
            if(s5.endsWith("."))
                stos2.add(s5.substring(0, 1).toUpperCase() + s5.substring(1, s5.length() - 1));
            else if(s5.equals(stos1.lastElement()))
                stos2.add(s5.toLowerCase() + ".");
            else
                stos2.add(s5.toLowerCase());
        }
        Collections.reverse(stos11);
        for(String s55: stos11){
            if(s55.endsWith("."))
                stos2.add(s55.substring(0, 1).toUpperCase() + s55.substring(1, s55.length() - 1));
            else if(s55.equals(stos11.lastElement()))
                stos2.add(s55.toLowerCase() + ".");
            else
                stos2.add(s55.toLowerCase());
        }
        System.out.println(stos2);
        /* DRUGI SPOSÓB, JAK WIĘCEJ ZDAŃ W LIŚCIE :
        public static void reverseWordsInTheSentence(String sentence){
        Stack<String> stack = new Stack<>();
        int strLength = sentence.length();
        StringBuffer word = new StringBuffer();
        int i = 0;
        while (i < strLength) {
            if (sentence.charAt(i) == ' ') {
                if (word.length() == 0) {
                    i++;
                    System.out.print(" ");
                } else {
                    i++;
                    addToStackDeleteCharactersFromAWord(stack, word);
                }
            } else if (sentence.charAt(i) == '.') {
                i++;
                addToStackDeleteCharactersFromAWord(stack, word);
                printWordsFromStack(stack);
                stack.clear();
            } else {
                word.append(sentence.charAt(i));
                i++;
            }
        }
    }
         */


        // ZAD 6
        System.out.println("\n ZADANIE 6 : ");
//        int i6 = 2015;
//        ArrayList<Character> lista66 = new ArrayList<>();
//        String i6_string = Integer.toString(i6);
//        for(int i=0; i<i6_string.length(); i++){
//            lista66.add(i6_string.charAt(i)); // cannot string to Integer, only string to int which is family to Integer
//        }
//        System.out.println(lista66);
        int i6 = 2015;
        int len = Integer.toString(i6).length();
        Stack<Integer> stos6 = new Stack<>();
        for(int i=0; i<len; i++){
            stos6.add(i6%10);
            i6=i6/10;
        }
        for(int j=0; j<=stos6.size()+2; j++){
            System.out.print(stos6.pop() + " ");
        }


        // ZAD 7
        System.out.println("\n\nZADANIE 7 : ");

        int from = 2;
        int n = 20;
        int i;
        boolean[] pierwsze_tab = new boolean[n+1];
        Arrays.fill(pierwsze_tab, true);

        // 0 AND 1 ARENT PRIME NUMBERS
        pierwsze_tab[0] = false;
        pierwsze_tab[1] = false;

        for(i=2; i<=Math.sqrt(n); i++)

            // CHECKING IF NUMBER IS PRIME
            if(pierwsze_tab[i])
                for(int j=i*i; j<=n; j=j+i){
                    pierwsze_tab[j] = false;
                }
        for(i=from; i<=n; i++){

            // PRINTING PRIME NUMBERS
            if(pierwsze_tab[i])
                System.out.print(i + " ");
        }

        // ZAD 8
        System.out.println("\n\nZADANIE 8 : ");
        List<String> lista8 = new ArrayList<String>(5);
        lista8.add("haha");
        lista8.add("brak");
        lista8.add("tego");
        lista8.add("drugiego");
        lista8.add("wlasnego");
        print(lista8);

        System.out.println();
        Vector<String> wektor1 = new Vector<>();
        wektor1.add("haha");
        wektor1.add("brak");
        wektor1.add("tego");
        wektor1.add("drugiego");
        wektor1.add("wlasnego");
        print(wektor1);

    }

}
