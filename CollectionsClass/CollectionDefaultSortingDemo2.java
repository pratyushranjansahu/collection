package collectiontest;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionDefaultSortingDemo2 {

	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList.add(new Integer(10));
		arrayList.add(new Float(10.5));
		Collections.sort(arrayList);
		System.out.println(arrayList);// Compile Time Error
										// :java.lang.ClassCastException:
										// java.lang.Integer cannot be cast to
										// java.lang.Float

	}

}
/*
 * To sort the elements of List according to default natural sorting order in
 * this case the elements should be homogeneous and comparable otherwise we will
 * get ClassCastException.
 */