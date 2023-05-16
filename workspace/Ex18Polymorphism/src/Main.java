
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 캐스팅 : 참조변수가 객체를 참조하는 행위를 표현한 용어
		
		First f=new First();     //제대로된 캐스팅
		Second s = new Second(); //제대로된 캐스팅
		
		//당연하게도 다른 class를 캐스팅하면 에러
		//First obj=new Second();
		
		// 하지만, 만약 두 클래스가 상속관계라면..
		// Second가 First를 상속받도록..
		First ff=new Second(); //부모참조변수는 자식객체를 참조할 수 있음.(왜? 자식객체에는 무조건 부모객체의 멤버를 가지고 있으므로..) --> 업 캐스팅 Up casting
		//Second ss=new First(); //자식참조변수는 부모객체를 참조할 수 없음.(왜? 부모객체에는 자식객체의 멤버를 가지고 있지 않으므로..) --> 다운 캐스팅 Down casting
		
		ff.a=10;
		ff.showFirst();
		//참조는 할수 있지만 자식만의 고유멤버는 사용할 수 없음.
		//ff.showSecond();//error
		
		//그럼에도 자식객체의 고유 멤버를 사용하고 싶다면?
		//Second클래스의 참조변수가 새로 필요함.
		//Second sss=ff;//error [왜? ff참조변수가 First객체를 참조하고 있는줄 알고있어서 -- 자식참조변수에 부모객체를 대입한 줄 알고..]
		Second sss = (Second)ff;//ff가참조변수가 실제 참조하는 객체가 Second임을 알려주면 됨.(즉, Second형으로 변환하면 됨 - 형변환)--> 이 상황을 다운캐스팅이라고 부름
		sss.b=50;
		sss.showSecond();
		
		//왜 업 캐스팅을 사용할까??..를 알아보기 전에.
		//혹시 오버라이드 메소드가 있다면?
		//실제 참조하는 객체의 오버라이드 된 Second의 show()기능 발동
		ff.show();
		//즉, First참조변수로 자식Second객체의 기능을 사용할 수도 있다는 것임.
		
		System.out.println("============================");
		
		
		//그런 이 기술이 뭐에 유용한 것인가?
		//부모 참조변수 1개로 자식 객체 모두를 제어 가능!
		First obj=null;
		obj=new First();
		obj.show();
		
		obj= new Second();// 업 캐스팅
		obj.show();
		
		//First를 상속한 클래스 Test가 있다면?
		obj=new Test(); //up casting
		obj.show();
		
		//Second를 상속한 Third클래스(조부모-부모-자식)
		obj=new Third();//조부모-->손주 객체 참조 : 업캐스팅
		obj.show();
		
		//이렇게 obj.show()라는 글씨는 똑같은데 다른결과를 보인다고 해서 "다형성"이라고 부름
		
		//참조변수 1개로 여러객체를 제어한다는 특징이 다형성인데..
		//근데.. 뭐.. 그래서 어디에 유용한데?
		
		
		
	}

}
