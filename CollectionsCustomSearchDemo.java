package collectiontest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsCustomSearchDemo {

	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList.add("P");
		arrayList.add("R");
		arrayList.add("A");
		arrayList.add("T");
		arrayList.add("Y");
		arrayList.add("U");
		arrayList.add("S");
		arrayList.add("H");
		Collections.sort(arrayList, new MyComparator());
		System.out.println(arrayList);//[Y, U, T, S, R, P, H, A]
		System.out.println(Collections.binarySearch(arrayList,"P",new MyComparator()));//5
		System.out.println(Collections.binarySearch(arrayList,"P"));//(-1)Unpredictable result because comparator not passed. 
	}

}

class MyComparator implements Comparator {
	public int compare(Object obj1, Object obj2) {
		String s1 =  obj1.toString();
		String s2 = obj2.toString();
		return s2.compareTo(s1);
	}
}
/*
 * If the list is sorted according to Comparator then at the time of search
 * operation also we should pass the same Comparator object otherwise we will
 * get unpredictable results.
 */