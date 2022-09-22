package kr.ac.sejong.kmooc.data_engineering.motivation;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class App1 {
	// 일단은 FileNotFoundException와 IOException을 throws하는 것으로 에러를 처리.
	public static void main(String[] args) throws IOException {
		// D:\Documents\4학년 2학기\데이터엔지니어링\데이터엔지니어링1주차실습파일\email-EuAll\email-EuAll.txt
		BufferedReader br = new BufferedReader(new FileReader("D:\\Documents\\4학년 2학기\\데이터엔지니어링\\데이터엔지니어링1주차실습파일\\email-EuAll\\email-EuAll.txt"));
		String line;
		String[] array;
		int from, to;
		
		line = br.readLine();
		while (line != null) {
			if (line.startsWith("#")) {
				line = br.readLine();
				continue;
			}
			
			array = line.split("\t");
			from = Integer.parseInt(array[0]);
			to = Integer.parseInt(array[1]);
			
			System.out.println(new Email(from, to));
			line = br.readLine();
		}
	}
}
