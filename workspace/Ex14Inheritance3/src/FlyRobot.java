
//상속을 통해 Robot의 기능을 이미 보유한 클래스를 설계
public class FlyRobot extends Robot{
	
	//이동, 공격 + 나는 기능
	
	//새로운 기능추가
	void fly() {
		System.out.println("오~~난다~~");
	}
	
	//기존에 상속받은 기능(이동,공격)이 마음에 들지 않을 수도 있음.
	//그러면 새로운 기능메소드를 만들 수 밖에 없음.
	//상속받은 기능 메소드와 같은 이름의 기능을 만들면.
	//기존 기능이 외부에서는 보이지 않게 됨. 즉, 새로만든 기능메소드만
	//사용할 수 있게됨.
	//이 기술을 Override라고 부름
	void move() {
		System.out.println("슝~~~");
	}
	
	//공격기능도 오버라이드하여 기능 수정
	void attack() {
		System.out.println("미사일 발사!!");
	}
	
}
