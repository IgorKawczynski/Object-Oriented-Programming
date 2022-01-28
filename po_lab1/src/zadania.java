import java.util.Scanner;

import static java.lang.Math.*;


public class zadania {
    public static void main(String[] args) {
        //ZAD 1 A
        System.out.println("ZADANIE 1 A\n");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = 0;
        int suma = 0;
        while (a != n) {
            a++;
            int an = scan.nextInt();
            suma = suma + an;
        }
        System.out.println(suma);


        //ZAD 1 B
        System.out.println("ZADANIE 1 B\n");
        int n2 = scan.nextInt();
        int a2 = 0;
        int suma2 = 1;
        while (a2 != n2) {
            a2++;
            int an2 = scan.nextInt();
            suma2 = suma2 * an2;
        }
        System.out.println(suma2);

        //ZAD 1 C
        System.out.println("ZADANIE 1 C\n");
        int n3 = scan.nextInt();
        int a3 = 0;
        int suma3 = 0;
        while (a3 != n3) {
            a3++;
            int an3 = scan.nextInt();
            suma3 = suma3 + abs(an3);
        }
        System.out.println(suma3);

        //ZAD 1 D
        System.out.println("ZADANIE 1 D\n");
        int n4 = scan.nextInt();
        int a4 = 0;
        double suma4 = 0;
        while (a4 != n4) {
            a4++;
            double an4 = scan.nextInt();
            suma4 = suma4 + sqrt(abs(an4));
        }
        System.out.println(suma4);

        //ZAD 1 E
        System.out.println("ZADANIE 1 E\n");
        int n5 = scan.nextInt();
        int a5 = 0;
        int suma5 = 1;
        while (a5 != n5) {
            a5++;
            int an5 = scan.nextInt();
            suma5 = suma5 * abs(an5);
        }
        System.out.println(suma5);

        //ZAD 1 F
        System.out.println("ZADANIE 1 F\n");
        int n6 = scan.nextInt();
        int a6 = 0;
        double suma6 = 0;
        while (a6 != n6) {
            a6++;
            double an6 = scan.nextInt();
            suma6 = suma6 + Math.pow(an6, 2);
        }
        System.out.println(suma6);


        //ZAD 1 G
        System.out.println("ZADANIE 1 G\n");
        int tab[] = new int[2];

        int n7 = scan.nextInt();
        int a7 = 0;
        int suma7 = 0;
        int iloczyn7 = 1;
        while (a7 != n7) {
            a7++;
            int an7 = scan.nextInt();
            suma7 = suma7 + an7;
            iloczyn7 = iloczyn7 * an7;
        }
        tab[0] = suma7;
        tab[1] = iloczyn7;
        System.out.println(tab[0] + " oraz " + tab[1]);

        //ZAD 1 H
        System.out.println("ZADANIE 1 H\n");
        double n8 = scan.nextInt();
        int a8 = 0;
        double suma8 = 0;
        while (a8 != n8) {
            a8++;
            double an8 = scan.nextInt();
            suma8 = suma8 + (Math.pow(-1, (a8 + 1)) * an8);
        }
        System.out.println(suma8);

        //ZAD 1 I
        System.out.println("ZADANIE 1 I\n");
        double n9 = scan.nextInt();
        int a9 = 0;
        double suma9 = 0;
        while (a9 != n9) {
            a9++;
            double an9 = scan.nextInt();
            suma9 = suma9 + ((Math.pow(-1, a9) * an9) / a9);
        }
        System.out.println(suma9);



        //ZAD 1 2 ???????
        System.out.println("ZADANIE 1 2\n");
        int n10 = scan.nextInt();
        int a10=0;
        int i10=1;
        double tab12[] = new double[n10];

        while(a10!=n10){
            a10++;
            double an10 = scan.nextDouble();
            tab12[a10-1]=an10;
        }
        //wypisanie od drugiego (indeks od 1)
        while(i10 < n10){
            System.out.println(tab12[i10] + ",");
            i10++;

        }
        //dodanie na koniec tablicy elementu a1
        System.out.println(tab12[0]);


        //ZAD 2 A
        System.out.println("ZADANIE 2 A\n");
        int n21 = scan.nextInt();
        int a21 = 0;
        int suma21 = 0;
        while (a21 != n21) {
            a21++;
            int an21 = scan.nextInt();
            if (an21 % 2 != 0) {
                suma21 = suma21 + 1;
            }
        }
        System.out.println(suma21);

        //ZAD 2 B
        System.out.println("ZADANIE 2 B\n");
        int n22 = scan.nextInt();
        int a22 = 0;
        int suma22 = 0;
        while (a22 != n22) {
            a22++;
            int an22 = scan.nextInt();
            if (an22 % 3 == 0 & an22 % 5 != 0) {
                suma22 = suma22 + 1;
            }
        }
        System.out.println(suma22);

        //ZAD 2 C
        System.out.println("ZADANIE 2 C\n");
        int n23 = scan.nextInt();
        int a23 = 0;
        int suma23 = 0;
        while (a23 != n23) {
            a23++;
            int an23 = scan.nextInt();
            if ((sqrt(an23)) % 2 == 0) {
                suma23 = suma23 + 1;
            }
        }
        System.out.println(suma23);

        //ZAD 2 D
        System.out.println("ZADANIE 2 D\n");
        int n24 = scan.nextInt();
        int a24=0;
        double tab24[] = new double[n24];
        int suma24=0;
        while(a24!=n24){
            a24++;
            double an24 = scan.nextInt();
            tab24[a24-1] = an24;
            if(a24>1 && a24<n24)
            {
                if(tab24[a24-1] < (tab24[a24-2]+tab24[a24])/2){
                    suma24=suma24+1;
                }
            }

        }
        System.out.println(suma24);


        //ZAD 2 E
        System.out.println("ZADANIE 2 E\n");


        int n25 = scan.nextInt();
        int a25=0;
        int tab25[] = new int[n25];
        int suma25=0;
        int factorial25=1;
        while(a25!=n25){
            a25++;
            double an25 = scan.nextInt();
            if(a25>=1 && a25<=n25)
            {
                for(int i25=2; i25<=n25; i25++){
                    factorial25 = factorial25 * i25;
                    if((tab25[a25-1] > Math.pow(2, a25)) && (tab25[a25-1] < factorial25)){
                        suma25=suma25+1;
                    }
                }
            }

        }
        System.out.println(suma25);

        //ZAD 2 F
        System.out.println("ZADANIE 2 F\n");

        int n26 = scan.nextInt();
        int a26 = 0;
        int suma26 = 0;
        int i26 = 1;
        while (a26 != n26) {
            a26++;
            int an26 = scan.nextInt();
            if (i26 % 2 != 0 & an26 % 2 == 0) {
                suma26 = suma26 + 1;
            }
        }
        System.out.println(suma26);


        //ZAD 2 G
        System.out.println("ZADANIE 2 G\n");

        int n27 = scan.nextInt();
        int a27 = 0;
        int suma27 = 0;
        while (a27 != n27) {
            a27++;
            int an27 = scan.nextInt();
            if (an27 >= 0 & an27 % 2 != 0) {
                suma27 = suma27 + 1;
            }
        }
        System.out.println(suma27);

        //ZAD 2 H
        System.out.println("ZADANIE 2 H\n");
        double n28 = scan.nextInt();
        int a28=0;
        double suma28 = 0;
        while(a28!=n28){
            a28++;
            double an28 = scan.nextInt();
            if(Math.abs(an28) < Math.pow(a28, 2)){
                suma28=suma28+1;
            }
        }
        System.out.println(suma28);


        //ZAD 2 2
        System.out.println("ZADANIE 2 2\n");
        int n31 = scan.nextInt();
        int a31 = 0;
        int suma31 = 0;
        while (a31 != n31) {
            a31++;
            int an31 = scan.nextInt();
            if (an31 > 0) {
                suma31 = suma31 + an31;
            }
            suma31 = suma31 * 2;
        }
        System.out.println(suma31);

        //ZAD 2 3
        System.out.println("ZADANIE 2 3\n");
        int n32 = scan.nextInt();
        int a32 = 0;
        int dodatnie = 0;
        int ujemne = 0;
        int zera = 0;
        while (a32 != n32) {
            a32++;
            int an32 = scan.nextInt();
            if (an32 > 0) {
                dodatnie = dodatnie + 1;
            }
            if (an32 < 0) {
                ujemne = ujemne + 1;
            }
            if (an32 == 0) {
                zera = zera + 1;
            }
        }
        System.out.println("Liczby dodatnie : " + dodatnie + "  Liczby ujemne : " + ujemne + "  Zera : " + zera);

        //ZAD 2 4
        System.out.println("ZADANIE 2 4\n");
        int n33 = scan.nextInt();
        int a33 = 0;
        int tab33[] = new int[n33];
        while (a33 != n33) {
            a33++;
            int an33 = scan.nextInt();
            tab33[a33-1] = an33;
        }
        int max = tab33[0];
        for (int i = 0; i < tab33.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }
        int min = tab33[0];
        for (int j = 0; j < tab33.length; j++) {
            if (tab[j] < min) {
                min = tab[j];
            }
        }
        System.out.println("MAX : " + max + "MIN : " + min);


        //ZAD 2 5
        System.out.println("ZADANIE 2 5\n");
        int n34 = scan.nextInt();
        int a34 = 0;
        int suma34 = 0;
        int tab34[] = new int[n34];
        while (a34 != n34) {
            a34++;
            int an34 = scan.nextInt();
            tab34[a34 - 1] = an34;
        }
        int temp = tab34[0];
        for (int k = 0; k < tab34.length - 1; k++) {
            if (tab34[k] > 0 & tab34[k + 1] > 0) {
                suma34 = suma34 + 1;
            }
        }
        System.out.println("liczba par : " + suma34);


        //BALEDUNG.COM ------------- PATRZ
    }
}
