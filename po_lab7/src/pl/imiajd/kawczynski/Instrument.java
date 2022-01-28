package pl.imiajd.kawczynski;

import java.time.LocalDate;
import java.util.Objects;

public abstract  class Instrument {

    private String producent;
    private LocalDate rokProdukcji;

    public Instrument(String producent, LocalDate rokProdukcji){
        this.producent = producent;
        this.rokProdukcji = rokProdukcji;
    }

    abstract void dzwiek();


    public String getProducent() {
        return producent;
    }

    public LocalDate getRokProdukcji() {
        return rokProdukcji;
    }

    @Override
    public String toString() {
        return "Instrument, Producent : " +
                producent +
                ", rokProdukcji : " + rokProdukcji;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instrument that = (Instrument) o;
        return Objects.equals(producent, that.producent) && Objects.equals(rokProdukcji, that.rokProdukcji);
    }
}
