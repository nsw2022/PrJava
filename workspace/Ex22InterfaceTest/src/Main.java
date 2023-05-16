
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//인터페이스 interface [ 추상메소드만 가진 추상클래스 ]
		//우선.. 문법적인 특징만..
		
		//1. 인터페이스는 직접 new로 객체생성 불가능!
		//Test t= new Test(); //error
		
		// 인터페이스를 사용하려면 상속하여 새로운 클래스를 설계하고 이를 객체로 생성
		First f= new First();
		f.aaa();
		f.bbb();
		
		// Test인터페이스를 구현한 클래스 Second객체 생성
		// 무조건. aaa(), bbb()를 가지고 있다고 확신할 수 있음.
		Second s= new Second();
		s.aaa();
		s.bbb();
		System.out.println();
		
		// 인터페이스를 구현한 클래스는 인터페이스의 자식클래스가 됨.
		//즉, 인터페이스참조변수(부모)로 구현한 클래스의 객체(자식)를 참조할 수 있음.
		Test t= new First();
		t.aaa();
		t.bbb();
		
		Test t2= new Second();
		t2.aaa();
		t2.bbb();
		
		// 인터페이스도 이너클래스를 가질 수 있으며.. 그 이너클래스는 무조건
		// public static 이기에 인터페이스객체의 생성여부와 상관없이 사용가능함.
		//단, 이너클래스이므로 그냥은 인식이 안되고 아웃터명을 쓰고 사용해야만 함.
		Test.Hello h= new Test.Hello(); 
		h.show();
		
		//다중 구현이 되면 부모가 2종류가 되는 것임.
		AAA a= new Sample();
		a.aaa();
		a.bbb();
	
		BBB b= new Sample();
		b.ccc();
		
		
		
		// 인터페이스를 사용하는 예제를 다음 프로젝트에서 소개...		

	}

}




