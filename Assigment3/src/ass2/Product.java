
public class Product {
	
	private String productCode;
	private String productName;
	private double productPrice;
	
	Product(String pCode,String pName,double pPrice){
		
		productCode=pCode;
		productName=pName;
		productPrice=pPrice;
		
	}
	
    void displayProductDetails() {
    	System.out.println("Product Code: "+ProductCode());
		System.out.println("Product Name: "+ProductName());
		System.out.println("Product Price: "+ProductPrice());
	}
	
	
	
}
