public class Zadania implements Comparable<Zadania>{

    public int priorytet;
    public String opis;


    public Zadania(int priorytet, String opis) {
        if(priorytet>0 & priorytet<9){
            this.priorytet = priorytet;
            this.opis = opis;
        }
        else
            System.out.println("PRIORYTET MUSI BYC DODANIA LICZBA JEDNOCYFROWĄ");
    }


    public int getPriorytet() {
        return priorytet;
    }

    public void setPriorytet(int priorytet) {
        this.priorytet = priorytet;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zadania zadania = (Zadania) o;
        return priorytet == zadania.priorytet && opis.equals(zadania.opis);
    }

    @Override
    public String toString() {
        return "Zadanie " +
                opis +
                " o priorytecie " + priorytet;
    }


    @Override
    public int compareTo(Zadania o) {
        return Integer.compare(this.priorytet, o.getPriorytet());
    }
}
