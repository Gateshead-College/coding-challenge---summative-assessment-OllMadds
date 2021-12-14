package gym_retailer;

import java.util.ArrayList;


public class Main {
    ArrayList<Stock> stk = new ArrayList<>();

    public static void main(String[] args) {
        Main m = new Main();
        m.stockList();
        m.displayStockList();
    }

    public void stockList() {
        stk.add(new Stock("Olympic Barbell", 294.70, "Rogue", "A001", 99));
        stk.add(new Stock("Weight Plate Set", 349.00, "Primal Strength", "A002", 99));
        stk.add(new Stock("20kg Plate Pair", 127.28, "Rogue", "A003", 99));
        stk.add(new Stock("'Change Plates' (Pair of 1.25kg and 2.5kg)", 77, "Rogue", "A004", 99));
        stk.add(new Stock("Flat Bench", 147, "Again Faster", "A005", 99));
        stk.add(new Stock("Adjustable Bench", 242, "Again Faster", "A006", 99));
    }
    public void displayStockList() {
        for (Stock s: stk) {
            System.out.println(s.name + ", " + "£" + s.price + ", " + s.manufacturer + ", " + s.id + ", " + s.numInStock + " Available");

        }

    }
}


