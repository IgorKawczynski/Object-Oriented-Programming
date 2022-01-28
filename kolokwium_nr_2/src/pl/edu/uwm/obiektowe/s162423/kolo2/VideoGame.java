package pl.edu.uwm.obiektowe.s162423.kolo2;

public class VideoGame extends Product{

    public String genre;
    public String studio;
    public int pegi;

    public VideoGame(String name, long id, double price, String genre, String studio, int pegi) {
        super(name, id, price);
        this.genre = genre;
        this.studio = studio;
        this.pegi = pegi;
    }

    @Override
    public String toString() {
        return super.toString() +
                " genre->" + genre + '|' +
                " studio->" + studio + '|' +
                " pegi->" + pegi + '|' ;
    }
}
