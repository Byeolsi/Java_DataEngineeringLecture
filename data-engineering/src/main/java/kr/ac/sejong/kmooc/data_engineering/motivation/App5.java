package kr.ac.sejong.kmooc.data_engineering.motivation;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class App5 {

	public static void main(String[] args) throws IOException {
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
}
