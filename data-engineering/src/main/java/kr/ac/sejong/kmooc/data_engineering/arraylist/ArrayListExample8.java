package kr.ac.sejong.kmooc.data_engineering.arraylist;

import java.util.ArrayList;
import java.util.List;

import kr.ac.sejong.kmooc.data_engineering.arraylist.impl.MyArrayList;
import kr.ac.sejong.kmooc.data_engineering.motivation.Email;

public class ArrayListExample8 {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		
		l.add(3);
		l.add(5);
		l.add(5);
		l.add(7);
		System.out.println(l);
		
		System.out.println(l.indexOf(2));
		System.out.println(l.indexOf(3));
		System.out.println(l.lastIndexOf(3));
		
		System.out.println(l.indexOf(5));
		System.out.println(l.lastIndexOf(5));
		
		ArrayList<Email> emails = new ArrayList<Email>();
		emails.add(new Email(0, 1));
		emails.add(new Email(1, 2));
		emails.add(new Email(1, 2));
		emails.add(new Email(2, 3));
		System.out.println(emails);
		System.out.println(emails.indexOf(new Email(0, 0)));
		System.out.println(emails.indexOf(new Email(0, 1)));
		System.out.println(emails.lastIndexOf(new Email(0, 1)));
		System.out.println(emails.indexOf(new Email(1, 2)));
		System.out.println(emails.lastIndexOf(new Email(1, 2)));
		
		// 4주차 3강
		System.out.println("* 4주차 3강 *");
		List<Integer> l2 = new MyArrayList<Integer>();
		
		l2.add(3);
		l2.add(5);
		l2.add(5);
		l2.add(7);
		System.out.println(l2);
		
		System.out.println(l2.indexOf(2));
		System.out.println(l2.indexOf(3));
		System.out.println(l2.lastIndexOf(3));
		
		System.out.println(l2.indexOf(5));
		System.out.println(l2.lastIndexOf(5));
		
		List<Email> emails2 = new MyArrayList<Email>();
		emails2.add(new Email(0, 1));
		emails2.add(new Email(1, 2));
		emails2.add(new Email(1, 2));
		emails2.add(new Email(2, 3));
		System.out.println(emails2);
		System.out.println(emails2.indexOf(new Email(0, 0)));
		System.out.println(emails2.indexOf(new Email(0, 1)));
		System.out.println(emails2.lastIndexOf(new Email(0, 1)));
		System.out.println(emails2.indexOf(new Email(1, 2)));
		System.out.println(emails2.lastIndexOf(new Email(1, 2)));
	}
}