package demo;

public class Person {
	String Name = new String();
	int Age ;
	String Occupation ;
	
	public Person(String Name,int Age, String Occupation) {
		this.Name=Name;
		this.Age = Age;
		this.Occupation = Occupation;
	}
	
	public void print() {
		System.out.println("Name: "+Name+" Age: "+Age+" Occupation: "+Occupation);
	}
}
