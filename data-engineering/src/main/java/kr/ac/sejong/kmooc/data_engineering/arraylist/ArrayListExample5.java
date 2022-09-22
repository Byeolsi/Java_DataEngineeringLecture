package kr.ac.sejong.kmooc.data_engineering.arraylist;

import java.util.ArrayList;
import java.util.List;

import kr.ac.sejong.kmooc.data_engineering.arraylist.impl.MyArrayList;

public class ArrayListExample5 {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		// []
		l.add(0, 3);
		// [3]
		System.out.println(l);
		l.add(1, 5);
		// [3, 5]
		System.out.println(l);
		l.add(2, 7);
		// [3, 5, 7]
		System.out.println(l);
		l.add(1, 9);
		// [3, 9, 5, 7]
		System.out.println(l);
		
		// 4주차 2강
		System.out.println("* 4주차 2강 *");
		List<Integer> l2 = new MyArrayList<Integer>();
		// []
		l2.add(0, 3);
		// [3]
		System.out.println(l2);
		l2.add(1, 5);
		// [3, 5]
		System.out.println(l2);
		l2.add(2, 7);
		// [3, 5, 7]
		System.out.println(l2);
		l2.add(1, 9);
		// [3, 9, 5, 7]
		System.out.println(l2);
		/*
		kr.ac.sejong.kmook.data_engineering.arraylist.impl.MyArrayList@2ff4acd0
		kr.ac.sejong.kmook.data_engineering.arraylist.impl.MyArrayList@2ff4acd0
		kr.ac.sejong.kmook.data_engineering.arraylist.impl.MyArrayList@2ff4acd0
		kr.ac.sejong.kmook.data_engineering.arraylist.impl.MyArrayList@2ff4acd0
		=> MyArrayList가 toString() 메소드가 구현되어 있지 않아, Default를 출력.
		*/
		
		/*
		=> toString() 구현 후
		[3]
		[3, 5]
		[3, 5, 7]
		[3, 9, 5, 7] 
		*/
	}
}
