package gym_retailer;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    ArrayList<Stock> stk = new ArrayList<>();
    private boolean exit = false;

    public void getData() {
        Initialise init = new Initialise();
        while(!exit)
            menu();
    }


    public static void main(String[] args) {
        Main m = new Main();
        m.menu();
        m.stockList();
        m.displayStockList();
    }

    private void stockList() {
        stk.add(new Stock("Olympic Barbell", 294.70, "Rogue", 1001, 99));
        stk.add(new Stock("Weight Plate Set", 349.00, "Primal Strength", 1002, 99));
        stk.add(new Stock("20kg Plate Pair", 127.28, "Rogue", 1003, 99));
        stk.add(new Stock("'Change Plates' (Pair of 1.25kg and 2.5kg)", 77, "Rogue", 1004, 99));
        stk.add(new Stock("Flat Bench", 147, "Again Faster", 1005, 99));
        stk.add(new Stock("Adjustable Bench", 242, "Again Faster", 1006, 99));
    }

    private void displayStockList() {
        for (Stock s : stk) {
            System.out.println(s.name + ", " + "£" + s.price + ", Manufacturer: " + s.manufacturer + ", Product ID: " + s.id + ", " + s.numInStock + " Available");
        }

    }

    private void menu() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Welcome! What action would you like to take?");
        System.out.println("1 - View stock available");
        System.out.println("2 - Edit a stocked item");
        System.out.println("3 - Add a new item to the Stock list");
        System.out.println("4 - Delete an item from the stock list");
        System.out.println("5 - Exit");
        int choice = Integer.parseInt(new Scanner(System.in).nextLine());
        handleChoice(choice);
    }

    private void handleChoice(int choice) {
        switch (choice) {
            case 1:
                displayStockList();
                break;
            case 2:
               updateStockItem();
                break;
            case 3:
               addStockItem();
                break;
            case 4:
               deleteStockItem();
                break;
            default:
                System.out.println("Input not recognised, please try again.");
                break;
        }
    }
    private void updateStockItem(){
        System.out.println("Please enter the ID number of the item you would like to edit:");
        int id = Integer.parseInt(new Scanner(System.in).nextLine());
        Stock updateStockItem = null;
        for (Stock s : stk) {
            if (s.id == id) {
                updateStockItem = s;
                break;
            }
        }
        System.out.println("Which detail would you like to edit?");
        System.out.println("1 - ID Number");
        System.out.println("2 - Name");
        System.out.println("3 - Manufacturer");
        System.out.println("4 - Price");
        System.out.println("5 - Number in Stock");
        int choice = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println("Please enter in a new value for that field:");
        if (updateStockItem != null) {
            if (choice == 1) {
                updateStockItem.id = Integer.parseInt(new Scanner(System.in).nextLine());
            }
            else if (choice == 2)  {
                updateStockItem.name = new Scanner(System.in).nextLine();
            }
            else if (choice == 3) {
                updateStockItem.manufacturer = new Scanner(System.in).nextLine();
            }
            else if (choice == 4) {
                updateStockItem.price = Double.parseDouble(new Scanner(System.in).nextLine());
            }
            else if (choice == 5) {
                updateStockItem.numInStock = Integer.parseInt(new Scanner(System.in).nextLine());
            }
            else {
                System.out.println("Invalid input. Please try again.");
                updateStockItem();
            }
        }
    }

    private void addStockItem(){
        System.out.println("Please enter the details of the product you'd like to add");
        System.out.println("Product name: ");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Product price: ");
        double price = Double.parseDouble(new Scanner(System.in).nextLine());
        System.out.println("Manufacturer: ");
        String manufacturer = new Scanner(System.in).nextLine();
        System.out.println("Product ID: ");
        int id = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println("Number in stock: ");
        int numInStock = Integer.parseInt(new Scanner(System.in).nextLine());
        stk.add(new Stock(name, price, manufacturer, id, numInStock));
    }
    private void deleteStockItem() {
        System.out.println("Which product would you like to remove?");
        int count = 1;
        for (Stock s: stk) {
            System.out.println(count + " - " + s.name);
            count ++;
        }
        int choice = Integer.parseInt(new Scanner(System.in).nextLine());
        stk.remove(choice - 1);
    }
}



