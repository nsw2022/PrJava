import java.util.Random;

public class Computer {
	
	//컴퓨터가 가질 정답값의 각 자리수의 숫자저장 멤버변수
		int com100, com10, com1;
		
		//정답(중복되지 않는 랜덤숫자)을 만들어내는 기능
		void makeNumbers(){
			Random rnd= new Random();
			
			while(true){
				com100= rnd.nextInt(10);
				com10= rnd.nextInt(10);
				com1= rnd.nextInt(10);
				
				if(com100!=com10 && com100!=com1 && com10!=com1) break;
			}		
			
		}
		
		
		//전달받은 값이 정답인지 체크.
		boolean checkAnswer(String answer){
			
			if(answer.length()!=3){
				System.out.println("잘못입력했어요...");
				return false;
			}
			
			int user100= answer.charAt(0)-48;
			int user10= answer.charAt(1)-48;
			int user1= answer.charAt(2)-48;		
			
			int strike=0, ball=0;
			
			if(user100==com100) strike++;
			else if(user100==com10 || user100==com1) ball++;
			
			if(user10==com10) strike++;
			else if(user10==com100 || user10==com1) ball++;
			
			if(user1==com1) strike++;
			else if(user1==com100 || user1==com10) ball++;
			
			//결과 출력
			if(strike==3){
				System.out.println("정답입니다!!");
				return true;
			}
			
			System.out.println(strike+"스트라이크  "+ball+"볼");
			System.out.println();
			return false;
			
		}
	

}
