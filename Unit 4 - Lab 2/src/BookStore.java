
public class BookStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book("The End", 20.5, 100, 20, 10, 4.5);
		Book book2 = new Book("Today", 15.5, 150, 15, 11, 3.5);
		Book book3 = new Book("YES", 30.5, 200);
		
		System.out.println(book1);
		
		
		
		System.out.println(book2);
		
		
		
		System.out.println(book3);
		System.out.println(book3.getbooktitle());
		book3.setnumofpages(90);
		book3.setbooktitle("The Cat and the Hat");
		System.out.println(book3.getbooktitle());
		book3.updateRating(3);
		book3.addInventory(7);
		book3.setprice(.30);
		System.out.println(book3.getprice());
		System.out.println(book3.getnumofcopies());
		System.out.println(book3);
		book3.setnumofpages(10);
		book3.sellInventory(5);
	}

}
