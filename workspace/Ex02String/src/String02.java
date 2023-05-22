import java.util.Scanner;
public class String02 {
<<<<<<< HEAD
	public static void main(String[] args) {
=======
public static void main(String[] args) {
>>>>>>> 9bc0f9aefa6ade40856742cbfa118c85b1fb8939
		/*
		 *  1. 문자열의 크기 5에서 1을 뺀 4가 i에 저장.

			2. i>=0비교. 4가 0보다 크다. 참=>실행

			3. str.charAt(i) 는 str입력된 문자열에서 4번째 글자. 즉 abcde 에서 e를 입력하게 됨.

			4. 포문 처음으로 돌아감.

			5. 이때는 i-- 증감식 실행. i--란 i의 값을 1씩 줄여나가는 것.

			6. 그렇게해서 i의 값은 3이 되었고 3>=0 참이기 때문에 계속 실행하다가 

			7. 0 값에서 i--실행시 -1이 되므로 i>=0이라는 조건식에 반하게 되어 출력 중지.
			
		 * */
		Scanner s=new Scanner(System.in);

		int i;
		System.out.print("Input Words");
		String str=s.nextLine();

		for(i=str.length()-1;i>=0;i--) {
			System.out.printf("%s",str.charAt(i));
		}
<<<<<<< HEAD

=======
>>>>>>> 9bc0f9aefa6ade40856742cbfa118c85b1fb8939
	}
}
