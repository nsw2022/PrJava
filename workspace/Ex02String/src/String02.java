import java.util.Scanner;
public class String02 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	String input;
	String ban;
	
	System.out.println("영단어 입력하면 반대로 출력");
	System.out.print("input: ");
	input=scan.next();
	
	String bin=input.trim();
	int len = bin.length();	
	
	for(int i=0;i<len;i++) {
		
		System.out.println(input.charAt(i));
		}
//	  모르겠음..
}
}
