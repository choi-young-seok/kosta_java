package HomeWork.j0727;

import java.util.Vector;

public class NameMenu3 {
   Vector<String> names;//�̸� �����͸� �����ϴ� �����
   
   public NameMenu3() {
	   names = new Vector<>();
   }
   
   public void insert(String name){//�̸��Է�,����
	   names.add(name);
   }
   
   public void selectAll(){//��ü�̸����,�˻�
	  System.out.println("[�̸����]");
	  for(int i=0; i<names.size(); i++){//Vector�� �ε��� ǥ��!!
		 //String name =  names.get(i);
		 System.out.println(" "+names.get(i));//(name);
	  }
   }
   
   public void delete(String delName){//�̸�����
	  for(int i=0; i<names.size(); i++){
		  if(delName.equals(names.get(i))){
			  names.remove(i);//���ͷ� ���� �̸�����
			  break;
		  }
	  }
   }
   
   public void update(String oldName, String newName){//�̸�����
	  for(int i=0; i<names.size(); i++){
			  if(oldName.equals(names.get(i))){
				  names.set(i, newName); //���ͷ� ���� ����
				  break;
			  }
	  } 
   }
   
   //�̸� ���������� �����ϴ� �޼ҵ�
   public boolean existName(String searchName){//�̸��� �����ϸ� true����
	  for(int i=0; i<names.size(); i++){
		  if(searchName.equals(names.get(i))){
			  return true;
		  }
	  }
	  return false; 
   }//existName
}

