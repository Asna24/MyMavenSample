package multipleinheritanceinterfacesamemethod;

public class Child implements Parent1,Parent2{
	public void show() {
		System.out.println("this is method show");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Child obj=new Child();
   obj.show();
	}

}
