
public class Main {

	public static void main(String[] args) {
		
		//static int k; //지역변수 0error : static 지역변수에 적용불가
		
		Test t1=new Test();
		Test t2=new Test();
		Test t3=new Test();
		
		t1.a=100;
		System.out.println(t1.a);
		System.out.println(t2.a);
		System.out.println(t3.a);
		System.out.println();
		
		t1.b=200;
		System.out.println(t1.b);
		System.out.println(t2.b);
		System.out.println(t3.b);
		System.out.println();
		
		t3.b=300;
		System.out.println(t1.b);
		System.out.println(t2.b);
		System.out.println(t3.b);
		System.out.println();
		
		//가만 코드를 써보니.. static멤버변수(클래스변수)는 객체마다 있는것이 아닌데
		//객체 참조변수로 .하고 접근하는것이 뭔가 좀.. 어색함.. 혼동됨
		
		//그래서..static변수는 클래스에 1개만 있는 변수니까.. 즉, 클래스 변수니까.
		//사용할때도 객체 참조변수. 이아니라 클래스명.이 좀더 어올리지 않을까??
		
		Test.b=500;
		System.out.println(Test.b);
		System.out.println(t1.b);
		System.out.println(t2.b);
		System.out.println(t3.b);
		System.out.println();
		
		//그래서 클래스명 만 있으면 사용이 가능하기에 별도의 객체생성없이도 변수사용이 가능함
		
		//그렇기에.. 이 변수를 이용하면 같은 클래스의 객체가 1개의 변수값을 공유할 수도 있음.
		new Test();
		new Test();
		new Test();
		new Test();
		new Test();
		new Test();
		new Test();
		new Test();
		new Test();
		
		System.out.println();
		
		// static 키워드를 사용하는 가장 많은 이유...
		// 객체 생성없이 사용하는 기능을 만들고 싶어서..
		
		// 메소드(기능)도 객체 없이 사용하기 위해.
		// static 메소드를 정의하여 사용함.
		
		// 일반메소드
		t1.aaa();//객체를 만들어야만 사용가능한 기능(메소드)
		
		//static메소드 -- 클래스명.메소드명();
		Test.show();
		
		//조금 복잡하게 static 멤버를 사용하는 모습
		Nice.obj.show();
		//사실 이와 유사한 코드를 여러분은 매번 사용중..
		System.out.println("zzz");
		
		
	}
}