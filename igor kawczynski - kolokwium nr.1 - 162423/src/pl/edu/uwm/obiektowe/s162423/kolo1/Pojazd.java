package pl.edu.uwm.obiektowe.s162423.kolo1;
import java.sql.Array;
import java.util.ArrayList;
import java.time.Period;
import java.time.LocalDate;

public class Pojazd {

    private String marka;
    private String model;
    private LocalDate dataProdukcji;
    private double cenaBazowa;
    private String Vin;
    private ArrayList<Wyposazenie> wyposażenie = new ArrayList<>(20);

    public Pojazd(String marka, String model, LocalDate dataProdukcji, double cenaBazowa){
        this.marka = marka;
        this.model = model;
        this.dataProdukcji = dataProdukcji;
        this.cenaBazowa = cenaBazowa;
    }


    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public LocalDate getDataProdukcji() {
        return dataProdukcji;
    }

    public double getCenaBazowa() {
        return cenaBazowa;
    }

    public String getVin() {
        return Vin;
    }


    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCenaBazowa(double cenaBazowa) {
        this.cenaBazowa = cenaBazowa;
    }

    public void setVin(String vin) {
        int suma_liter = 0;
        int suma_cyfr = 0;
        for (int i = 0; i < vin.length(); i++) {
            if (vin.charAt(i) > 'A' && vin.charAt(i) < 'Z' && vin.charAt(i) != 'I' && vin.charAt(i) != 'O' && vin.charAt(i) != 'Q') {
                suma_liter = suma_liter + 1;
            }
            if (vin.charAt(i) > '0' && vin.charAt(i) < '9') {
                suma_cyfr = suma_cyfr + 1;
            }
        }
        if ((suma_cyfr + suma_liter) == 17)
            this.Vin = vin;
        else {
            System.out.println("BŁĘDNY NUMER VIN ! ");
        }
    }
    public int getWiek(){
        int wiek = 0;
        LocalDate aktualna_data = LocalDate.now();
        wiek = Period.between(dataProdukcji, aktualna_data).getYears();
        System.out.println("Wiek auta " + getMarka() + " " + getModel() + " to : ");
        return wiek;
    }

    @Override
    public String toString() {
        return "Pojazd marki " +
                marka +
                ", model: " + model +
                " wyprodukowany " + dataProdukcji;
    }

    public void dodajWyposazenie(Wyposazenie wyposazenie1){

        wyposażenie.add(wyposazenie1);

    }

    public double getCenaFinalna(){
        double cenaFinalna = 0;
        for(Wyposazenie w : wyposażenie){
            cenaFinalna = cenaFinalna + w.getCena();
        }
        return cenaFinalna + cenaBazowa;

    }

    public void listWyposazenie(){
        for(Wyposazenie w : wyposażenie){
            System.out.println(w.toString());
        }
    }

    public ArrayList<Wyposazenie> getWyposazenie() {
        return wyposażenie;
    }
}

class TestPojazd {

    public static void main(String[] args) {

        Pojazd audi = new Pojazd("Audi", "A4", LocalDate.of(1998, 11, 12), 84000);
        Pojazd bmw = new Pojazd("BMW", "F36", LocalDate.of(1996, 10, 25), 69000);
        Pojazd mercedes = new Pojazd("MERCEDES", "C10", LocalDate.of(1995, 4, 24), 93000);

        Wyposazenie wyposazenie1 = new Wyposazenie("Skóra", 6000);
        Wyposazenie wyposazenie2 = new Wyposazenie("Alufelgi", 4500);
        Wyposazenie wyposazenie3 = new Wyposazenie("Szyby", 3000);
        Wyposazenie wyposazenie4 = new Wyposazenie("Skóra", 5400);
        Wyposazenie wyposazenie5 = new Wyposazenie("Turbo", 9000);

        audi.dodajWyposazenie(wyposazenie1);
        bmw.dodajWyposazenie(wyposazenie2);
        mercedes.dodajWyposazenie(wyposazenie3);
        audi.dodajWyposazenie(wyposazenie4);
        audi.dodajWyposazenie(wyposazenie5);

        ArrayList<Pojazd> garaz = new ArrayList<>(5);
        garaz.add(audi);
        garaz.add(bmw);
        garaz.add(mercedes);
        for(Pojazd p : garaz){
            System.out.println(p + ", jego cena bazowa to : " + p.getCenaBazowa());
            p.listWyposazenie();
            System.out.println("Sumaryczna wartość pojazdu to : "+ p.getCenaFinalna());
            System.out.println("\n");

        }

        //PRZYKŁADOWE TESTY NIE BĘDĄCE W POLECENIU KOLOKWIUM
//        bmw.setVin("VGM418UTY612PES43");
//        System.out.println(bmw.getVin());
//        audi.setVin("IGM418UTY612PES43"); // BŁĘDNY, ZAWIERA ZNAK ,, I ''
//        System.out.println(audi.getVin());
//        audi.listWyposazenie();
//        System.out.println(audi.getWiek());

    }
}