
public class Second extends First {
	
	private int b;
	
	public void show() {
		//System.out.println("a: " + a);//error 접근제한자 private은 상속받은 클래스도 사용못함
		showFirst();
		System.out.println("b: " + b);
		System.out.println();
	
	}
	
	//생성자 - 객체생성할때 자동으로 실행되는 특별한 메소드
	public Second() {
		//super();쓰든 안쓰든 자동으로 부모생성자는 호출됨
		System.out.println("Second객체 생성");
	}
	
	//생성자 Overloading
	public Second(int a, int b) {
		//this.a=a;//부모 private멤버는 접근불가
		//무조건 부모객체도 생성됨. 즉 이때.. 부모생성자도 같이 호출됨
		//부모생성자를 명시적으로 호출해야하는 경우가 있음.
		//이를 위한 특별한 생성자 호출문법
		super(a);//부모생성자 호출문법.
		this.b=b;
		System.out.println("Second객체 생성, INT, INT");
	}
	
}
