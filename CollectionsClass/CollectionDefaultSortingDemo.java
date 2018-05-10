package collectiontest;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionDefaultSortingDemo {

	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList.add("p");
		arrayList.add("r");
		arrayList.add("a");
		arrayList.add("t");
		arrayList.add("y");
		arrayList.add("u");
		arrayList.add("s");
		arrayList.add("h");
		Collections.sort(arrayList);
		System.out.println(arrayList);// [a, h, p, r, s, t, u, y]

	}

}
/*
 * To sort the elements of List according to default natural sorting order in
 * this case the elements should be homogeneous and comparable otherwise we will
 * get ClassCastException.
 */
