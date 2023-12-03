package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class SampleArrayListCollection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList obj=new ArrayList();
    
    obj.add(56);
    obj.add("hi");
    obj.add(56.78);
    obj.add('G');
    System.out.println(obj );
    
    /*Iterator  itr =obj.iterator(); 
    while(itr.hasNext())
    {
    	System.out.println(itr.next());
    }*/
    
   // obj.remove(2);
  //  int a=obj.size();
    
    //obj.add(2, 56.8);
    System.out.println(obj.contains(56));
   
    
	}
	}
  
   


