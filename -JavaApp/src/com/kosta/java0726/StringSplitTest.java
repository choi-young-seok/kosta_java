package com.kosta.java0726;

public class StringSplitTest {
	public static void main(String[] args) {
		String tel = "010-3338-5525";
		
		String tels[] = tel.split("");
		for (int i = 0; i < tels.length; i++) {
			System.out.println("tel["+i+"] : "+ tels[i] );
		}
		
//		String uploadMemberPath = "rcn115@naver.com";
//		String requestPath = "member_profile";
		
//		String makeDirPath = "uploadFile"+"\\"+uploadMemberPath+"\\"+requestPath;
		
//		String makeDirPaths[] = makeDirPath.split("\\");
		
		String makeDirPaths[] = {"uploadFile", "rcn115@naver.com", "member_profile"};
		for (int i = 0; i < makeDirPaths.length; i++) {
			System.out.println("makeDirPaths["+i+"] : "+ makeDirPaths[i] );
		}
	}

}
