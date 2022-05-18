package mar.tisk.uzduotis;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomerController {
	private CustomerRepository repository = new CustomerRepository();
	
	public CustomerController(CustomerRepository repository) {
		this.repository = repository;
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/list")
	public List<Customer> listas() {
		return repository.findAll();
	}
	
	@GetMapping("/test")
	public String asd() {
		return "hey";
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(method=RequestMethod.POST, value="/create")
	public Customer create(@RequestBody Customer c) {
		return repository.create(c);
	}
	
}
