package zadanie2;


public class TestAdres{

    public static void main(String[] args)
    {
        Adres adres1 = new Adres("Zamoyskiego", "54", "Żeromin", "09-300");
        Adres adres2 = new Adres("Żeromińska", "3", "Raciąż", "09-301");

        System.out.println(adres1.pokaz());
        System.out.println(adres2.pokaz());

        System.out.println(adres1.przed(adres2));
        System.out.println(adres2.przed(adres1));

    }

}
