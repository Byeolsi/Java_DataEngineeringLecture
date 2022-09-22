package kr.ac.sejong.kmooc.data_engineering.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import kr.ac.sejong.kmooc.data_engineering.arraylist.impl.MyArrayList;

public class ArrayListExample16 {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println(list);
		
//		Integer[] array = new Integer[5];
//		array = list.toArray(array);
//		for (Integer val : array) {
//			System.out.println(val);
//		}
		
		// 사이즈가 작더라도 문제 없음.
		// 사이즈가 작으면, 크기에 맞는 새로운 array를 만듦.
//		Integer[] array = new Integer[3];
//		array = list.toArray(array);
//		for (Integer val : array) {
//			System.out.println(val);
//		}
		
		// 사이즈가 크면, 남는 크기만큼 null로 채워짐.
//		Integer[] array = new Integer[7];
//		array = list.toArray(array);
//		for (Integer val : array) {
//			System.out.println(val);
//		}
		
		// 에러 발생.
		// 타입이 맞지 않아 Integer가 String으로 casting 될 수 없기 때문에
//		String[] array = new String[5];
//		array = list.toArray(array);
//		for (String val : array) {
//			System.out.println(val);
//		}
		
		// 문제 없음.
		// 모든 클래스가 Object 클래스를 상속하고 있기 때문에 문제가 발생하지 않음.
		Object[] array = new Object[5];
		array = list.toArray(array);
		for (Object val : array) {
			System.out.println(val);
		}
		
		// 4주차 5강
		System.out.println("* 4주차 5강 *");
		List<Integer> list2 = new MyArrayList<Integer>();
		
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		
		System.out.println(list2);
		
		Object[] array2 = new Object[5];
		array2 = list2.toArray(array2);
		for (Object val : array2) {
			System.out.println(val);
		}
	}
}