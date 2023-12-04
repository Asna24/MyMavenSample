package aggregation;

public class Employee {
String name;
int id;
Address address;  // Create instance variable of first class
Employee(String name, int id,Address address)
{
	this.name=name;
	this.id=id;
	this.address=address; // do every steps doing in previous instance variables
}
public void display() {
	System.out.println(name+ "   " + id );
	System.out.println(address.city + "  " + address.state + "  " +address.country);// to refer the first class
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address1=new Address("trivandrum","kerala","india");
		Address address2 = new Address("chennai", "tamil nadu", "india");
		
		Employee e1= new Employee("Anu",689,address1); // address 1 to refer first class object
		Employee e2= new Employee("sidhu",7899,address2);
		
		e1.display();
		e2.display();
		
	}

}
