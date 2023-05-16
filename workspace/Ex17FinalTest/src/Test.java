
public class Test {
	
	final int num=20; //final : 멤버변수
	//final int age;	  //error : 멤버변수 final은 적용하면서 반드시 명시적으로 초기화를 해줘야 함.
	
	
	void aaa() {
		//num=30;//error : final 멤버변수 값 변경 불가!
		bbb(10);
	}
	
	void bbb(final int k) {//매게변수에도 final 키워드 적용가능
		System.out.println(k);
		//k=50;//error
		System.out.println(k);
	}
	
	//메소드에도 final 키둬드 적용가능 - 오버라이드(Override)가 불가한 메소드!
	//Test클래스를 상속하는 Sample 클래스 설계해보기..
	final void show() {
		System.out.println("TEST show!");
	}
	

	
}
