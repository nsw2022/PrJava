
public class Sample extends Test{
	
	//일반 메소드는 오버라이드 가능함.
	
	@Override
	void aaa() {
		// TODO Auto-generated method stub
		super.aaa();
		System.out.println("aaa메소드 기능 개선!");
	}
	
	
	//final메소드 show()는 오버라이드가 불가!! --  error
//	void show() {
//		// TODO Auto-generated method stub
//
//	}
	
}
