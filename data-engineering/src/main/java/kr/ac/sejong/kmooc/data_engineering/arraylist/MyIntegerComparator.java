package kr.ac.sejong.kmooc.data_engineering.arraylist;

import java.util.Comparator;

public class MyIntegerComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// Compares its two arguments for order.
		// Returns a negative integer,zero, or a positive integer
		// as the first argument is less than, equalto, or greater than the second.
		
		// 기본은 오름차순 정렬.
		// 이를 반대로 하면, 내림차순 정렬이 됨.
		// 왼쪽이 작을 경우, -1
		if (o1 < o2)
			return -1;
		// 서로 같을 경우, 0
		else if (o1 == o2)
			return 0;
		// 오른쪽이 작을 경우, +1
		else
			return +1;
	}
}
