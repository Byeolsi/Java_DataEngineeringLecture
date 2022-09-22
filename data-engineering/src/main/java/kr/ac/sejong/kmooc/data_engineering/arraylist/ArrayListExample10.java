package kr.ac.sejong.kmooc.data_engineering.arraylist;

import java.util.ArrayList;
import java.util.List;

import kr.ac.sejong.kmooc.data_engineering.arraylist.impl.MyArrayList;
import kr.ac.sejong.kmooc.data_engineering.motivation.Email;

public class ArrayListExample10 {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		
		l.add(3);
		l.add(5);
		l.add(7);
		l.add(9);
		System.out.println(l);
		// 에러 발생.
//		System.out.println(l.remove(5));
		System.out.println(l.remove(Integer.valueOf(5)));
		System.out.println(l.remove(Integer.valueOf(11)));
		System.out.println(l);
		
		ArrayList<Email> emails = new ArrayList<Email>();
		emails.add(new Email(0, 1));
		emails.add(new Email(1, 2));
		emails.add(new Email(2, 4));
		System.out.println(emails);
		System.out.println(emails.remove(new Email(0, 1)));
		System.out.println(emails.remove(new Email(3, 6)));
		System.out.println(emails);
		
		// 4주차 3강
		System.out.println("* 4주차 3강 *");
		List<Integer> l2 = new MyArrayList<Integer>();
		
		l2.add(3);
		l2.add(5);
		l2.add(7);
		l2.add(9);
		System.out.println(l2);
		// 에러 발생.
//		System.out.println(l.remove(5));
		System.out.println(l2.remove(Integer.valueOf(5)));
		System.out.println(l2.remove(Integer.valueOf(11)));
		System.out.println(l2);
		
		List<Email> emails2 = new MyArrayList<Email>();
		emails2.add(new Email(0, 1));
		emails2.add(new Email(1, 2));
		emails2.add(new Email(2, 4));
		System.out.println(emails2);
		System.out.println(emails2.remove(new Email(0, 1)));
		System.out.println(emails2.remove(new Email(3, 6)));
		System.out.println(emails2);
	}
}