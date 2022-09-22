package kr.ac.sejong.kmooc.data_engineering.arraylist;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import kr.ac.sejong.kmooc.data_engineering.arraylist.impl.MyArrayList;
import kr.ac.sejong.kmooc.data_engineering.motivation.Email;

public class ArrayListExample19 {
	public static ArrayList<Email> getData() throws IOException {
		ArrayList<Email> data = new ArrayList<Email>();
		// List<Email> data = new MyArrayList<Email>();
		/*
			4주차 5강 - MyArrayList로 수행하는 경우, 데이터를 읽어들이는 속도가 굉장히 느림을 알 수 있음.
			이는 시간적인 면에서 효율성을 생각하지 않고 공간적인 면만 생각해서 코드를 작성했기 때문.
			add() 메소드를 호출할 때마다 용적을 늘리는 방법이 아닌, array가 꽉 찼을 때에 2배씩만 늘려주는 방법을 채택해도 속도가 빨라짐.
		*/
		
		// D:\Documents\4학년 2학기\데이터엔지니어링\데이터엔지니어링1주차실습파일\email-EuAll\email-EuAll.txt
		BufferedReader br = new BufferedReader(new FileReader("D:\\Documents\\4학년 2학기\\데이터엔지니어링\\데이터엔지니어링1주차실습파일\\email-EuAll\\email-EuAll.txt"));
		String line;
		String[] array;
		int from, to;
		int index = 0;
	
		while (true) {
			line = br.readLine();
			if (line == null) break;
			
			if (line.startsWith("#")) continue;
			
			array = line.split("\t");
			from = Integer.parseInt(array[0]);
			to = Integer.parseInt(array[1]);
			data.add(new Email(from, to));
		}
		br.close();
		
		return data;
	}
	
	public static void main(String[] args) throws IOException {
		ArrayList<Email> data = getData();
		
		int count = 0;					// 이벤트의 수
		int min = Integer.MAX_VALUE;	// 최소 사람의 ID
		int max = Integer.MIN_VALUE;	// 최대 사람의 ID
		
		for (Email email : data) {
			int from = email.getFrom();
			int to = email.getTo();
			count++;
			if (from < min)
				min = from;
			if (from > max)
				max = from;
			if (to < min)
				min = to;
			if (to > max)
				max = to;
		}
		System.out.println("이벤트의 수: " + count);
		System.out.println("최소 사람 ID: " + min);
		System.out.println("최대 사람 ID: " + max);
		
		// 4주차 5강
		System.out.println("* 4주차 5강 *");
		List<Email> data2 = getData();
		
		int count2 = 0;					// 이벤트의 수
		int min2 = Integer.MAX_VALUE;	// 최소 사람의 ID
		int max2 = Integer.MIN_VALUE;	// 최대 사람의 ID
		
		for (Email email2 : data2) {
			int from2 = email2.getFrom();
			int to2 = email2.getTo();
			count2++;
			if (from2 < min2)
				min2 = from2;
			if (from2 > max2)
				max2 = from2;
			if (to2 < min2)
				min2 = to2;
			if (to2 > max2)
				max2 = to2;
		}
		System.out.println("이벤트의 수: " + count2);
		System.out.println("최소 사람 ID: " + min2);
		System.out.println("최대 사람 ID: " + max2);
	}		
}