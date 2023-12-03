package Exception;

public class ArrayIndexSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[]= {1,3,4,};
			
			System.out.println(a[10]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("Exception is handled");
		}
	}

}
