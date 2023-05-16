
public class AAA extends Test{
	//Test 추상클래스안에 추상메소드도 존재함.
	//이름만 있고 기능이 없는 메소드가 이 AAA클래스에도 존재하게됨.
	//그래서 그 추상클래스를 반드시 구현(implement)해야만 함.
	//구현한다는 것은 오버라이드를 한다는 것임.
	void aaa() { //override
		System.out.println("AAA클래스의 aaa()메소드");
	}
	
	//즉, 추상메소드를 가진 추상클래스를 상속받은 클래스는 무조건
	//추상메소드를 오버라이드해서 구현할수밖에 없는 강제성이 생김.
	
	//생성자
	public AAA() {
		System.out.println("AAA 생성자");
	}

}
