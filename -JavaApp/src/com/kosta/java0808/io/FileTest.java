package com.kosta.java0808.io;

import java.io.File;

public class FileTest {

	public static void main(String[] args) throws Exception {
//		File f = new File(String 경로);
		
//		★ 암기 !!
//		자바의 경로 표현방법
//		 - > 각 폴더와 폴더사이를 \\혹은 /로 표기
//		File f = new File("E:\\Kosta Project_neon\\JavaApp\\0808");
//		File f = new File("E:/Kosta Project_neon/JavaApp/0808/a.txt");
		File f = new File("junghoon/jeong/a.txt");
		System.out.println("파일 존재 유뮤 : " + f.exists());	
	
//		★ 이클립스의 JavaProject로 생성된 프로젝트 내의 경로는 
//		   프로젝트 명까지를 생략한 상태로 사용 하는 것이 가능
//		ex)"E:/Kosta Project_neon/JavaApp/0808"  =>이클립스 표기 : "0808/a.txt"
		
		System.out.println("파일 진위 여부 : " + f.isFile());
		System.out.println("폴더 진위 여부 : " + f.isDirectory());

		System.out.println("파일이름: "+ f.getName());
	   
		System.out.println("===========파일경로===========");
		System.out.println("f.getPath(): "+f.getPath());
		System.out.println("f.getAbsolutePath(): "+f.getAbsolutePath());
		//throws IOException처리
		System.out.println("f.getCanonicalPath(): "+f.getCanonicalPath());
		   
		System.out.println("f.getParent(): "+ f.getParent());//f: a.txt
		System.out.println("f.length(): "+ f.length());//영문,숫자:1  한글:2
		 
		System.out.println("===========파일지우기===========");
//		//파일지우기(JVM상에서 삭제)
//		boolean flag = f.delete();
//		if(flag){
//			System.out.println("파일삭제성공!!");
//		}else{
//			System.out.println("파일삭제실패!!");
//		} 
//		
//		
//		System.out.println("===========폴더생성===========");
//		File f3 = new File("junghoon/jeong");
//		System.out.println("정훈폴더는 존재? "+ f3.exists());
		
//		boolean flag2 = f3.mkdirs();//mkdirs: make directory
//		
//		if(flag2){
//			System.out.println("폴더생성 성공!!");
//		}else{
//			System.out.println("폴더생성 실패!!");   
//		}
//		   
//	 	 System.out.println("===========파일지우기===========");
	 	 
	   
	}
}
