package excelread;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//String d = ExcelCode.getIntegerData(1, 1);
		//System.out.println(d);

		System.out.println(ExcelCode.getStringData(1, 0));
		System.out.println(ExcelCode.getIntegerData(1, 1));

	}

}
