// Main.java
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting homework7 ....");
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Apple", 1.2));
        productList.add(new Product("Banana", 0.9));
        productList.add(new Product("Orange", 0.5));
        productList.add(new Product("Grapes", 15.0));

        ProductMarket market = new ProductMarket(productList);

        System.out.println("All names: " + market.getAllNames());
        System.out.println("Names alphabetically: " + market.getNamesAlphabetically());
        System.out.println("Prices greater than 10: " + market.getPricesGreaterThan10());
        System.out.println("Prices less than 0: " + market.getPricesLessThan0());
        System.out.println("Prices as string: " + market.getPricesAsString());
    
    }
}