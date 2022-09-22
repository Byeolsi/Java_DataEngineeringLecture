package kr.ac.sejong.kmooc.data_engineering.motivation;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import java.io.BufferedReader;
import java.io.FileReader;

public class App13 {
	public static Email[] getData() throws IOException {
		Email[] data = new Email[420045];
		
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
			data[index++] = new Email(from, to);
		}
		br.close();
		
		return data;
	}
	
	public static void main(String[] args) throws IOException {
		Email[] data = getData();
		
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		for (Email email : data) {
			treeSet.add(email.from);
			treeSet.add(email.to);
		}
		System.out.println("100000 이전의 수: " + treeSet.lower(100000));
		System.out.println("100000 이후의 수: " + treeSet.higher(100000));
		System.out.println("가장 작은 수: " + treeSet.first());
		System.out.println("가장 큰 수: " + treeSet.last());
		 
		// TreeSet은 Iterator도 가지고 있으므로, 순서대로 확인하는 것도 가능.
		Iterator<Integer> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
