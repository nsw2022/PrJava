
public class Main {
public static void main(String[] args) {
	
	//객체 생성 후 언제나 멤버값을 설정하는 작업이 실행되는 것이 일반적임
			Person p= new Person(); //객체의 멤버는 기본값으로 초기화
			p.setMembers("sam", 20);
			p.show();
			
			//2번째 객체생성 후 언제나 설정하는 작업이 반드시 따라옴
			Person p2= new Person();
			p2.setMembers("robin", 25);
			p2.show();
			
			//이렇게 입력기능을 매번 호출하는 행동도 슬슬..짜증나기 시작함...
			//객체생성하면 분명히 값을 넣어줘야 할텐데 그때마다 다음줄에서 입력기능을
			//호출하는 작업이 번거롭게 느껴짐..
			//마치..
			int a;
			a=10;  //대입
			//이게 짜증.
			
			int b=10; //만들면서 값을 대입해줌.-- 초기화!!
			
			//변수도 이렇게 만들면서 초기화 할 수 있다면..
			//객체도 생성하면서 초기화 해주면.. setMembers()기능을 굳이 호출하지
			//않아도 되겠죠..
			
			//그래서 .. 개발자가 별도의 함수호출을 하지않고 객체를
			//생성(new)할때 자동으로 호출되는 메소드가 있다면....
			
			//그래서 탄생한 기술 - 생성자 Constructor
			// ** 객체생성(new)할때 자동으로 1번 호출되는 특별한 메소드! **
			
			//Person 클래스에 생성자를 적용하기 전에..
			//먼저 생성자라는 문법을 알아보는 실습 진행..
			
			First f= new First(); //생성자 호출
			
			//생성자는 객체를 생성할때마다 호출됨
			First f2= new First();
			
			//파라미터를 전달하는 생성자 호출해보기 - 생성자 오버로딩
			First f3= new First(10);
			
			System.out.println();
			
			// Person클래스에 생성자를 적용해 보기
			Person p3= new Person("hong", 30);
			p3.show();	
			
			Person p4= new Person();
			p4.show();
			
			System.out.println();
			
			// ** 좀 특별한 생성자 호출 문법 -- this() 생성자 **
			
			Second s= new Second(10, 20);
			Second s2= new Second();
			
			// 자바의 객체가 생성될때 멤버변수의 초기화를 위한
			// 4단계..
			
			InitialTest obj= new InitialTest();
			System.out.println(obj.a);
			
}
}