package kr.ac.sejong.kmooc.data_engineering.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample13 {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			Integer val = iterator.next();
			if (val % 2 == 0) {
				// 에러 발생
				// list에서 해당 값을 지움으로써, list에 변형이 생김.
//				list.remove(val);
				// 잘 지워짐. next() 메소드를 쓰고, next() 메소드로 반환된 해당 값이 제거됨.
				// next() 메소드를 한 번 호출하면, remove() 메소드도 한 번만 호출하는 것을 권장.
				iterator.remove();
			}
		}
		System.out.println(list);
	}
}