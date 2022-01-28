package zad3;

import java.time.LocalDate;

abstract class Instrument {

    private String producent;
    private LocalDate rokProdukcji;


    public Instrument(String producent, LocalDate rokProdukcji) {
        this.producent = producent;
        this.rokProdukcji = rokProdukcji;
    }


    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public LocalDate getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(LocalDate rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    abstract String dzwiek();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instrument that = (Instrument) o;
        return producent.equals(that.producent) && rokProdukcji.equals(that.rokProdukcji);
    }

    @Override
    public String toString() {
        return
                ", Producent = " + producent + '\'' +
                ", Rok produkcji=" + rokProdukcji;
    }
}
