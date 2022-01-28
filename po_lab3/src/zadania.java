import static java.lang.Math.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;
import java.lang.Character;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.io.File;

public class zadania {

    static int CountChar(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count = count + 1;
            }
        }
        return count;
    }

    static int CountSubStr(String str, String subStr) {
        int count = 0;
        int pos = 0;
        while(true) {
            pos = str.indexOf(subStr, pos);
            if (pos != -1) {
                count = count + 1;
                pos += subStr.length();
            }
            else {
                return count;
            }
        }
    }

    static String Middle(String str){
        String temp = "";
        if(str.length() == 2)
            return str;
        if(str.length() %2 == 0 ){
            temp = temp + str.charAt(str.length()/2) + str.charAt((str.length()/2) - 1);
        }
        else{
            temp = temp + str.charAt((str.length()/2));
        }
        return temp;
    }

    static String Repeat(String str, int n){
        String repeater = "";
        for(int i=0; i<n; i++){
            repeater = repeater + str;
        }
        return repeater;
    }

    static int[] Where(String str, String subStr) {
        int count = 0;
        int pos = 0;
        int i = 0;
        int[] tab = new int[subStr.length()];
        if (str.equals(subStr)){
            tab[0] = 0;
            return tab;
        }
        else {
            while (true) {
                pos = str.indexOf(subStr, pos);
                if (pos != -1) {
                    count = count + 1;
                    tab[i] = pos;
                    pos += subStr.length();
                    i++;
                } else {
                    return tab;
                }
            }
        }
    }

    static String Change(String str){
        StringBuffer msg = new StringBuffer();
        msg.append(str);
        for(int i=0; i<msg.length(); i++){
            if(Character.isLowerCase(msg.charAt(i))){
                msg.setCharAt(i, Character.toUpperCase(msg.charAt(i)));
            }
            else if(Character.isUpperCase(msg.charAt(i))){  // w przypadku 2 ifow nie dziala -- mozna takze ify podlozyc pod zwyklego stringa, a zmieniac stringBuffera
                msg.setCharAt(i, Character.toLowerCase(msg.charAt(i)));
            }
        }
        return msg.toString();
    }

    static String Nice(String str){
        StringBuffer msg = new StringBuffer();
        msg.append(str);
        int count = 0;
        for(int i=msg.length()-1; i>0; i--){
            count = count + 1;
            if(count%3==0 & i!=msg.length()){
                    msg.insert(i, "'");
            }
        }
        return msg.toString();
    }

    static String Nice_mod(String str, String separator, int pause){
        StringBuffer msg = new StringBuffer();
        msg.append(str);
        int count = 0;
        for(int i=msg.length()-1; i>0; i--){
            count = count + 1;
            if(count%pause==0 & i!=msg.length()){
                msg.insert(i, separator);
            }
        }
        return msg.toString();
    }

    static int CountCharInFile(char char1) throws FileNotFoundException {
        int count = 0;
        File file1 = new File("C:\\2022 studia\\PRZEDMIOTY\\PO\\lab\\po_lab3\\TEKST.txt");
        Scanner scan_file = new Scanner(file1);
        while (scan_file.hasNext()) {
            String char2 = scan_file.next();
            int index = 0;
            while (index < char2.length()) {
                if (char2.charAt(index) == char1) {
                    count = count + 1;
                }
                index++;
            }
        }
        return count;
    }


    static int CountStringInFile(File file, String str1) throws IOException {
        String plik = Files.readString(Path.of("C:\\2022 studia\\PRZEDMIOTY\\PO\\lab\\po_lab3\\TEKST2.txt"), StandardCharsets.US_ASCII); //plik odczytany jako string + wykorzystanie metody z zadania 1B)
        int count = 0;
        int pos = 0;
        while(true) {
            pos = plik.indexOf(str1, pos);
            if (pos != -1) {
                count = count + 1;
                pos += str1.length();
            }
            else {
                return count;
            }
        }
    }

    static BigInteger CountSeeds(int n){
        BigInteger returned_value = BigInteger.TWO;
        return returned_value.pow((n*n)-1);

    }

    static BigDecimal AmountOfCapital(int n, double k, double p){
        BigDecimal returned_value = BigDecimal.valueOf(k);
        BigDecimal p_bigdecimal = BigDecimal.valueOf(p);
        for(int i=0; i<n; i++){
            returned_value = returned_value.add(returned_value.multiply(p_bigdecimal));
        }
        return returned_value;

    }

    public static void main(String[] args) throws IOException {

        System.out.println("\nZADANIE 1 A : ");
        char c1 = 'b';
        String str1 = "barabaszbB";
        System.out.println("Liczba wystąpień znaku ,,c1'' w łancuchu ,,str1'' : " + CountChar(str1, c1));


        System.out.println("\nZADANIE 1 B : ");
        String str2 = "AlaMaBotaAlaxxxAla";
        String subStr2 = "Ala";
        System.out.println("Liczba wystąpień wyrazu ,,subStr2'' w wyrazie ,,str2'' : " + CountSubStr(str2, subStr2));


        System.out.println("\nZADANIE 1 C : ");
        String scan_string = "";
        System.out.println("Napisz swój wyraz scan_string :");
        Scanner scan = new Scanner(System.in);
        scan_string = scan.nextLine();
        System.out.println("Środkowy napis w ,,scan_string'' : " + Middle(scan_string));
        String str3 = "kotek";
        String str4 = "kottek";
        String str5 = "KotecccccccccccccccccccZcccccccccccccccccccetoK";
        System.out.println("Środkowy napis w ,,str3'' : " + Middle(str3));
        System.out.println("Środkowy napis w ,,str4'' : " + Middle(str4));
        System.out.println("Środkowy napis w ,,str5'' : " + Middle(str5));


        System.out.println("\nZADANIE 1 D : ");
        String str6 = "";
        System.out.println("Napisz swój wyraz str6 :");
        str6 = scan.nextLine();
        System.out.println("Napis repeat_string będący konkatenacją n kopii napisu str : " + Repeat(str6, 6));


        System.out.println("\nZADANIE 1 E : ");
        String scan_string2 = "";
        String scan_string3 = "";
        System.out.println("Wprowadź napis pierwszy, będący bazowym : ");
        scan_string2 = scan.nextLine();
        System.out.println("Wprowadź napis drugi, będący subStringiem napisu bazowego : ");
        scan_string3 = scan.nextLine();
        System.out.println("Tablica indeksów wystąpień wyrazu ,,subStr7'' w wyrazie ,,str7'' : " + Arrays.toString(Where(scan_string2, scan_string3)));
        String str7 = "AlaMaBotaAlaxxxAla";
        String subStr7 = "Ala";
        System.out.println("Tablica indeksów wystąpień wyrazu ,,subStr7'' w wyrazie ,,str7'' : " + Arrays.toString(Where(str7, subStr7)));


        System.out.println("\nZADANIE 1 F : ");
        String scan_string8 = "";
        System.out.println("Wprowadź napis scan_string8, który zostanie zmodyfikowany : ");
        scan_string8 = scan.nextLine();
        System.out.println("Napis scan_str8 zmodyfikowany : " + Change(scan_string8));


        System.out.println("\nZADANIE 1 G : ");
        String scan_string9 = "";
        System.out.println("Wprowadź napis scan_string9, który zostanie zmodyfikowany : ");
        scan_string9 = scan.nextLine();
        System.out.println("Napis scan_str9 zmodyfikowany : " + Nice(scan_string9));
        String string9 = "1245123421";
        System.out.println("Napis str9 zmodyfikowany : " + Nice(string9));


        System.out.println("\nZADANIE 1 H : ");
        String scan_string10 = "";
        System.out.println("Wprowadź napis scan_string10, który zostanie zmodyfikowany : ");
        scan_string10 = scan.nextLine();
        System.out.println("Napis scan_str9 zmodyfikowany : " + Nice_mod(scan_string10, ".", 4));
        String string10 = "1245123421";
        System.out.println("Napis str10 zmodyfikowany : " + Nice_mod(string10, ".", 4));


        System.out.println("\nZADANIE 2 : ");
        System.out.println("Liczba podanego w argumencie znaku w pliku ,,TEKST : " + CountCharInFile('h'));

        System.out.println("\nZADANIE 3 : ");
        File file1 = new File("C:\\2022 studia\\PRZEDMIOTY\\PO\\lab\\po_lab3\\TEKST2.txt");
        System.out.println("Liczba łańcuchów znaków ,,str1'' w pliku ,,TEKST : " + CountStringInFile(file1, "hehe"));

        System.out.println("\nZADANIE 4 : ");
        int n4 = 3;
        System.out.println("Liczba ziarenek rozłożonych na szachownicy o rozmiarze " + n4 + " x " + n4 + " to : " + CountSeeds(n4));

        System.out.println("\nZADANIE 5 : ");
        int n5 = 4;
        double k5 = 1100;
        double p5 = 0.05;
        System.out.println("Kapitał końcowy o parametrach k = " + k5 + ", n =  " + n5 + ", p = " + p5 + ", to : " + AmountOfCapital(n5, k5, p5));
    }
}
