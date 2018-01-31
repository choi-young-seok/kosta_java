package com.kosta.java0727;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionTest {

	public static void main(String[] args) {
		FileReader fileReader = null;
			try {
				fileReader = new FileReader("a.txt");
				//java io�� 4�� Ŭ���� �� �ϳ��� Reader 
				//inputStream, outputStream  ->����Ʈ ���� ����� 
				// Reader, Writer ->���ڿ����� �����
				
				//������ ��δ� "����̺�:\���\���ϸ�"
				//ex)c:\cys\0727\a.txt
				//���� = ��Ŭ���� Java Project�� ���� ������Ʈ ������ ��ΰ� �ڵ����� �����Ǿ� ���ϸ� �Է��ϴ� ���� ����
				//�ݵ�� ��Ŭ������ JavaProject�� ��츸 ����
				
				int i;
				while((i=fileReader.read())!=-1){
//					System.out.println(fileReader.read());  // return���� int ���� ������ �ƽ�Ű�ڵ带 ���
					System.out.print((char)i); //���� �ƽ�Ű �ڵ� ���� �ٽ� char������ ����ȯ�Ͽ� ���
				}
				
				
			} catch (FileNotFoundException e) {
				System.out.println("���ܰ�ü e :" + e); //e�� ��� =  e.toString()�� ���
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

		
	//	} catch (IOException e) {  // �ΰ��� �ͼ����� ��� ���踦 �����µ�, IOX�� �θ�, FILENOT�� �ڽ��̴�.
		//�θ�� �ڽ������� ����ȯ�� ������ �����ϱ� ������, �ڽ��� �ͼ����� ó���Ҽ� ����.
		// ���� ���� ĳġ������ ��� �ͼ����� ���� ���� Ŭ�������� ����Ŭ������ Ȯ���ذ��� ����ó���� �����ؾ� �Ѵ�.
	//		// TODO: handle exception
	//	} catch (FileNotFoundException e) {
	//		// TODO: handle exception
	//	}
		
		
		
	}
}
