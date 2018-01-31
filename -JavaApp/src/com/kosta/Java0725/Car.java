package com.kosta.Java0725;

public class Car {

	String carName; 
	int WheelNum;
	int Velocity;
	
	public Car(String carName, int wheelNum, int velocity) {
		this.carName = carName;
		this.WheelNum = wheelNum;
		this.Velocity = velocity;
	}
	
	@Override
	public String toString() {
		return "Car [carName=" + carName + ", WheelNum=" + WheelNum + ", Velocity=" + Velocity + "]";
	}

	public boolean equals(Car c){
		if(carName == c.carName && WheelNum == c.WheelNum && Velocity == c.Velocity)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Car car1 = new Car("소나타", 4, 100);
		Car car2 = new Car("소나타", 4, 100);
		
		//메모리 비교
		
		if(car1 == car2)
			System.out.println("주소가 같다");
		else
			System.out.println("주소가 다르다");
		
		if(car1.equals(car2))
			System.out.println("객체 값이 같다");
		else
			System.out.println("객체 값이 다르다");
	
	
		
	}
}
