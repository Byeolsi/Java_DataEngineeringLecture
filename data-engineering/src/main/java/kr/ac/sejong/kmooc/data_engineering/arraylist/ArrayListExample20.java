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

public class ArrayListExample20 {
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
		
		// 보내는 사람 기준으로 오름차순 정렬
		data.sort(new Comparator<Email>() {
			@Override
			public int compare(Email o1, Email o2) {
				if (o1.getTo() < o2.getTo())
					return -1;
				else if (o1.getTo() == o2.getTo())
					return 0;
				else
					return +1;
			}
		});
		
		// Iterator를 통해 data 순회
		Iterator<Email> iterator = data.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}		
}