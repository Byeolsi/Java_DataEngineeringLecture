package kr.ac.sejong.kmooc.data_engineering.motivation;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class App4 {

	public static void main(String[] args) throws IOException {
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
}
