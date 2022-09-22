package kr.ac.sejong.kmooc.data_engineering.arraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;

import kr.ac.sejong.kmooc.data_engineering.motivation.Email;

public class ArrayListExample17 {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(5);
		list.add(3);
		list.add(2);
		list.add(4);
		list.add(1);
		
		System.out.println(list);
		
		// interface를 구현한 class의 instance를 이용한다.
		list.sort(new MyIntegerComparator());
		
		System.out.println(list);
		
		// 내림차순 정렬
		list.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// 왼쪽이 작을 경우, -1 이지만, 반대로 +1
				if (o1 < o2)
					return +1;
				// 서로 같을 경우, 0
				else if (o1 == o2)
					return 0;
				// 오른쪽이 작을 경우, +1 이지만, 반대로 -1
				else
					return -1;
			}
		});
		System.out.println(list);
		
		// Email 객체 sort
		ArrayList<Email> emails = new ArrayList<Email>();
		emails.add(new Email(5, 1));
		emails.add(new Email(3, 4));
		emails.add(new Email(2, 2));
		emails.add(new Email(4, 3));
		emails.add(new Email(1, 5));
		
		System.out.println(emails);
		
		// 보내는 사람 기준 오름차순 정렬
		emails.sort(new Comparator<Email>() {

			@Override
			public int compare(Email o1, Email o2) {
				if (o1.getFrom() < o2.getFrom())
					return -1;
				else if (o1.getFrom() == o2.getFrom())
					return 0;
				else
					return +1;
			}
		});
		System.out.println(emails);
		
		// 받는 사람 기준 내림차순 정렬
		emails.sort(new Comparator<Email>() {

			@Override
			public int compare(Email o1, Email o2) {
				if (o1.getTo() < o2.getTo())
					return +1;
				else if (o1.getTo() == o2.getTo())
					return 0;
				else
					return -1;
			}
		});
		System.out.println(emails);
	}
}