import java.util.Scanner;
public class String01 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	String input;
	
	System.out.println("영단어 입력하면 한자리당 +1값 출력");
	System.out.print("input: ");
	input=scan.next();
	
	String bin=input.trim();
	int len = bin.length();	
	
	for(int i=0;i<len;i++) {
	
	System.out.println((char)(input.charAt(i)+1));
	}
}
}

