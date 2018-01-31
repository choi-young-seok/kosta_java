package HomeWork.j0729;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class ColorChangeTest2 extends Frame implements AdjustmentListener  {
   //객체선언	
   Label la_red, la_blue, la_green;
   Scrollbar sb_red, sb_blue, sb_green;
   TextArea ta;
   
   /*
     <이벤트 처리> : 스크롤바를 조정했을때 바탕색을 변경해라~!!
      
    */

   
   Panel leftp, redp, bluep, greenp;   
	
   public ColorChangeTest2() {
	  //객체생성 
	  la_red = new Label("빨강"); 
	  la_blue = new Label("파랑"); 
	  la_green = new Label("초록"); 
	   
	  //sb_red = new Scrollbar(orientation, value, visible, minimum, maximum)
	  sb_red = new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 265);
	  sb_blue = new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 265);
	  sb_green = new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 265);
	
	  
	  ta = new TextArea();
	    ta.setBackground(Color.BLACK);
	     
	  redp = new Panel();
	    redp.setLayout(new BorderLayout());//방위정렬
	    redp.add(la_red, "West");
	    redp.add(sb_red, "Center");
	    
	  greenp = new Panel();
		  greenp.setLayout(new BorderLayout());//방위정렬
		  greenp.add(la_green, "West");
		  greenp.add(sb_green, "Center");
	    
	  bluep = new Panel();
		  bluep.setLayout(new BorderLayout());//방위정렬
		  bluep.add(la_blue, "West");
		  bluep.add(sb_blue, "Center");
	  
	  leftp = new Panel();
	     leftp.setLayout(new GridLayout(5, 1, 0, 10));
	     leftp.add(new Label());
	     leftp.add(redp);
	     leftp.add(bluep);
	     leftp.add(greenp);
	     leftp.setBackground(Color.orange);
	     
	  setTitle("색바꾸기");
	  setLayout(new GridLayout(1,2));//가로 1행 기본
	  add(leftp);
	  add(ta);
	  
	  setSize(600,300);
	  setVisible(true);	 
	  
	  //interface
	  sb_red.addAdjustmentListener(this);
	  sb_blue.addAdjustmentListener(this);
	  sb_green.addAdjustmentListener(this);
	  
   }//생성자
   
	  @Override
	  public void adjustmentValueChanged(AdjustmentEvent e) {
	  	// TODO Auto-generated method stub
	    	int red, blue, green;
	    	red = sb_red.getValue();
	    	blue = sb_blue.getValue();
	    	green = sb_green.getValue();
	    	
	    	ta.setBackground(new Color(red, green, blue));
	    	
//	    	ta.setText("red : " + red +", green : " + green + ", blue : " + blue);
//	    	
	    	//textarea에 appen()메소드를 이용한 방법
	    	ta.append("red : " + red +", green : " + green + ", blue : " + blue +"\n");
	    	
	  }
   
   public static void main(String[] args) {
	   new ColorChangeTest2();
	   

   }//main
}//class
