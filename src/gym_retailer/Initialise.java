package gym_retailer;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Initialise {
    static File stockFile = new File("C:/Users/OllieM/Desktop/Stock.txt");
    public void createFileIfNotExists() {
        try {
            if (!stockFile.isFile()) {
                stockFile.createNewFile();
            }
        }
        catch (IOException ioEx) {
            System.out.println("Encountered an error trying to create text file");
            ioEx.printStackTrace();
        }
    }
    public static void writeData(ArrayList<Stock> stocks) {
        try {
            FileWriter writer = new FileWriter(stockFile);
            for (Stock s: stocks) {
                writer.write(s.id + ", " + s.manufacturer + ", " + s.name + ", " + s.price + ", " + s.numInStock);
                writer.write("\n");
            }
            writer.close();
        }
        catch (IOException ioex) {
            System.out.println("Failed to write to file");
            ioex.printStackTrace();
        }
    }
    public ArrayList<String> readFile(File file) {
        createFileIfNotExists();
        ArrayList<String> lines = new ArrayList<>();
        try {
            FileReader reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader);
            String line;
            while((line = br.readLine()) != null) {
                lines.add(line);
            }
            reader.close();
        }
        catch (IOException ioex) {
            System.out.println("Failed to read the file");
            ioex.printStackTrace();
        }
        return lines;
    }
    private Stock getStockFromString(String stockString) {
        Stock s;
        String[] pd = stockString.split(",");
        s = new Stock(pd[0], Double.parseDouble(pd[1]), pd[2], Integer.parseInt(pd[3]), Integer.parseInt(pd[4]));
        return s;
    }
    public ArrayList<Stock> getStocks (ArrayList<String> stockStrings) {
        ArrayList<Stock> stocks = new ArrayList<>();
        for (String s : stockStrings) {
            stocks.add(getStockFromString(s));
        }
        return stocks;
    }
}
