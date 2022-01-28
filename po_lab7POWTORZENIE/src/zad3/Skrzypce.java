package zad3;

import java.time.LocalDate;

public class Skrzypce extends Instrument {

    public Skrzypce(String producent, LocalDate rokProdukcji) {
        super(producent, rokProdukcji);
    }

    @Override
    String dzwiek() {
        return "skrzyyyyypkiii";
    }

    @Override
    public String toString() {
        return "Skrzypce" + super.toString();
    }

}
