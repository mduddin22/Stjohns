package com.ArrayList;

import java.util.ArrayList;
import java.util.Collections;


public class LearnArrayList {

	public static void main(String[] args) {
		
		
		ArrayList<String> Cities = new ArrayList<String>();

		
		Cities.add("New York");
		Cities.add("San Deigo");
		Cities.add("Tampa");
		Cities.add("Los Angeles");
		Cities.add("Buffalo");
		Cities.add("Albany");
		
		System.out.println(Cities);
		
		
		System.out.println(Cities.get(4));
		
		
		Cities.set(5, "Long Island");
		
		
		System.out.println(Cities);
		
		Cities.remove(5);
		
		System.out.println(Cities);
		
		System.out.println(Cities.size());
		
		for (int i=0; i<Cities.size(); i++) {
		
		System.out.println(Cities.get(i));
		
		}
		
		System.out.println();
		
		Collections.sort(Cities);
		
		for (int i=0; i<Cities.size(); i++) {
			
			System.out.println(Cities.get(i));
		}
		
		}
		
	}

		
		
	


