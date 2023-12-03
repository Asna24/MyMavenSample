package Exception;

public class NumberFormatExceptionSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String a="hai";
			int i= Integer.parseInt(a);
			System.out.println(i);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
			System.out.println("Exception is handled");
		}
	}

}
