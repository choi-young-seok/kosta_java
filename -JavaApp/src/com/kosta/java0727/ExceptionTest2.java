package com.kosta.java0727;

public class ExceptionTest2 {
	public static void main(String[] args) {
		
		//Run configration탭에서 argument를 직접 입력하여 실행
		
		//	su1		su2
		//	10		5	: 정상
		//	10			: ArrayIndexOutOfBoundsException
		//	ab		cd	: NumberFormatException
		//	10		0	: ArithmethicException
		
//		위 세개의 Exception은 부모관계를 갖지 않는 Exception
		
		try {
			
			System.out.println("매개변수로 받은 두수의 값");
			int su1 = Integer.parseInt(args[0]); //Index , Number Exception 발생가능
			int su2 = Integer.parseInt(args[1]); //Index , Number Exception 발생가능
			System.out.println("sus1 = "+su1+", su2 = "+su2);
			System.out.println("su1을 su2로 나눈 몫 = " + (su1/su2)); //Arith Exception 발생가능
			System.out.println("나눗셈을 원활히 수행 하였습니다.");
			
		}catch (NumberFormatException e) {
			System.out.println("예외 중 먼저 처리할 자식 Exception을 먼저 받은 후 나머지 예외에 대해서 부모인 Exception이 한번에 처리" + e.getMessage());
		}catch(Exception e){ //모든 예외의 부모인 Exception이 발생하는 모든 자식 Exception에 대해서 처리
			System.out.println("모든 예외 상황 처리 : " + e.getMessage());
		}finally {
			System.out.println("예외 발생과 상관없이 무조건 실행하는 블럭!!");
		}
			
/*		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("에러 : 인덱스 범위 참조 에러 : " + e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("에러 : 숫자 형식 에러 : " + e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("에러 : 0나누기 에러 : " + e.getMessage());
		}*/
		
		
	}
}
