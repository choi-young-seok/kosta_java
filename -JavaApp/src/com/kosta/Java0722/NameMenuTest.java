package com.kosta.Java0722;

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
			int choiceNum = nm.PrintMenu();
			switch(choiceNum)
			{
				case 1: //�߰�
					names[k] = nm.addName();
					k++;
					break;

				case 2: //����
					nm.delName();
					break;

				case 3: //����
					nm.editName();
					break;

				case 4: //�˻�
					nm.listName();
					break;

				case 5:
					b=false;
					System.out.println("=== �����մϴ�. ===");
					break;		
					
			}
		}//while
	}//main
}//class