
public class Main2 {
	
	public static void main(String[] args) {
		
		//연산자는 C언어와 거의 똑같음.
		//산술,비교,논리,비트,증감,복합대입,삼항연산,형변환  연산자 모두 존재함
		
		//차이점.
		//1) 비교 or 논리 연산의 결과는 1/0이 아니라 true/false 임.
		System.out.println(5>3);
		
		//2) 비트연산자 중에 시프트연산자에 1개 추가.  >>>
		int a=10;
		System.out.println( a>>2 ); //a변수의 2진수값의 위치를 1칸씩 오른쪽으로 밀기
		System.out.println( a>>>2 );
		
		//음수일때만 차이가 있음 : >>>은 부호비트까지 밀어버림(부호가 바뀜)
		a= -10;
		System.out.println( a>>2 );
		System.out.println( a>>>2 );
		
		
		//3) && 와 & 를 조건문에서 사용할때의 차이점!
		int n=5;
		if(n>0 && n<10) { // && 는 앞에것에서 false가 나오면 뒤의 연산을 하지않음 
			System.out.println("aa");
		}
		
		if(n>0 & n<10) {  // & 는 앞에 연산이 fasle가 나와도 뒤 연산을 수행함
			System.out.println("bb");
		}
		
//		String s= null;
//		if(s==null || s.length()==0) {
//			System.out.println("글자가 없음");
//		}
//		 
//		if(s==null | s.length()==0) {
//			System.out.println("글자가 없음!");
//		}
		
		
		
		//제어문도 c언어와 거의 같음
		//if, if-else, if-else if
		//switch
		//while, do-while
		//for  , 향상된 for문도 새로 등장함.(배열수업때 소개 가능함)
		
		//차이점..
		//1) 1/0은 더이상 참/거짓이 아님. true/false 키워드로 사용
		//무한반복문.
//		while(true) {
//			...
//		}
		
		//2) c언어에서 switch는 정수형/한문자만 가능했지만..Java는 문자열도 됨
		String ss="SAM";
		
		switch(ss) {
		case "kim":
			System.out.println("한국사람");
			break;
			
		case "sam":
			System.out.println("가나사람");
			break;
			
		default:
			System.out.println("ㅁㅁㅁ");			
		}		
		
		
	}

}
