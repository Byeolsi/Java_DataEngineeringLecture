package kr.ac.sejong.kmooc.data_engineering.arraylist;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import kr.ac.sejong.kmooc.data_engineering.motivation.Email;

public class ArrayListExample21 {
	public static ArrayList<Email> getData() throws IOException {
		ArrayList<Email> data = new ArrayList<Email>();
		
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
		
		// 받는 사람 기준으로 내림차순 정렬
		data.sort(new Comparator<Email>() {
			@Override
			public int compare(Email o1, Email o2) {
				if (o1.getTo() < o2.getTo())
					// 반드시 '-1, 0, 1'이 아니어도 됨.
					// 내림차순 기준 '음수, 0, 양수'이면, OK.
					// 오름차순 기준 '양수, 0, 음수'이면, OK.
					return +2;
				else if (o1.getTo() == o2.getTo())
					return 0;
				else
					return -2;
			}
		});
		
		// 내림차순 정렬되어 있는 list의 맨 끝부터 차례대로 앞으로 하나씩 출력.
		// 결과적으로 받는 사람 기준으로 오름차순 정렬된 것처럼 출력할 것임.
		ListIterator<Email> listIterator = data.listIterator(data.size());
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
	}		
}