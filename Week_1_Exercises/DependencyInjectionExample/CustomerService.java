package DependencyInjectionExample;

public class CustomerService {
    private CustomerRepository customerRepository;

    // Constructor injection for dependency
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer getCustomerById(String id) {
        return customerRepository.findCustomerById(id);
    }
}

