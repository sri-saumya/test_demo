package demo;
import java.util.*;


public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter :");
		String Name = sc.next();
		int Age = sc.nextInt();
		String Occ = sc.next();
		
		
		Person person = new Person(Name,Age,Occ);
		person.print();

	}

}
