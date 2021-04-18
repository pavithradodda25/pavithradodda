package ass;

class TestProduct {
	
	public static void main(String[] args) {
		
		Product product1=new Product("laptop",45000.0,'E');
        System.out.println(product1.getProductDetails());
        Product product2=new Product("Mobile",42000.0);
        System.out.println(product2.getProductDetails());
        
	}
}

