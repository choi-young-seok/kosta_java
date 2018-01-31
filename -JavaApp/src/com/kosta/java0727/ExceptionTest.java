package com.kosta.java0727;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionTest {

	public static void main(String[] args) {
		FileReader fileReader = null;
			try {
				fileReader = new FileReader("a.txt");
				//java io의 4대 클래스 중 하나인 Reader 
				//inputStream, outputStream  ->바이트 단위 입출력 
				// Reader, Writer ->문자열단위 입출력
				
				//파일의 경로는 "드라이브:\경로\파일명"
				//ex)c:\cys\0727\a.txt
				//예외 = 이클립스 Java Project의 경우는 프로젝트 까지의 경로가 자동으로 설정되어 파일명만 입력하는 것이 가능
				//반드시 이클립스의 JavaProject의 경우만 가능
				
				int i;
				while((i=fileReader.read())!=-1){
//					System.out.println(fileReader.read());  // return형이 int 읽은 문자의 아스키코드를 출력
					System.out.print((char)i); //읽은 아스키 코드 값을 다시 char형으로 형변환하여 출력
				}
				
				
			} catch (FileNotFoundException e) {
				System.out.println("예외객체 e :" + e); //e를 출력 =  e.toString()의 결과
				System.out.println("e.getMessage() : " + e.getMessage());
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					fileReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		
	//	} catch (IOException e) {  // 두개의 익셉션은 상속 관계를 가지는데, IOX는 부모, FILENOT은 자식이다.
		//부모는 자식으로의 형변환이 언제나 가능하기 때문에, 자식의 익셉션을 처리할수 없다.
		// 따라서 다중 캐치문에서 모든 익셉션은 가장 하위 클래스에서 상위클래스로 확장해가며 예외처리를 진행해야 한다.
	//		// TODO: handle exception
	//	} catch (FileNotFoundException e) {
	//		// TODO: handle exception
	//	}
		
		
		
	}
}
