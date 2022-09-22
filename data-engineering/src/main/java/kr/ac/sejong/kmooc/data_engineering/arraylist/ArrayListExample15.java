package kr.ac.sejong.kmooc.data_engineering.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import kr.ac.sejong.kmooc.data_engineering.arraylist.impl.MyArrayList;

public class ArrayListExample15 {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(9);
		
		System.out.println(list);
		list.clear();
		System.out.println(list);
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		
		// 4주차 5강
		System.out.println("* 4주차 5강 *");
		List<Integer> list2 = new MyArrayList<Integer>();
		
		list2.add(3);
		list2.add(5);
		list2.add(7);
		list2.add(9);
		
		System.out.println(list2);
		list2.clear();
		System.out.println(list2);
		System.out.println(list2.isEmpty());
		System.out.println(list2.size());
	}
}