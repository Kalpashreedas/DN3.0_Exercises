package E_Commerce_Platform;
import java.util.Arrays;
public class ProductSearch {
    public static Product linearSearch(Product[] products, String targetName) {
        for (Product product : products) {
            if (product.getProductName().equals(targetName)) {
                return product;
            }
        }
        return null;
    }
    
    public static Product binarySearch(Product[] products, String targetName) {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int comparison = products[mid].getProductName().compareTo(targetName);

            if (comparison == 0) {
                return products[mid];
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        // Example usage
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Smartphone", "Electronics"),
            new Product(3, "Coffee Maker", "Appliances"),
            new Product(4, "Desk Chair", "Furniture")
        };

        // Sort products by productName for binary search
        Arrays.sort(products, (a, b) -> a.getProductName().compareTo(b.getProductName()));

        // Perform searches
        Product resultLinear = linearSearch(products, "Smartphone");
        Product resultBinary = binarySearch(products, "Smartphone");

        System.out.println("Linear Search Result: " + resultLinear);
        System.out.println("Binary Search Result: " + resultBinary);
    }

    
}
