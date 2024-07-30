package Inventory_Management_System;
import java.util.HashMap;
import java.util.Map;

public class inventoryManager {
   

    private Map<String, Product> inventory = new HashMap<>();

    // Add a product
    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    // Update a product
    public void updateProduct(String productId, Product updatedProduct) {
        inventory.put(productId, updatedProduct);
    }

    // Delete a product
    public void deleteProduct(String productId) {
        inventory.remove(productId);
    }

    // Retrieve a product
    public Product getProduct(String productId) {
        return inventory.get(productId);
    }

}
