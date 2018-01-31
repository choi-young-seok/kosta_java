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

public class ColorChangeTest extends Frame{
   //객체선언	
   Label la_red, la_blue, la_green;
   Scrollbar sb_red, sb_blue, sb_green;
   TextArea ta;
   
   /*
     <이벤트 처리> : 스크롤바를 조정했을때 바탕색을 변경해라~!!
      - 이벤트 소스 : sb_red, sb_blue, sb_green
      - 해당 컴포넌트의 클래스 : Scrollbar
      
      - 이벤트 리스너 : AdjustmentListener : interface이므로 implement하여 사용
         - 선언된 추상메소드 : adjustmentValueChanged를 구현하여 사용
      
      - 연결자 메소드 등록 : addAdjustmentListener()
      	sb_red.addAdjustmentListener(this);
      
    */
   
   
   Panel leftp, redp, bluep, greenp;   
	
   public ColorChangeTest() {
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
//	  sb_red.addAdjustmentListener(this);
//	  sb_blue.addAdjustmentListener(this);
//	  sb_green.addAdjustmentListener(this);
	  
	  //AdjustmentListener는 interface로 객체 생성이 불가능한데 class에 implements하지 않고 다음과 같이 사용할수 있는 이유는?
	  
	  ///익명의 내부 클래스 :
	  //new interface or abstract class => class extends abstract class or implements interface 
	  //객체생성의 의미에서 new가 아닌 class에서 extends 혹은 implements 하는 의미와 같으며, 
	  //다만 extends 혹은 implements받는 class가 실행하려는 class에 정의되어있으며(내부클래스),
	  //이름이 없는 class이므로 내부의 익명 클래스라 한다.
	  
	  sb_red.addAdjustmentListener(new AdjustmentListener() {
		
		@Override
		public void adjustmentValueChanged(AdjustmentEvent e) {
			// TODO Auto-generated method stub
			ta.setBackground(new Color(sb_red.getValue(), sb_blue.getValue(), sb_green.getValue()));
		}
	});
	  
	  sb_blue.addAdjustmentListener(new AdjustmentListener() {
		  
		  @Override
		  public void adjustmentValueChanged(AdjustmentEvent e) {
			  // TODO Auto-generated method stub
			  ta.setBackground(new Color(sb_red.getValue(), sb_blue.getValue(), sb_green.getValue()));
		  }
	  });
	  sb_green.addAdjustmentListener(new AdjustmentListener() {
		  
		  @Override
		  public void adjustmentValueChanged(AdjustmentEvent e) {
			  // TODO Auto-generated method stub
			  ta.setBackground(new Color(sb_red.getValue(), sb_blue.getValue(), sb_green.getValue()));
		  }
	  });
	  
   }//생성자
//   
//	  ActionListenr in
//	  @Override
//	  public void adjustmentValueChanged(AdjustmentEvent e) {
//	  	// TODO Auto-generated method stub
//	    	int red, blue, green;
//	    	red = sb_red.getValue();
//	    	blue = sb_blue.getValue();
//	    	green = sb_green.getValue();
//	    	
//	    	ta.setBackground(new Color(red, green, blue));
//	  }
   
   public static void main(String[] args) {
	   new ColorChangeTest();
	   

   }//main
}//class
