package supermaven;

public class ChildSuperOverriding extends ParentSuperOverriding{
public void display()
{
	super.display();
	System.out.println("this is child class");
	super.display();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildSuperOverriding object=new ChildSuperOverriding();
		object.display();

	}

}
