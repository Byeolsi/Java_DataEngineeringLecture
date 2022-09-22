package kr.ac.sejong.kmooc.data_engineering.arraylist;

import java.util.ArrayList;
import java.util.List;

import kr.ac.sejong.kmooc.data_engineering.arraylist.impl.MyArrayList;
import kr.ac.sejong.kmooc.data_engineering.motivation.Email;

public class ArrayListExample3 {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<Integer>();
		System.out.println(intList.isEmpty());
		System.out.println(intList.size());
		
		ArrayList<String> stringList = new ArrayList<String>();
		System.out.println(stringList.isEmpty());
		System.out.println(stringList.size());
		
		ArrayList<Email> emailList = new ArrayList<Email>();
		System.out.println(emailList.isEmpty());
		System.out.println(emailList.size());
		
		// 4주차 2강
		System.out.println("* 4주차 2강 *");
		List<Integer> intList2 = new MyArrayList<Integer>();
		System.out.println(intList2.isEmpty());
		System.out.println(intList2.size());
		
		List<String> stringList2 = new MyArrayList<String>();
		System.out.println(stringList2.isEmpty());
		System.out.println(stringList2.size());
		
		List<Email> emailList2 = new MyArrayList<Email>();
		System.out.println(emailList2.isEmpty());
		System.out.println(emailList2.size());
	}

}
