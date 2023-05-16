
public class Main {
	
	public static void main(String[] args) {
		
		//상속받은 기능이 마음에 들지 않을 때 사용하는 문법
		//Override
		
		Robot r = new Robot();
		r.move();
		r.attack();
		System.out.println();

		//이동,공격 + 나는 기능이 새로이 추가된 객체
		FlyRobot fr= new FlyRobot();
		fr.move();   // 상속받은기능.. 영.. 어올리지않음.. 오버라이드
		fr.attack(); // 오버라이드한 메소드가 호출됨
		fr.fly();
		System.out.println();
		
		//이동,공격 + 수영하는 기능이 새로이 추가된 객체
		SwimmingRobot sr= new SwimmingRobot();
		sr.move();		//기능개선 - 오버라이드
		sr.attack();	//기능개선 - override
		sr.swimming();
		
		//오버라이드를 사용할때 조금 신경써야할 상황이 있을 수 있음.
		//기존의 기능을 완전히 바꾸는 상황...이 아니라..
		//기존 기능을 그대로 유지하되 거기에 조금 새로운 기능이 추가되었으면 할때.
		
		
		
		
	}

}
