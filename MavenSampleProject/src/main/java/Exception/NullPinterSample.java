package Exception;

public class NullPinterSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String a=null;
			System.out.println(a.length());
		}
		catch(NullPointerException e) {
			System.out.println(e);
			System.out.println("Exception is handled");
		}
	}

}
