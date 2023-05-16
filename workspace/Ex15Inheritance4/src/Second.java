
public class Second extends First{
	
	//이미, First의 a변수를 보유한 상태임.
	private int b;
	
	//멤버값 출력기능 메소드 - Override
	public void show() {
		//상속받은 a값도 출력하고 내 변수 b값도 출력
		//System.out.println("a: " + a);//error - private
		//First객체의 값은 First의 출력기능으로..
		//show(); 재귀호출
		
		super.show();//부모의 가려진 show()메소드 호출!
		System.out.println("b: " + b);
		System.out.println();
	}
	
}
