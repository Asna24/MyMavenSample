package supermaven;

public class SuperConstructorChild extends SuperConstructorParent {

	SuperConstructorChild()
	{
		//super(); already exist by default
		System.out.println("this is child");
		
		//super(); error
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperConstructorChild obj1 =new SuperConstructorChild();
	}

}
