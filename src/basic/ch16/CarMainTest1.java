package basic.ch16;

import basic.ch18.Car;

public class CarMainTest1 {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.startCar();
		
		// 엔진의 속성인 name 변수의 값을 초기화 해보자.
		car1.engine.name = "실키식스";
		car1.engine.price = 3000;
		
		System.out.println(car1.engine.name);
		System.out.println(car1.engine.price);
		
	}

}
