package phoenixm103.demoMicroservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import phoenixm103.demoMicroservice.service.CustomerService;



@RestController
public class CustomersAddressController {
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(method=RequestMethod.GET, value = "/hometown")
	public String getCustomersHomeTown() {
		return customerService.getCustomersHomeTown();
		
	}		
}
