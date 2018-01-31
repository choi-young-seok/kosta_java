package HomeWork.j0805;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class InputForm extends JFrame{
	JLabel nameLabel, ageLabel, jobLabel;
	JButton inputButton, cancelButton;
	JTextField nameField, ageField, jobField;
	
	
	public InputForm() {
		nameLabel = new JLabel("이름");
		nameLabel.setBounds(100, 50, 45, 45);
		ageLabel = new JLabel("나이");
		ageLabel.setBounds(100, 100, 45, 45);
		jobLabel = new JLabel("직업");
		jobLabel.setBounds(100, 150, 45, 45);
		
		nameField = new JTextField(10);
		nameField.setBounds(150, 50, 60, 30);
		ageField = new JTextField(10);
		ageField.setBounds(150, 100, 60, 30);
		jobField = new JTextField(10);
		jobField.setBounds(150, 150, 60, 30);
		
		inputButton = new JButton("입력");
		inputButton.setBounds(80, 200, 60, 35);
		cancelButton = new JButton("입력");
		cancelButton.setBounds(160, 200, 60, 35);
		
		setLayout(null);
		
		add(nameLabel);
		add(ageLabel);
		add(jobLabel);
		
		add(nameField);
		add(ageField);
		add(jobField);
		
		add(inputButton);
		add(cancelButton);
		
		setTitle("InputForm");
		setVisible(true);
		setBounds(300,200,300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		
	}	

	public void initForm(){
		//각필드 null초기화
		//최상위필드 포커싱
	}
}