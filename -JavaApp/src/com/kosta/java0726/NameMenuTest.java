package com.kosta.java0726;

import java.io.IOException;

class NameMenuTest 
{
	public static void main(String[] args) throws IOException
	{
		NameMenu nm = new NameMenu();
		String names[] = new String [5];
		int k = 0;
		boolean b = true;

		while(b)
		{
			String choice = nm.PrintMenu();
			if(!(choice.matches("[0-9]+"))){
				System.out.println("번호만 입력하세요!!");
			}
			else{
				int choiceNum = Integer.parseInt(choice);
				switch(choiceNum)
				{
					case 1: //추가
						names[k] = nm.addName();
						k++;
						break;
	
					case 2: //삭제
						nm.delName();
						break;
	
					case 3: //수정
						nm.editName();
						break;
	
					case 4: //검색
						nm.listName();
						break;
	
					case 5:
						b=false;
						System.out.println("=== 종료합니다. ===");
						break;	
				}
					
			}
		}//while
	}//main
}//class