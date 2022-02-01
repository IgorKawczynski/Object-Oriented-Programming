package Z1;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayUtilDemo {


    public static void main(String[] args){

        Character[] char1 = {'b', 'e', 'b', 'f', 'g', 'h', 'i'}; // powinno zostać jedno ,,b'' - usuniecie duplikatów ( powtarzających się elementów )
        LocalTime[] localtime1 = {LocalTime.of(4, 50, 35),
                LocalTime.of(3, 50, 35),
                LocalTime.of(5, 50, 35),
                LocalTime.of(7, 50, 35),
                LocalTime.of(8, 50, 35),
                LocalTime.of(4, 50, 35)};

        System.out.println("Tablica obiektów typu Character przed usunięciem duplikatów : ");
        System.out.println(Arrays.toString(char1));
        System.out.println("Tablica obiektów typu LocalTime przed usunięciem duplikatów : ");
        System.out.println(Arrays.toString(localtime1));

        // można przed deklaracją metody wpisać typ, jednakże nie jest to konieczne ( kompilator sam wyciągnie to z
        // kontekstu :
        ArrayList<Character> char1NoDuplicates = ArrayUtil.<Character>removeRepeatedElements(char1);
        ArrayList<LocalTime> localtime1NoDuplicates = ArrayUtil.<LocalTime>removeRepeatedElements(localtime1);

        System.out.println("ArrayList obiektów typu Character po usunięciu duplikatów : ");
        System.out.println(char1NoDuplicates);
        System.out.println("ArrayList obiektów typu LocalTime po usunięciu duplikatów : ");
        System.out.println(localtime1NoDuplicates);

    }
}
