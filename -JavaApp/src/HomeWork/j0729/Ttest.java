package HomeWork.j0729;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class Ttest extends Frame{
	Panel panel1, panel2, panel3, panel4, panel5;
	Scrollbar scrollbar1, scrollbar2, scrollbar3;
	Label label1, label2, label3;
	
	GridLayout gridLayout;
	
	
	public Ttest(String title) {
		super(title);
		
		//����
		panel1 = new Panel();
		panel2 = new Panel();
		panel3 = new Panel();
		panel4 = new Panel();
		panel5 = new Panel();
		
		label1 = new Label("����");
		label2 = new Label("�Ķ�");
		label3 = new Label("�ʷ�");
		
		scrollbar1 = new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,255);
		scrollbar2 = new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,255);
		scrollbar3 = new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,255);
		
		gridLayout = new GridLayout(0, 2);
		
		//����
		setLayout(gridLayout);
		panel1.setBackground(Color.orange);
		panel1.setLayout(new GridLayout(0, 3));
		
		add(panel1);
			panel1.add(scrollbar1);
			panel1.add(scrollbar2);
			panel1.add(panel3);
			panel1.add(panel4);
			
			panel1.add(label1);
			panel1.add(label2);
			panel1.add(label3);
			
		add(panel5);
		panel5.setBackground(new Color(scrollbar1.getValue(), scrollbar2.getValue(), scrollbar3.getValue()));
		//������
		setVisible(true);
		setSize(500, 500);
		
		scrollbar1.addAdjustmentListener(new AdjustmentListener() {
			
			@Override
			public void adjustmentValueChanged(AdjustmentEvent e) {
				// TODO Auto-generated method stub
				scrollbar1.getValue();
			}
		});
		
		scrollbar2.addAdjustmentListener(new AdjustmentListener() {
			
			@Override
			public void adjustmentValueChanged(AdjustmentEvent e) {
				// TODO Auto-generated method stub
				scrollbar1.getValue();
			}
		});
		
	}
	
	public static void main(String[] args) {
		new Ttest("�����ϱ� �׽�Ʈ");
	}
}
