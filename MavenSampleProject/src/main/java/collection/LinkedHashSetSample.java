package collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set obj=new LinkedHashSet(); // first interface last constructor
		obj.add(8);
		obj.add(89);
		obj.add("java");
		obj.add('Z');
		
		System.out.println(obj);
		Set obj1=new LinkedHashSet();
		obj1.add(100);
		obj1.add("helo");
		obj1.add(6);
		
		System.out.println(obj1);
		
		obj1.addAll(obj);
		
		//obj.removeAll(obj1);
		System.out.println(obj);
		

	}

}
