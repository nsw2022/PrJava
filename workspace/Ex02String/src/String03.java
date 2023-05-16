import java.util.Scanner;
public class String03 {
public static void main(String[] args) {
	

		
		Scanner scan= new Scanner(System.in);
		
		String s= scan.next();//입력받을꺼야를 이렇게표현..
		char max= s.charAt(0);
		for(int i=1; i< s.length(); i++) {
			char ch= s.charAt(i);
			if( ch > max  ) {
				max= ch; //모든 문자를 나열
			}
		}
		
		System.out.println( max );		

	}
}

