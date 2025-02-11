package com.celcom.day6;

public class GarbageCollectionExample {

	static int count;

	GarbageCollectionExample() {  // constructor to calculate total no of objects instantiated
		count++;
		System.out.println(count);
	}

	@Override
	protected void finalize() { //writing recycle logic
		count--;
		System.out.println(count);
	}

	public static void main(String args[]) {
		GarbageCollectionExample obj1 = new GarbageCollectionExample();
		GarbageCollectionExample obj2 = new GarbageCollectionExample();
		
		obj1 = null;
	
		obj2 = null;
		
		Runtime.getRuntime().gc(); //implementing gc through jvm; can also use System.gc();
	}

}
