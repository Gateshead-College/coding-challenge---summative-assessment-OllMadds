package gym_retailer;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {

    ArrayList<User> users;

    public static void main(String[] args) {
        Login l = new Login();
        l.users = l.getUsers();
        while(true)
            l.checkDetails();
    }
    public ArrayList<User> getUsers() {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("OllMadds", "password", "Ollie", "Maddsion", 101, true));
        users.add(new User("ChaXby", "password1", "Chloe", "Haxby", 102, true));
        users.add(new User("DiscoHalls", "password2", "James", "Halls", 103, false));
        users.add(new User("MeepScott", "password3", "Martin", "Scott", 101, true));
        return users;
    }
    public void checkDetails(){
        System.out.println("Username: ");
        String username = new Scanner(System.in).nextLine();
        System.out.println("Password: ");
        String password = new Scanner(System.in).nextLine();
        for (User u: users) {
            if (username.equals(u.username)) {
                if (password.equals(u.password)) {
                    MainMenu mm = new MainMenu();
                    mm.getData(u);
                    break;
                }
            }
            System.out.println("Incorrect username and/or password. Please try again.");
        }
    }
}

