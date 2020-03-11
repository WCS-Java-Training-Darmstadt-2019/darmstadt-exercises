package codesammler;

import java.util.*;

public class Array145 {

	public static void main(String [] args) {
		
		ArrayList<Integer> originalList = new ArrayList<Integer>();
		
		originalList.add(1);
		originalList.add(2);
		originalList.add(3);
		originalList.add(4);
		originalList.add(5);
		
		for (int i=0; i<originalList.size(); i++) {
			System.out.println(originalList.get(i));
		}
		
		originalList.remove(3);
		
		for (int i=0; i<originalList.size(); i++) {
			System.out.println(originalList.get(i));
		}
	}
	
}
