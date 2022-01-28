public class RachunekBankowy {

    public static double rocznaStopaProcentowa;
    private double saldo;

    public RachunekBankowy(double saldo) {
        this.saldo = saldo;
    }

    public void obliczMiesieczneOdsetki() {

        saldo = saldo + ((saldo * rocznaStopaProcentowa) / 12);

    }

    public static void setRocznaStopaProcentowa(double nowaRocznaStopaProcentowa) {

        rocznaStopaProcentowa = nowaRocznaStopaProcentowa;

    }

    public static double getRocznaStopaProcentowa() {

        return rocznaStopaProcentowa;
    }

    public double getSaldo() {

        return saldo;
    }
}

class TestRachunekBankowy {

    public static void main(String[] args) {

        RachunekBankowy saver1 = new RachunekBankowy(2000);
        RachunekBankowy saver2 = new RachunekBankowy(3000);
        RachunekBankowy.setRocznaStopaProcentowa(0.04);
        saver1.obliczMiesieczneOdsetki();
        saver2.obliczMiesieczneOdsetki();
        System.out.println("SALDO SAVER1 : " + saver1.getSaldo());
        System.out.println("SALDO SAVER2 : " + saver2.getSaldo());
        RachunekBankowy.setRocznaStopaProcentowa(0.05);
        saver1.obliczMiesieczneOdsetki();
        saver2.obliczMiesieczneOdsetki();
        System.out.println("SALDO SAVER1 : " + saver1.getSaldo());
        System.out.println("SALDO SAVER2 : " + saver2.getSaldo());


    }
}

