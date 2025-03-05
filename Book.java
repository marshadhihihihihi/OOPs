class Book {
	
	private String title;
	private String author;
	private String ISBN;
	private double price;
	
	public Book (String title,String author) {
		
		this.title = title;
		this.author = author;
		this.ISBN = "unknown"; // default
		this.price = 100.0; // default
		
	}
	
	public Book (String title,String author,String ISBN) {
		
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.price = 100.0; // default
		
	}
	
	public Book (String title,String author,String ISBN,double price) {
		
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.price = price;
		
	}
	
	String getBookDetails () {
		
		return "title : "+title+", author : "+author+", ISBN : "+ISBN+", price : "+price;
		
	}
	
	public static void main (String...args) {
		
		Scanner sc = new Scanner(System.in);
		
		Book[] books = new Book[2];
		
		for (int i = 0; i < books.length; i++) {
			
			System.out.print("Enter the book title : ");
			String title = sc.nextLine();
			
			System.out.print("Enter the author's name : ");
			String author = sc.nextLine();
			
			System.out.print ("Enter the ISBN : ");
			String isbn = sc.nextLine();
			
			System.out.print ("Enter the price : ");
			double price = sc.nextDouble();
			sc.nextLine();
			
			books[i] = new Book (title,author,isbn,price);
			System.out.println();
		}
		
		System.out.println ("Book details");
		for (Book a : books) {
			
			System.out.println (a.getBookDetails());
			
		}
	
	}
}