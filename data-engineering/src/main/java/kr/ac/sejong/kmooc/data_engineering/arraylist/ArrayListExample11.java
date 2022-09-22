package kr.ac.sejong.kmooc.data_engineering.arraylist;

import java.util.ArrayList;
import java.util.List;

import kr.ac.sejong.kmooc.data_engineering.arraylist.impl.MyArrayList;

public class ArrayListExample11 {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		
		l.add(3);
		l.add(5);
		l.add(7);
		l.add(9);
		
		System.out.println(l);
		System.out.println(l.remove(0));
		System.out.println(l);
		l.add(11);
		System.out.println(l);
		System.out.println(l.remove(1));
		System.out.println(l);
		
		// 에러 발생!
		// System.out.println(l.remove(100));
		
		// 4주차 3강
		System.out.println("* 4주차 3강 *");
		List<Integer> l2 = new MyArrayList<Integer>();
		
		l2.add(3);
		l2.add(5);
		l2.add(7);
		l2.add(9);
		
		System.out.println(l2);
		System.out.println(l2.remove(0));
		System.out.println(l2);
		l2.add(11);
		System.out.println(l2);
		System.out.println(l2.remove(1));
		System.out.println(l2);
		
		System.out.println(l2.remove(100));
	}
}