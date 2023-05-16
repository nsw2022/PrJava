package aaa;

public class Test {
	
	//생성자 - default 생성자메소드 [같은 패키지에서만 호출 가능함]
	Test(){
		System.out.println("Test 객체 생성");
	}
	
	//생성자도 public으로.. [가급적 모든 생성자는 public을 권장]
	public Test(int n){
		System.out.println("Test 객체 생성 public 생성자");
	}
}
