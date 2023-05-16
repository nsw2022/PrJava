
public class LocalClassTest {

	int g=10;// 멤버변수
	
	//멤버메소드
	void aaa() {
		
		int a=50;//지역 변수 - 다른지역에서는 인식 불가
		g=100;
		final int b=100;//지역변수 - 상수화된 변수 -값변경이 불가한 변수
		//b=200;//error
		
		
		//설계하기 전에 사용하면 에러
		//Sample ss;//error
		
		//지역클래스 - Local class//////////////////이 지역안에서만 인식가능
		class Sample{
			void show()
			{
				System.out.println("Sample.. show");
				
				//멤버변수는 지역클래스안에서도 어디서든 사용가능
				g=500;
				//단 지역변수는 사용이제한됨
				//a=20;//error
				
				//단, 지역변수이더라도 fianl 키워드가 있다면 사용가능함.
				System.out.println(b);
			}
		}////////////////////////////////
		
		Sample s= new Sample();
		s.show();
		
		//지역변수를 사용하는 이유..
		//1. 지역클래스는 그 메소드 안에서만 잠깐 마치 1회용처럼
		//사용하는 객체를 만들어야 할때  사용
		
		//2. 나중에 배울 '익명 클래스;라는 것을 만들어야할때 지역클래스가 사용
		
	}
	
	//다른 멤버메소드
	void bbb() {
		g=200;
		//a=300;//error
	}
	
	//Sample s;//error
}
