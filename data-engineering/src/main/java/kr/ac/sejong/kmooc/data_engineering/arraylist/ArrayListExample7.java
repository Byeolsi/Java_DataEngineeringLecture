package kr.ac.sejong.kmooc.data_engineering.arraylist;

import java.util.ArrayList;
import java.util.List;

import kr.ac.sejong.kmooc.data_engineering.arraylist.impl.MyArrayList;

public class ArrayListExample7 {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		// []
		l.add(0, 3);
		l.add(1, 5);
		l.add(2, 7);
		l.add(1, 9);
		// [3, 9, 5, 7]
		System.out.println(l);
		
		System.out.println(l.get(0));
		System.out.println(l.get(1));
		System.out.println(l.get(2));
		System.out.println(l.get(3));
		// 에러 발생!
		// System.out.println(l.get(4));
		
		// 4주차 3강
		System.out.println("* 4주차 3강 *");
		List<Integer> l2 = new MyArrayList<Integer>();
		// []
		l2.add(0, 3);
		l2.add(1, 5);
		l2.add(2, 7);
		l2.add(1, 9);
		// [3, 9, 5, 7]
		System.out.println(l2);
		
		System.out.println(l2.get(0));
		System.out.println(l2.get(1));
		System.out.println(l2.get(2));
		System.out.println(l2.get(3));
		// 에러 발생!
		System.out.println(l2.get(4));
	}
}
