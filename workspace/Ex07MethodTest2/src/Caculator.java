
public class Caculator {

	//기능들 - 메소드들..
	
	//더하기 기능
	int add(int x, int y) {
		int sum=x+y;
		return sum;
	}
	
	//빼기 기능
	int subtract(int x,int y) {
		return x-y;
	}
	
	//곱셈 기능
	int multiple(int x, int y) {
		return x*y;
	}
	
	
	//나눗셈 기능
	int divide(int x, int y) {
		return x/y;
	}
	
	//double형 사칙연산을 위한 기능들 - 메소드 정의들.. 추가정의
	//기존에 있던 다른 메소드와 같은 이름의 메소드를 또 추가할 수 있음.
	//단, 파라미터의 개수나 자료형이 달라야만 함.
	//이런식으로 똑같은 일므의 함수가 여러개 있는 기술을 함수 Overloading(오버로딩)이라고 부름.
	
	double add(double x,double y) {
		return x+y;
	}
	
	//문자열을 전달받아 산술연산을 수행해주는 덧셈기능으로 구현 : Overloading
	int add(String x, String y) {
		
		//String을 int로 면환해보기 - 참조형과 기본형 자료형간에는 형변환 연산자로 변환 불가능
		int a = Integer.parseInt(x);
		int b = Integer.parseInt(y);
		
		int sum=a+b;
		return sum;
	}
	
	//가변길이인자 ->  ...
	//파라미터로 전달받은 값들의 덧셈결과를 출력하는 기능
	// 파라미터가 몇개가 절단되든 받고 싶을때.. 사용하는 기술
	void total(int... n) {
		//가변길이 인자 n은 배열로 자동 만들어짐.
		int sum=0;
		for(int i=0; i<n.length;i++) {
			sum=sum+n[i];
		}
		
		System.out.println("누적 덧셈 값 : " + sum);
	}
	
}
