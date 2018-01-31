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
			  
			System.out.println("<이름메뉴>");
			System.out.println("1.추가 2.삭제 3.수정 4.검색 5.나가기");
			System.out.print("번호==> "); 
			str = in.readLine();
			
			//str.matches("[0-9]+"); //숫자조합 체크
			//!str.matches("[0-9]+"); //숫자아닌조합 체크
			if(!str.matches("[0-9]+"))//str: "abc" "1a"
			{
				System.out.println("#번호만 입력하세요!!\n");	
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
					    System.out.println("#더 이상 입력할 수 없습니다 \n " +
					    		           "한 개 이상의 이름을 먼저 삭제한 후 입력하세요!!");
					    break;
				    }
					
					System.out.print("이름: ");
					String name = in.readLine();
					
					System.out.print("직업: ");
					String job = in.readLine();
					
					System.out.print("나이: ");
					String insertAge = in.readLine();
					int age = Integer.parseInt(insertAge);

					Person p = new Person(name, job, age);
				    menu.insert(p);			    	 
				    break;
				 
				 case 2: 
					System.out.print("삭제할 번호: ");
					String delNum = in.readLine();
					int idx = Integer.parseInt(delNum);
					
					menu.delete(idx);
					break;
					     
				 case 3:
				 {	
					 System.out.print("수정할 번호 : ");
					 String updateNum  = in.readLine();
					 int idx2 = Integer.parseInt(updateNum);
					 
					 System.out.print("나이 : ");
					 String aage = in.readLine();
					 int updateAge = Integer.parseInt(aage);
					 
					 System.out.print("직업 : ");
					 String updateJob = in.readLine();
					 
					 Person p2 = new Person();
					 p2.setAge(updateAge);
					 p2.setJob(updateJob);
					 
					 menu.update(p2, idx2);
				 }
					 break;
					 
				 case 4: 
					 System.out.println("#사람목록");
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

