package testpack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Framework {
	
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
	public static void main(String[] args) {
		Framework a=new Framework();
		a.sortArrayByMeena();
	}

	 

		
		
	
}
