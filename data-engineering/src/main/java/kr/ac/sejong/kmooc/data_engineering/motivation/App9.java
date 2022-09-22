package kr.ac.sejong.kmooc.data_engineering.motivation;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class App9 {
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
		
		// 보낸 사람을 Integer[] senders
		Integer[] senders = new Integer[300000];
		int count = 0;
		for (Email email: data) {
			int from = email.from;
			// from이 senders에 있는지 없는지 확인하고 있으면 무시하고, 없으면 추가.
			for (int i = 0; i < senders.length; i++) {
				if (senders[i] == null) {
					// from이 senders에 없으며, 추가 가능
					senders[i] = from;
					break;
				}
				if (senders[i] == from) break;
			}
			System.out.println(++count);
		}
		// senders는 보낸 사람의 ID를 중복없이 앞에서 부터 채워 놓았음.
		int senderCount = 0;
		for (int i = 0; i < senders.length; i++) {
			if (senders[i] == null) break;
			senderCount++;
		}
		System.out.println("보낸 사람의 수: " + senderCount);
		// 보낸 사람의 수: 225409
	}
}
