package com.kosta.java0809.swing.io;

public class ThreadTimer extends Thread {
	
	ArrowMoveTest arr;
	boolean flag = true;
	int x=0, y=0;

	//���� �����÷ο�
//	public ThreadTimer(){
//		arr = new ArrowMoveTest();
//	}
	
	public ThreadTimer(ArrowMoveTest arr) {
		this.arr = arr;
		//ArrowMoveTest class�� ThreadTimer class�� ���� �����ڸ� ȣ���ϰ� �ֱ� ������
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
				  x+=5;//����ġ
				  arr.la.setLocation(x, y);
				  //System.out.println("x="+x);
				  if(x>=430)break;
				  Thread.sleep(50);//0.5�ʰ� ������(�����)			  
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
