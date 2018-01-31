package com.kosta.java0726.Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NameMenu {
   String names[]; //배열: (이름)데이터 저장소
   String choice;
   int k = 0;
   boolean b ;

   
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
   public NameMenu() {
	  names = new String[5];//배열객체생성
	  //names[0]번지~ names[4]번지
   }
	
 //메소드: 데이터를 추가,검색,삭제,수정기능.
   public void addName(String name){
	   if(k>=5)
	   {
		   System.out.println("더 이상 입력할 수 없습니다 \n" 
                + "한 개 이상의 이름을 먼저 삭제한 후 입력하세요!!");
	   }
	 for(int i=0; i<names.length; i++){//검색: 비어있는 방찾기 ===> 방값이null
		 if(name.equals(names[i])){
			 System.out.println("이미 입력된 이름입니다!!");
			 break;
		 }
		 else if(names[i] == null){ //빈방을 찾았다면
		   names[i] = name;
		   k++;
		   break;
		 }
      }	   
   }//추가
   
   public void delName(String name){
	 for(int i=0; i<names.length; i++){//지우고자 하는 이름을 배열에서 찾기
		 //names[i] : 배열에 저장된 값,  name: 지울 이름
		 //if(names[i].equals(name)){ //문자열 내용 비교:  문자열.equals(비교문자열)
	     //if(name.equals(names[i])){//콘솔입력은 null입력이 없다. 최소 빈문자열 "" 임!!
		 if(!(CheckName(name)))
		  {
			  System.out.println("존재하지 않는 이름입니다!!");
			  break;
		  }
		 else if(names[i] != null  && names[i].equals(name)){ 
			 //NullPointerException발생이유: null.필드명 또는 null.메소드명()
			 // A||B  : A가 true라면 B는 실행되지 않음.   
			 // A&&B  : A가 false라면 B는 실행되지 않음
		   names[i]=null;//삭제표현
	       k--; 
		   break;
	        
		 }
		 /*else
		 {
			 System.out.println("존재하지 않는 이름입니다!!");
			 break;
		 }*/
	 }
   }//삭제
   public void editName(String oldName,String  newName){//수정
	  for(int i=0; i<names.length; i++){
		  if(!(CheckName(oldName)))
		  {
			  System.out.println("존재하지 않는 이름입니다!!");
			  break;
		  }
		  else if(names[i] != null &&names[i].equals(oldName) ){//수정할 이름을 찾았다면
			  names[i]=newName;
			  break;
		  }
	  }
   }
   public void listName(){//전체데이터검색
	 System.out.println("[이름목록]");
	 for(int i=0; i<names.length; i++){//i=0~4
		if(names[i] != null)
        System.out.println(" "+names[i]);
	 }	   
   }//listName
   
   public String PrintMenu() throws IOException
   {
	  System.out.println("<이름메뉴>");
      System.out.println("1.추가 2.삭제 3.수정 4.검색 5.나가기");
      System.out.print("번호==> ");
      choice = br.readLine();
      
      return choice;
   }
   
   public boolean CheckName(String name){
	   
	   boolean b = false;
	   
	   for (int i = 0; i < names.length; i++) {
		   if(names[i].equals(name)){
			   b = true;
			   break;
		   }
		   else{
			   b = false;
			   break;
		   }
	   }//for
	   return b;
   }//CheckName
	
}
