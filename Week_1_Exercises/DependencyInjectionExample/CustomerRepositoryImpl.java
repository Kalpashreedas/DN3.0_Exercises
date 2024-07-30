package DependencyInjectionExample;

import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {
    private Map<String, Customer> customerData;

    public CustomerRepositoryImpl() {
        // Sample data for demonstration purposes
        customerData = new HashMap<>();
        customerData.put("001", new Customer("001", "Alice"));
        customerData.put("002", new Customer("002", "Bob"));
    }

    @Override
    public Customer findCustomerById(String id) {
        return customerData.get(id);
    }
}

