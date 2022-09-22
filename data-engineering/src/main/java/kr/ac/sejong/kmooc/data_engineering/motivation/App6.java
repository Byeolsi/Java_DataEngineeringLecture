package kr.ac.sejong.kmooc.data_engineering.motivation;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class App6 {

	public static void app2() throws IOException {
		// D:\Documents\4학년 2학기\데이터엔지니어링\데이터엔지니어링1주차실습파일\email-EuAll\email-EuAll.txt
		BufferedReader br = new BufferedReader(new FileReader("D:\\Documents\\4학년 2학기\\데이터엔지니어링\\데이터엔지니어링1주차실습파일\\email-EuAll\\email-EuAll.txt"));
		String line;
		String[] array;
		int from, to;
		int lineCount = 0; // 줄 수를 담는 line 변수
	
		while (true) {
			line = br.readLine();
			if (line == null) break;
			lineCount++;
			
			if (line.startsWith("#")) continue;
			
			array = line.split("\t");
			from = Integer.parseInt(array[0]);
			to = Integer.parseInt(array[1]);
			System.out.println(new Email(from, to));
		}
		System.out.println("줄 수: " + lineCount);
		br.close();
	}
	
	public static void app3() throws IOException {
		// D:\Documents\4학년 2학기\데이터엔지니어링\데이터엔지니어링1주차실습파일\email-EuAll\email-EuAll.txt
		BufferedReader br = new BufferedReader(new FileReader("D:\\Documents\\4학년 2학기\\데이터엔지니어링\\데이터엔지니어링1주차실습파일\\email-EuAll\\email-EuAll.txt"));
		String line;
		String[] array;
		int from, to;
		int eventCount = 0; // 이벤트 수를 담는 eventCount 변수
	
		while (true) {
			line = br.readLine();
			if (line == null) break;
			
			if (line.startsWith("#")) continue;
			eventCount++;
			
			array = line.split("\t");
			from = Integer.parseInt(array[0]);
			to = Integer.parseInt(array[1]);
		}
		System.out.println("이벤트 수: " + eventCount);
		br.close();
	}
	
	public static void app4() throws IOException {
		// D:\Documents\4학년 2학기\데이터엔지니어링\데이터엔지니어링1주차실습파일\email-EuAll\email-EuAll.txt
		BufferedReader br = new BufferedReader(new FileReader("D:\\Documents\\4학년 2학기\\데이터엔지니어링\\데이터엔지니어링1주차실습파일\\email-EuAll\\email-EuAll.txt"));
		String line;
		String[] array;
		int from, to;
		int min = Integer.MAX_VALUE; // 가장 최소의 사람 ID를 담는 min 변수
		// Integer.MAX_VALUE는 Integer로 표현할 수 있는 수에서 가장 큰 수.
	
		while (true) {
			line = br.readLine();
			if (line == null) break;
			
			if (line.startsWith("#")) continue;
			
			array = line.split("\t");
			from = Integer.parseInt(array[0]);
			if (from < min) min = from;
			
			to = Integer.parseInt(array[1]);
			if (to < min) min = to;
		}
		System.out.println("최소 사람 ID: " + min);
		br.close();
	}
	
	public static void app5() throws IOException {
		// D:\Documents\4학년 2학기\데이터엔지니어링\데이터엔지니어링1주차실습파일\email-EuAll\email-EuAll.txt
		BufferedReader br = new BufferedReader(new FileReader("D:\\Documents\\4학년 2학기\\데이터엔지니어링\\데이터엔지니어링1주차실습파일\\email-EuAll\\email-EuAll.txt"));
		String line;
		String[] array;
		int from, to;
		int max = Integer.MIN_VALUE; // 가장 최대의 사람 ID를 담는 max 변수
		// Integer.MIN_VALUE는 Integer로 표현할 수 있는 수에서 가장 작은 수.
	
		while (true) {
			line = br.readLine();
			if (line == null) break;
			
			if (line.startsWith("#")) continue;
			
			array = line.split("\t");
			from = Integer.parseInt(array[0]);
			if (from > max) max = from;
			
			to = Integer.parseInt(array[1]);
			if (to > max) max = to;
		}
		System.out.println("최대 사람 ID: " + max);
		br.close();
	}
	
	public static void main(String[] args) throws IOException {
		// app2();
		long pre = System.currentTimeMillis();
		
		for (int i = 0; i < 100; i++) {
			app3();
			app4();
			app5();
		}
		
		System.out.println(System.currentTimeMillis() - pre);
		// 21620 ms
	}
}
