
// Outer class 라고도 부름
public class Test {
	
	int a;  //멤버변수
	
	//멤버메소드
	void show() {
		System.out.println("Test.." + a);
		
		//이너클래스의 멤버를 마으맫로 사용할 수 없음.
		//k=50;//error
		
	}//show method...
	
	//이너클래스는 만들어서 리턴해주는 능력을 가진 기능(메소드)
	Nice makeInnerClassObject() {
		//이너클래스 객체 생성 가능
		Nice n= new Nice();
		return n;
	}
	
	//클래스안에 새로운 클래스 설계
	//inner class라고 부름
	//이너 클래스의 특징
	//1. 외부(다른 클래스)에서 아웃터클래스명이 없으면 인식불가! 
	//2. 외부에서 아웃터명을 이용하여 인식하더라도..객체생성은 불가!
	//3. 이너클래스는 아웃터클래스안에서만 생성할 수 있음.
	
	//4. 이너클래스는 아웃터의 멤버를 내것인양 마음대로 사용가능함.
	//4.1 아웃터는 이너의 멤버를 사용대로 사용할 수 없음.
	
	// 이너클래스는 객체를 안전하게 만들기 위해서..사용
	// 즉, 외부에서 아웃터객체없이 마음대로 사용하는 것을 막기위한 목적
	class Nice{
		
		int k=10; //멤버변수
		
		//멤버메소드
		void aaa() {
			System.out.println("Nice..." + k);
			
			//아웃터의 멤버변수를 마음대로 사용할 수 있음.
			a= 50;
			System.out.println("a: "+ a);
			
			//아웃터의 멤버메소드도 마음대로..
			show(); //내것인양 호출
			
		}
		
	}//Nice class..	

}//Test class...






