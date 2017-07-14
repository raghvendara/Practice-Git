import java.util.Scanner;


public class Faculty extends Person{
	private int employeeId;
	Person person=new Person();
	Faculty(){}
	Faculty(String name,String address,int rollNumber)
	{
		
		person.setName(name);
		person.setAddress(address);
		this.employeeId=rollNumber;
	}
	public void faculty()
	{
		System.out.println("CHOOSE : 1.Enter New Faculty 2.Update Faculty 3.Delete Faculty 4.Search Faculty 5.Exit");
		Scanner scan=new Scanner(System.in);
		char c2=scan.next().charAt(0);
		Faculty faculty=new Faculty();
		/*
		if(c2=='1')
		{
			faculty.newFaculty();
		}
		else if(c2=='2')
		{
			faculty.updateFaculty();
		}
		else if(c2=='3')
		{
			faculty.deleteFaculty();
		}
		else if(c2=='4')
		{
			faculty.searchFaculty();
		}
		else if(c2=='5')
		{
			System.out.println(" Bye Thanks for visiting...!");
			System.exit(0);
		}
		else 
		{
			System.out.println("choose correct..!");
			faculty();
		}
		scan.close();

	}

		
	*/	
	}
	
}
