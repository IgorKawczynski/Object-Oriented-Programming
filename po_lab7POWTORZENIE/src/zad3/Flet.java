package zad3;
import java.time.LocalDate;

public class Flet extends Instrument implements Dzwiek {

    public Flet(String producent, LocalDate rokProdukcji) {
        super(producent, rokProdukcji);
    }

//    @Override
//    String dzwiek() {
//        return "fleeeeecik";
//    }

    @Override
    public String toString() {
        return "Flet" + super.toString();
    }

    @Override
    public String dzwiek() {
        return "fleeeeecik";
    }
}
