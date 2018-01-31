package com.kosta.java0803;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BaseBallGame2 extends JFrame implements ActionListener{
   JTextArea ta;
   JScrollPane scroll;
   JLabel la;
   JTextField tf;
   
   JButton bt_new, bt_clear, bt_dap, bt_exit;
	
   JPanel panel;
   
   int com[];//��ǻ�Ϳ��� �߻��ϴ� ������ ���� ����.
   int user[];//�ؽ�Ʈ�ʵ带 ���� �Էµ� ���ڹ��ڿ����� ����
   Random r;
   JFrame f;
   boolean startGame;
   int count;//���ڸ��߱� �õ� Ƚ��
   
   public BaseBallGame2() {
	  setTitle("���ھ߱�����");	  
	  f = this; 
	  
	  //�ڷ��� ������[] = new �ڷ���[�迭ũ��];
	  com = new int[3];
	  user = new int[3];
	  r = new Random();
	  
	  ta = new JTextArea();
	    ta.setEditable(false);//�������
	    ta.setText("\n\n\t<���ھ߱�����>");
	     ta.append("\n    1. ���ӽ����� ���ؼ� �����ӹ�ư�� Ŭ��");
	     ta.append("\n    2. �Է¿� �ߺ������ʴ� ���ڸ� ���� �Է��� ����");
	     ta.append("\n    3. ���ڿ� �ڸ����� ���߸� Strike");
	     ta.append("\n       ���ڸ� ���߸� Ball�� �߰��˴ϴ�.");
	     ta.append("\n    4. ������ ���� ������ �����ư�� Ŭ��");
	     ta.append("\n    5. ��Ÿ ���ǻ����� ������ �����ڿ��� �����ٶ�");
	     ta.append("\n      (070-5039-5815)");
	    
	    
	    
	  scroll = new JScrollPane(ta);//��ũ�ѹٸ� �����ϴ� TextArea
	  la = new JLabel("�Է�:");
	  tf = new JTextField();
	    //tf.setEditable(false);
	    tf.setEnabled(false);//��Ȱ��ȭ
	  
	  bt_new = new JButton("������");	  
	  bt_clear = new JButton("�����");
	  bt_dap = new JButton("����");
	  bt_exit = new JButton("������");
	  
	  //ActionCommand ���ڿ�����
	  //bt_new.setActionCommand("�浿");
	  tf.setActionCommand("�ؽ�Ʈ�ʵ�");
	  
	  
	  panel = new JPanel();
	  
	  scroll.setBounds(10, 10, 350, 280);
	  la.setBounds(10, 320, 30,30);
	  tf.setBounds(50, 320, 310,30);

	  bt_new.setBounds(380, 60, 90,30);//x��,y��, ����, ����
	  bt_clear.setBounds(380, 110, 90,30);
	  bt_dap.setBounds(380, 160, 90,30);
	  bt_exit.setBounds(380, 210, 90,30);
	  
	  panel = new JPanel();
	  panel.setLayout(null);
	  panel.setBackground(Color.orange);
	  panel.add(scroll);	  
	  panel.add(la);	  
	  panel.add(tf);	  
	  panel.add(bt_new);	  
	  panel.add(bt_clear);	  
	  panel.add(bt_dap);	  
	  panel.add(bt_exit);
	  
	  
      add(panel);
      setBounds(300,200, 500, 400);
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      eventUp();
   }//������
   
   
   public void eventUp(){//�̺�Ʈ �ҽ� ���
	  //��ư���
	  bt_new.addActionListener(this);
	  bt_clear.addActionListener(this);
	  bt_dap.addActionListener(this);
	  bt_exit.addActionListener(this);
	  
	  //�ؽ�Ʈ�ʵ���
	  tf.addActionListener(this);
	  
	  //(class My extends MouseAdapter{})	
	  tf.addMouseListener(new MouseAdapter() {
		  @Override
		public void mouseClicked(MouseEvent e) {
		  if(!startGame) showMessage("���ӽ����� ���� �����ӹ�ư�� Ŭ���ϼ���!!");
			  //JOptionPane.showMessageDialog(f,"�ȳ�~!!");	
		}
	  });
   }//eventUp
   
   public void showMessage(String msg){
	   JOptionPane.showMessageDialog(this,msg);	   
   }
   
   //��ȣ����
   public void createNum(){
	  com[0]= r.nextInt(9)+1;//0~8 + 1 : 1~9 //r.nextInt(10);//0~9
	  do{
		  com[1]= r.nextInt(9)+1;
	  }while(com[1] == com[0]);
	  do{
		  com[2]= r.nextInt(9)+1;		  
	  }while(com[2]==com[1]  ||  com[2] == com[0]);
   }//createNum
   
   //��ǻ�ͳ����� ������Էµ����� ��
   public void compareNum(String str){
	  //���ڿ� ---> int []�迭 ��ȯ
	 for(int i=0; i<user.length; i++){  
	   user[i]= str.charAt(i) -48;
	 }
	 
	 if(duplicateNum()){//�ߺ��� ���� �߽߰� true����
	   JOptionPane.showMessageDialog(this, "�ߺ������ʴ� ���� �Է��ϼ���!!"); 
	    return;
	 }
	 
	 count++;//�õ� Ƚ��
	 
	 int strike=0, ball=0;
	 //���� ---> strike�� ball ī��Ʈ
	 for(int i=0; i<com.length; i++){//com�迭ǥ�� 0~2
	   for(int j=0; j<user.length; j++){//user�迭ǥ�� 0~2
		  if(com[i] == user[j]){//�迭�� ����� ���� ��(���� ���� �߰ߵȴٸ�)
		      if(i == j){//����ġ, �ڸ���(�ε���)�� ��ġ
		    	  strike++;
		      }else{//����ġ, �ڸ���(�ε���) ����ġ
		    	  ball++;
		      }
		  }
	   }
	 }//�ٱ�for
	 
	if(strike==3) {
	 ta.append("�����մϴ�~^^* ["+str+"] ������ ���߼̽��ϴ�!!\n");
	 tf.setEnabled(false);
	 startGame=false;
	}else 
	 ta.append(count+" : ["+str+"] �� "+strike+"Strike, "+ball+"Ball\n");
	 
   }//compareNum
   
   public void initText(){
	  ta.setText("");
	  tf.setText(""); 
	  tf.requestFocus();//�ؽ�Ʈ�ʵ忡 ��Ŀ�� ��ġ��Ű��
   }//TextField, TextArea�ʱ�ȭ
   
   public boolean inputCheck(String str){//�Էµ� ���� ���� ���ڰ˻�, ���̰˻�
	  //for(int i=0; i<str.length(); i++){}
	  return str.matches("[1-9]{3}");//d: digit(������)
   }//inputCheck
   
   public boolean duplicateNum(){//user[]���� �ߺ����ڰ˻�	   
	  if(user[0]==user[1] || user[0]==user[2] || user[1]==user[2]) 
		  return true;  
	  //else 
	     return false;
   }//duplicateNum
   
   @Override	
   public void actionPerformed(ActionEvent e) {//�̺�Ʈ �ڵ鷯(�������)
	  //Object ob = e.getSource();//�̺�Ʈ�ҽ��� ���۷��� ������. 
	  String action = e.getActionCommand();//�׼Ǹ�� ���ڿ� ������.
	  System.out.println("action="+ action);
	  
	  if(action.equals("�ؽ�Ʈ�ʵ�")){//if(ob==tf)
		String str = tf.getText();
		tf.setText("");		
		if(!inputCheck(str)){//inputCheck(): ������ ���Է½� ����true
	      JOptionPane.showMessageDialog(this, "3�ڸ� ���ڸ� �Է��ϼ���!!");
			return; 		
		}		
		
		compareNum(str);
	  }else if(action.equals("������")){
		 count=0;
		 createNum();
		 tf.setEnabled(true);
		 startGame=true;
		 initText();
	  }else if(action.equals("�����")){
		 initText();
	  }else if(action.equals("����")){
		 ta.append("������ ["+com[0]+com[1]+com[2]+"] �Դϴ�!!\n"); 
	  }else if(action.equals("������")){
		 System.exit(0);
	  }
   }//actionPerformed
     
   public static void main(String[] args) {
	   new BaseBallGame2();
   }



}



