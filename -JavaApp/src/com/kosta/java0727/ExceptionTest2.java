package com.kosta.java0727;

public class ExceptionTest2 {
	public static void main(String[] args) {
		
		//Run configration�ǿ��� argument�� ���� �Է��Ͽ� ����
		
		//	su1		su2
		//	10		5	: ����
		//	10			: ArrayIndexOutOfBoundsException
		//	ab		cd	: NumberFormatException
		//	10		0	: ArithmethicException
		
//		�� ������ Exception�� �θ���踦 ���� �ʴ� Exception
		
		try {
			
			System.out.println("�Ű������� ���� �μ��� ��");
			int su1 = Integer.parseInt(args[0]); //Index , Number Exception �߻�����
			int su2 = Integer.parseInt(args[1]); //Index , Number Exception �߻�����
			System.out.println("sus1 = "+su1+", su2 = "+su2);
			System.out.println("su1�� su2�� ���� �� = " + (su1/su2)); //Arith Exception �߻�����
			System.out.println("�������� ��Ȱ�� ���� �Ͽ����ϴ�.");
			
		}catch (NumberFormatException e) {
			System.out.println("���� �� ���� ó���� �ڽ� Exception�� ���� ���� �� ������ ���ܿ� ���ؼ� �θ��� Exception�� �ѹ��� ó��" + e.getMessage());
		}catch(Exception e){ //��� ������ �θ��� Exception�� �߻��ϴ� ��� �ڽ� Exception�� ���ؼ� ó��
			System.out.println("��� ���� ��Ȳ ó�� : " + e.getMessage());
		}finally {
			System.out.println("���� �߻��� ������� ������ �����ϴ� ��!!");
		}
			
/*		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("���� : �ε��� ���� ���� ���� : " + e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("���� : ���� ���� ���� : " + e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("���� : 0������ ���� : " + e.getMessage());
		}*/
		
		
	}
}
