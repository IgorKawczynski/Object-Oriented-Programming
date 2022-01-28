package pl.imiajd.kawczynski;

import java.time.LocalDate;

public class Flet extends Instrument{

    private String kosztFletu;

    public Flet(String producent, LocalDate rokProdukcji, String kosztFletu) {
        super(producent, rokProdukcji);
        this.kosztFletu = kosztFletu;
    }

    @Override
    public void dzwiek() {

    }

    @Override
    public String toString() {
        return "Flet, " + super.toString();
    }
}
