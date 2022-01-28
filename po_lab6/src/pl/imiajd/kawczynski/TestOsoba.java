package pl.imiajd.kawczynski;

public class TestOsoba {

    public static void main(String[] args)
    {
        Osoba osoba1 = new Osoba("Wiertalak", "2000");
        Osoba osoba2 = new Osoba("Smolińska", "1966");

        Student student1 = new Student(osoba1.getNazwisko(), osoba1.getRokUrodzenia(), "leśnictwo");
        Student student2 = new Student("Smolińska", "1966", "gastronomia");

        Nauczyciel nauczyciel1 = new Nauczyciel(osoba1.getNazwisko(), osoba1.getRokUrodzenia(), "5300");
        Nauczyciel nauczyciel2 = new Nauczyciel("Smolińska", "1966", "2300");


        System.out.println(osoba1);
        System.out.println(osoba2);
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(nauczyciel1);
        System.out.println(nauczyciel2);

    }

}
