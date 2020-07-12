package phoenixm103.demoMicroservice.service;

import org.springframework.stereotype.Service;

import phoenixm103.demoMicroservice.adapterpattern.ITargetCustomer;
import phoenixm103.demoMicroservice.adapterpattern.Adaptee;
import phoenixm103.demoMicroservice.adapterpattern.HomeTownAdapter;

@Service
public class CustomerService {
	
	ITargetCustomer itarget;
	
	public String getCustomersHomeTown() {
		itarget=new HomeTownAdapter(new Adaptee());
		
		return itarget.getCustomersAddress();
		// TODO Auto-generated method stub
		
	}

}
