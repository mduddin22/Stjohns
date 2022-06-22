package com.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListInteger {

	public static void main(String[] args) {
	ArrayList<Integer> NumberSet= new ArrayList<Integer> ();
	
	NumberSet.add(20);
	NumberSet.add(30);
	NumberSet.add(40);
	NumberSet.add(50);
	NumberSet.add(60);
	
	
	System.out.println(NumberSet);
	
	
	int x = NumberSet.get(4);
	System.out.println(x);
	
	NumberSet.add(13);
	
	NumberSet.add(54);
	
	System.out.println(NumberSet);
	
	Collections.sort(NumberSet);
	
	System.out.println(NumberSet);
	
	
	}

}
