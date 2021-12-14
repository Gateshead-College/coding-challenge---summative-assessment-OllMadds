package gym_retailer;

import java.util.Scanner;

public class Menu_Screen {
    public void menuScreen() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Welcome! What action would you like to take?");
        System.out.println("1 - View stock available");
        System.out.println("2 - Update Stock list");
        int choice = Integer.parseInt(new Scanner(System.in).nextLine());
        if (choice == 1) {
        }
    }

}
