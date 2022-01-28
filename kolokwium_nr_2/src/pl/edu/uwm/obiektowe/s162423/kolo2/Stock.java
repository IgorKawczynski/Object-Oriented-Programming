package pl.edu.uwm.obiektowe.s162423.kolo2;

import java.sql.Array;
import java.util.ArrayList;

public class Stock {

    public ArrayList<Product> list0;
    public float discount = 0;


    public Stock(ArrayList<Product> list0, float discount) {
        this.list0 = list0;
        this.discount = discount;
    }


    public ArrayList<Product> getList0() {
        return list0;
    }

    public void setList0(ArrayList<Product> list0) {
        this.list0 = list0;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public void addProduct(Product p){
        ArrayList<Long> id_list = new ArrayList<>();
        for(Product p2: this.list0){
            id_list.add(p2.getId());
        }
        if(id_list.contains(p.getId())){
            System.out.println("ZDUBLOWANE ID");
        }
        else{
            this.list0.add(p);
        }
    }

    public void applyDiscount(float d){
        if(this.discount + d < 51)
            this.discount = this.discount + d;
        else
            System.out.println("RABAT MOZE MAKSYMALNIE WYNIESC 50");
    }

    public double getTotalValue(){
        double wynik = 0;
        for(Product p3: this.list0){
            wynik = wynik + (p3.getPrice() * ((100-discount)/100)) ;
        }
        return wynik;
    }

}
