package com.kosta.Java0725;

public class EqualTest {

	public static void main(String[] args) {
		
		Equals eq = new Equals();
		Equals eq2 = new Equals();
		
		Car c1 = new Car("�ҳ�Ÿ", 4, 100);
		Car c2 = new Car("�ҳ�Ÿ", 4, 100);
		
		System.out.println(eq==eq2);
		// ==�����ڴ� �񱳴���� �Ǵ� �ΰ�ü�� �ּ� ���� ��
		//eq�� eq2�� ���� new �����ڸ� �̿��Ͽ� �޸��Ҵ��� �ϰ� �����Ƿ�
		//���� �ٸ� �޸� �ּҰ��� ������ �Ǿ� ==������ ����� false
		System.out.println(c1==c2);
		System.out.println();
		
		System.out.println(eq.equals(eq2));
		//equals�޼ҵ�� �񱳴���� �Ǵ� �� ��ü�� ���� �� 
		//�⺻ �����ڸ� ���� �ƹ����� �Ҵ���� �ʰ� �޸𸮸� �Ҵ� ����
		//�� ��ü eq, eq2�� equals����� false�� ������ ����?
		System.out.println(c1.equals(c2));
		
		
		/*public boolean equals(Car c){
			if(carName == c.carName && WheelNum == c.WheelNum && Velocity == c.Velocity)
				return true;
			else
				return false;
		}*/
		System.out.println(eq.equals(eq2));
		//�� false�� ������ ���� : c1�� c2�� ���ϴ� equals �񱳹��� 
//		object�� ���� ����ڰ� ��ü���� ���ϵ��� ������ �ϴ� �޼ҵ��
//		�̸� ȣ���Ͽ� c1�� c2�� ���Ͽ��� ������ true�� ���� �Ͽ�����,
//		�⺻�����ڷ� ������ ��ü eq�� eq2�� ���ϴ� equals�� ��ü���� 
//		�޼ҵ尡 ���� ���� �ʾƼ� false�� ����
		
	}
}
