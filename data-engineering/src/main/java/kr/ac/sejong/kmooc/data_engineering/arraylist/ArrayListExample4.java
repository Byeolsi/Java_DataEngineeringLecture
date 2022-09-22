package kr.ac.sejong.kmooc.data_engineering.arraylist;

import java.util.ArrayList;
import java.util.List;

import kr.ac.sejong.kmooc.data_engineering.arraylist.impl.MyArrayList;

public class ArrayListExample4 {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<Integer>();
		System.out.println(intList.isEmpty());
		System.out.println(intList.size());
		
		System.out.println(intList.add(3));
		
		System.out.println(intList.isEmpty());
		System.out.println(intList.size());
		
		System.out.println(intList.add(7));
		System.out.println(intList.add(5));
		
		System.out.println(intList.isEmpty());
		System.out.println(intList.size());
		
		// 4주차 2강
		System.out.println("* 4주차 2강 *");
		List<Integer> intList2 = new MyArrayList<Integer>();
		System.out.println(intList2.isEmpty());
		System.out.println(intList2.size());
		
		System.out.println(intList2.add(3));
		
		System.out.println(intList2.isEmpty());
		System.out.println(intList2.size());
		
		System.out.println(intList2.add(7));
		System.out.println(intList2.add(5));
		
		System.out.println(intList2.isEmpty());
		System.out.println(intList2.size());
	}
}
