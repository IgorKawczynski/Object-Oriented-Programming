package pl.edu.uwm.obiektowe.s162423.kolo2;

public abstract class Product {

    public String name;
    public long id;
    public double price;

    public Product(String name, long id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product:" +
                "name->" + name + '|' +
                " id->" + id + '|' +
                " price->" + price + '|';
    }

}
