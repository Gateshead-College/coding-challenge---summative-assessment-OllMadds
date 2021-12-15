package gym_retailer;

public class Stock {
    String name;
    double price;
    String manufacturer;
    int id;
    int numInStock;

    public Stock(String name, double price, String manufacturer, int id, int numInStock){
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.id = id;
        this.numInStock = numInStock;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getNumInStock() {
        return numInStock;
    }
    public void setNumInStock(int numInStock) {
        this.numInStock = numInStock;
    }
    }

