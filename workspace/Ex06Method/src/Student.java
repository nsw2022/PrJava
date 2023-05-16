
public class Student {
	
	//연관있는 데이터들을 저장할 변수를 정의
	//Field(필드: 멤버변수)
	String name;
	int kor;
	int eng;
	double aver;
	
	//기능을 설계할 수 있음.
	// 예) 화면에 aaa라는 글씨를 출력하는 기능(Function -> Method)
	// Method를 만드는 문법은 c언어와 동일
	void show() {
		// aaa라는 글씨를 출력시키는 실행문(코드)
		System.out.println("aaa");
	}
	//main 함수에서 위에서 만든 기능(함수,메소드)를 사용(호출)해야만 코드가 실행됨
	
	//멤버변수(필드)들을 출력하는 기능!(Method)
	void output() {
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("평균 : " + aver);
		System.out.println();
	}
	
	
	//평균을 계산하는 기능도 추가될 수 있겠죠.
	void calAverage() {
		aver=(double)(kor+eng)/(double)2;
	}
	
	//멤버변수에 값을 대입하는 기능(Method) 추가..
	void setMembers(String name, int kor, int eng) {
		//매게변수로 전달받은 값들은 멤버변수에 대입해주는 기능  코딩
		//name= name;
		//멤버변수를 매게변수와 구별하기위한 특별한 키워드.. this키워드
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		//this.aver=(double)(kor+eng)/(double)2;
		
		//입력기능안에서 계산기능을 사용할 수도 있음
		//this.calAverage(); 구별할려고 this를 쓴거 구별할필요없음 안써도 상관없
		
		calAverage();
				
		
		
	}

}
