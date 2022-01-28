import pl.imiajd.kawczynski.*;
import java.time.LocalDate;
import java.util.ArrayList;


public class TestInstrumenty {

    public static void main(String[] args) {

        ArrayList<Instrument> orkiestra = new ArrayList<>(5);
        //NIE DZIALA - PYTANIE DLACZEGO ???
//        orkiestra.set(0, new Skrzypce("Amadi", LocalDate.of(1993, 10, 10), "5400"));
//        orkiestra.set(1, new Flet("Wojtas", LocalDate.of(1991, 9, 24), "8400"));
//        orkiestra.set(2, new Flet("Wojtas", LocalDate.of(1997, 4, 26), "10400"));
//        orkiestra.set(3, new Fortepian("Bajerant", LocalDate.of(1949, 12, 24), "24400"));
//        orkiestra.set(4, new Fortepian("PolskieNajlepsze", LocalDate.of(2020, 10, 11), "15500"));
        Skrzypce skrzypce1 = new Skrzypce("Amadi", LocalDate.of(1993, 10, 10), "5400");
        Flet flet1 = new Flet("Wojtas", LocalDate.of(1991, 9, 24), "8400");
        Flet flet2 = new Flet("Wojtas", LocalDate.of(1997, 4, 26), "10400");
        Fortepian fortepian1 = new Fortepian("Bajerant", LocalDate.of(1949, 12, 24), "24400");
        Fortepian fortepian2 = new Fortepian("PolskieNajlepsze", LocalDate.of(2020, 10, 11), "15500");
        orkiestra.add(skrzypce1);
        orkiestra.add(flet1);
        orkiestra.add(flet2);
        orkiestra.add(fortepian1);
        orkiestra.add(fortepian2);

        skrzypce1.dzwiek();
        flet1.dzwiek();
        flet2.dzwiek();
        fortepian1.dzwiek();
        fortepian2.dzwiek();

        for(Instrument i: orkiestra){
            System.out.println(i);
        }

    }
}
