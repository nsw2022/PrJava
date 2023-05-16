

public class Main {
public static void main(String[] args) {
	//OOP(객체지향)에서는 객체의 멤버들이 외부로부터 보호되어 관리되는 것이 중요한 개념임
	//정보은닉, 캡슐화의 개념. 이를 위한 문법 - 접근제한자
	
	//Access Modifier의 종류 4가지 ( 보안 강->약 )
	//1. private	: 본인 class 내부에서만 접근 가능
	//2. [default]  : 같은 package에서는 .연산자로 접근 가능, 다른 package에서는 .연산자로 접근 불가
	//3. protected  : 같은 package에서는 .연산자로 접근 가능, 다른 package에서는 .연산자로 접근 불가, 단, 다른package여도 상속관계면 접근 가능
	//4. public     : 어느 곳에서든 .연산자로 멤버접근 가능
	
	// 이 Main .java와 같은 package안에 있는 class의 객체 생성
	
	First f=new First();
	
	//f.a=10;//error : private멤버는 외부에서 .으로 접근 불가!
	
	//같은 패키지라면 나머지 접근제한자로 부여된 멤버는 .으로 접근 가능!!
	f.b=20;
	f.c=30;
	f.d=40;
	
	f.aaa(); //객체의 멤버메소드 안에서는 모든 멤버에 접근 가능
	
	//다른 패키지의 클래스를 객체로 만들어 멤버에 접근을 시도..
	aaa.Second s=new aaa.Second();
//	s.a=10;//error - private
//	s.b=20;//error - default는 같은 패키지만 접근가능
//	s.c=30;//protected도 같은 패키지만 접근 가능, 상속관계도 아님.
	
	s.d=40; //Ok - public은 어디서든 .이면 접근가능
	
	// 멤버메소드에도 접근제한자는 적용됨.
	//s.aaa()//error - default니까!!!
	
	s.bbb();//public메소드는 호출 가능함

	// 생성자 메소드도 접근제한자의 영향을 받음
	//aaa.Test t= new aaa.Test(); //default 접근제한 생성호출 불가
	
	aaa.Test t= new aaa.Test(10);//public 접근제한 생성자 호출 가능
	
	//클래스도 접근제한자의 영향을 받음.
	//aaa.Third x; //error - default class는 다른패키지에서 사용불가
	
}
}
