package collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetSample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set obj=new LinkedHashSet(); // first interface last constructor
		obj.add(8);
		obj.add(89);
		obj.add("java");
		obj.add('Z');
		
		System.out.println(obj);
		
		//obj.clear();
		
		
		//System.out.println(obj.isEmpty());
		//obj.remove(89);
		System.out.println(obj);
		System.out.println(obj.size());
		
		
	}

}
