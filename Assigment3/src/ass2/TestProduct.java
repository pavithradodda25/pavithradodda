package ass2

public class TestProduct {

	public static void main(String[] args) {
		
		Product pro = new Product();
		pro.displyProductCode("P101");
		pro.displayProductName("Laptop");
		pro.displayProductPrice(15000);
		
		System.out.println("Product Code: "+pro.displayProductCode());
		System.out.println("Product Name: "+pro.displayProductName());
		System.out.println("Product Price: "+pro.displayProductPrice());
	}

}
