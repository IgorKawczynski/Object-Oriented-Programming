import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.Collections;

import static java.lang.Math.*;


public class zadania {

    public static void generuj(int[] tab, int n, int minWartosc, int maxWartosc) {
        Random r = new Random();  // utworzenie zmiennej randomowej
        if (n > 0 && n < 101) {
            for (int j = 0; j < tab.length; ++j) {
                tab[j] = r.nextInt(maxWartosc + 1 - minWartosc) + minWartosc; //od -999 do 999 deklaracja
                System.out.println(tab[j]);
            }
        }
        else {
            System.out.println("Liczba elementów tablicy musi być w przedziale od 1 do 100 włącznie");
        }
    }

    public static int ileNieparzystych(int[] tab){
        int suma = 0;
        for (int j : tab) {
            if (j % 2 != 0) {
                suma = suma + 1;
            }
        }
        return suma;
    }

    public static int ileParzystych(int[] tab){
        int suma = 0;
        for (int j : tab) {
            if (j % 2 == 0) {
                suma = suma + 1;
            }
        }
        return suma;
    }

    public static int ileDodatnich(int[] tab){
        int suma = 0;
        for (int j : tab) {
            if (j > 0) {
                suma = suma + 1;
            }
        }
        return suma;
    }

    public static int ileUjemnych(int[] tab){
        int suma = 0;
        for (int j : tab) {
            if (j < 0) {
                suma = suma + 1;
            }
        }
        return suma;
    }

    public static int ileZerowych(int[] tab){
        int suma = 0;
        for (int j : tab) {
            if (j == 0) {
                suma = suma + 1;
            }
        }
        return suma;
    }

    public static int my_max(int[] tab){
        int max = tab[0];
        for (int i : tab) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static int ileMaksymalnych(int[] tab){
        int suma = 0;
        for (int i : tab) {
            if (i == my_max(tab)) {
                suma = suma + 1;
            }
        }
        return suma;
    }

    public static int SumaDodatnich(int[] tab){
        int suma = 0;
        for (int i : tab) {
            if (i > 0) {
                suma = suma + i;
            }
        }
        return suma;
    }

    public static int SumaUjemnych(int[] tab){
        int suma = 0;
        for (int i : tab) {
            if (i < 0) {
                suma = suma + i;
            }
        }
        return suma;
    }

    public static int DlugoscMaksymalnegoCiaguDodatnich(int[] tab){
        int len = 0;
        int max = 0;
        for (int i : tab) {
            if (i > 0) {
                len = len + 1;
            }
            else {
                len = 0;
            }
            if(max < len)
                max = len;
        }
        return max;
    }


    public static void Signum(int[] tab){
        int suma = 0;
        for (int i=0; i<tab.length; i++) {
            if (tab[i] < 0) {
                tab[i] = -1;
            }
            if (tab[i] > 0) {
                tab[i] = 1;
            }
        }
    }

    public static void OdwrocFragment(int[] tab1, int lewy, int prawy){
        if((lewy < 0) || (lewy > tab1.length-1) || (prawy < 0) || (prawy > tab1.length-1)){
            System.out.println("Błędna wartość lewy lub prawy\n");
        }
        else{
            int tab2[] = new int[prawy - lewy + 1];
            if(prawy + 1 - lewy >= 0)
                System.arraycopy(tab1, lewy, tab2, 0, prawy - lewy + 1);  //funkcja z wykładu
            for(int x=lewy; x<prawy+1; x++){
                tab1[x] = tab2[prawy - x];
            }
        }
    }

    public static void wypisz(int[] tab){
        System.out.print("[ ");
        for (int i : tab) {
            System.out.print(i + " ");
        }
        System.out.print("]\n");
    }

    public static void main(String[] args) {

        int n1=0;
        System.out.println("Wypisz liczbę elementow tablicy od 1 do 100 :\n");
        Scanner scan = new Scanner(System.in);
        n1 = scan.nextInt();
        int[] tab1 = new int[n1];

        generuj(tab1, n1, -999, 999);

        System.out.println("\n\nZADANIE 2 A : \n");
        System.out.println("Ilość liczb nieparzystych w tablicy :");
        System.out.println(ileNieparzystych(tab1));
        System.out.println("Ilość liczb parzystych w tablicy :");
        System.out.println(ileParzystych(tab1));

        System.out.println("\n\nZADANIE 2 B : \n");
        System.out.println("Ilość liczb dodatnich w tablicy :");
        System.out.println(ileDodatnich(tab1));
        System.out.println("Ilość liczb ujemnych w tablicy :");
        System.out.println(ileUjemnych(tab1));
        System.out.println("Ilość liczb zerowych w tablicy :");
        System.out.println(ileZerowych(tab1));

        System.out.println("\n\nZADANIE 2 C : \n");
        System.out.println("Liczba maksymalna : \n");
        System.out.println(my_max(tab1));
        System.out.println("Ilość liczb maksymalnych w tablicy :");
        System.out.println(ileMaksymalnych(tab1));

        System.out.println("\n\nZADANIE 2 D : \n");
        System.out.println("Suma liczb dodatnich w tablicy : ");
        System.out.println(SumaDodatnich(tab1));
        System.out.println("Suma liczb ujemnych w tablicy : ");
        System.out.println(SumaUjemnych(tab1));

        System.out.println("\n\nZADANIE 2 E : \n");
        System.out.println("Dlugosc maksymalnego, dodatniego ciagu w tablicy : ");
        System.out.println(DlugoscMaksymalnegoCiaguDodatnich(tab1));

        System.out.println("\n\nZADANIE 2 F : \n");
        System.out.println("Tablica po zastosowaniu funkcji signum : ");
        Signum(tab1);
        wypisz(tab1);

        System.out.println("\n\nZADANIE 2 G : \n");
        System.out.println("Tablica po odwroceniu podanego fragmentu ( już po funkcji signum ) : ");
        OdwrocFragment(tab1, 0, 3);
        wypisz(tab1);

        int m2 = 0;
        int n2 = 0;
        int k2 = 0;
        System.out.print("Podaj liczbę z zakresu od 1 do 10:\n");
        m2 = scan.nextInt();
        System.out.print("Podaj liczbę z zakresu od 1 do 10:\n");
        n2 = scan.nextInt();
        System.out.print("Podaj liczbę z zakresu od 1 do 10:\n");
        k2 = scan.nextInt();
        if((m2>=1 && m2<=10) && (n2>=1 && n2<=10) && (k2>=1 && k2<=10)) {
            Random r2 = new Random();
            int[][] matrix_a = new int[m2][n2];
            for (int i = 0; i < m2; i++) {
                for (int j = 0; j < n2; j++) {
                    matrix_a[i][j] = r2.nextInt(20);
                }
            }
            int[][] matrix_b = new int[n2][k2];
            for (int i2 = 0; i2 < n2; i2++) {
                for (int j2 = 0; j2 < k2; j2++) {
                    matrix_b[i2][j2] = r2.nextInt(40);
                }
            }
            int[][] matrix_c = new int[m2][k2];
            for(int i3 = 0; i3 < m2; i3++){
                for(int j3 = 0; j3 < k2; j3++){
                    for(int l3 = 0; l3 < n2; l3++){
                        matrix_c[i3][j3] += matrix_a[i3][l3] * matrix_b[l3][j3];
                    }
                }
            }
            System.out.println("MATRIX A : \n");
            for(int i4 = 0; i4 < m2; i4++){
                System.out.print("[ ");
                for(int j4 = 0; j4 < n2; j4++){
                    System.out.print(matrix_a[i4][j4] + " ");
                }
                System.out.print("]\n");
            }
            System.out.println("MATRIX B : \n");
            for(int i4 = 0; i4 < n2; i4++){
                System.out.print("[ ");
                for(int j4 = 0; j4 < k2; j4++){
                    System.out.print(matrix_b[i4][j4] + " ");
                }
                System.out.print("]\n");
            }
            System.out.println("MATRIX C : \n");
            for(int i4 = 0; i4 < m2; i4++){
                System.out.print("[ ");
                for(int j4 = 0; j4 < k2; j4++){
                    System.out.print(matrix_c[i4][j4] + " ");
                }
                System.out.print("]\n");
            }

        }
        else{
            System.out.println("Wszystkie liczby muszą mieścić się w podanym zakresie !!");
        }
    }
}
