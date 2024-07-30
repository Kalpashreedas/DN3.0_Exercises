package Financial_Forecasting;

public class FinancialForecasting {

        // Recursive method to calculate future value
        public static double calculateFutureValue(double initialValue, double growthRate, int years) {
            if (years == 0) {
                return initialValue; // Base case
            } else {
                return calculateFutureValue(initialValue * (1 + growthRate), growthRate, years - 1);
            }
        }
    
        public static void main(String[] args) {
            double initialValue = 1000.0; // Initial investment
            double growthRate = 0.05;     // 5% growth rate
            int years = 10;               // Number of years
    
            double futureValue = calculateFutureValue(initialValue, growthRate, years);
            System.out.println("Future Value: $" + futureValue);
        }
        
    
}
