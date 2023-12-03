package Exception;

public class ExceptionSample {
	public void show() {
	try {
		int a=2/0;
		System.out.println(a);
	}
	catch(ArithmeticException e) {
		System.out.println(e);
		System.out.println("Exception is handled");
		
	}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionSample obj=new ExceptionSample();
		obj.show();
	}

}
