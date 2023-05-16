import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
				
			
			Scanner scan=new Scanner(System.in);
			
			System.out.print("입력값 : ");
			
			String juburn;//입력받은 주번 저장					
			juburn=scan.nextLine();
			int length=juburn.length();
			int check[]= {2,3,4,5,6,7,8,9,2,3,4,5};//자리수마다 98곱해줄 규칙
			
			int sum=0;//합계출력
			
			juburn=juburn.replace("-", "");
			juburn=juburn.replace(" ", "");
			
			while(length<13) {
				System.out.println("13자리 이상입력해주세요");
				System.out.println();
				System.out.print("입력값 : ");
				juburn=scan.nextLine();
				int length1=juburn.length();
				juburn=juburn.replace("-", "");//juburn의 공백과 '-'표시 삭제
				juburn=juburn.replace(" ", "");
				if(length1>=13) {
					length=length1;
					break;
				}
				
			}
			
			juburn=juburn.replace("-", "");
			juburn=juburn.replace(" ", "");
			
			System.out.println(length);
			for(int i=0;i<juburn.length()-1;i++) {
			
				sum+=( (int)(juburn.charAt(i))-48)*check[i];
			}
			System.out.println(sum);
	
			int su = 11 - sum % 11; //끝자리와 비교해줄 su
			System.out.println(su);
			
			String correct = juburn.substring(12); //입력한 주번의 마지막 자리와 비교해줄 correct
			
			int a=Integer.parseInt(correct);
			System.out.println(correct);
			
			if( a==(su) )  {
				System.out.println("정확한주민번호");
			}else {
				System.out.println("다시입력해주세요");
			}
			System.out.println();
		}

		
		
		
		
		
		
		
	}

}
