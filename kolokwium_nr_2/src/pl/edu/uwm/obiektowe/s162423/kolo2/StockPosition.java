package pl.edu.uwm.obiektowe.s162423.kolo2;

import java.util.Objects;

public class StockPosition<T extends Product, V extends Number> {

    private T t;
    private V v;

    public StockPosition(T t, V v) {
        this.t = t;
        this.v = v;
    }

    public double getValue(){
        double wynik = 0;
        wynik = wynik + (this.t.getPrice() * (double)this.v);
        return wynik;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StockPosition<Product, Number> that = (StockPosition<Product, Number>) o;
        if(Objects.equals(this.t.getId(), that.t.getId())){
            return true;
        }
        else{
            return false;
        }
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }
}
