import java.util.Random;

import hashTable.*;

public class Test {

	public static void main(String[] args) {
		HashTable<Integer, String> hashtable = new SeparateChaining<Integer,String>();
		
		/*
		hashtable.put(4,"omar1");
		System.out.println((String)hashtable.get(4));
		System.out.println(hashtable.contains(4));
		System.out.println(hashtable.size());
		System.out.println(hashtable.isEmpty());
		
		System.out.println();
		
		hashtable.delete(4);
		System.out.println(hashtable.get(4));
		System.out.println(hashtable.contains(4));
		System.out.println(hashtable.size());
		System.out.println(hashtable.isEmpty());
		
		System.out.println();
		
		hashtable.put(4,"omar2");
		System.out.println((String)hashtable.get(4));
		System.out.println(hashtable.contains(4));
		System.out.println(hashtable.size());
		System.out.println(hashtable.isEmpty());
		
		
		System.out.println();
		
		hashtable.put(3,"omar3");
		System.out.println((String)hashtable.get(3));
		System.out.println(hashtable.contains(3));
		System.out.println(hashtable.size());
		System.out.println(hashtable.isEmpty());
		
		System.out.println();
		*/
		String[] names = {"omar","omar2","omar3","omar4","omar5"};
		
		Random r = new Random();
		
		for(int i=0;i<1000;i++)
		{	
			int index = Math.abs(r.nextInt(1000));
			
			hashtable.put(index, names[0]+""+i);
			
			System.out.println(hashtable.get(i));
			System.out.println(hashtable.size());
		}
		
		for (int i = 0; i < 1000; i++) {
			System.out.println(hashtable.get(i));
		}
		
		
		System.out.println("Number of slots");
		System.out.println(hashtable.getMemoryInfo());
		System.out.println(hashtable.size());
		System.out.println(hashtable.collisonsNumber());
		
		
		
		
		
	}

}
