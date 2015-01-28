package TEst;

public class Test1 
{
	int i;
	String name;
	String lastname;
	
	void display()
	{
		System.out.println("Test " +i);
		System.out.println("String name " +name);
		//System.out.println("String name " +lastname);
	}
	
	void display1()
	{
		System.out.println("Test " +i);
		System.out.println("String name " +name);
		System.out.println("String name " +lastname);
	}

	void insert(int a, String name)
	{
		i = a;
		this.name = name;
	}
	
	void insert (int a, String name, String Lname)
	{
		i = a;
		this.name = name;
		lastname = Lname;
	}
	
	public static void main(String[] args)
	{
		Test1 objte = new Test1();
		objte.insert(5, "testname goes here");
		objte.display();
		objte.insert(6, "Overload", "Multiple ar");
		objte.display1();
		
	}
	
}
