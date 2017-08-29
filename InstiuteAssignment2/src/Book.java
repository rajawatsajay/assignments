
public class Book {

	  private String Book_title;
	  private int Book_price;
	  
	  public Book(String book_title, int book_price)
	  {
	    this.Book_title = book_title;
	    this.Book_price = book_price;
	  }
	  
	  public String getBook_title()
	  {
	    return this.Book_title;
	  }
	  
	  public void setBook_title(String book_title)
	  {
	    this.Book_title = book_title;
	  }
	  
	  public int getBook_price()
	  {
	    return this.Book_price;
	  }
	  
	  public void setBook_price(int book_price)
	  {
	    this.Book_price = book_price;
	  }
	  
	  void createBook()
	  {
	    System.out.println("Book is create");
	  }
	  
	  void showBook()
	  {
	    System.out.println("Book_title:" + this.Book_title + " " + "Book_price:" + this.Book_price);
	  }
}
