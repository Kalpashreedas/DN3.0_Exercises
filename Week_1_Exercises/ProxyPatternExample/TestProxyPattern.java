package ProxyPatternExample;

public class TestProxyPattern {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("https://example.com/image1.jpg");
        Image image2 = new ProxyImage("https://example.com/image2.jpg");

        // Load and display image1 for the first time
        System.out.println("Displaying image1 for the first time:");
        image1.display();

        // Load and display image2 for the first time
        System.out.println("\nDisplaying image2 for the first time:");
        image2.display();

        // Display image1 again (should use cached version)
        System.out.println("\nDisplaying image1 again:");
        image1.display();

        // Display image2 again (should use cached version)
        System.out.println("\nDisplaying image2 again:");
        image2.display();
    }
}

