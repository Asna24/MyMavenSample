package ExceptionThrow;

public class ThrwoSample {
	public void validate(int age) {
		if (age<18) {
			throw new ArithmeticException("person is not eligible");
		}
		else
		{System.out.println("Eligible");}
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrwoSample obj=new ThrwoSample();
		obj.validate(14);
		//obj.validate(19);
	}

}
 