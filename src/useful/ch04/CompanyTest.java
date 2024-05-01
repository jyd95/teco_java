package useful.ch04;

public class CompanyTest {

	public static void main(String[] args) {
		// 생성 불가.
		// Company company = new Company();
		
		// Company 객체에 어떻게 접근해야 할까?
		
		// A클래스에서 활용
		Company company = Company.getInstance();
		System.out.println(company);
		
		// B클래스에서 활용
		Company company2 = Company.getInstance();
		System.out.println(company2);
		
		
	}// end of main

}// end of class
