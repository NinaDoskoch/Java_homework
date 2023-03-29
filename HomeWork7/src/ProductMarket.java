import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductMarket {
    private List<Product> products;

    public ProductMarket(List<Product> products) {
        this.products = products;
    }

    public List<String> getAllNames() {
        return products.stream().map(Product::getName).collect(Collectors.toList());
    }

    public List<String> getNamesAlphabetically() {
        return products.stream().map(Product::getName).sorted().collect(Collectors.toList());
    }

    public List<Double> getPricesGreaterThan10() {
        return products.stream().filter(p -> p.getPrice() > 10).map(Product::getPrice).collect(Collectors.toList());
    }

    public List<Double> getPricesLessThan0() {
        return products.stream().filter(p -> p.getPrice() < 0).map(Product::getPrice).collect(Collectors.toList());
    }

    public String getPricesAsString() {
        return products.stream().map(p -> String.valueOf(p.getPrice())).collect(Collectors.joining(", "));
    }
}
