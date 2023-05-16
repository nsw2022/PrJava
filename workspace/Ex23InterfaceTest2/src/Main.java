import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 스타크래프트 게임을 제작하는 예)
		// 해병,탱크,레이스 라는 유닛들이 존재함.
		
		// 팀장이 인터페이스를 설계하고 추상메소드의 이름을 정하면 
		// 팀원들은 그 이름을 토대로 기능을 구현하여 클래스를 설계함.
		// 팀장 : Unit 인터페이스 설계
		// 팀원1 : Marine클래스를 설계 및 Unit 구현..//유닛이라면 가져야 할 기본 기능 구현(메소드 이름 통일)
		// 팀원2 : Tank클래스를 설계 및 Unit 구현
		// 팀원3 : Race클래스를 설계 및 Unit 구현
		
		// Marine, Tank, Race 객체는 move(), attack()기능이 있음을 확신할 수 있음.
		
		// 팀장은 만들어진 클래스를 이용하여 객체 생성 및 게임알고리즘 코딩!
		
		// 각 클래스의 참조변수를 사용하지 않고.
		// 부모클래스의 역할인 Unit인터페이스의 참조변수를 이용하여
		// 모든 유닉객체들을 제어할 수 있음.
		
		// 배열로 유닛을 만들면 여러유닛객체들을 관리할 수 있지만..
		// 단점. 미리 배열의 길이를 지정해야만 함.
		// Unit[] units= new Unit[200]; //시작부터 200개의 개수를 정해야 해서. 낭비
		// 실제 게임에서는 유닛들이 생성과 소멸이 반복적으로 발생함.
		
		// 실제 게임이나 앱에서는 유동적 배열 - ArrayList클래스 이용 [기차같은 느낌]
		
		ArrayList<Unit> units= new ArrayList<Unit>();
		
		// 요소의 개수 알아내기
		int num= units.size();
		System.out.println("유닛 개수 : " + num);
		
		// 배열에 Unit객체를 생성하여 추가하기
		units.add( new Marine() );
		units.add( new Tank() );
		units.add( new Marine() );
		units.add( new Race() );
		
		System.out.println("유닛 개수 : " + units.size());
		
		//각 유닛들의 기능들 사용해보기
//		for(int i=0; i<units.size(); i++) {
//			Unit u= units.get(i);
//			
//			u.move();
//			u.attack();			
//			
//			System.out.println();
//		}
		
		//향상된 for문 ( for each 문법)
		for( Unit u : units ) {
			u.move();
			u.attack();
			
			//레벨업이 가능한 유닛을 레벨업 하도록..
			//모든 유닛이 levelup()이 되는 것은 아니기에
			//levelup()기능을 호출할 수 있는 참조변수로 다운캐스팅
//			if( u instanceof Marine ) {
//				Marine m= (Marine)u;
//				m.levelup();
//			}else if( u instanceof Tank ) {
//				((Tank)u).levelup();
//			}
			
			if( u instanceof LevelUpable ) {
				((LevelUpable)u).levelup();
			}
			
			System.out.println();			
		}
		

	}

}






