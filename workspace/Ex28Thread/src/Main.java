
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Thread(스레드) : 동시에 여러 작업을 처리하는 기법
		//1. 프로세스 : 실행중인 하나의 자바 프로그램 
		//2. 스레드   : 하나의 프로세스안에서 동작하는 일꾼같은 개념.
		
		// 즉, Thread는 개발자가 작성한 코드를 읽어서 실행하는 녀석(객체)으로 생각하면 됨
		// 하나의 프로세스에는 적어도 하나의 스레드는 기본적으로 존재하며 그 스레드를 Main Thread (사장 같은 개념) 라고 부름		
		// 다시말해. 스레드를 만든다는 것은 새로운 직원객체를 만들어서.. 
		// main tread와 별개로 코드를 읽어서 실행하는 녀석을 만든다는 것임.
		// 즉, main이 A작업을 할때 직원 thread는 B작업을 수행할 수 있도록 하는 기법
		
		// 동시에 했으면 하는 작업 2개 구현!
		//예) 파일 다운로드를 하면서 음악재생 or 채팅하기 ...etc..
		
		// 아직 네트워크를 배우지 않았으니까..실제 파일 다운로드하는 코드를 작성하는 것이 아니라..느낌만..주는 코드..
		
//		//1) 20개의 파일을 다운로드하는 작업 
//		for(int i=0; i<20; i++) {
//			System.out.println( i + "번째 파일 다운로드 중...");
//			
//			//강제로 잠시 대기..
//			for(long k=0; k<10000000000L; k++) {
//				new String();//의미 없는 객체 생성. 시간걸리도록.				
//			}
//		}
		
//		//2) 20개의 음악을 재생하는 작업
//		for(int i=0; i<20; i++) {
//			System.out.println( i + "번째 음악 재생 중...");
//			
//			//강제로 잠시 대기..
//			for(long k=0; k<10000000000L; k++) {
//				new String();//의미 없는 객체 생성. 시간걸리도록.				
//			}
//		}
		
		//위 2개의 작업이 동시에 되면 더 빠르겠죠.
		//어떻게? 새로운 직업을 더 채용하면 가능하겠죠..
		// 사장(Main Thread)말고 직원(별도 Thread)객체를 만들어야
		// 동시작업이 가능함.
		// how? --> Thread의 능력을 부여받기 --> Thread 클래스를 상속!!
		
		ThreadA a= new ThreadA(); //직원채용 - 직원객체 생성
		//a.run(); //이렇게 직접 run()메소드를 호출하면..사장객체가 코드를 실행함.
		a.start(); //작업 시작을 요청.(자동으로 Thread의 run()메소드가 발동함)

		ThreadB b= new ThreadB(); //두번째 직원 채용
		b.start(); 
		
		//스레드가 cpu를 번갈아 점유하면서 동시에 작업하는 것처럼
		//보이게 만드는 기술이 스레드 기술임.
		
		//이때 어떤 스레드가 cpu를 얼만큼씩 점유할지는 운영체제쪽에서 결정함
		//이때 특정 스레드에게 우선권을 주는 우선순위 지정이 가능함.
		//a.setPriority(1); //낮음
		//b.setPriority(10); //높음
		
		//main thread로 별도 작업 가능
		for(int k=100; k<200; k++) {
			System.out.println( k +" : " + Thread.currentThread().getName());
			
			// 0.2초 동안 잠시 대기 ( 200 밀리세컨드 )
			try {
				Thread.sleep(200);
			}catch(InterruptedException e) {								
			}			
		}
		
	}// main method..

}//Main class..


//파일 다운로드작업을 수행하는 직원 클래스(Thread 능력이 있는) 설계
class ThreadA extends Thread{
	//이 스레드클래스가 해야할 작업을 작성하는 특별한 메소드
	//별도 직원이 별개로 동작하도록 하려면 반드시 이 메소드안에 코드를 작성해야만 함.
	@Override
	public void run() {
		//이 직원이 했으면 하는 코드를 작성.
		//1) 20개의 파일을 다운로드하는 작업 
		for(int i=0; i<20; i++) {
			System.out.println( i + "번째 파일 다운로드 중..." + Thread.currentThread().getName());
					
			//강제로 잠시 대기..
			for(long k=0; k<10000000000L; k++) {
				new String();//의미 없는 객체 생성. 시간걸리도록.				
			}
		}
	}
	
}


//음악 재생 작업을 수행하는 직원 클래스(Thread를 상속한) 설계
class ThreadB extends Thread{
	@Override
	public void run() {
		//2) 20개의 음악을 재생하는 작업
		for(int i=0; i<20; i++) {
			System.out.println( i + "번째 음악 재생 중..." + Thread.currentThread().getName());
					
			//강제로 잠시 대기..
			for(long k=0; k<10000000000L; k++) {
				new String();//의미 없는 객체 생성. 시간걸리도록.				
			}
		}
		
	}
}








