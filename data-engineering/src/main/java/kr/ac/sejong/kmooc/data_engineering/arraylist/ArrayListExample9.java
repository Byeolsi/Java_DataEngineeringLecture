package kr.ac.sejong.kmooc.data_engineering.arraylist;

import java.util.ArrayList;
import java.util.List;

import kr.ac.sejong.kmooc.data_engineering.arraylist.impl.MyArrayList;

public class ArrayListExample9 {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		
		l.add(3);
		l.add(5);
		l.add(7);
		l.add(9);
		System.out.println(l);
		l.add(1, 4);
		System.out.println(l);
		l.set(2, 11);
		System.out.println(l);
		// 에러 발생!
		// l.set(10, 13);
		
		// 4주차 3강
		System.out.println("* 4주차 3강 *");
		List<Integer> l2 = new MyArrayList<Integer>();
		
		l2.add(3);
		l2.add(5);
		l2.add(7);
		l2.add(9);
		System.out.println(l2);
		l2.add(1, 4);
		System.out.println(l2);
		l2.set(2, 11);
		System.out.println(l2);
		// 에러 발생!
		l2.set(10, 13);
	}
}