
//추상클래스 : 그냥 사용하는 것이 아니라. 반드시 상속해서 사용해야 함. 
public abstract class Test {
	
	
	
	int a;           //일반 변수    [인스턴스 변수]
	static int b=10; //static 변수 [클래스 변수]
	
	//생성자 메소드도 존재함
	public Test() {
		System.out.println("TEST 생성자!");
	}
	
	//일반 메소드 
	void show() {
		System.out.println("show...");
	}
	
	//추상 메소드 : 이름만 있고 내용이 없는 메소드
	abstract void aaa();

}
