
public class Test {
	
	public int a;         //멤버변수         -- 객체(인스턴스)마다 존재하는 변수  -- 인스턴스 변수 라고도 부름
	public static int b;  //static 멤버변수  -- 클래스에 1개 존재하는 변수       -- 클래스 변수 라고도 부름
	
	
	public static int count=0; //클래스에 1개만 있는 변수
	
	//생성자
	public Test() {
		count++;
		System.out.println("Test 객체 생성 : #" + count);
	}
	
	// 메소드에서 static 키워드 적용가능
	// 먼저, 일반 메소드 - 객체를 생성해야만 사용이 가능한 메소드(기능)
	public void aaa() {
		System.out.println("aaa");
		System.out.println( a ); //일반변수(인스턴스 변수)
		System.out.println( b ); //static변수
	}
	
	// static method - 객체 생성 없이도 사용가능한 메소드(기능)
	public static void show() {
		System.out.println("SHOW!!");
		
		//System.out.println( a ); //error - 일반변수(인스턴스 변수)
		System.out.println( b ); //static변수
		
		//static메소드안에서는 static 멤버만 사용이 가능함
	}

}




