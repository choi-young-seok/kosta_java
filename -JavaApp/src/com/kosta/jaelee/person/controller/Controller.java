package com.kosta.jaelee.person.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.kosta.jaelee.person.model.Model;
import com.kosta.jaelee.person.model.Person;
import com.kosta.jaelee.person.VIew.*;

public class Controller implements ActionListener {
	// ��ü ���ø����̼��� �帧 ����

	// ����
	MainView mainV;
	InputForm form;

	// �𵨵��
	Model m;

	int cntNo;// �ԷµǴ� ������� (������)��ȣ�ο�

	int upNo;// ������ Person�� ��ȣ�� �ӽ÷� ����
	/*
	 * <��Ʈ�ѷ��� ����> 1. ����� ��û�� ���� �м� 2. ����� �Էµ����͸� ������ 3. �𵨰�ü����. 3_1. �޼ҵ�ȣ�� 3_2.
	 * ���ϵ����͸� ������ ���� 4. ������(������) �̵�
	 * 
	 * �ɼ�) ��ȿ���˻�
	 */

	public Controller() {
		mainV = new MainView();
		form = new InputForm();

		m = new Model();

		eventUp();
	}// ������

	private void eventUp() {// �̺�Ʈ�ҽ�-----�̺�Ʈ�ڵ鷯�� ����
		// MainView���
		mainV.bt_insert.addActionListener(this);
		mainV.bt_update.addActionListener(this);
		mainV.bt_delete.addActionListener(this);
		mainV.bt_exit.addActionListener(this);

		// InputForm���
		form.bt_submit.addActionListener(this);
		form.bt_cancel.addActionListener(this);

		// InputForm - JTextField���� �����Է�
		form.tf_name.addActionListener(this);
		form.tf_age.addActionListener(this);
		form.tf_job.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {// �̺�Ʈ �ڵ鷯(ó����)
		Object ob = e.getSource();// �̺�Ʈ�ҽ��� ���۷������� ������
		if (ob == mainV.bt_insert) {// 1. ���ο��� '�Է�'��ư�� Ŭ���ߴٸ�
									// ------> ������ �Է����� ���ߴٸ�
			// ������ �̵�===> 4.
			form.initForm();
			mainV.setVisible(false);
			form.setVisible(true);// �Է��� �����ֱ�

		} else if (ob == mainV.bt_update) {// 1. ���ο��� '����'��ư�� Ŭ���ߴٸ�
			// �м����: ���������� �����ϰڴ�!!
			// �ʿ��Ѱ�? �������� ���(ModelŬ���� select()�޼ҵ� �ʿ�),
			// ������ �ѷ��� ���� �ʿ�!!

			int selectedRow = mainV.table.getSelectedRow();
			if (selectedRow == -1) {
				JOptionPane.showMessageDialog(mainV, "������ ���� ����!!");
				return;
			}
			int selectedNo = (int) mainV.table.getValueAt(selectedRow, 0);
			// (row,column) --> 0 column: ��ȣ
			System.out.println("���õ� ��: " + selectedRow);
			System.out.println("���õ� ���� ��ȣ(" + selectedRow + "�� 0��): " + selectedNo);

			upNo = selectedNo; // ��? ������ �ٸ� update�׼ǿ��� ����� �� �ֵ���

			Person p = m.select(selectedNo);
			form.tf_name.setText(p.getName());
			form.tf_age.setText(p.getAge() + "");
			// setText()�޼ҵ�� ���ڿ� �Ķ���͸� ���ϹǷ� setText(13+"");
			form.tf_job.setText(p.getJob());

			form.initUpForm();
			mainV.setVisible(false);
			form.setVisible(true);// ������ �����ֱ�

		} else if (ob == mainV.bt_delete) {// 1. ���ο��� '����'��ư�� Ŭ���ߴٸ�
			// String str = JOptionPane.showInputDialog(mainV, "������ ��ȣ:");
			String str = mainV.showInput("������ ��ȣ:");

			if (str == null) { // ��ҳ� X��ư�� Ŭ���� str���� null���� ����
				// nullüũ
				return;
			}

			if (!str.matches("[\\d]+")) {// ����üũ
				JOptionPane.showMessageDialog(mainV, "���ڸ� �Է�!!");
				return;
			}

			int delNo = Integer.parseInt(str);

			int t = JOptionPane.showConfirmDialog(mainV, "��������?");

			if (t != 0)
				return;

			// ������ ��ȣ ��������
			/*
			 * Person p = m.select(delNo);//�˻� if(p==null){//��ġ�ϴ� ��ȣ�� ã�� ������!!
			 * JOptionPane.showMessageDialog(mainV, "�������� �ʴ� ��ȣ�Դϴ�!!"); return;
			 * }
			 */

			// if(t==0){//'��'��ư�� Ŭ���ߴٸ�
			if (!m.delete(delNo)) { // �����۾� ����, ���������ڵ�
				JOptionPane.showMessageDialog(mainV, "[�������� �ʴ� ��ȣ�Դϴ�!!]");
				return;
			}
			mainV.displayTable(m.selectAll()); // ������ ����� ���͸� ������
			// }

		} else if (ob == mainV.bt_exit) {// 1. ���ο��� '����'��ư�� Ŭ���ߴٸ�
			System.exit(0);
		} else if (ob == form.bt_submit || ob == form.tf_job) {
			// 1. �Է������� '�Է�'��ư�� Ŭ���ߴٸ�
			// 1. ���������� '����'��ư�� Ŭ���ߴٸ�

			String name = form.tf_name.getText().trim();// 2.
			String ageStr = form.tf_age.getText().trim();// 2.
			String job = form.tf_job.getText().trim();// 2.

			int age;

			Person p;// 3.

			// InputForm��ü �Ѱ��� ����ϱ� ������ �Է°� ������ ����!!
			if (form.getTitle().equals("�Է���")) {// �Է����̶��
				// ��ȿ���˻�!!(�� üũ)
				// �⺻��: if(name == null || name.length() < 1)
				// NullPointerException����
				// if(name.length() == 0)

				boolean flag = true;
				if (name.equals("")) {
					JOptionPane.showMessageDialog(form, "�̸��Է�!!");
					form.tf_name.requestFocus();
				} else if (ageStr.length() == 0) {
					JOptionPane.showMessageDialog(form, "�����Է�!!");
					form.tf_age.requestFocus();
				} else if (!ageStr.matches("[0-9]+")) {// ���̿� ���� ���� üũ
					JOptionPane.showMessageDialog(form, "���̴� ���ڸ��Է�!!");
					form.tf_age.setText("");
					form.tf_age.requestFocus();
				} else if (job.length() < 1) {
					JOptionPane.showMessageDialog(form, "�����Է�!!");
					form.tf_job.requestFocus();
				} else {
					// �̸�,����,������ ���� �ԷµǾ��ٸ�
					flag = false;
				}

				if (flag)
					return;

				age = Integer.parseInt(ageStr);// �����͵� �Է�, ��������!!

				cntNo++;// 1���� ��ȣ
				p = new Person(cntNo, name, age, job);
				m.insert(p);// 3_1 -----> p.getNo()? ---> 1
			} else {// �������̶��

				// ��ȿ���˻��� �����͸� �迭�� ������.
				String data[] = { name, ageStr, job };

				if (isEmpty(data)) { // �󰪹߽߰�
					JOptionPane.showMessageDialog(form, "�����͸� ���� �Է�!!");
					return;
				}

				age = Integer.parseInt(ageStr);// �����͵� �Է�, ��������!!

				p = new Person(upNo, name, age, job);// (������ ��ȣ, ������ ������)
				m.update(p);// 3_1 -----> p.getNo()? ---> 5
			}

			// Vector<Person> v = m.selectAll(); //3_2
			// mainV.displayTable(v);
			mainV.displayTable(m.selectAll());// ������ ���系���� JTable�� ���.

			form.setVisible(false);// 4.
			mainV.setVisible(true);// 4.

		} else if (ob == form.bt_cancel) {// 1. �Է������� '���'��ư�� Ŭ���ߴٸ�
			form.setVisible(false);
			mainV.setVisible(true);
		} else if (ob == form.tf_name) {
			form.tf_age.requestFocus();
		} else if (ob == form.tf_age) {
			form.tf_job.requestFocus();
		}
		// else if(ob== form.tf_job){}

	}// actionPerformed

	// �������� ��ȿ�� �˻�
	public boolean isEmpty(String data[]) {// �� �߽߰� true�� ����
		for (int i = 0; i < data.length; i++) {
			if (data[i].length() == 0)
				return true;
		}
		return false;// ��ü ���ڿ������Ͱ� �� ����
	}// isEmpty

	public static void main(String[] args) {
		new Controller();
	}

}
