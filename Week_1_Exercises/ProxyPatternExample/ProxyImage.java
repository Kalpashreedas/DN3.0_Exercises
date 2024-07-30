package ProxyPatternExample;

import java.util.HashMap;
import java.util.Map;

public class ProxyImage implements Image {
    private String imageUrl;
    private RealImage realImage;
    private static Map<String, RealImage> imageCache = new HashMap<>();

    public ProxyImage(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = imageCache.get(imageUrl);
            if (realImage == null) {
                System.out.println("Loading image for the first time: " + imageUrl);
                realImage = new RealImage(imageUrl);
                imageCache.put(imageUrl, realImage);
            } else {
                System.out.println("Using cached image: " + imageUrl);
            }
        } else {
            System.out.println("Using existing image object: " + imageUrl);
        }
        realImage.display();
    }
}

