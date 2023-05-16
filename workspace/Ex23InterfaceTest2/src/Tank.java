
public class Tank implements Unit, LevelUpable{
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("바퀴로 이동..");
	}
	
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("자주포 발사..");
	}
	
	@Override
	public void levelup() {
		// TODO Auto-generated method stub
		System.out.println("미친태크 변신!!");
	}

}
