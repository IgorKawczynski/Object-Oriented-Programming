package zad3;

import java.time.LocalDate;

public class Fortepian extends Instrument{

    public Fortepian(String producent, LocalDate rokProdukcji) {
        super(producent, rokProdukcji);
    }

    @Override
    String dzwiek() {
        return "forteeeeeepix";
    }

    @Override
    public String toString() {
        return "Fortepian" + super.toString();
    }

}
