
public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 스레드를 제어하는 상황..  스레드의 시작. 일시정지. 이어하기. 종료 에 대한 실습
		
		//타이어조립하는 직원객체 생성
		CThread t= new CThread();
		t.start(); //작업시작! - run()메소드가 실행됨
		
		//스레드는 딱 1번만 start()할 수 있음.
		//즉, run()메소드의 실행이 끝나면 이 스레드는 다시 사용불가!
		
		//그런 특정작업을 여러번 수행하게 하고싶다면?
		//run()메소드 안에서 반복문 처리를 해야함.
		
		
		// 스레드의 작업을 무한이 반복시키면 퇴근못함. 노예계약..미친것임.
		// 그래서 원할때 스레드를 멈추는 기능도 있어야 함.
		// 3초후에 퇴근시키기.
		try {
			Thread.sleep(2300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//t.stop(); //stop()기능은 있지만 절대로 사용을 권하지 않음.
		//why? 작업도중에도 stop()이 호출되면 강제로 멈춤...
		//그러다보니 메모리에 자원들이 찌꺼기처럼 남아있는 문제가 발생될 여지가 있음.
		//그래서 스레드를 멈춰야 할때.. stop()말고.. run()이 정상적으로 종료되도록 만들어야 함.
		// 이 코드에서는 while()문의 조건이 항상 true여서 run()이 끝날 수 없음.
		//결국, while문을 종료시키면 정상적으로 run()메소드가 종료됨.
		//그래서 무한작업중이 스레드를 멈추려면. stop()대신에..
		//while문의 조건을 false변경하면 됨.
		t.isRun= false;	
		
	}//main method... 여기까지 오면 main thread는 퇴근.

}

//특정 작업을 수행하는 직원(스레드) 클래스
class CThread extends Thread{
	
	boolean isRun= true;
	boolean isWait= false;
	
	@Override
	public void run() {
		
		while(isRun) {
			//타이어 4개 조립
			System.out.println("1번 타이어 조립");
			System.out.println("2번 타이어 조립");
			System.out.println("3번 타이어 조립");
			System.out.println("4번 타이어 조립");
			System.out.println();
			
			
//			if(isWait) {
//				try {
//					wait();
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
			
			//1초 대기
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}//while...
		
		System.out.println("퇴근!!");
		
	}//run method..
	
}//CThread class...
