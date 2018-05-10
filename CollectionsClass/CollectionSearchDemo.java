package collectiontest;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSearchDemo {

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

		Collections.sort(arrayList);
		System.out.println(arrayList);// [A, H, P, R, S, T, U, Y]
		System.out.println(Collections.binarySearch(arrayList, "U"));// 5
		System.out.println(Collections.binarySearch(arrayList, "Z"));// -9

	}

}
/*
 * Internally these search methods will use binary search algorithm. Successful
 * search returns index unsuccessful search returns insertion point. Insertion
 * point is the location where we can place the element in the sorted list.
 * Before calling binarySearch() method compulsory the list should be sorted
 * otherwise we will get unpredictable results.
 */
