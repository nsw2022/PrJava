
public class Main {

	public static void main(String[] args) {
		
		Second s=new Second();
		s.show();
		
		Second s2=new Second(10,20);
		s2.show();
		
		//상속의 사옥도 가능함. (조부모 - 부모 - 자식 )
		//Second 상속한 Third클래스
		Third t= new Third();
		System.out.println();
		
		//상속에 사용된 First클래스를 상속한 또다른 클래스가 있을 수 있음
		//First를 상속한 Test클래스
		new Test();
		
		
		//다중 상속을 불가능함!!
		//Test를 상속하면서 Second도 상속하려고 하면??
		//error!! Nice클래스..
		
		//상속을 하다보면.. 고려할 점..
		//상속받은 기능이 마음에 들지 않는 경우.
		//다음프로젝트에서..
		
		
	}
}