import java.util.Scanner;
class address_update
{
	String firstname, lastname, address, city, state, zip, phonenumber, email;
	public void display()
	{
		System.out.println("First Name :"+firstname+" "+"Last Name :"+lastname+" "+"Address :"+address+" "+"City :"+city+" "+"State :"+state+" "+"Zip :"+zip+" "+"Phonenumber :"+phonenumber+" "+"Email :"+email);
	}
	public void input()
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter your firstname");
		firstname=obj.nextLine();
		System.out.println("Enter your lastname");
		lastname=obj.nextLine();
		System.out.println("Enter your address");
		address=obj.nextLine();
		System.out.println("Enter your city");
		city=obj.nextLine();
		System.out.println("Enter your state");
		state=obj.nextLine();
		System.out.println("Enter your zip");
		zip=obj.nextLine();
		System.out.println("Enter your phonenumber");
		phonenumber=obj.nextLine();
		System.out.println("Enter your email");
		email=obj.nextLine();
	}
}
public class Demo
{
	public static void main(String [] args)
	{
		System.out.println("Welcome to Address Book Program");
		address_update ob=new address_update();
		ob.input();
		ob.display();
    }
}
