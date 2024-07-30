package ObserverPatternExample;

public class TestObserverPattern {
    public static void main(String[] args) {
        // Create stock market for a specific stock
        StockMarket googleStock = new StockMarket("Google");

        // Create observers
        Observer mobileApp = new MobileApp("StockMobile");
        Observer webApp = new WebApp("StockWeb");

        // Register observers
        googleStock.registerObserver(mobileApp);
        googleStock.registerObserver(webApp);

        // Simulate price changes and notify observers
        System.out.println("\nStock price change detected:");
        googleStock.setStockPrice(2800.00);

        // Simulate another price change
        System.out.println("\nStock price change detected:");
        googleStock.setStockPrice(2825.00);

        // Deregister one observer
        googleStock.deregisterObserver(mobileApp);

        // Simulate another price change
        System.out.println("\nStock price change detected:");
        googleStock.setStockPrice(2850.00);
    }
}

