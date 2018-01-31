package HomeWork.j0728;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PersonMenuTest {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PersonMenu menu = new PersonMenu();

		int num;
		boolean b = true;
		
		while(b)
		{
			String str;
			  
			System.out.println("<�̸��޴�>");
			System.out.println("1.�߰� 2.���� 3.���� 4.�˻� 5.������");
			System.out.print("��ȣ==> "); 
			str = in.readLine();
			
			//str.matches("[0-9]+"); //�������� üũ
			//!str.matches("[0-9]+"); //���ھƴ����� üũ
			if(!str.matches("[0-9]+"))//str: "abc" "1a"
			{
				System.out.println("#��ȣ�� �Է��ϼ���!!\n");	
				num=-1;
			}
			
			else
			{
				num = Integer.parseInt(str);//Integer.parseInt("1");-->1		    	  
			}
			
			switch(num){
				case 1: 
				    if(menu.persons.size() == 5)
				    {
					    System.out.println("#�� �̻� �Է��� �� �����ϴ� \n " +
					    		           "�� �� �̻��� �̸��� ���� ������ �� �Է��ϼ���!!");
					    break;
				    }
					
					System.out.print("�̸�: ");
					String name = in.readLine();
					
					System.out.print("����: ");
					String job = in.readLine();
					
					System.out.print("����: ");
					String insertAge = in.readLine();
					int age = Integer.parseInt(insertAge);

					Person p = new Person(name, job, age);
				    menu.insert(p);			    	 
				    break;
				 
				 case 2: 
					System.out.print("������ ��ȣ: ");
					String delNum = in.readLine();
					int idx = Integer.parseInt(delNum);
					
					menu.delete(idx);
					break;
					     
				 case 3:
				 {	
					 System.out.print("������ ��ȣ : ");
					 String updateNum  = in.readLine();
					 int idx2 = Integer.parseInt(updateNum);
					 
					 System.out.print("���� : ");
					 String aage = in.readLine();
					 int updateAge = Integer.parseInt(aage);
					 
					 System.out.print("���� : ");
					 String updateJob = in.readLine();
					 
					 Person p2 = new Person();
					 p2.setAge(updateAge);
					 p2.setJob(updateJob);
					 
					 menu.update(p2, idx2);
				 }
					 break;
					 
				 case 4: 
					 System.out.println("#������");
					 menu.select();
					 
					 break;
					 
				 case 5:
					 System.out.println("====end====");
					 b=false;
					 
					 break;
			}//switch
			
		}//while
	}//main
}//class

