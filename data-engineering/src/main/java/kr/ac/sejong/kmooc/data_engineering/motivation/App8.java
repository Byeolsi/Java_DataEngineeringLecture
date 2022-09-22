package kr.ac.sejong.kmooc.data_engineering.motivation;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class App8 {
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
		
		// 265213 ID가 있는 지 확인.
		for (Email email: data) {
			if (email.from == 265213) {
				System.out.println("발견");
				System.exit(1);
			}
			if (email.to == 265213) {
				System.out.println("발견");
				System.exit(1);
			}
		}
		System.out.println("미발견");
	}
}
