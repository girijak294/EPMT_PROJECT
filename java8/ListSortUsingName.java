//Comparator inerface to sort given list of Employees in the alphabetic order of their name

import java.util.ArrayList;
import java.util.Collections;

public class ListSortUsingName {

	public static void main(String[] args) {
		ArrayList <SortEmployeeEx> l = new ArrayList<>();
		

		l.add(new SortEmployeeEx("Bhavani"));
		l.add(new SortEmployeeEx("fefef"));
		l.add(new SortEmployeeEx("qwewr"));
		l.add(new SortEmployeeEx("thtth"));
		
		//Collections.sort(l, (name1, name2) -> name1.getName().compareTo(name2.getName()));
		l.sort((name1, name2) -> name1.getName().compareTo(name2.getName()));
		
		for(SortEmployeeEx k: l) {
		System.out.println(k.getName());}

	}

}
