package Z2;
import java.util.*;
public class fun {

    public static void main(String[] args){

        LinkedHashSet<Integer> linked = new LinkedHashSet<>(List.of(4, 7, 1, 2134, 51321, 13, 22, 29));
        System.out.println("\nLinkedHashSet: " + linked);
        System.out.println("LinkedHashSet po redukcji:");
        Iterator<Integer>  it=linked.iterator();

        int sl1 = 22;
        while(it.hasNext()) {
            int temp=it.next();
            if(sl1==(temp)){
                it.remove();
            }
        }
        System.out.println(linked);





        LinkedHashSet<Character> linked2 = new LinkedHashSet<>(List.of('o', 'm', 'g'));
        System.out.println("\nLinkedHashSet: " + linked2);
        System.out.println("LinkedHashSet po redukcji:");
        Iterator<Character>  it2=linked2.iterator();

        char sl2 = 'm';
        while(it2.hasNext()) {
            Character temp2=it2.next();
            if(sl2==(temp2)){
                it2.remove();
            }
        }
        System.out.println(linked2);





        LinkedHashSet<Float> linked3 = new LinkedHashSet<>(List.of(21.99f, 124.96f, 241421.06f, 21321321.52f, 231213.01f, 21321.56f));
        System.out.println("\nLinkedHashSet: " + linked3);
        System.out.println("LinkedHashSet po redukcji:");
        Iterator<Float> it3=linked3.iterator();

        float sl3 = 231213.01f;
        while(it3.hasNext()) {
            float temp3=it3.next();
            if(sl3==(temp3)){
                it3.remove();
            }
        }
        System.out.println(linked3);
    }
}