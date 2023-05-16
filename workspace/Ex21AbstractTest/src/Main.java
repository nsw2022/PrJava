
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal ani= new Dog(); //업캐스팅 [부모->자식]
		Animal ani2= new Cat();
		Animal ani3= new Pig();
		
		ani.say();
		ani2.say();
		ani3.say();
		System.out.println();
		
		//위 코드를 Animal 배열로 만들면 동물객체가 아무리 많아도 한번에 제어 가능
		Animal[] anis= new Animal[10];
		
		//그런데 위 코드는 다소 에러의 위험이 존재함.
		//Animal 클래스의 존재목적은 ... 객체생성이 아니라.. 상속용.
		//즉, 객체로 만들면 안되는 클래스임.
		//실수로 new를 하면..객체가 만들어짐.
		//Animal a= new Animal(); //error - 추상클래스는 new로 직접 만들면 에러
		//a.say(); //내용이 없는 기능을 사용하는 문제가 발생할 수도 있음.
		
		//위와 같은 실수는 개발자들에게 무의미한 실행으로 속도도 느려지고 메모리도 낭비됨
		
		//이를 방지하기위해 class임에도 new로 객체생성이 불가능한 class를 설계하는 문법
		//추상 클래스 - abstract class	
		
		
		//추상클래스의 문법적 특징 //////
		//추상클래스는 new키워드로 직접 객체생성이 불가능!
		//Test t= new Test(); //error
		//추상클래스는 그냥 사용하는 것이 아니라 상속해서 사용함.
		//Test를 상속한 AAA클래스 만들고 사용해보기
		AAA obj= new AAA();
		obj.aaa();
		obj.show();
		System.out.println( Test.b ); //static 사용
		
		BBB obj2= new BBB();
		obj2.aaa();
		
		//추상클래스도 업캐스팅 가능함
		//Test를 상속한 AAA, BBB 객체 생성
		Test t= null;
		
		t= new AAA(); //업캐스팅
		t.aaa();
		
		t= new BBB(); //up casting
		t.aaa();
		
		//Test를 상속한 새로운 객체를 만들려면..
		//또.. 새로 클래스를 설계해야만 함.	
		//매번 이렇게 새로 클래스르 설계할때 클래스이름을 명명하는것도
		//은근 짜증남. - 이 클래스로 사용되는 객체가 1개만 있을때는
		//더더욱 별도의 class 이름을 명명하는 것이 무적 번거롭고 짜증.
		
		//그래서 어차피 객체 1개만 만들기 위해서 사용하는 class라면..
		//굳이 클래스이름을 줄 필요가 있을까?
		//객체 new하면서 1회용 class설계도면을 작성!
		//Test를 상속한 이름없는 class를 설계하는 문법
		//이름이 없는 class : 익명클래스 [ Anonymous class ]
		Test tt= new Test() {
			@Override
			void aaa() {
				// TODO Auto-generated method stub
				System.out.println("1회용 클래스로 객체 생성하여 aaa()");
			}			
		};
		
		tt.aaa();	

	}

}

class Hello extends Test{
	@Override
	void aaa() {
		// TODO Auto-generated method stub
		
	}
}

class Nice extends Test{

	@Override
	void aaa() {
		// TODO Auto-generated method stub
		
	}
	
}

//상속을 목적으로 설계하는 class - 추상클래스
abstract class Animal{
	//내용은 없고 단순히 기능이름만 존재할 목적으로 - 오버라이드 목적용 메소드
	//이름만 있고 내용이 없는 메소드 - 추상 메소드
	abstract void say();
}

class Dog extends Animal{
	void say() { //override
		System.out.println("멍멍!!");
	}
}

class Cat extends Animal{
	@Override
	void say() {
		System.out.println("야옹~~");
	}
}

class Pig extends Animal{
	@Override
	void say() {
		System.out.println("꿀꿀@@");
	}
}
