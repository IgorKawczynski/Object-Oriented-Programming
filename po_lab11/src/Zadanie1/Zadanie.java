package Zadanie1;


public class Zadanie implements Comparable<Zadanie>{
    public int priorytet;
    public String opis;

    public Zadanie(int priorytet, String opis) {
        if(priorytet>0 && priorytet < 10)
            this.priorytet = priorytet;
        else
            throw new RuntimeException("PRIORYTET MUSI BYĆ DODATNIĄ LICZBĄ JEDNOCYFROWĄ !\n");
        this.opis = opis;
    }

    public int getPriorytet() {
        return priorytet;
    }

    public void setPriorytet(int priorytet) {
        if(this.priorytet > 0 && this.priorytet < 10)
            this.priorytet = priorytet;
        else
            throw new RuntimeException("PRIORYTET MUSI BYĆ DODATNIĄ LICZBĄ JEDNOCYFROWĄ !\n");
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    @Override
    public String toString() {
        return "Zadanie{" +
                "priorytet=" + priorytet +
                ", opis='" + opis + '\'' +
                "} ";
    }

    @Override
    public int compareTo(Zadanie z) {
        if(this.priorytet == z.getPriorytet())
            return 0;
        if(this.priorytet > z.getPriorytet())
            return 1;
        else
            return -1;
        // OR JUST ONLY return Integer.compare(this.priorytet, z.getPriorytet());
    }
}
