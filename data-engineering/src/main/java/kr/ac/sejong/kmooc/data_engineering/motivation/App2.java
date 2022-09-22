package kr.ac.sejong.kmooc.data_engineering.motivation;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class App2 {

	public static void main(String[] args) throws IOException {
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
}
