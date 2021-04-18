
public class TestProduct {
	
	public static void main(String[] args) {
		Address address=new Address("1st Main HSR Layout","Bangalore");
		Customer customer = new Customer("John",address);
		customer.getCustomerDetails();
	}

}
