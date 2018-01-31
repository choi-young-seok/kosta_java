package com.kosta.java0809.swing.io;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class SimpleNotePad extends JFrame implements ActionListener{
   JTextArea ta;
   JScrollPane scroll_pane;//사이즈를 벗어나는 데이터를 표현하기 위해 사용
                     //JTextArea. JList, JTable
   JMenuBar menu_bar;
   JMenu file_menu, help_menu;
   JMenuItem menu_item_open,menu_item_save,menu_item_exit;


	FileInputStream fis;
	FileOutputStream fos;
	
	JFileChooser chooser;
	
	int i;
	byte b[];
   
   /*
     <기능구현>
    1. 파일(a.txt)을 읽어서 JTextArea에 출력
         파일 --------------> ta
         
    2. JTextArea의 text를 특정파일이름으로 저장
       ta --------------> 파일
       
    JFileChooser클래스
       - openDialog
       - saveDialog
       
    참고) JMenuItem(이벤트소스) ----------->
          이벤트처리
    */
   
   public SimpleNotePad() {
      setTitle("자바메모장");
      
      chooser = new JFileChooser();
	      
	try {
		fis = new FileInputStream("a.txt");
		fos = new FileOutputStream("b.txt");
	
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	b =  new byte[512];
      
      //메뉴아이템 구성
      menu_item_open = new JMenuItem("열기");
      menu_item_save = new JMenuItem("저장");
      menu_item_exit = new JMenuItem("종료");
      
      //메뉴구성
      file_menu = new JMenu("File");
         file_menu.add(menu_item_open);
         file_menu.add(menu_item_save);
         file_menu.add(menu_item_exit);
      help_menu = new JMenu("Help");
      
      //메뉴바구성
      menu_bar = new JMenuBar();
         menu_bar.add(file_menu);
         menu_bar.add(help_menu);
      
      setJMenuBar(menu_bar);
      
      ta = new JTextArea();
      ta.setEditable(false);
      scroll_pane = new JScrollPane(ta);
      
      add(scroll_pane);
      
      setBounds(300,50,600,650);
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      
      //연결자(감시자) 등록
      menu_item_open.addActionListener(this);
      menu_item_save.addActionListener(this);
      menu_item_exit.addActionListener(this);
      help_menu.addActionListener(this);
      

		 
			
//			int i;
//			byte b[] = new byte[1024];
//			while((i = fis.read(b))!= -1){
//				fos.write(b);
//			}
//			
		 

   }//생성자

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		if(ob == menu_item_open){
			try {
				//특정 파일 선택시 0(APPROVE_OPTION) return, 취소시 1(CANCEL_OPTION) return
				int open = chooser.showOpenDialog(this);
				String str;
				
				if(open == JFileChooser.APPROVE_OPTION){ // APPROVE_OPTION = 상수로 0의 값을 가지고 있으며, Dialog에서 열기버튼을 눌렀을때의 값인 0과 같다.
					File f = chooser.getSelectedFile();
					if(f == null){
						return ;
					}
					System.out.println(f.getName());
					System.out.println(f.getPath());
				}
				
			} catch (HeadlessException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}else if(ob == menu_item_save){
			chooser.showSaveDialog(this);
		}else{
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		new SimpleNotePad();
	}
}//class