
public class First {
	//접근제한자 적용해보기
	private int a;
	
	//멤버값을 출력하는 기능메소드
	public void showFirst() {
		System.out.println("a: " + a);
	}
	
	//생성자 - 객체가 생성되면 자동 발동하는 특별한 메소드
	public First() {
		System.out.println("First객체 생성");
	}
	
	//생성자 오버로딩
	public First(int a) {
		this.a=a;
		System.out.println("First객체 생성, int");
	}
	
	
	
}
