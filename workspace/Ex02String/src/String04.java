import java.util.Scanner;
public class String04 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
			
	System.out.println("문자열 입력하면 모든공백문자는 제거됩니다");
	System.out.print("input: ");

	String input=scan.nextLine();

	input=input.replace(" ", "");
	System.out.println(input);
	

	
}
}
