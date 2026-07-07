package com.arrays;

import java.util.HashSet;
import java.util.Set;
public class duplicatearr {

	public static void main(String[] args) {

		int[] arr = {7,8,10,8,7,5,4};

		Set<Integer> s = new HashSet<>();
for(int a:arr) {
	if(!s.add(a)) {
		System.out.println(a);
	
	}
}
	}

}