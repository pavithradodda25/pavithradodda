package ass1;

class Product{
    private String productCode;
    private String productName;
    private double productPrice;
    
    public String getProductCode(){
        return productCode;
    }
    public String getProductName(){
        return productName;
    }
    public double getProductPrice(){
        return productPrice;
    }
    
    public void setProductCode(String newProductCode){
        this.productCode = newProductCode;
    }
    public void setProductName(String newProductName){
        this.productName = newProductName;
    }
    public void setProductPrice(double newProductPrice){
        this.productPrice = newProductPrice;
    }
    
}
