package useful.ch04;

/**
 * 디자인 패턴 살펴 보기 - 싱글톤 패턴이 뭘까?
 * 
 * 1. 생성자를 private로 만든다. 
 * 2. static 변수를 활용해서 내부에서 객체를 생성하고 주소값을 할당한다. 
 * 3. 외부에서 유일하게 참조할 수 있는 public 메서드를 제공한다.
 */

public class Company {
	// 1. 생성자의 접근 제어 지시자를 private 로 변경하면
	// 외부에서 생성자를 호출 할 수 없다.
	private Company() {
	}

	// 2. static 변수를 활용한 데이터 타입 선언
	private static Company company;

	// 3. 외부에서 접근 가능한 메서드를 만들어 준다.
	public static Company getInstance() {
		if (company == null) {
			company = new Company();
		}
		return company;
	}

}
