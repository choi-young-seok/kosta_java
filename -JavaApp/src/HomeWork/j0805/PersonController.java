package HomeWork.j0805;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PersonController implements ActionListener{
	MainView mainView;
	InputForm inputForm;
//	boolean b=true;
	int personCount;
	
	public PersonController() {
		mainView = new MainView();
		inputForm = new InputForm();
		eventUp();
	}
	
	public void eventUp(){
		mainView.inputButton.addActionListener(this);
		mainView.updateButton.addActionListener(this);
		mainView.deleteButton.addActionListener(this);
		mainView.exitButton.addActionListener(this);
		
		inputForm.inputButton.addActionListener(this);
		inputForm.cancelButton.addActionListener(this);
	}
	
//	public void switchFrame() {
//		
//		if(b==true){
//			mainView.setVisible(true);
//			inputForm.setVisible(false);
//		}else{
//			mainView.setVisible(false);
//			inputForm.setVisible(true);
//		}
//	}
//

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
//		
//		if(ob==mainView.inputButton){
//
//		}else if(ob==mainView.updateButton){
//			
//		}else if(ob==mainView.deleteButton){
//			
//		}else if(ob==mainView.exitButton){
//			System.exit(0);
//		}else if(ob==inputForm.inputButton){
//			//입력
//			if(ob==){
//
//			}else{//수정
//
//			}
//		}else{
//
//		}
	}//이벤트 핸들러
	
	public static void main(String[] args) {
		new PersonController();
	}
}
