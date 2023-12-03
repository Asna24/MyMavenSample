package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListSample2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		LinkedList obj=new LinkedList();
		obj.add(89);
		obj.add(7);
		obj.add("hi");
		obj.add('H');
		System.out.println(obj);
		
		
		/*Iterator itr=obj.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());*/
		
		
		//obj.add(2, "helo");
		//obj.addFirst(7);
		//obj.addLast('K');
		
		//System.out.println(obj.indexOf(7));
		System.out.println(obj.contains(8));
		
		
		}

	}


