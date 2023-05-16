import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
			System.out.println("unload me를 치면 프로그램 종료");
		while(true) {
			
			
			Scanner scan=new Scanner(System.in);
			
			System.out.print("입력값 : ");
			
			String data;//입력받은 데이터 저장					
			data=scan.nextLine();
			int length=data.length();
			
			if(data.equalsIgnoreCase("unload me") ) {
				System.out.println("프로그램 종료"); System.exit(0);//프로그램 종료가 따로없어서 만듬
			}
			
			
			int check[]= {2,3,4,5,6,7,8,9,2,3,4,5};//자리수마다 곱해줄 규칙
			
			int sum=0;//합계출력
			
			data=data.replace("-", "");//data의 공백과 '-'표시 삭제
			data=data.replace(" ", "");
			
			while(length<13) {
				
				System.out.println("13자리 이상입력해주세요");
				System.out.println();
				System.out.print("입력값 : ");
				data=scan.nextLine();
				length=data.length();
				if(data.equalsIgnoreCase("unload me") ) {
					System.out.println("프로그램 종료"); System.exit(0);//프로그램 종료가 따로없어서 만듬
				}
				data=data.replace("-", "");//data의 공백과 '-'표시 삭제
				data=data.replace(" ", "");
				
				if(length>=13) {
					
					break;
				}
				
			}
			
			data=data.replace("-", "");//data의 공백과 '-'표시 삭제
			data=data.replace(" ", "");
			length=data.length();
		
			if(length==13) {
			for(int i=0;i<data.length()-1;i++) {
			
				sum+=( (int)(data.charAt(i))-48)*check[i];
			}
			
	
			int su = 11 - sum % 11; //끝자리와 비교해줄 su
			
				
				String correct = data.substring(12); //입력한 주번의 마지막 자리와 비교해줄 correct
			
				int a=Integer.parseInt(correct);
			
			
				if( a==(su) )  {
					System.out.println("...주민번호가 맞습니다");
				}else {
					System.out.println("...개인정보가 아닙니다");
				}
			
			}else if(length==16){
				System.out.println("...카드번호가 맞습니다");
			}else {
				System.out.println("...개인정보가 아닙니다");
			}
				
				System.out.println();
			}	
	}

}
