package pl.edu.uwm.obiektowe.s162423.kolo2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;

public class NewStock extends Stock implements IListable, Comparable<NewStock>{

    public LinkedList<StockPosition<Product, Number>> positions;

    public NewStock(ArrayList<Product> list0, float discount, LinkedList<StockPosition<Product, Number>> positions) {
        super(list0, discount);
        this.positions = positions;
    }

    public void addPosition(StockPosition<Product, Number> sp){
        this.positions.add(sp);
        addProduct(sp.getT());
    }

    @Override
    public Stack<Product> getSortedByValue(boolean ascending) {
//        return this.positions;
//        this.positions.sort();
        Stack<Product> stak1 = new Stack<>();
        for(Product p: this.list0){
            stak1.push(p);
        }
        return stak1;
    }


    @Override
    public int compareTo(NewStock o) {
        if(this.getTotalValue() == o.getTotalValue())  // can be done with Double.compare()
            return 0;
        if(this.getTotalValue() > o.getTotalValue())
            return 1;
        else
            return -1;
        }


    @Override
    public double getTotalValue() {
        return super.getTotalValue();
    }
}
