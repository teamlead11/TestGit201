package testpack;

import java.util.Arrays;

public class Framework {

	public static void main(String[] args) {
		
		Framework f=new Framework();
		f.sortArraySortBySri();
		
		}

	public void sortArraySortBySri() {
	
		int num[]= {10,5,30,20,15};
		
		System.out.println("Before Sorting:");
		for(int i:num) {
			System.out.println(i);
		}
		Arrays.sort(num);
		System.out.println("After Sorting:");
		for(int n:num) {
			System.out.println(n);
		}
		
		
		
	}
}
