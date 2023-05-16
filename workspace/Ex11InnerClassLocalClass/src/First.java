
public class First {

	int a=10;
	static int b=20;
	
	//static inner class : 아웃터객체 없이 외부에서 객체생성 가능
	public static class Hello{
		
		void show() {
			System.out.println("Hello...show");
			//a=50;//error
			b=100;//아웃터의 static 멤버는 사용가능
			
		}
	}
	
}
