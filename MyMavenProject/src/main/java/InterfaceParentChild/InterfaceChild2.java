package InterfaceParentChild;

public class InterfaceChild2 implements InterfaceParent{
	public void add() {
		System.out.println("thi is second child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//InterfaceChild2  obj = new InterfaceChild2 ();
		//obj.add();
		//InterfaceChild1 obj1 =  new InterfaceChild1();
		//obj1.add();
		
		InterfaceParent obj =new InterfaceChild1();
		obj.add();
	}

}
