
public class Employee {
private int id;
private String name;
private Date dob = new Date();


public void acceptInfo(int i, String nm, int dd, int mm, int yy)
{
	id = i;
	name = nm;
	dob.acceptDate(dd, mm, yy);
}

public void display()
{
	System.out.println("Employee Info:");
	System.out.println("Name:"+name);
	System.out.println("Id:"+id);
	System.out.print("DoB:");
	dob.display();
}

}
