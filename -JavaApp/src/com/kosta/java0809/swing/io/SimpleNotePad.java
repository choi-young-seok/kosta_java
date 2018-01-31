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
   JScrollPane scroll_pane;//����� ����� �����͸� ǥ���ϱ� ���� ���
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
     <��ɱ���>
    1. ����(a.txt)�� �о JTextArea�� ���
         ���� --------------> ta
         
    2. JTextArea�� text�� Ư�������̸����� ����
       ta --------------> ����
       
    JFileChooserŬ����
       - openDialog
       - saveDialog
       
    ����) JMenuItem(�̺�Ʈ�ҽ�) ----------->
          �̺�Ʈó��
    */
   
   public SimpleNotePad() {
      setTitle("�ڹٸ޸���");
      
      chooser = new JFileChooser();
	      
	try {
		fis = new FileInputStream("a.txt");
		fos = new FileOutputStream("b.txt");
	
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	b =  new byte[512];
      
      //�޴������� ����
      menu_item_open = new JMenuItem("����");
      menu_item_save = new JMenuItem("����");
      menu_item_exit = new JMenuItem("����");
      
      //�޴�����
      file_menu = new JMenu("File");
         file_menu.add(menu_item_open);
         file_menu.add(menu_item_save);
         file_menu.add(menu_item_exit);
      help_menu = new JMenu("Help");
      
      //�޴��ٱ���
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
      
      //������(������) ���
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
		 

   }//������

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		if(ob == menu_item_open){
			try {
				//Ư�� ���� ���ý� 0(APPROVE_OPTION) return, ��ҽ� 1(CANCEL_OPTION) return
				int open = chooser.showOpenDialog(this);
				String str;
				
				if(open == JFileChooser.APPROVE_OPTION){ // APPROVE_OPTION = ����� 0�� ���� ������ ������, Dialog���� �����ư�� ���������� ���� 0�� ����.
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