package Z2;

import java.util.Iterator;
import java.util.Objects;

public class Printer {

    public static <E extends Iterable<?>> void printMarginal(E objekt){

        Iterator<?> iter1 = objekt.iterator();
        String temp_last = "";
        if(iter1.hasNext())
            System.out.print(iter1.next());
        while(iter1.hasNext())
            temp_last = iter1.next().toString();
        if(!Objects.equals(temp_last, ""))
            System.out.print("  " + temp_last);

    }
    //dla obiektu jednoelementowego, wypisze tylko pierwszy element, który jest jednocześnie pierwszym i końcowym
    //dla pustego obiektu, nie wypisze żadnego elementu
}
