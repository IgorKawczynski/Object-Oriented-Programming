package pl.edu.uwm.obiektowe.s162423.kolo2;

import java.util.ArrayList;
import java.util.LinkedList;

public class ProductStockTest {

    public static void main(String[] args) {

        ArrayList<Product> produkty1 = new ArrayList<>(5);

        VideoGame grawideo1 = new VideoGame("gra1", 154, 5400d, "rpg", "cdp", 18);

        Book ksiega1 = new Book("ksiega1", 154, 5200, "isbn1", "autor1");

        produkty1.add(grawideo1);
        produkty1.add(ksiega1);

        Stock stok1 = new Stock(produkty1, 0);

        System.out.println(stok1.getTotalValue());

        stok1.applyDiscount(15);
        System.out.println(stok1.getDiscount());
        System.out.println(stok1.getTotalValue());

        stok1.applyDiscount(40);
        System.out.println(stok1.getDiscount());
        System.out.println(stok1.getTotalValue());

        System.out.println(stok1.getList0());


        // ------------------------------ ostatnie zadanie ----------------------------- //

        System.out.println("\n ------------------------------ ");
        System.out.println("\nOSTATNIE ZADANIE : ");

        LinkedList<StockPosition<Product, Number>> pozycje1 = new LinkedList<>();
        NewStock stock1 = new NewStock(produkty1, 0, pozycje1);
        System.out.println("start discount : " + stock1.getDiscount());
        System.out.println(stock1.getTotalValue());
        stock1.applyDiscount(10);
        System.out.println("new discount : " + stock1.getDiscount());
        System.out.println(stock1.getTotalValue());
        stock1.getSortedByValue(true);

        // warto także sprawdzić zawartość listy w klasie NewStock
//        System.out.println(stock1.getList0());


    }
}
