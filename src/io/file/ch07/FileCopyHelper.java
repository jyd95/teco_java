package io.file.ch07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopyHelper {

	// 함수 기반으로 만들어 보자

	// 파일 복사
	public static void copyFile(String readFilePath, String writterFilePath) {

		try (FileReader fr = new FileReader(readFilePath); 
				FileWriter fw = new FileWriter(writterFilePath)) {

			int c;
			while ((c = fr.read()) != -1) {
				fw.write(c);
			}
			System.out.println("파일 복사 완료 : " + writterFilePath);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("파일 복사 중 오류 발생");
		}

	}

	// 파일 복사 - 버퍼 활용
	public static void copyFileWithBuffer(String readFilePath, String writterFilePath) {
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(readFilePath));
				BufferedWriter bw = new BufferedWriter(new FileWriter(writterFilePath))){
			
			// 버퍼를 활용할 때 버퍼의 크기를 지정할 수 있다.
			char[] buffer = new char[1024];
			int numCharsRead; // 읽은 문자 수
			
			while( (numCharsRead = bufferedReader.read(buffer)) != -1 ) {
				bw.write(buffer, 0, numCharsRead);
				System.out.println("numCharsread : " + numCharsRead);
			
			}
			
			System.out.println("버퍼를 활용한 파일 복사 완료 : " + writterFilePath);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("버퍼를 활용한 파일 복사 중 오류 발생");
		}
	}

	// 메인 함수
	public static void main(String[] args) {
		FileCopyHelper.copyFile("Seoul.txt", "copySeoul.txt");
		System.out.println("-----------------------------");
		FileCopyHelper.copyFileWithBuffer("NewYork.txt", "CopyNewYork.txt");
	}// end of main
}
