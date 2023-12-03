package Exception;

public class FinallyKeywordSample {

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
		finally {
			System.out.println("the code is completed");
		}

	}

}
