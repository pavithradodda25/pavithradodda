package ass;

public class Product {
	
	private String productCode;
	private String productName;
	private double productPrice;
	private char categoryCode;
	private static int prodCounter=100;
	
	 public Product(String productName, double productPrice, char categoryCode){
	        this.productName=productName;
	        this.productPrice=productPrice;
	        this.categoryCode=categoryCode;
	        this.productCode=generateProductCode(categoryCode);
	    }
	    public Product(String productName, double productPrice){
	        this.productName=productName;
	        this.productPrice=productPrice;
	        this.categoryCode='E';
	        this.productCode=generateProductCode('E');
	    }
	    public void setProductCode(String productCode){
	        this.productCode=productCode;
	    }
	    public String getProductCode(){
	        return productCode;
	    }
	    public void setProductName(){
	        this.productName=productName;
	    }
	    public String getProductName(){
	        return productName;
	    }
	    public void setProductPrice(){
	        this.productPrice=productPrice;
	    }
	    public double getProductPrice(){
	        return productPrice;
	    }
	    public void setCategoryCode(){
	        this.categoryCode=categoryCode;
	    }
	    public char getCategoryCode(){
	        return categoryCode;
	    }
	   
	    int getProdCounter(){
	        return prodCounter;
	    }
	    private String generateProductCode(char categoryCode){
	        this.prodCounter++;
	        return Character.toString(categoryCode)+ Integer.toString(this.prodCounter);
	    }
	    public String getProductDetails(){
	        double price=this.productPrice;
	        char category=this.categoryCode;
	        return "Product : Code - "+this.productCode+", Name - "+this.productName+",price - "+Double.toString(price)+
	        ", Category - "+Character.toString(category);
	       
	    }
}
	
	
	
