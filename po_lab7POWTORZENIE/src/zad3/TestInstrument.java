package zad3;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestInstrument {

    public static void main(String[] args)
    {
        Skrzypce skrzypki1 = new Skrzypce("Giorgino De Rossi", LocalDate.of(2005, 10, 14));
        Skrzypce skrzypki2 = new Skrzypce("Giorgino De Rossi", LocalDate.of(2003, 5, 5));
        Skrzypce skrzypki3 = new Skrzypce("Giorgino De Rossi", LocalDate.of(2004, 12, 21));
        Flet flecik1 = new Flet("Amadeus", LocalDate.of(2010, 11, 20));
        Fortepian forpetiaan1 = new Fortepian("Giorgino De Rossi", LocalDate.of(1789, 3, 7));

        ArrayList<Instrument> orchestra = new ArrayList<>(5);
        orchestra.add(skrzypki1);
        orchestra.add(skrzypki2);
        orchestra.add(skrzypki3);
        orchestra.add(flecik1);
        orchestra.add(forpetiaan1);

        System.out.println("\n ORCHESTRA GRA : \n");
        System.out.println(orchestra.get(0).dzwiek());
        System.out.println(orchestra.get(1).dzwiek());
        System.out.println(orchestra.get(2).dzwiek());
        System.out.println(orchestra.get(3).dzwiek());
        System.out.println(orchestra.get(4).dzwiek());

        System.out.println("\n W ORCHESTRZE GRALI : \n");
        for(Instrument instrumenty: orchestra){
            System.out.println(instrumenty);
        }
    }
}
