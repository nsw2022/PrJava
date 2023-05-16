
public class First {

	//객체가 생성될때(new) 한번 자동으로 실행되는 특별한 메소드
	//생성자 [ Constructor ]
	//생성자 메소드를 만드는 규칙
	//1. 메소드의 이름이 클래스이름과 동일함!
	//2. 리턴타입을 명시하지 않아야 함.
	
	First() {
		System.out.println("First 생성자");
	}
	
	//생성자의 오버로딩도 가능함.
	First(int a){
		System.out.println("First 생성자 : "+a);
	}
}
