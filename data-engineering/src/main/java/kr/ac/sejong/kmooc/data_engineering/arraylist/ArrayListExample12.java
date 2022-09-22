package kr.ac.sejong.kmooc.data_engineering.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import kr.ac.sejong.kmooc.data_engineering.arraylist.impl.MyArrayList;

public class ArrayListExample12 {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(9);
		
		// for 문을 이용한 배열을 순회하는 방법
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("==========");
		
		// for each 문을 이용한 배열을 순회하는 방법 (iterator를 내부적으로 이용하는 방법)
		for (Integer val : list) {
			System.out.println(val);
		}
		System.out.println("==========");
		
		// 직접 iterator를 이용하여 Collection을 순회하는 방법
		// list가 Integer 형태의 ArrayList이므로, 반환하는 iterator도 integer 형태.
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		// 4주차 4강
		System.out.println("* 4주차 4강 *");
		List<Integer> list2 = new MyArrayList<Integer>();
		
		list2.add(3);
		list2.add(5);
		list2.add(7);
		list2.add(9);
		
		// for 문을 이용한 배열을 순회하는 방법
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		System.out.println("==========");
		
		// for each 문을 이용한 배열을 순회하는 방법 (iterator를 내부적으로 이용하는 방법)
		for (Integer val : list2) {
			System.out.println(val);
		}
		System.out.println("==========");
		
		// 직접 iterator를 이용하여 Collection을 순회하는 방법
		// list가 Integer 형태의 ArrayList이므로, 반환하는 iterator도 integer 형태.
		Iterator<Integer> iterator2 = list2.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
	}
}