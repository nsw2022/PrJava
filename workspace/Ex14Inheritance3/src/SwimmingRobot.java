
public class SwimmingRobot extends Robot{

	//이동,공격기능은 보유한 상태
	
	//새로이 수영기능만 추가
	void swimming() {
		System.out.println("음~파! 음~파!");
	}
	
	
	@Override 
	void move() {
		System.out.println("첨벙 첨벙!!");
	}
	
	@Override
	void attack() {
		System.out.println("어뢰 발사!!");
	
	}
}
