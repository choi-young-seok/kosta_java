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
   
   int com[];//컴퓨터에서 발생하는 임의의 난수 저장.
   int user[];//텍스트필드를 통해 입력된 숫자문자열값을 저장
   Random r;
   JFrame f;
   boolean startGame;
   int count;//숫자맞추기 시도 횟수
   
   public BaseBallGame2() {
	  setTitle("숫자야구게임");	  
	  f = this; 
	  
	  //자료형 변수명[] = new 자료형[배열크기];
	  com = new int[3];
	  user = new int[3];
	  r = new Random();
	  
	  ta = new JTextArea();
	    ta.setEditable(false);//쓰기금지
	    ta.setText("\n\n\t<숫자야구게임>");
	     ta.append("\n    1. 게임시작을 위해서 새게임버튼을 클릭");
	     ta.append("\n    2. 입력에 중복되지않는 세자리 수를 입력후 엔터");
	     ta.append("\n    3. 숫자와 자릿수를 맞추면 Strike");
	     ta.append("\n       숫자만 맞추면 Ball이 추가됩니다.");
	     ta.append("\n    4. 정답을 보고 싶으면 정답버튼을 클릭");
	     ta.append("\n    5. 기타 문의사항이 있으면 관리자에게 연락바람");
	     ta.append("\n      (070-5039-5815)");
	    
	    
	    
	  scroll = new JScrollPane(ta);//스크롤바를 지원하는 TextArea
	  la = new JLabel("입력:");
	  tf = new JTextField();
	    //tf.setEditable(false);
	    tf.setEnabled(false);//비활성화
	  
	  bt_new = new JButton("새게임");	  
	  bt_clear = new JButton("지우기");
	  bt_dap = new JButton("정답");
	  bt_exit = new JButton("나가기");
	  
	  //ActionCommand 문자열설정
	  //bt_new.setActionCommand("길동");
	  tf.setActionCommand("텍스트필드");
	  
	  
	  panel = new JPanel();
	  
	  scroll.setBounds(10, 10, 350, 280);
	  la.setBounds(10, 320, 30,30);
	  tf.setBounds(50, 320, 310,30);

	  bt_new.setBounds(380, 60, 90,30);//x축,y축, 가로, 세로
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
   }//생성자
   
   
   public void eventUp(){//이벤트 소스 등록
	  //버튼등록
	  bt_new.addActionListener(this);
	  bt_clear.addActionListener(this);
	  bt_dap.addActionListener(this);
	  bt_exit.addActionListener(this);
	  
	  //텍스트필드등록
	  tf.addActionListener(this);
	  
	  //(class My extends MouseAdapter{})	
	  tf.addMouseListener(new MouseAdapter() {
		  @Override
		public void mouseClicked(MouseEvent e) {
		  if(!startGame) showMessage("게임시작을 위해 새게임버튼을 클릭하세요!!");
			  //JOptionPane.showMessageDialog(f,"안녕~!!");	
		}
	  });
   }//eventUp
   
   public void showMessage(String msg){
	   JOptionPane.showMessageDialog(this,msg);	   
   }
   
   //번호생성
   public void createNum(){
	  com[0]= r.nextInt(9)+1;//0~8 + 1 : 1~9 //r.nextInt(10);//0~9
	  do{
		  com[1]= r.nextInt(9)+1;
	  }while(com[1] == com[0]);
	  do{
		  com[2]= r.nextInt(9)+1;		  
	  }while(com[2]==com[1]  ||  com[2] == com[0]);
   }//createNum
   
   //컴퓨터난수와 사용자입력데이터 비교
   public void compareNum(String str){
	  //문자열 ---> int []배열 변환
	 for(int i=0; i<user.length; i++){  
	   user[i]= str.charAt(i) -48;
	 }
	 
	 if(duplicateNum()){//중복된 숫자 발견시 true리턴
	   JOptionPane.showMessageDialog(this, "중복되지않는 수를 입력하세요!!"); 
	    return;
	 }
	 
	 count++;//시도 횟수
	 
	 int strike=0, ball=0;
	 //값비교 ---> strike와 ball 카운트
	 for(int i=0; i<com.length; i++){//com배열표현 0~2
	   for(int j=0; j<user.length; j++){//user배열표현 0~2
		  if(com[i] == user[j]){//배열에 저장된 값을 비교(같은 값이 발견된다면)
		      if(i == j){//값일치, 자릿수(인덱스)도 일치
		    	  strike++;
		      }else{//값일치, 자릿수(인덱스) 불일치
		    	  ball++;
		      }
		  }
	   }
	 }//바깥for
	 
	if(strike==3) {
	 ta.append("축하합니다~^^* ["+str+"] 정답을 맞추셨습니다!!\n");
	 tf.setEnabled(false);
	 startGame=false;
	}else 
	 ta.append(count+" : ["+str+"] ▶ "+strike+"Strike, "+ball+"Ball\n");
	 
   }//compareNum
   
   public void initText(){
	  ta.setText("");
	  tf.setText(""); 
	  tf.requestFocus();//텍스트필드에 포커스 위치시키기
   }//TextField, TextArea초기화
   
   public boolean inputCheck(String str){//입력된 값에 대해 숫자검사, 길이검사
	  //for(int i=0; i<str.length(); i++){}
	  return str.matches("[1-9]{3}");//d: digit(십진수)
   }//inputCheck
   
   public boolean duplicateNum(){//user[]내의 중복숫자검사	   
	  if(user[0]==user[1] || user[0]==user[2] || user[1]==user[2]) 
		  return true;  
	  //else 
	     return false;
   }//duplicateNum
   
   @Override	
   public void actionPerformed(ActionEvent e) {//이벤트 핸들러(기능정의)
	  //Object ob = e.getSource();//이벤트소스의 레퍼런스 얻어오기. 
	  String action = e.getActionCommand();//액션명령 문자열 얻어오기.
	  System.out.println("action="+ action);
	  
	  if(action.equals("텍스트필드")){//if(ob==tf)
		String str = tf.getText();
		tf.setText("");		
		if(!inputCheck(str)){//inputCheck(): 적절한 값입력시 리턴true
	      JOptionPane.showMessageDialog(this, "3자리 숫자만 입력하세요!!");
			return; 		
		}		
		
		compareNum(str);
	  }else if(action.equals("새게임")){
		 count=0;
		 createNum();
		 tf.setEnabled(true);
		 startGame=true;
		 initText();
	  }else if(action.equals("지우기")){
		 initText();
	  }else if(action.equals("정답")){
		 ta.append("정답은 ["+com[0]+com[1]+com[2]+"] 입니다!!\n"); 
	  }else if(action.equals("나가기")){
		 System.exit(0);
	  }
   }//actionPerformed
     
   public static void main(String[] args) {
	   new BaseBallGame2();
   }



}



