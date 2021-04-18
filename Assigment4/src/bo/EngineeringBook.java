package bo;

public class EngineeringBook extends Book {
	
	private String category;

	public EngineeringBook(int bookNo, String title, String author, float price, String cate) {
		super(bookNo, title, author, price);
		category=cate;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	void getEngineeringBook() {
		System.out.println(getBookNo()+"\n"+getTitle()+"\n"+getAuthor()+"\n"+getPrice()+"\n"+category);
	}

	public static void main(String[] args) {
		EngineeringBook ebook = new EngineeringBook(100,"java","uuu",899,"hgg");
		ebook.getEngineeringBook();
	}

}
