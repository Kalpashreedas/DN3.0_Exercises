package SingletonPatternExample;
public class Logger {
    // Step 2: Private static instance of Logger
    private static Logger instance;

    // Step 2: Private constructor to prevent instantiation
    private Logger() {
        // Optional: Initialization code here (if needed)
    }

    // Step 2: Public static method to get the instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Sample logging method
    public void log(String message) {
        System.out.println("Log message: " + message);
    }
}
