package kr.ac.sejong.kmooc.data_engineering.arraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample18 {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		
		System.out.println(list);
		
		// 2번 인덱스부터 3(4-1)번 인덱스까지 서브 리스트를 가져옴.
		List<Integer> sublist = list.subList(2, 4);
		System.out.println(sublist);
		
		// sublist에 1번 인덱스에 9를 넣음.
		sublist.add(1, 9);
		System.out.println(sublist);
		// 원본에 대한 연산이 일어남.
		System.out.println(list);
		
		// list에 10을 넣음.
		list.add(10);
		System.out.println(list);
		// 에러 발생.
		System.out.println(sublist);
	}
}