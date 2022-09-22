package kr.ac.sejong.kmooc.data_engineering.arraylist;

import java.util.ArrayList;
import java.util.List;

import kr.ac.sejong.kmooc.data_engineering.arraylist.impl.MyArrayList;
import kr.ac.sejong.kmooc.data_engineering.motivation.Email;

public class ArrayListExample6 {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(0, 3);
		l.add(1, 5);
		l.add(2, 7);
		l.add(1, 9);
		// [3, 9, 5, 7]
		System.out.println(l);
		System.out.println(l.contains(3));
		System.out.println(l.contains(6));
		
//		ArrayList<Email> emails = new ArrayList<Email>();
//		emails.add(new Email(0, 0));
//		emails.add(new Email(0, 1));
//		emails.add(new Email(2, 2));
//		System.out.println(emails);
//		System.out.println(emails.contains(new Email(0, 1)));
		// true가 반환되어야 할 것 같지만, false가 반환됨.
		// contains라는 메소드가 자바의 모든 클래스가 상속하고 있는 object의 equals라는 메소드를 이용해서 구현되었기 때문.
		// 이 두개의 객체는 내용은 같지만 서로 다른 객체이기 때문에 false를 반환.

		// 1. 이메일의 객체를 잡아서 추가한 후 0, 1이 contains인지 질
//		ArrayList<Email> emails = new ArrayList<Email>();
//		emails.add(new Email(0, 0));
//		Email e01 = new Email(0, 1);
//		emails.add(e01);
//		emails.add(new Email(2, 2));
//		System.out.println(emails);
//		System.out.println(emails.contains(e01));
		
		// 2. equals 메소드를 적절히 오버라이딩함.
		ArrayList<Email> emails = new ArrayList<Email>();
		emails.add(new Email(0, 0));
		emails.add(new Email(0, 1));
		emails.add(new Email(2, 2));
		System.out.println(emails);
		System.out.println(emails.contains(new Email(0, 1)));
		
		// 4주차 3강
		System.out.println("* 4주차 3강 *");
		List<Integer> l2 = new MyArrayList<Integer>();
		l2.add(0, 3);
		l2.add(1, 5);
		l2.add(2, 7);
		l2.add(1, 9);
		// [3, 9, 5, 7]
		System.out.println(l2);
		System.out.println(l2.contains(3));
		System.out.println(l2.contains(6));
		
		List<Email> emails2 = new MyArrayList<Email>();
		emails2.add(new Email(0, 0));
		emails2.add(new Email(0, 1));
		emails2.add(new Email(2, 2));
		System.out.println(emails2);
		System.out.println(emails2.contains(new Email(0, 1)));
	}
}
