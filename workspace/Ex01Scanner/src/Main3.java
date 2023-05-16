import java.util.Random;
import java.util.Scanner;

public class Main3 {
	public static void main(String[] agrs) {
//		//랜덤값을 만들어 주는 능력을 가진 객체 생성
//		Random rnd=new Random();
//		
//		//임의의 정수값
//		int n=rnd.nextInt();//-21억 ~ +21억
//		System.out.println("n: "+n);
//		
//		//범위를 가지는 정수값
//		int n2=rnd.nextInt(10);//총 10개 : 0~9
//		System.out.println("n2: "+n2);
//		
//		int n3=rnd.nextInt(100);//총 100개 : 0~99
//		System.out.println("n3: "+n3);
//		
//		int n4=rnd.nextInt(16);//총 16개 : 0~15
//		System.out.println("n4: "+n4);
//		
//		//5~15
//		int n5=rnd.nextInt(11)+5;
//		System.out.println("n5 "+n5);
//		
//		//-5 ~ 5
//		int n6=rnd.nextInt(11)-5;
//		System.out.println("n6: "+n6);
//		
//		//랜덤한 논리값
//		boolean b=rnd.nextBoolean();
//		System.out.println("논리값 : "+ b);
//		
//		//랜덤한 실수형 숫자
//		double d=rnd.nextDouble();//0.0 ~ 0.99999999...
//		System.out.println("실수값 : "+d);
//		
//		// 0.0 ~ 9.999999999
//		double d2=rnd.nextDouble() * 10 ;
//		System.out.println("실수값 : "+d2);
//		
//		// 0.0 ~ 99.999999999
//		double d3=rnd.nextDouble() * 100 ;
//		System.out.println("실수값 : "+d3);
//		
//		//0.0 ~ 14.99999
//		double d4=rnd.nextDouble() * 15 ;
//		System.out.println("실수값 : "+d4);
		
		//예) 컴퓨터가 500~1000 중 랜덤한 숫자를 만들고 정하고
		//	  사용자는 이를 맞추는 [숫자 스무고개]게임 만들기
		
		//컴퓨터가 정할 정답값 500~1000 사이
		
		//랜검값을 만드는 능력을 가진 객체 생성
		Random rnd=new Random();
		int com=rnd.nextInt(501)+500; //500~1000
		
		//사용자가 숫자를 입력할 수 있도록 키보드 입력을 해주는 객체 생성
		Scanner scan=new Scanner(System.in);
		
		while(true) {
			System.out.print("500~1000 사이값 입력: ");
			int user=scan.nextInt();
			
			//입력된 user값과 정답값인 com 변수의 값을 비교
			
			if( user > com) {
				System.out.println(user+" 보다 작습니다.");
				System.out.println();
			}else if( user < com){
				System.out.println(user+" 보다 큽니다.");
				System.out.println(
						);
			}else {
				System.out.println("축하합니다.\n정답입니다.");
				break;
		}
		
		
		
		
		
		
		
		
		
		
		
	}
		
	}
}


