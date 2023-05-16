
public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 같은 자원을 제어하지는 않지만 스레드들의 동기화처리가 필요한 경우에
		// 사용하는 스레드의 기능메소드 : join()
		
		JThread j= new JThread();
		j.start();
		
		// j의 작업이 끝날때 까지 다른 스레드들은 작업을 기다려줬으면.. (block)
		try {
			j.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		// synchronized와 비슷한 기능임. 차이는 같은 기능을 수행하지 않더라도..
		// 스레드들을 강제로 동기화 시키는 기능
		
		
		//main thread가 다른 작업 수행
		for(int i=0; i<10; i++) {
			System.out.println("main....");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}

class JThread extends Thread{
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("aaa");
			
			try {
				Thread.sleep(500); //0.5초
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}	
}
