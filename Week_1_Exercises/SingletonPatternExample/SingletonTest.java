package SingletonPatternExample;

public class SingletonTest {
        public static void main(String[] args) {
            // Step 4: Obtain instances of Logger
            Logger logger1 = Logger.getInstance();
            Logger logger2 = Logger.getInstance();
    
            // Test the Singleton property
            if (logger1 == logger2) {
                System.out.println("Logger has a single instance.");
            } else {
                System.out.println("Logger instances are different.");
            }
    
            // Test logging functionality
            logger1.log("This is a test log message.");
    
            // Verify that the same instance is used to log another message
            logger2.log("Logging another message.");
        }  
}
