package kr.ac.sejong.kmooc.data_engineering.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import kr.ac.sejong.kmooc.data_engineering.arraylist.impl.MyArrayList;

public class ArrayListExample14 {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(9);
		
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("==========");
		
		ListIterator<Integer> listIterator = list.listIterator(0);
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		System.out.println("==========");
		
		ListIterator<Integer> listIterator2 = list.listIterator(list.size());
		while (listIterator2.hasPrevious()) {
			System.out.println(listIterator2.previous());
		}
		System.out.println("==========");
		
		// 4주차 4강
		System.out.println("* 4주차 4강 *");
		List<Integer> list2 = new MyArrayList<Integer>();
		
		list2.add(3);
		list2.add(5);
		list2.add(7);
		list2.add(9);
		
		ListIterator<Integer> listIterator3 = list2.listIterator(0);
		while (listIterator3.hasNext()) {
			System.out.println(listIterator3.next());
		}
		System.out.println("==========");
		
		ListIterator<Integer> listIterator4 = list2.listIterator(list2.size());
		while (listIterator4.hasPrevious()) {
			System.out.println(listIterator4.previous());
		}
		System.out.println("==========");
	}
}