
public class Address {
	
	private String addressLine;
	private String city;
	
	Address(String aLine,String City){
		
		addressLine=aLine;
		city=City;
		
	}
	

	public String getAddressLine() {
		return addressLine;
	}


	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}
	
	void getAddressDetails() {
		System.out.println(addressLine +"," +city);
	}

}
