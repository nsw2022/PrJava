
//상속 : First class의 설계도면 물려받아 새로운 기능만 추가..
public class Second extends First{
	//그냥 보기에는 멤버가 하나도 없어보이지만.
	//상속받은 first 클래스의 멤버를 이미 보유한 상태가 됨.
	
	//멤버변수 추가
	int b;
	
	//본인 멤버변수값 출력하는 기능메소드
	void showSecond() {
		System.out.println("b: "+ b);
	}
	
	//상속해준 First의 멤버도 출력하는 기능메소드
	void show() {
		//System.out.println("a: "+a);
		//First의 출력을 대신할 필요 없음.
		//First에는 본인값을 출력하는 기능메소드가 이미 있음.
		//그 기능을 호출만 하면 됨
		showFirst();//그 객체꺼는 그 객체가.. 니껀 니가!!
				
		System.out.println("b: "+b);
		System.out.println();
	}
	
	//멤버값을 입력하는 기능 메소드도
	void setMembers(int a,int b) {
		//매게변수를 값들을 멤버변수에 대입해주기..
		//this.a=a; 동작은 되지만 조금 어색함
		//this키워드는 본인객체를 의미한. 여기서는 Second..
		//a가 Second껀가?? First건데?? 상속은 First의 멤버를 내것처럼 쓰니깐 가능..
		//상속받은 클래스(sub 클래스)안에는 특별한 키워드가 존재함.
		//부모클래스를 객체를 참조하고 있는 super 키워드
		//super.a=a;
		//객체지향은 니껀니가!!!
		//a값 입력하는것도 First의 기능을 통해서 하도록 요청!!
		setA(a);
		
		this.b=b;
		
	}
	
}
