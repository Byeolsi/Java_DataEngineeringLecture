package kr.ac.sejong.kmooc.data_engineering.motivation;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.io.BufferedReader;
import java.io.FileReader;

public class App10 {
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
		
		// HashSet은 집합의 성질을 가짐.
		// 단순히 추가를 시켜도 중복이 자동적으로 제거됨.
		HashSet<Integer> senders = new HashSet<Integer>();
		int count = 0;
		for (Email email: data) {
			int from = email.from;
			senders.add(from);
			System.out.println(++count);
		}
		System.out.println("보낸 사람의 수: " + senders.size());
		// 보낸 사람의 수: 225409
	}
}
