package gym_retailer;

public class User {
    String username;
    String password;
    String forename;
    String surname;
    int employeeID;
    boolean admin;

    public User(String username, String password, String forename, String surname, int employeeID, boolean admin) {
        this.username = username;
        this.password = password;
        this.forename = forename;
        this.surname = surname;
        this.employeeID = employeeID;
        this.admin = admin;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
    public boolean isAdmin() {
        return admin;
    }
    }