package kr.ac.sejong.kmooc.data_engineering.motivation;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class App7 {
	public static void app3(Email[] data) {
		int size = 0;
		for (int i = 0; i < data.length; i++) {
			size++;
		}
		System.out.println("이벤트 수: " + size);
	}
	
	public static void app4(Email[] data) {
		int min = Integer.MAX_VALUE;
		for (Email email: data) {
			if (email.from < min) min = email.from;
			if (email.to < min) min = email.to;
		}
		System.out.println("최소 사람 ID: " + min);
	}
	
	public static void app5(Email[] data) {
		int max = Integer.MIN_VALUE;
		for (Email email: data) {
			if (email.from > max) max = email.from;
			if (email.to > max) max = email.to;
		}
		System.out.println("최대 사람 ID: " + max);
	}
	
	public static void main(String[] args) throws IOException {
		// 1970년 1월 1일 0시 0분 0초 이래로 변환된 millisecond 수를 나타냄.
		// 현재 시간
		long pre = System.currentTimeMillis();
		
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
		
		for (int i = 0; i < 100; i++) {
			app3(data);
			app4(data);
			app5(data);
		}
		
		System.out.println(System.currentTimeMillis() - pre);
		// 870 ms
	}
}
