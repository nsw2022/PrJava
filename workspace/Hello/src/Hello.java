
public class Hello {
	
	public static void main(String[] args) {
		
		//출력기능(함수)을 가진 녀석(객체)에게 출력을 요청!
		System.out.print(10);
		System.out.println('A'+1);
		System.out.println((char)('A'+1));
		
		//덧셈 중에서 특이하게.. 문자열도 덧셈이 됨!
		//문자열은 숫자가 아님으로 산술덧셈이 되는 것은 말이 안됨
		//사실 문자열의 + 은 덧셈연산이 아니라 결합연산임
		System.out.println("aaa"+"bbb");
		System.out.println("Hello"+" World");
		
		//다른 자료형 끼리의 덧셈연산
		System.out.println(5+3.14); //int+double --> 자동형변환 발동(작은것->큰것)
		System.out.println(10+"aaa"); //int+String --> 자동형변환 발동(작은것->큰것)
		System.out.println(10+3+"aaa");
		System.out.println("aaa"+10+3);
		System.out.println("aaa"+(10+3));
		
		//출력포멧을 만들때 위 문자열 결합의 특성을 이용하여 출력
		//printf("%d  * %d  = %d",5,3,5*3);
		System.out.println( 5 +" * "+ 3 +" = " + (5*3));
		
		//c언어의 오마주를 위해서 printf기능도 여전히 제공함
		System.out.printf("%d * %d = %d",5,3,5*3);
		
		System.out.println();//한줄 바꾸기
		//java의 자료형
		
		//1)pirmitive(원시)적 자료형 - boolean, bytem char ,shotrt, int long, float : Data를 저장하는 목적 자료형
		//2)refference(참조)적 자료형 String Random.///등 2천여개 : 객체를 참조하기 위한 자료형
		
		// 변수를 만드는 문법 - 자료형 = 변수명;
		int a;
		a=10;
		//출력기능을 가진 객체에게 a변수의 값 출력 요청
		System.out.println(  a  );
		
		double b;
		b=3.14;
		System.out.println( b );
		
		char c='G';
		System.out.println(c);
		
		boolean d=true;
		System.out.println(d);
		
		boolean d2=5>3;
		System.out.println(d);
		
		//변수 값 대입시 주의사항.
		//작은 자료형에 큰 값을 대입할 수 없음. - error
		int e;
		//e=3.14;//error
		//억지로 소수점 날리고 대입하고 싶다면? - 형변환
		e=(int)3.14;
		System.out.println(e);
		
		float f;
		//f= 3.14;//error
		//f=(float)3.14;//좀 불편..
		//소수점 있는 실수 상수를 만들때 아예 float형으로 만들도록.
		f=3.14f;
		System.out.println(f);
		
		//변수의 크기보다 큰 값을 넣어도 에러
		short g;//short 2byte 사이즈.. 저장가능 범위가 : 65,536개 [+32천 ~ -32천]
		//g=33000;
		g=32767;
		System.out.println(g);
		
		byte h=127; //127
		
		//long의 범위 - 1800경 [ 900경 ~ -900경 ]
		long n;
		n=3000000000L;// 정수 상수도 기본 int여서.. Long형으로 만들도록 요청
		System.out.println(n);
		
		// 산술연산의 특이한 특성 [정수형의 변수끼리의 덧셈은 무조건 int로 변환 됩니다]
		short m1=10;
		short m2=20;
		System.out.println(m1+m2);
		
		//short m3= m1+m2;error
		short m3= (short)(m1+m2);
		System.out.println(m1+" + "+m2+" = "+m3);
		
		//참조형 변수 사용모습
		String s;
		s=new String("aaa");
		System.out.println(s.toString());//String객체의 값을 출력해줌
		
		String s2=new String("aaa");
		System.out.println(s2);//println()에 주면 자동 toString()이 발동함
		
		//s와 s2 변수는 서로 다른 주소값을 가지고 있음.
		System.out.println( s == s2 );//false
		
		
		
		//변수의 반대.. 상수
		//1) literal 상수 - 보이는 그대로의 값. ex) 10, 3.14, 'A'
		//2) final 상수
		int k=10;
		k=20;
		
		final int w=10;
		//w-20;//eror
	}
	
	
	
}
