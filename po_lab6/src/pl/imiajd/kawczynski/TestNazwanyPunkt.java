package pl.imiajd.kawczynski;

public class TestNazwanyPunkt
{
    public static void main(String[] args)
    {
        NazwanyPunkt a = new NazwanyPunkt(3, 5, "port");
        a.show();

        Punkt b = new Punkt(3, 5);
        b.show();

        Punkt c = new NazwanyPunkt(3, 6, "tawerna");
        c.show();

        //a = b;               //  --- powoduje błąd kompilacji  (dlaczego ?)
        //a = (NazwanyPunkt) b;  //   --- powoduje błąd wykonania   (dlaczego ?)

//        a = c;                 //--- powoduje błąd kompilacji  (dlaczego ?)
        a = (NazwanyPunkt) c;
        System.out.println("\nTEST");
        a.show();
        b.show();
        c.show();
    }
}




