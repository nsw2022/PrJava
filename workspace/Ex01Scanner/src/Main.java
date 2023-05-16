import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//System.in 을 사용하여 입력하는 방시은 너무 별로...
		//why? 입력값을 무조건 ASCII값으로만 주기에.. 원하는
		//자료형으로 변환하는 코드를 작성하는데 상다잏 불편함..
		
		// 그래서 Java에는 System.in이 입력받은 키보드로부터 입력받은 ASCII값을
		//알아서 원하는 자료형으로 변환시켜주는 기능이 설계된 class가 존재함
		// 그 클래스의 이름은  Scanner 임.
		
		//Scanner의 기능을 사용하고 싶다면.. 객체를 만들어서 기능을 사용해야만 함
		//객체를 만들어주는 명령어인 new 키워드로 Scanner객체를 생성하여 입력받는 작업을 수행함.
		
		
//		
//		//Scanner객체 생성하고 참조변수에 대입하기
//		Scanner scan=new Scanner(System.in);
//		
//		//정수입력
//		int k = scan.nextInt(); // 숫자모양이 아닌 값을 넣으면 에러발생
//		System.out.println("k : "+k);
//		
//		//실수입력
//		double b=scan.nextDouble();
//		System.out.println("b : "+b);
//		
//		//논리값 입력
//		boolean c=scan.nextBoolean();
//		System.out.println("c : "+c);
//		
//		//문자열 입력
//		String s=scan.next();//중간에 공백문자 저장안됨. 즉, 스페이스를 누르면 입력이 끝이라고 생각함
//		System.out.println("s : " + s);
//		
//		//한줄 단위로 문자열 읽어들이는 기능	[기존 입력의 Enter가 자동으로 받아들여짐] 해결? 한번더 nextLine
//		String s2=scan.nextLine();
//		s2=scan.nextLine();
//		System.out.println("s2 : "+s2);
		
		//char형 입력기능은 없음..!! --  다음수업에서 해결책 소개
		
		
		//예제) 사용자로부터 2개의 정수를 입력받아서 곱셈하는 프로그램 제작
		
		//키보드입력을 받아 원하는 자료형으로 변환해주는 기능을 가진 객체 생성
		Scanner scan=new Scanner(System.in);
		
		System.out.println("2개의 정수를 입력받아 곱셉 결과를 보여주는 프로그램");
		System.out.println();
		
		int a,b;
		System.out.print("intput: ");
		a=scan.nextInt();
		
		System.out.print("intput :");
		b=scan.nextInt();
		
		// 계산
		int c=a*b;
		
		//계산결과 출력
		System.out.println();
		System.out.println(a+" * "+ b + " = "+ c);
	}

}
