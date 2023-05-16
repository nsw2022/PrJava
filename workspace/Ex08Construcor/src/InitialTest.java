
public class InitialTest {
	//1. 기본값 초기화 - 0에 해당하는 값
	int a=10;//2. 명시적 초기화
	
	//3. 초기화 블럭 : 프로그래밍이 가능함
	{
		a=20;
		a++;//실행문을 작성할 수 있음
		if(a<25) a--;//프로그래밍 코드를 작성하여 초기화 가능
		
		System.out.println("초기화 블럭");
	}
	
	//4. 생성자메소드
	InitialTest(){
		a=50;
		System.out.println("생성자 메소드");
	}
}
