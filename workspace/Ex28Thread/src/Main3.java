
public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 스레드가 많아질때 고려할 사항
		// 동기화처리.  -- Thread를 사용하는 것은 비동기 처리를 한다는 것임.
		
		// 동기   (Synchronized)   :  a작업이 끝나면 b작업을 하는것
		// 비동기  (ASynchronized)  :  a작업을 할때 b작업을 동시에 하는것
		
		// 멀티스레드 환경에서 동기화 처리를 한다는 것은 A thread가 어떤 작업이 끝날때까지 B thread가 동작을 기다려주는 처리..
		
		// 계좌객체 생성
		Account acc= new Account();
		
		// 입금(add)작업을 별도의 Thread가 수행.
		
		//acc계좌에 100원을 입금하고 싶어하는 고객1
		TestThread t1= new TestThread(acc); 
		
		//acc계좌에 100원을 입금하고 싶어하는 고객2
		TestThread t2= new TestThread(acc);
		
		
		//비슷한 시점에 둘다 100원 입금 동작 실행!
		t1.start(); //자동  run()메소드가 별도 스레드에 의해 발동
		t2.start();		

	}

}


//은행계좌 시스템 클래스
class Account{
	
	int money=0;
	
	//입금기능 - 동기화처리 안한 기능
	//동기화를 안하면.. 여러스레드가 동시에 이 기능을 실행할 가능성이 있어서 잔액계산이 잘못될 수 있음.
	//이때 필요한 것이 동기화 처리...
	// 동기화 처리의 2가지 방법
	// 1. 메소드 자체를 동기화 처리   -- add2()
	// 2. 특정 코드 영역만 동기화 처리 -- add3()
	void add(int m) {
		
		String name= Thread.currentThread().getName();
		
		System.out.println(name+" : 입금작업을 시작합니다.");		
		System.out.println(name+" : 입금 전 잔액 : " + money);
		
		money += m;
		
		//전산처리 시간을 가정하여..오래걸리도록..쓸데없는.코드
		for(long i=0; i<20000000000L; i++) {
			new String("aaa");
			new String("bbb");
			new String("ccc");
		}
		
		System.out.println(name+" : 입금 후 잔액 : " + money);
		System.out.println();
	}
	
	//메소드에 동기화처리 : synchronized
	synchronized void add2(int m) {
		
		String name= Thread.currentThread().getName();
		
		System.out.println(name+" : 입금작업을 시작합니다.");		
		System.out.println(name+" : 입금 전 잔액 : " + money);
		
		money += m;
		
		//전산처리 시간을 가정하여..오래걸리도록..쓸데없는.코드
		for(long i=0; i<90000000000L; i++) {
			new String("aaa");
			new String("bbb");
			new String("ccc");
		}
		
		System.out.println(name+" : 입금 후 잔액 : " + money);
		System.out.println();
	}
	
	
	// 특정 코드영역만 동기화 처리
	void add3(int m) {
		
		String name= Thread.currentThread().getName();
		
		System.out.println(name+" : 입금작업을 시작합니다.");
		
		//이 영역안에 있는 코드는 동기화 처리됨. 
		// ()안에 넣는 객체 : 동기화처리를 해야하는 당사자 객체
		synchronized (this) {
			
			System.out.println(name+" : 입금 전 잔액 : " + money);
			
			money += m;
			
			//전산처리 시간을 가정하여..오래걸리도록..쓸데없는.코드
			for(long i=0; i<20000000000L; i++) {
				new String("aaa");
				new String("bbb");
				new String("ccc");
			}
			
			System.out.println(name+" : 입금 후 잔액 : " + money);
			System.out.println();
			
			
			
		}
		
	}
	
	
	
}



// 은행계좌에 100원을 입금하는 동작을 수행하는 Thread 설계
class TestThread extends Thread{
	
	Account acc;
	
	public TestThread(Account acc) {
		this.acc= acc;		
	}	
	
	@Override
	public void run() {
		//acc.add(100); //100원 입급하는 동작 수행 - 동기화처리 안된 기능
		//acc.add2(100);  //기능메소드에 동기화처리가 된 기능사용
		acc.add3(100);  //특정 코드영역만 동기화처리
	}	
}



