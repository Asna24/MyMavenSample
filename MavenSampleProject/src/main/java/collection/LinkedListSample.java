package collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  List<Integer> obj=new LinkedList<Integer>();
  obj.add(7);
  obj.add(6);
  obj.add(7);
  obj.add(78);
  System.out.println(obj);
  
  for(int i:obj)
  {System.out.println(i);
	}

}
}
