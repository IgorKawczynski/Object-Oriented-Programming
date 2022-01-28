package Zadanie_2_3;
import java.util.ArrayList;
import java.util.HashMap;


public class Student_List{

    private HashMap<Integer, Student> indeks;
    private HashMap<Student, String> ocena;
    private int nextIndex = 162420;

    public Student_List(){

        ocena = new HashMap<>();
        indeks = new HashMap<>();
    }

    public void dodaj_student(String imie, String nazwisko){

        indeks.put(this.nextIndex, new Student(imie, nazwisko, this.nextIndex));

        System.out.printf("Student %s %s z indeksem %d został dodany.\n", imie, nazwisko, this.nextIndex++);
    }

    public void usun_student(int indeks1){

        Student student1 = this.indeks.get(indeks1);
        this.ocena.remove(student1);
        this.indeks.remove(indeks1);

        System.out.printf("Student z indeksem %d został usuniety.\n", indeks1);
    }

    public void dodaj_ocena(int indeks1, String ocena){

        if (indeks.containsKey(indeks1)) {
            if (!this.ocena.containsKey(this.indeks.get(indeks1)))
            {
                this.ocena.put(this.indeks.get(indeks1), ocena);
                System.out.printf("Dodano ocenę %s dla studenta z indeksem %d.\n", ocena, indeks1);
            }
            else
                System.out.printf("Student z indeksem %d ma już wpisaną ocenę. Użyj komendy : 'ZMIEN'.\n", indeks1);
        }
        else
            System.out.println("Nie ma studenta z takim indeksem.");
    }

    public void zmien_ocena(int indeks1, String ocena_nowa){

        System.out.printf("Zmieniono ocene z %s na %s dla studenta o indeksie %s .\n", ocena.get(indeks.get(indeks1)), ocena_nowa, indeks1);
        this.ocena.replace(indeks.get(indeks1), ocena_nowa);
    }

    public void wyswietl(){

        System.out.println("Lista ocen studentow:");
        ArrayList<Student> studenci_lista = new ArrayList<>(ocena.keySet());
        studenci_lista.sort(Student::compareTo);
        for(Student student1: studenci_lista)
            System.out.println(student1.toString() + ": " + ocena.get(student1));
    }
}
