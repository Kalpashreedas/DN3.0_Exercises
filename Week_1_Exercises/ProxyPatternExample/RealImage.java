package ProxyPatternExample;

public class RealImage implements Image {
    private String imageUrl;

    public RealImage(String imageUrl) {
        this.imageUrl = imageUrl;
        loadImageFromServer();
    }

    // Simulate loading an image from a remote server
    private void loadImageFromServer() {
        System.out.println("Loading image from server: " + imageUrl);
        // Simulating delay for image loading
        try {
            Thread.sleep(2000); // Simulating delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + imageUrl);
    }
}

