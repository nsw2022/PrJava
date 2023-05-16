
public class RaceHorse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Horse h1= new Horse("적토마");
		Horse h2= new Horse("캐논");
		Horse h3= new Horse("천리안");
		
		System.out.println("경주 시작!!");
		
		h1.start();
		h2.start();
		h3.start();
		
		
	}

}

class Horse extends Thread{
	
	String name;
	
	//생성자메소드 - new할때 자동으로 실행되는 특별한 메소드
	public Horse(String name) {
		this.name= name;		
	}
	
	@Override
	public void run() {
		for(int i=0; i<20; i++) {
			System.out.println( name + " : 다그닥! 다그닥");
			
			//0.4초정도 대기 (400ms)
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {}			
		}
		
		System.out.println( name + " 도착!");		
		
	}//run method.
}
