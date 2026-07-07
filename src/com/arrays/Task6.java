package com.arrays;

public class Task6 {

	public static void main(String[] args) {
		 int[] arr = {1, 2, 4, 7, 11, 15};
	        int target = 15;

	        int left=0;
			int right=arr.length-1;
			while(left< right) {
				int sum=arr[left]+arr[right];
				if(sum==target) {
					System.out.println("pair is : "+arr[left]+ " and "+arr[right]);
					return;
					}else if(sum<target) {
						left++;
					}
					else {
						right--;
					}
				}

	System.out.println("pair not found");
		}


}
