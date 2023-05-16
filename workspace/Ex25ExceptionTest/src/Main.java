import java.net.MalformedURLException;
import java.net.URL;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Error (오류)  : 실행불가!
		// 2. Exception (예외) : 실행중(Run Time) 문제 발생!
		
		// Exception의 대표적인 예
		//1) 사용자가 잘못된 데이터형식을 입력했을 때 : 숫자입력상황에서 문자입력..등.
		//2) 개발자 로직이나 계산을 잘못할 경우 : 배열의 인덱스번호 오류, or 0으로 나눗셈
		//3) 네트워크나 하드웨어 오류 : 파일저장할때 HDD가 잘못되었거나. 서버에 데이터를 보낼때 서버쪽이 문제가 있을때..
		//4) 악의적인 과부하에 의하 예외 (디도스 공격) : 해결이 어려움..
		
		// 예외처리라는 기법이 오늘 수업
		// 예외처리하는 것은 예외가 발생하지 않게 하는 하는 것이 아니라.
		// 예외가 발생하더라도 프로그램이 다운되지 않도록 하는 기법
		
		// 즉, 예외가 발생하면 프로그램은 그 줄 다음의 코드들을 실행지않고 종료됨
		// 그래서 예외가 발생한 부분만 코드를 실행하지 않고 그 다음줄을 그대로 진행하도록 하는 기법
		
		System.out.println("예외처리에 대해 알아봅시다.\n");
		
		//예외상황
//		int k=0;
//		System.out.println( 10/k );
		
		//1] 0으로 나눗셈.
		int a=0;
		
		//예외처리.
		//예외가 발생할 가능성이 있는 코드에 처리를 해야함
		try {
			System.out.println( 10/a );
			
		}catch(ArithmeticException e) {
			//위 try영역안의 코드에서 예외 발생시 실행되는 영역
			System.out.println("예외가 발생했습니다.");
			System.out.println("예외메세지 : " + e.getMessage());
			System.out.println("예외메세지 풀버전 : " + e.toString());
		}
		
		System.out.println();		
		
		//2] 배열의 인덱스 번호 사용 오류..
		int[] arr= new int[5];
		
		try {
			
			for(int i=0; i<=5; i++) {
				System.out.println( arr[i] );
			}			
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외발생!");			
		}
		
		System.out.println();
		
		//3] null참조변수로 객체의 기능메소드를 사용(가장 많이 발생하는 예외 - NPE)
		String s= null;
		
		try {
			System.out.println( s.length() );
			
		}catch(NullPointerException e) {
			System.out.println("null에러! 객체없어!!");			
		}
		
		System.out.println();
		
		
		//4] 잘못된 데이터를 입력받을때.
		Scanner scan= new Scanner(System.in);
		
		int n;
		
		try {
//			System.out.print("입력: ");
//			n= scan.nextInt();
//			
//			System.out.println("n: " + n);
			
		}catch(InputMismatchException e) {
			System.out.println("정수만 입력해!!");			
		}
		
		System.out.println();
		
		
		//5] 숫자로 바꿀 수 없는 데이터를 숫자로 바꾸고자 할때.
		// GUI프로그래밍에서는 모든 입력이 String임. 숫자키패드로 입력해도 숫자모양의 문자열임. "123"
		
//		System.out.print("입력: ");
//		String str= scan.next(); //숫자모양 문자열을 키보드로 입력받기
		
		//문자열 --> 정수형으로 변환 [ 기본형<-->참조형 끼리는 형변화연산자로 변환불가 ]
		//int num= (int)str; //error
		
		try {
//			int num= Integer.parseInt(str);
//			System.out.println( num + 5 ); //숫자임을 확인하기위해 5 더해보기
			
		}catch(NumberFormatException e) {
			System.out.println("정수형 문자열이 아니어서 변환 불가!");			
		}
		
		
		//결론! 예외처리는 예외가 발생안하도록 하는 것이 아니라.
		//예외가 발생하더라도 다운되지 않도록 하는 문법.
		
		
		//예외가 한번에 여러가지 발생하는 경우도 있음.
		//예) 두 수를 입력받아 나눗셈을 하는 프로그램.
//		int c, d;
//		
//		try {
//			c= scan.nextInt();
//			d= scan.nextInt();
//			
//			//중첩 예외처리
//			try {
//				System.out.println( c/d );
//			}catch(ArithmeticException e) {
//				System.out.println("0나눗렘 오류");
//			}			
//			
//		}catch(InputMismatchException e) {
//			System.out.println("정수 아닌값 입력 오류");			
//		}
		
		
		//중첩. 중첩..중첩..이거 은근 짜증.
		//중첩예외처리 보다는 다중 catch문법을 더 선호함
//		int c, d;
//		
//		try {
//			c= scan.nextInt();
//			d= scan.nextInt();
//			
//			System.out.println( c/d );
//			
//		}catch(InputMismatchException e) {
//			System.out.println("에러");
//			
//		}catch(ArithmeticException e) {
//			System.out.println("에러");
//		}
		
		
		//다중 catch문은 개수 제한 없음.
		//모든 Exception의 종류를 다 catch하기에는 너무 많음.
		//이때, 만약, catch영역의 처리코드가 다르지만 않다면..
		//한방에 모든 예외에 반응하는 catch문을 만들 수 있음.
		int c, d;
		
		try {
//			c= scan.nextInt();
//			d= scan.nextInt();
//			
//			System.out.println(c/d);
			
		}catch(Exception e) { //모든 XxxxException클래스의 부모클래스
			System.out.println("error");
			
		}
		
		
		// 예외발생 여부와 상관없이 무조건 해야할 일이 있다면..?		
		int x=2;
		try {
			System.out.println(10/x);
			System.out.println("계산성공");
			
		}catch(Exception e) {
			System.out.println("계산실패");
			
		}finally {
			System.out.println("여긴 무조건 실행되는 영역");
			
		}
		
		//가만보니..finally가 없어도 어차피 catch{} 밖에 다음줄에
		//코드를 쓰면 무조건 실행됨..
		//그럼 왜?? 
		//개발자들이 해당 코드가 어떤 역할로 작성하고 있는지를 쉽게
		//파악하기 위해서 finally영역을 사용함.
		
		//예를 들어. 네트워크 작업시에 서버와 통신을 위한 무지개로드(Stream)를 
		//작업이 끝나면 성공여부와 상관없이 무조건 끊어주는 코드가 필수로 요구됨.
		
		
		//finally를 사용하는 또다른 용법.
		//예외발생했을때.. 굳이 catch 영역안에 특별히 작성할 코드가 없다면.
		//catch문을 작성하는게 은근 짜증임. 이때 catch문을 생략할 수 있는 방법
		//catch문 대신에 finally 작성.
		try {
			
		}finally {
			
		}
		
		System.out.println();
		
		// Exception의 2가지 종류!
		// 1. Checked Exception   : 예외처리를 안하면 에러가 발생하여 실행조차 못하는 예외들!
		// 2. UnChecked Exception : 예외처리를 해도 되고 안해도 되는 예외들! [ 지금까지 살펴본 것들 모두.. ]
		
		// Checked Exception의 대표적인 것들..반드시 예외처리 해야 하는것들
		
		// 네크워크 작업)
		try {
			//URL url= new URL("http://www.naver.com");
			URL url= new URL("www.naver.com");
			System.out.println("접속 성공!");
			
		}catch(MalformedURLException e) {
			System.out.println("서버주소가 이상해요~~");
		}
		
		
		
		
		
		
		
		
		
		
		
				
		
		
		
		
		
		
		System.out.println("\n프로그램 종료\n");
	}

}
