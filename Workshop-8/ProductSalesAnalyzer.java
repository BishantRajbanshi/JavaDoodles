import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductSalesAnalyzer {
    public static void main(String[] args) {
        ProductSalesAnalyzer analyzer = new ProductSalesAnalyzer();
        Map<String, Double> productSales = analyzer.readProductSales("products.txt");
        Map<String, Double> averageSales = analyzer.calculateAverageSales(productSales);
        analyzer.exportToCSV(averageSales, "average_sales.csv");
        System.out.println("Average sales exported to average_sales.csv");
    }

    public Map<String, Double> readProductSales(String filePath) {
        Map<String, Double> productSales = new HashMap<>();
        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                if (!line.isEmpty()) {
                    String[] parts = line.split(";");
                    if (parts.length == 2) {
                        String product = parts[0].trim();
                        double price = Double.parseDouble(parts[1].trim().replace(",", ""));
                        productSales.put(product, productSales.getOrDefault(product, 0.0) + price);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
        return productSales;
    }

    public Map<String, Double> calculateAverageSales(Map<String, Double> productSales) {
        Map<String, Double> averageSales = new HashMap<>();
        for (Map.Entry<String, Double> entry : productSales.entrySet()) {
            String product = entry.getKey();
            double totalPrice = entry.getValue();
            int count = 1;
            if (averageSales.containsKey(product)) {
                totalPrice += averageSales.get(product);
                count++;
            }
            double averagePrice = totalPrice / count;
            averageSales.put(product, averagePrice);
        }
        return averageSales;
    }

    public void exportToCSV(Map<String, Double> data, String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("Product,Average Sales\n");
            for (Map.Entry<String, Double> entry : data.entrySet()) {
                writer.write(entry.getKey() + "," + entry.getValue() + "\n");
            }
        } catch (IOException e) {
            System.err.println("Error exporting to CSV: " + e.getMessage());
        }
    }
}
