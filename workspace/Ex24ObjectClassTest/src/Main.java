import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Object class : 모든 클래스의 부모 클래스(최상위 클래스)
		// Java언어에 존재하는 모든 클래스는 extends의 명시여부와 상관없이
		// 무조건 Object클래스를 상속받은 상태로 만들어짐.
		
		Test t= new Test();
		//Test클래스는 명시적으로 아무것도 상속하지 않았지만 기본적으로 Object클래스를 상속받은 상태임.
		//그래서..
		t.toString(); //이런 메소드를 가지고 있음.
		
		
		//Object클래스의 주요 기능 메소드들.
		//1. toString()          - 객체를 소개하는 문자열을 리턴하는 기능메소드
		//2. equals(Object obj)  - 전달받은 객체obj와 같은 객체인지를 리턴해주는 메소드 : 리턴값[true/false]
		//3. hashCode()          - 객체의 해시코드를 리턴 : 리턴값 int형 
		//4. getClass()          - 객체의 클래스 정보를 가진 객체를 리턴 
		//5. wait(), notify(), notifyAll() - 이건 Thread수업 중에 소개 가능함.
		
		//1. toString()메소드 : 객체를 소개하는 문자열을 리턴
		String s= t.toString();
		System.out.println(  s  ); // [ default : "클래스명@해시코드"]
		//해시코드 : 객체가 만들어진 메모리(RAM)의 물리적인 주소에 대응된 논리적인 주소(자바에서의 주소) : 예) 물류창고에서 물품번호같은 느낌.
		
		//다른 Test클래스 객체를 생성해보면 해시코드(주소)가 다름을 확인할 수 있음.
		Test t2= new Test();
		String s2= t2.toString();
		System.out.println( s2 );
		
		Random rnd= new Random();
		String s3= rnd.toString();
		System.out.println( s3 );
		
		//근데 클래스 중에서 toString()의 리턴값이 조금 다른 것들이 있음.
		String str= new String("Hello");
		String s4= str.toString();
		System.out.println( s4 ); //"Hello" -- why? String클래스가 .toString을 오버라이드해서 기능을 개선했다는 것임.
		
		// String클래스는 객체를 소개하는 "클래스명@해시코드"가 실제 코딩에
		// 그닥 필요하지 않는 기능이게 차라리..본인 문자열 데이터를 출력하는
		// 기능으로 개선한 것임.
		
		// 나도 새로운 클래스를 만들면서 toString()를 개선해보기
		First f= new First();
		String s5= f.toString();
		System.out.println( s5 );
		
		// System.out.println() 기능메소드의 특별한 기능
		// 파라미터로 전달받은 객체의 toString()을 자동 발동시킴
		System.out.println( f ); //자동 .toString() 발동됨
		System.out.println( f.toString() );
		
		
		//2. equals(Object obj) : 같은 객체인지를 확인하는 메소드 : 리턴값이 true/false
		Test t3= new Test();
		Test t4= new Test();
		
		boolean b= t3.equals(t4);		
		System.out.println( b ); //false
		
		Test t5= t3; //t3참조변수의 주소를 t5참조변수에 대입
		boolean b2= t3.equals(t5);
		System.out.println(b2);  //true
		
		// 개발자들은 이 기능메소드를 많이 사용하지는 않음. why? 더 쉬운방법
		System.out.println( t3 == t4  ); //참조변수의 주소끼리 비교연산
		System.out.println( t3 == t5  );
		
		// 하지만, String클래스에서는 equals()가 조금 다르게 동작함.
		String ss= new String("android");
		String ss2= new String("android");
		
		System.out.println( ss == ss2 ); //false
		System.out.println( ss.equals(ss2) ); //true : 값끼리 비교하는 기능으로 변환
		
		//String 클래스는 .equals()의 기능을 멤버값 끼리 비교하도록 override했다는 것임.
		//원한다면 여러분도 본인 클래스의 equals()를 개선할 수도 있음.
		
		
		//3. getClass() : 클래스의 정보를 가진 Class객체를 리턴
		Test t6= new Test();
		Class c= t6.getClass();
		System.out.println( c.getName() );
		System.out.println( c.getSuperclass() );
		System.out.println( c.getPackageName() );
		
		
		//4. hashCode() : 자바에서 주소값(해시코드)
		Test t7= new Test();
		int hashcode= t7.hashCode();
		System.out.println( hashcode );
		
		
		System.out.println();
		
		
		//Object 클래스 모든 클래스의 부모클래스임.
		//부모참조변수는 자식객체를 참조할 수 있다. 업캐스팅
		
		//그렇다면.
		//Object참조변수는 어떤 객체든 참조가 가능하다는 것임.
		
		Object obj= null;
		
		obj= new Test(); //부모->참소
		obj= new First(); //업캐시팅
		obj= new Random();
		obj= new String();
		
		// 또한, 메소드를 만들때 파라미터로 어떤 객체든 받고 싶은때도
		// Object 참조변수를 사용함. 대표적인 사용처.) System.out.println()
		System.out.println( new Random() );
		System.out.println( new Test() );
		System.out.println( new String() );
		
		//마치 만능 자료형 같은 느낌임.
		//진짜 만능은 아님. 왜? 참조는 할 수 있지만 객체의 고유기능을 사용이 불가
		

	}

}






