package com.kosta.Java0725;

public class EqualTest {

	public static void main(String[] args) {
		
		Equals eq = new Equals();
		Equals eq2 = new Equals();
		
		Car c1 = new Car("소나타", 4, 100);
		Car c2 = new Car("소나타", 4, 100);
		
		System.out.println(eq==eq2);
		// ==연산자는 비교대상이 되는 두객체의 주소 값을 비교
		//eq와 eq2는 각각 new 연산자를 이용하여 메모리할당을 하고 있으므로
		//서로 다른 메모리 주소값을 가지게 되어 ==연산의 결과는 false
		System.out.println(c1==c2);
		System.out.println();
		
		System.out.println(eq.equals(eq2));
		//equals메소드는 비교대상이 되는 두 객체의 값을 비교 
		//기본 생성자를 통해 아무값도 할당되지 않고 메모리만 할당 받은
		//두 객체 eq, eq2의 equals결과가 false가 나오는 이유?
		System.out.println(c1.equals(c2));
		
		
		/*public boolean equals(Car c){
			if(carName == c.carName && WheelNum == c.WheelNum && Velocity == c.Velocity)
				return true;
			else
				return false;
		}*/
		System.out.println(eq.equals(eq2));
		//가 false가 나오는 이유 : c1과 c2를 비교하는 equals 비교문은 
//		object로 부터 사용자가 객체값을 비교하도록 재정의 하는 메소드로
//		이를 호출하여 c1과 c2를 비교하였기 떄문에 true를 리턴 하였으나,
//		기본생성자로 생성한 객체 eq와 eq2를 비교하는 equals는 구체적인 
//		메소드가 정의 되지 않아서 false를 리턴
		
	}
}
