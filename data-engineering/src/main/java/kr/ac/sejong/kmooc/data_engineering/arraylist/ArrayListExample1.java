package kr.ac.sejong.kmooc.data_engineering.arraylist;

import java.util.ArrayList;
import java.util.List;

import kr.ac.sejong.kmooc.data_engineering.arraylist.impl.MyArrayList;
import kr.ac.sejong.kmooc.data_engineering.motivation.Email;

public class ArrayListExample1 {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<Integer>();
		ArrayList<String> stringList = new ArrayList<String>();	
		ArrayList<Email> emailList = new ArrayList<Email>();
		
		// 4주차 2강
		List<Integer> intList1 = new ArrayList<Integer>();
		List<String> stringList1 = new ArrayList<String>();
		List<Email> emailList1 = new ArrayList<Email>();
		
		List<Integer> intList2 = new MyArrayList<Integer>();
		List<String> stringList2 = new MyArrayList<String>();
		List<Email> emailList2 = new MyArrayList<Email>();
	}
}
