import java.util.Arrays;
import java.util.Comparator;
class Product {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
    public String toString() {
        return productId + " - " + productName + " (" + category + ")";
    }
}
class SearchUtility {

    public static Product linearSearch(Product[] products, int targetId) {
        for (Product product : products) {
            if (product.productId == targetId) {
                return product;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, int targetId) {
        int left = 0, right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (products[mid].productId == targetId) {
                return products[mid];
            } else if (products[mid].productId < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }

    public static void sortProducts(Product[] products) {
        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));
    }
}

public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product(102, "Laptop", "Electronics"),
                new Product(101, "Shirt", "Fashion"),
                new Product(105, "Coffee Maker", "Home"),
                new Product(103, "Phone", "Electronics"),
                new Product(104, "Heels", "Footwear")
        };

        System.out.println("Linear Search");
        Product result1 = SearchUtility.linearSearch(products, 103);
        System.out.println(result1 != null ? "Product "+result1 +" found" : "Product not found");

        System.out.println("\nBinary Search");
        SearchUtility.sortProducts(products);
        Product result2 = SearchUtility.binarySearch(products, 101);
        System.out.println(result2 != null ? "Product "+result2+" found" : "Product not found");
    }
}
