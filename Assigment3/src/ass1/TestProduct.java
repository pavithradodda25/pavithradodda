package ass1;

public class TestProduct
{
	public static void main(String[] args) {
			
		Product pro = new Product();
		pro.setProductCode("P101");
		pro.setProductName("Laptop");
		pro.setProductPrice(15000);
		
		System.out.println("Product Code: "+pro.getProductCode());
		System.out.println("Product Name: "+pro.getProductName());
		System.out.println("Product Price: "+pro.getProductPrice());
	}
}

