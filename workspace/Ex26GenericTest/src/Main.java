
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Generic [ 제네릭 - 아직 명칭이 정해지지 않는 상품 (제네릭상품) ]
		// class를 만들때 멤버의 자료형을 결정하지 않고.. 객체를 만들때(new 할때) 결정하도록 하는 문법
		
		// Generic <> 으로 설계된 클래스를 객체로 new 해보기. 이때 멤버의 자료형을 결정
		Box<String> box= new Box<String>();
		box.a= new String("Hello");		
		System.out.println( box.a );
		
		// Generic클래스를 객체로 만들면서 자료형을 정할때 주의할 점.
		// Generic<>안에 정할 수 있는 자료형은 참조형만 가능함. 기본형은 불가!
		// 그럼에도 하고 싶다면.. 기본형을 참조형으로 만들어주는 Wrapper class가 존재함
		// Wrapper class의 종류 : Boolean, Byte, Character, Short, Integer, Long, Float, Double
		Integer a= 10;   //자동 new Integer(10)  -- auto boxing
		Double b= 3.14;  //자동 new Double(3.14) 
		
		Box<Integer> box2= new Box<Integer>();
		box2.a= 10;
		System.out.println( box2.a );
		
		Box<Double> box3= new Box<Double>();
		box3.a= 3.14;
		System.out.println( box3.a );
		
		Box<Boolean> box4= new Box<Boolean>();
		box4.setA(true);
		System.out.println( box4.getA()  );
		
		//멤버가 여러개이며 각자 다른 자료형을 지정하고 싶다면?
		Box2<String, Integer> b1= new Box2<String, Integer>();
		b1.a= new String("Nice");
		b1.b= "android";
		b1.c= 100;
		

	}

}
