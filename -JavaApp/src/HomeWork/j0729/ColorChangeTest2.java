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
   //��ü����	
   Label la_red, la_blue, la_green;
   Scrollbar sb_red, sb_blue, sb_green;
   TextArea ta;
   
   /*
     <�̺�Ʈ ó��> : ��ũ�ѹٸ� ���������� �������� �����ض�~!!
      
    */

   
   Panel leftp, redp, bluep, greenp;   
	
   public ColorChangeTest2() {
	  //��ü���� 
	  la_red = new Label("����"); 
	  la_blue = new Label("�Ķ�"); 
	  la_green = new Label("�ʷ�"); 
	   
	  //sb_red = new Scrollbar(orientation, value, visible, minimum, maximum)
	  sb_red = new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 265);
	  sb_blue = new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 265);
	  sb_green = new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 265);
	
	  
	  ta = new TextArea();
	    ta.setBackground(Color.BLACK);
	     
	  redp = new Panel();
	    redp.setLayout(new BorderLayout());//��������
	    redp.add(la_red, "West");
	    redp.add(sb_red, "Center");
	    
	  greenp = new Panel();
		  greenp.setLayout(new BorderLayout());//��������
		  greenp.add(la_green, "West");
		  greenp.add(sb_green, "Center");
	    
	  bluep = new Panel();
		  bluep.setLayout(new BorderLayout());//��������
		  bluep.add(la_blue, "West");
		  bluep.add(sb_blue, "Center");
	  
	  leftp = new Panel();
	     leftp.setLayout(new GridLayout(5, 1, 0, 10));
	     leftp.add(new Label());
	     leftp.add(redp);
	     leftp.add(bluep);
	     leftp.add(greenp);
	     leftp.setBackground(Color.orange);
	     
	  setTitle("���ٲٱ�");
	  setLayout(new GridLayout(1,2));//���� 1�� �⺻
	  add(leftp);
	  add(ta);
	  
	  setSize(600,300);
	  setVisible(true);	 
	  
	  //interface
	  sb_red.addAdjustmentListener(this);
	  sb_blue.addAdjustmentListener(this);
	  sb_green.addAdjustmentListener(this);
	  
   }//������
   
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
	    	//textarea�� appen()�޼ҵ带 �̿��� ���
	    	ta.append("red : " + red +", green : " + green + ", blue : " + blue +"\n");
	    	
	  }
   
   public static void main(String[] args) {
	   new ColorChangeTest2();
	   

   }//main
}//class
