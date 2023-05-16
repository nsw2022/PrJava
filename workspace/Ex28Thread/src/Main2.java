
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Thread를 만드는 방법은 2가지가 있음.
		//1. Thread클래스를 상속한(extends) 클래스를 설계하여 사용하는 방법
		//2. Runnable인터페이스를 구현한(implements) 클래스를 설계하여 사용하는 방법

		// 왜 2가지 방법이 있을까?
		// 다중 상속의 효과를 보고 싶어서....??
		// Person클래스의 능력을 가지면서 ..동시에 스레드의 능력도 보유한 객체를 만들고 싶다면?
		PersonThread pt= new PersonThread();
		
		//스레드의 시작은 .start()인데 Runnable인터페이스로 만들면
		//.start()가 없음.
		
		//그럼 그냥 .run()해볼까?
		//pt.run(); //이렇게 하면 main스레드가 작업.
		
		//그래서 결국 .start()를 해야 하는데 Runnable은 .start()가 없어서
		//누군가 대신 start()를 해줘야 함. 결국 trigger용 Thread가 필요함
		
		// Runnable로 만든 객체를 이 트리거용 스레드의 생성자에 전달해주면.
		// 이 트리거용 스레드의 .start()를 하면 Runnable로 만든 객체의
		// run()가 자동 발동됨. 
		Thread t= new Thread(pt);
		t.start();
		
		System.out.println("aaa");
		
		
		//Runnable인터페이스의 사용모습의 다른 형태!
		//익명클래스(이름이 없는 클래스) 적용해보기 - 객체를 new하면서 class를 설계하는 문법
		Runnable r= new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("익명클래스 Runnable!!");
			}
		};
		
		Thread t2= new Thread(r);
		t2.start(); // r객체의 run메소드가 대신 발동됨.
		
		
		//인터페이스를 구현하는 익명클래스를 만들면서 Thread의 생성자함수 파라미터에 전달
		Thread t3= new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("kkkkkkkkkk");
			}			
		});
		t3.start();
		
		
		
		
	}

}

class PersonThread extends Person implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		//1초마다 본인의 멤버값(name, age)을 5번 출력하는 기능구현
		for(int i=0; i<5; i++) {
			System.out.println( name +" , " + age +" - " + Thread.currentThread().getName());
			
			//1초간 스레드 잠재우기
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}	
}



class Person{
	String name;
	int age;
}








