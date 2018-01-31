package com.kosta.java0809.swing.io;

public class ThreadTimer extends Thread {
	
	ArrowMoveTest arr;
	boolean flag = true;
	int x=0, y=0;

	//스택 오버플로우
//	public ThreadTimer(){
//		arr = new ArrowMoveTest();
//	}
	
	public ThreadTimer(ArrowMoveTest arr) {
		this.arr = arr;
		//ArrowMoveTest class와 ThreadTimer class가 서로 생성자를 호출하고 있기 때문에
	}
	
	@Override
	public void run() {
		try {
//			while(flag==true){
//			Thread.sleep(100);
////				arr.x=arr.x+30;
//				x = x+30;
//				arr.la.setBounds(x, 0, 60, 60);
//				if(arr.x>430){
////					arr.y=arr.y+30;
//					y = y+30;
//					arr.la.setBounds(x, y, 60, 60);
//				}else if(arr.y>430){
//					flag = false;
//				}
//			}//while
			while(true){        
				  x+=5;//증가치
				  arr.la.setLocation(x, y);
				  //System.out.println("x="+x);
				  if(x>=430)break;
				  Thread.sleep(50);//0.5초간 대기상태(쉬어라)			  
				}
				while(true){
				  y+=5;
				  arr.la.setLocation(x, y);
				  if(y>=400)break;
				  Thread.sleep(80);
				}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}//run

}//class
