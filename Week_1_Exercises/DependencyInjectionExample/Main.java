package DependencyInjectionExample;

public class Main {
    public static void main(String[] args) {
        // Create a CustomerRepositoryImpl object
        CustomerRepository repository = new CustomerRepositoryImpl();

        // Inject the repository into the CustomerService
        CustomerService customerService = new CustomerService(repository);

        // Use the service to find a customer
        Customer customer = customerService.getCustomerById("001");

        // Display customer information
        if (customer != null) {
            System.out.println("Customer ID: " + customer.getId());
            System.out.println("Customer Name: " + customer.getName());
        } else {
            System.out.println("Customer not found.");
        }
    }
}

