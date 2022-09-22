package kr.ac.sejong.kmooc.data_engineering.arraylist;

import java.util.ArrayList;
import java.util.List;

import kr.ac.sejong.kmooc.data_engineering.arraylist.impl.MyArrayList;
import kr.ac.sejong.kmooc.data_engineering.motivation.Email;

public class ArrayListExample2 {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<Integer>();
		System.out.println(intList.isEmpty());
		
		ArrayList<String> stringList = new ArrayList<String>();
		System.out.println(stringList.isEmpty());
		
		ArrayList<Email> emailList = new ArrayList<Email>();
		System.out.println(emailList.isEmpty());
		
		// 4주차 2강
		System.out.println("* 4주차 2강 *");
		List<Integer> intList2 = new MyArrayList<Integer>();
		System.out.println(intList2.isEmpty());
		
		List<String> stringList2 = new MyArrayList<String>();
		System.out.println(stringList2.isEmpty());
		
		List<Email> emailList2 = new MyArrayList<Email>();
		System.out.println(emailList2.isEmpty());
	}

}
