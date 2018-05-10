package collectiontest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionCustomizeSortingDemo {

	
	public static void main(String[] args) {
		ArrayList arrayList=new ArrayList();
		arrayList.add("P");
		arrayList.add("R");
		arrayList.add("A");
		arrayList.add("T");
		arrayList.add("Y");
		arrayList.add("U");
		arrayList.add("S");
		arrayList.add("H");
		arrayList.add(new Integer(10));
		Collections.sort(arrayList,new MyComparator());
		System.out.println(arrayList);//[Y, U, T, S, R, P, H, A, 10]

	}

}
class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
		return s2.compareTo(s1);
	}
	
}
