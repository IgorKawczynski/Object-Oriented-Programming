package pl.edu.uwm.obiektowe.s162423.kolo1;

public class Wyposazenie {

        String nazwa;
        double cena;

        public Wyposazenie(String nazwa, double cena){
            this.nazwa = nazwa;
            this.cena = cena;
        }


        public String getNazwa() {
            return nazwa;
        }

        public double getCena() {
            return cena;
        }

        public void setNazwa(String nazwa) {
            this.nazwa = nazwa;
        }

        public void setCena(double cena) {
            this.cena = cena;
        }

        @Override
        public String toString() {
            return "Wyposazenie: " + nazwa +
                    ", cena: " + cena;
        }
}
