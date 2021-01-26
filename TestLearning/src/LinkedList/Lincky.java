package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;



public class Lincky {
	
	public static void main(String[] args) {
		
		LinkedList<String> linky= new LinkedList<String>();
		
		linky.add("Rob");
		linky.add("Alex");
		linky.add("Jose");
		
		//linky.remove();
		//linky.clear();
		//linky.getLast();
		System.out.println(linky.get(1));
		
		Iterator it=linky.iterator();
		
		while(it.hasNext()) {
			String s=(String) it.next();
			
			if(s=="Rob") {
				System.out.println("we found "+ s);
			}
		}
		
		
	
		
		
		
	}
}
