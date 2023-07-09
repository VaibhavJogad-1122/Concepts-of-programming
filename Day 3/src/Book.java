
public class Book {

	private String bname;
	private int id;
	private String author;
	private float price;
	
	public void setBookName(String bnm)
	{
		bname = bnm;
	}
	
	public String getBookName()
	{
		return bname;
	}
	
	public void setId(int i)
	{
	    id = i;	
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setAuthor(String a)
	{
		author = a;
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	public void setPrice(float p)
	{
	    price = p;	
	}
	
	public float getPrice()
	{
		return price;
	}
	
	public void display()
	{
		System.out.println("---------Display Function:-------- ");
		System.out.println("Book Name: "+bname+" Book Id: "+id+" Name of Author: "+author+" Price: "+price);
	}

}
