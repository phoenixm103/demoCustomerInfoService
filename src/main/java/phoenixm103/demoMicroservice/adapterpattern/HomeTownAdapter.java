package phoenixm103.demoMicroservice.adapterpattern;

import org.springframework.beans.factory.annotation.Autowired;





public class HomeTownAdapter implements ITargetCustomer {
	
	@Autowired
	private Adaptee adaptee;
	
	public HomeTownAdapter(Adaptee adaptee) {
		this.adaptee=adaptee;	
	}
	
	@Override
	public String getCustomersAddress() {
		// TODO Auto-generated method stub
		
		return adaptee.getustomersHomeTown();
		
	}
}
