
public class Customer {
	
	private String customerName;
	private Address resdentialAddress;
	
	Customer(String cName, Address rAddress){
		customerName=cName;
		resdentialAddress=rAddress;
	}
    
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Address getResdentialAddress() {
		return resdentialAddress;
	}

	public void setResdentialAddress(Address resdentialAddress) {
		this.resdentialAddress = resdentialAddress;
	}

	void getCustomerDetails() {
		System.out.println("Customer :" +customerName +"\n Residential Address :" +resdentialAddress.getAddressLine()+","+resdentialAddress.getCity());
	}
	

}
