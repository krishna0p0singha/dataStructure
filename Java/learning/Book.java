class Book{
	String name;
	double price;
	String author;
	public static void main(String [] args){
		Book b1=new Book();
		Book b2=b1;
		Book b3=null;
		b1.name="Core Java";
		b2.price =550;
		b3.author="";
		System.out.println(b1.name);
		System.out.println(b1.price);
		System.out.println(b1.author);
	}
}