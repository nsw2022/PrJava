import java.util.Scanner;
import java.util.ArrayList;
public class Araay2 {
public static void main(String[] args) {
	
		
		//1차원 배열
		int[] arr= new int[3];
		
		//2차원 배열
		int[][] aaa= new int[2][3];
		
		//요소값들 대입
		aaa[0][0]= 10;
		aaa[0][1]= 20;
		aaa[0][2]= 30;
		
		aaa[1][0]= 100;
		aaa[1][1]= 200;
		aaa[1][2]= 300;
		
		//요소값들 출력
		System.out.println( aaa[0][0] );
		System.out.println( aaa[0][1] );
		System.out.println( aaa[0][2] );
		System.out.println();
		
		System.out.println( aaa[1][0] );
		System.out.println( aaa[1][1] );
		System.out.println( aaa[1][2] );
		System.out.println();
		
		//배열의 길이값 알아보기
		System.out.println( aaa.length );
		System.out.println( aaa[0].length );
		System.out.println( aaa[1].length );
		
		//반복문을 이용하여 2차원배열의 요소값들을 출력
		for(int i=0; i<aaa.length; i++) {			
			for(int k=0; k<aaa[i].length; k++) {
				System.out.print( aaa[i][k] + "   " );
			}
			System.out.println();			
		}
		System.out.println();
		
		
		//각 set(층)마다 다른 길이의 1차원배열을 가질 수 있음.
		int[][] bbb= new int[3][];
		
		bbb[0]= new int[3];
		bbb[1]= new int[5];
		bbb[2]= new int[4];
		
		//배열요소의 개수
		System.out.println(bbb.length);
		System.out.println(bbb[0].length);
		System.out.println(bbb[1].length);
		System.out.println(bbb[2].length);
		
		//배열의 요소값 출력 - 반복문
		for(int i=0; i<bbb.length; i++) {
			
			for(int k=0; k<bbb[i].length; k++) {
				System.out.print( bbb[i][k] +"  " );
			}
			System.out.println();
			
		}
		System.out.println();
		
		
		//2차원배열도 초기화
		int[][] ccc= new int[][]{ 
						new int[]{10,20}, 
						new int[]{10,20,30,40} 
					};
					
		//축약표현으로 줄여서..초기화
		int[][] ddd= {
				{10,20,30},
				{1000,200,300,400,500},
				{50,60,70,80}				
		};
		
		for(int i=0; i<ddd.length; i++) {
			
			for(int k=0; k<ddd[i].length; k++) {
				System.out.print( ddd[i][k] + "  " );
			}
			System.out.println();
			
		}
		System.out.println();
		
		
		//확장된 for문법( for each문법)
		for( int[] t : ddd ) {
			
			for( int n : t) {
				System.out.print( n +"  " );
			}
			System.out.println();
			
		}
		System.out.println();
		
		
		// 배열의 개수를 변수로 지정할 수 있다. 2차원배열도 가능함
		// 심지어 그 변수의 값을 키보드로 입력받을 수도 있음.
		Scanner scan= new Scanner(System.in);
		
//		System.out.print("층수 입력 : ");
//		int a= scan.nextInt();
//		
//		int[][] eee= new int[a][];
//		
//		for(int i=0; i<eee.length; i++) {
//			System.out.print("호수 입력: ");
//			int b= scan.nextInt();
//			
//			eee[i]= new int[b];
//		}
//		
//		for( int i=0; i<eee.length; i++ ) {
//			
//			for( int k=0; k<eee[i].length; k++) {
//				System.out.print( eee[i][k] +"  "); 
//			}
//			System.out.println();
//			
//		}
//		System.out.println();
		
		
		//3차원배열.... 4,5,6 차원도.... 같은 방식
		int[][][] abc= new int[2][][];
		
		abc[0]= new int[3][];
		abc[1]= new int[4][];
		
		abc[0][0]= new int[2];
		abc[0][1]= new int[5];
		abc[0][2]= new int[3];
		
		abc[1][0]= new int[4];
		abc[1][1]= new int[7];
		abc[1][2]= new int[6];
		abc[1][3]= new int[3];
		
		abc[0][0][0]= 10;		
		abc[1][2][3]= 100;
		
		
		System.out.println("==================");
		
		//실제 현업에서 대량의 데이터를 다루는 작업은 필수임. [다량의 게시글, 회원명단 등...]
		//그래서 배열을 정말 많이 사용될 수 밖에 없음.
		//하지만, 배열의 단점이 하나 존재함. 한번 요소의 개수를 정하여 만들면
		//나중에 추가 또는 삭제가 불가함
		
		//그래서 현업에서는 요소의 개수를 변경할 수 있는(추가/삭제가 가능한)
		//[유동적 배열] 객체를 사용함
		//그 능력을 가진 객체를 ArrayList 라고 부름
		// 마치, 기차 뒤에 차량을 계속 추가할 수 있듯이...
		ArrayList<String> list= new ArrayList<String>();
		
		System.out.println("요소개수 : " + list.size() );
		
		//요소 추가
		list.add( new String("sam")  );
		list.add( new String("robin")  );
		list.add( "hong" ); //자동 new String()
		
		System.out.println("요소개수 : " + list.size() );

		//요소값 출력
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		//요소삭제
		list.remove(1);//1번방의 요소가 삭제됨.
		System.out.println("요소개수 : " + list.size() );
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
	}
}
		