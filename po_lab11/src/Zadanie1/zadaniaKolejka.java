package Zadanie1;
import java.util.PriorityQueue;


public class zadaniaKolejka{

    public PriorityQueue<Zadanie> zadania_kolejka;


    public zadaniaKolejka() {
        this.zadania_kolejka = new PriorityQueue<>();
    }

    public PriorityQueue<Zadanie> getZadania_kolejka() {
        return zadania_kolejka;
    }

    public void dodaj(int priorytet, String opis){
        this.zadania_kolejka.add(new Zadanie(priorytet, opis));
    }

    public void usun(){
        this.zadania_kolejka.poll(); //deletes first element of queue
    }

    public void wypisz(){
        for(Zadanie z: this.zadania_kolejka){
            System.out.println(z);
        }
    }
}
