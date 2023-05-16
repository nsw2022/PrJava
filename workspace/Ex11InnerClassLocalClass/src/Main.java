
public class Main {
	
	public static void main(String[] args) {
		
		//일반적인 클래스
		Test t= new Test(); //일반클래스는 그냥 인식됨
		
		//이너 클래스는 아웃터밖에서는 인식안됨
		//Nice n; //error
		
		//인식되려면 아웃클래스명. 으로 인식가능함
		//Test.Nice n= new Test.Nice(); //error
		
		//외부에서 Inner class 객체의 기능을 사용하고 싶다면..
		//이너클래스 참조변수를 만들고 이 참조변수에 이너클래스객체를 참조시키면 됨
		
		//아웃터클래스는 이너클래스를 객체로 만들수 있었죠?
		//아웃터클래스를 객체로 만들어서 이너클래스를 만들어서 리턴해주는 기능을 사용하면 되지 않을까?
		Test test= new Test();
		
		Test.Nice n= test.makeInnerClassObject();
		n.aaa();
		
		//이너클래스는 static 키워드 적용이 가능함.
		//static 이너클래스는 아웃터 객체없이 곧바로 객체생성이 가능함.// 누구 소속이라는 느낌을 줄 수 있음.
		
		First.Hello h=new First.Hello();
		h.show();
		
		//안드로이드에서 많이 사용됨.
		
	}

}
