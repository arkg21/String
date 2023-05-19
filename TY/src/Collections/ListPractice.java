package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class ListPractice 
{
	public static void main(String[] args) 
	{
		ArrayList<Object>list= new ArrayList<Object>();	
		list.add("Archit");
		list.add("Sethupathi");
		list.add("Luffy");
		list.add("Zoro");
		list.add(null);
		list.add(123);
		System.out.println(list);
		
		ArrayList<Integer>ob=new ArrayList<Integer>();
		ob.add(50);
		ob.add(75);
		ob.add(30);
		ob.add(20);
		ob.add(75);
		System.out.println(ob);
		Collections.sort(ob);
		System.out.println(ob);
		
		list.addAll(ob);
		System.out.println(list);
		
		if(list.contains("Archit"))
		{
			System.out.println("It is present");
		}
		else
		{
			System.out.println("It is not present");
		}
		
		for (Integer i : ob) 
		{
		System.out.println(i);	
		}
		
		System.out.println("***************************************************************************************");
		PriorityQueue<Object>pro=new PriorityQueue<Object>();
		pro.add("Virat");
		
		System.out.println("***************************************************************************************");
		HashMap<Integer, String> hash=new HashMap<Integer, String>();
		hash.put(1, "Archit");
		hash.put(2, "One Piece");
		hash.put(3, "Naruto");
		hash.put(4, "Dattebayo");
		hash.put(5, null);
		hash.put(null, "Dattebayo");
		hash.put(6, null);
		hash.put(6, null);
		System.out.println(hash);
		
		for (Entry<Integer, String> i : hash.entrySet() ) 
		{
			System.out.println(i.getKey()+"="+i.getValue());
		} 
		
		System.out.println(hash.containsKey(3));
		System.out.println(hash.containsValue("Dattebayo"));
		System.out.println(hash.containsKey(9));
		System.out.println(hash.containsValue("Itachi"));
		System.out.println(hash.remove(3));
		System.out.println(hash);
		
		System.out.println("***************************************************************************************");
		LinkedHashMap<Integer, String> link=new LinkedHashMap<Integer, String>();
		link.put(1, "Achu");
		link.put(2, "Zoro");
		link.put(3, "Itachi");
		link.put(4, "Pirate");
		link.put(5, null);
		link.put(null, "Dattebayo");
		link.put(6, null);
		link.put(6, null);
		System.out.println(link);
		
		for (Entry<Integer, String> i : link.entrySet() ) 
		{
			System.out.println(i.getKey()+"="+i.getValue());
		} 
		
		System.out.println("***************************************************************************************");
		TreeMap<Integer, String> tree=new TreeMap<Integer, String>();
		tree.put(1, "Anish");
		tree.put(2, "Ani");
		tree.put(3, "Shaa");
		tree.put(5, "LKB");
		tree.put(4, null);
		tree.put(4, "TM");
		System.out.println(tree);
		
		for (Entry<Integer, String> i : tree.entrySet() ) 
		{
			System.out.println(i.getKey()+"="+i.getValue());
		} 
	}


}
