
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 지역변수에 final을 붙이면 상수화된 변수
		final int a=10;
		//a=20;//error : a의 값 변경 불가!
				
		// 자바의 특이한 점.
		final int b;
		b=10;//처음 값을 대입해 주는 것을 초기화의 개념으로 처리함
		//=20;//error
		
		// 멤버변수에도 final키워드 적용가능
		// Test클래스 설계..
		
		// class에도 final키워드 적용가능 : 상속불가한 클래스
		// final 클래스를 사용하는 것에는 특별한 차이가 없음.
		// 단, 상속을 못해준다는 것임.
		// First를 상속하는 Second클래스 설계를 시도해보기.. -error
		First f=new First();
		f.a=10;
		f.show();
		
		
		
	}

}
