package Exception;

public class ArithmeticExceptionSample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=2/0;
			System.out.println(a);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			System.out.println("Exception is handled");
		}

	}

}
