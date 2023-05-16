
public class Main {

	public static void main(String[] args) {
		
		// 상속 - 다른 클래스의 멤버들을 물려받는 문법
		// 상속은 닫눗ㄴ히 메버드만 쪽~~뽑아가는것이 아님
		//삭속을 실제로도 객체안에 객체가 존재하는 구조. 그림으로 반드시 이해
		//
		Second s=new Second();
		s.a=10;
		s.b=20;
		
		System.out.println("a: " + s.a);
		System.out.println("b: "+s.b);
		System.out.println();
		
		//객체지향은 멤버변수를 직접 제어하는 것을 권장하지 않음.
		//객체들을 본인의멤버값을 출력해주는 기능이 있는게 좋다.
		//그래서 각 클래스에 본인값을 출력해주는 기능을 구현..해보기
		s.showFirst();//상속받은 클래스의 멤버를 내것인양.
		s.showSecond();
		System.out.println();
		
		//Second는 First의 멤버값도 어차피 출력해야 의미가 있으니까.
		//First의 멤버값도 같이 한방에 출력해주는 기능이 있다면 더 간결.
		s.show();
		
		
		//2번째 객체 생성
		Second s2=new Second();
		//객체의 멤버값 대입하는 것도 기능으로 있으면 더 좋겠죠.?
		s2.setMembers(100,200);
		s2.show();
		
		//3번째 객체 생성
		Second s3=new Second();
		s3.setMembers(100,200);
		s3.show();
		
		//4번째 객체 생성하고 난 후 항상 값 대입하는 기능을 호출해야함..
		//이거 은근 짜증.
		//객체를 생성하면서 값을 전달하여 초기화하면 더 편하게 값 대입이 가능
		//생성자
//		Second s4=new Second(50,60);//이러면 더 편하겠죠..
//		s4.show();
		
		
		
		
		
	}

}
