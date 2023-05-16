
//인터페이스의 작성 모습 : 클래스 작성 모습 동일함.
//interface == abstract class
//인터페이스는 곧바로 객체 생성불가
public interface Test {
	
	//interface의 특징들
	//1. 인터페이스 안에서는 인스턴스변수, static변수, 인스턴스메소드를 만들 수 없음. 멤버변수는 오직 public static final만 가능함.
	//2. 인터페이스 안에서는 모든 멤버의 접근제한자가 오직 public만 가능함. 명시를 안하면 자동 전원 public이됨.
	//3. 인터페이스 안에서는 추상메소드, static만 가능함.
	//4. 인터페이스는 기능(메소드)구현이 완성된 것이 아니기에 그냥 사용할 수는 없고 반드시 기능을 구현해야만 사용 가능함.
	//5. 인터페이스를 사용하려면 새로운 클래스를 작성하면서 implements키워드로 구현해야만 함.
	//6. 인터페이스 구현도 일종의 상속개념이므로 (부모-자식 관계) 업캐스팅 가능함.
	
	//7. 인터페이스도 클래스의 개념이므로  이너클래스를 가질 수 있으며..자동 public static 이 됨.
	
	//8. 인터페이스는 다중구현(상속)이 가능함. //AAA, BBB인터페이스 -> Sample클래스로 구현
	//9. 인터페이스도 다른 인터페이스로부터 상속받을 수 있음. // kkk인터페이스를 상속하는 SSS인터페이스를 구현한 Nice클래스
	
	//멤버변수 사용불가
	//int a;
	//static int b;
	
	//멤버변수 중에는 public static final변수는 사용가능
	final int a=10;  //자동 public static이 적용됨.
	int b=20;        //자동 public static final까지 적용됨.
	
	
	//일반멤버메소드 : 인스턴스 메소드 사용불가!!!
//	void show() {
//		System.out.println("show...");
//	}
	
	//인터페이스는 추상메소드만 가지려고 탄생된 문법
	public abstract void aaa();
	void bbb();  //자동 public abstract
	
	
	//자동 public
	static void ccc() {
		System.out.println("ccc.");
	}
	
	
	//inner class - 자동 public static 
	class Hello{
		void show() {
			System.out.println("Hello show!!");
		}
	}	
	

}// Test interface....
