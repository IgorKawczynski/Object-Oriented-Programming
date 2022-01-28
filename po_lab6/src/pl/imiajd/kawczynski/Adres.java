package pl.imiajd.kawczynski;

public class Adres {
    private String ulica;
    private String numer_domu;
    private String miasto;
    private String kod_pocztowy;

    public Adres(String ulica, String numer_domu, String miasto, String kod_pocztowy){
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }

    public Adres(String ulica, String miasto, String kod_pocztowy){
        this.ulica = ulica;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }


    public String getKod_pocztowy() {
        return kod_pocztowy;
    }

    public String getMiasto() {
        return miasto;
    }

    public String getNumer_domu() {
        return numer_domu;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public void setNumer_domu(String numer_domu) {
        this.numer_domu = numer_domu;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public void setKod_pocztowy(String kod_pocztowy) {
        this.kod_pocztowy = kod_pocztowy;
    }

    public String pokaz() {
        return "Kod pocztowy : " + kod_pocztowy +
                ", miasto : " + miasto +
                ", ulica : " + ulica +
                ", numer domu : " + numer_domu;
    }

    public boolean przed(Adres adres2){
        String kod_pocztowy1 = kod_pocztowy.substring(0, 2) + kod_pocztowy.substring(2+1);
        String kod_pocztowy2 = adres2.kod_pocztowy.substring(0, 2) + adres2.kod_pocztowy.substring(2+1);
        return Integer.parseInt(kod_pocztowy1) < Integer.parseInt(kod_pocztowy2);
    }
}


