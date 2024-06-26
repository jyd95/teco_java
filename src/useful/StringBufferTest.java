package useful;

public class StringBufferTest {
	// 코드의 시작점 - (메인 작업자)
	public static void main(String[] args) {
		
		String str1 = new String("Hello");
		String str2 = new String("World");
		
		StringBuffer bufferStr = new StringBuffer("Hello");
		System.out.println(bufferStr);
		System.out.println(System.identityHashCode(bufferStr)); // 원시 주소값.
		
		bufferStr.append(str2);
		System.out.println(bufferStr);
		System.out.println(System.identityHashCode(bufferStr)); // 원시 주소값.
		
		// 1번 결과와 2번 결과의 주소값이 같다는 의미는
		// 새로운 메모리를 할당 하지 않고 변경한 것이다.
		
		// 활용
		String newStr = String.valueOf(bufferStr);
		String newStr2 = bufferStr.toString();
		
		System.out.println(newStr);
		System.out.println(newStr2);
		
	}// end of main

}// end of class
