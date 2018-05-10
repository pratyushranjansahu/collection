package collectiontest;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionDefaultSortingDemo3 {

	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList.add("p");
		arrayList.add("r");
		arrayList.add("a");
		arrayList.add(null);
		Collections.sort(arrayList);
		System.out.println(arrayList);//Run time Exception : java.lang.NullPointerException

	}

}
/*The List should not contain null otherwise we will get NullPointerException.*/
