package pl.edu.uwm.obiektowe.s162423.kolo2;

public class Book extends Product{

    public String isbn;
    public String author;

    public Book(String name, long id, double price, String isbn, String author) {
        super(name, id, price);
        this.isbn = isbn;
        this.author = author;
    }

    @Override
    public String toString() {
        return super.toString() +
                "isbn->" + isbn + '|' +
                " author->" + author + '|';
    }
}
