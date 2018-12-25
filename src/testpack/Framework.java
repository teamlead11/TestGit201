package testpack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Framework {

	public static void main(String[] args) {
		
		Framework f = new Framework();
		f.sortArraySortBySri();
		f.sortArrayByMeena();
		f.sortArrayByMani6726();
	}

	public static void baseClassMethod() {

		System.out.println("this is my base project");

	}

	public static void sortArrayByAravindan() {
		int n, temp;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array:");
		n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter all the elements:");
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.print("Ascending Order:");
		for (int i = 0; i < n - 1; i++) {
			System.out.print(a[i] + ",");
		}
		System.out.print(a[n - 1]);
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
	
	public void sortArrayByMeena() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
        al.add(10);
        al.add(4);
        al.add(6);
        al.add(2);
        System.out.println("Before List sort" +al);
        Collections.sort(al);
        System.out.println("After List sort" +al);
}

public void sortArrayByMani6726() {

	String[] arr = new String[] { "m", "a", "n", "i", "k","a", "n","d", "a", "n" };
	Arrays.sort(arr);
	System.out.println("print manikandan");
	for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);

	}









}



