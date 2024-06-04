package structure.ch07;

import java.util.LinkedHashMap;
import java.util.Map;

public class UserRegistrationSystem {


		private Map<String, User> users = new LinkedHashMap<>();
		
		// 정적 내부 클래스로 설계
		static class User{
			
			String name;
			String email;
			
			public User(String name, String email) {
				this.email = email;
				this.name = name;
			}
			@Override
			public String toString() {
				return " 이름 : " + name + ", 이메일 : " + email;
			}
			
		}// end if inner User class
		
		// 사용자 등록 기능
		public void addUser(String name, String email) {
			// key, value(User)
			users.put(email, new User(name, email));
		}
		
		
		
		// 사용자 출력 기능
		public void displayUsers() {
			for(User user : users.values()) {
				System.out.println(user.toString());
			}
		}
		
		
		// 코드 테스트(메인 함수)
		public static void main(String[] args) {
		
			UserRegistrationSystem system = new UserRegistrationSystem();
			// 스캐너
			User user1 = new User("홍길동1", "a@naver.com");
			User user2 = new User("홍길동2", "b@naver.com");
			User user3 = new User("홍길동3", "c@naver.com");
			
			system.addUser(user1.name, user1.email);
			system.addUser(user2.name, user2.email);
			system.addUser(user3.name, user3.email);
			
			// Map 구조는 기본적으로 순서를 보장하지 않지만 LinkedHashMap을 사용하여 해결
			// 가입한 순서대로 출력되는지 확인
			system.displayUsers();
			
			
			
	}// end of miain

}
