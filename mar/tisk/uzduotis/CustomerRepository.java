package mar.tisk.uzduotis;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;



@Repository
public class CustomerRepository {
	List<Customer> customers = new ArrayList<>();
	
	public CustomerRepository() {
		customers.add(new Customer("Test", "Test", "2015-01-01", 12345, "mail@test.lt"));
	}
	
	public List<Customer> findAll(){
		return customers;
	}
	public Customer create(Customer c) {
		customers.add(c);
		return c;
	}
}
