import java.net.MalformedURLException;
import java.net.URL;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// throws : 예외 떠 넘기기..문법!! 일종의 폭탄 돌리기
		
		try {
			int x= divide(10,0); //divide()메소드에서 떠넘긴(throws) 예외를 대신 처리.
			System.out.println( x );
			
		}catch(ArithmeticException e) {
			System.out.println("0나눗셈 불가!");			
		}
		
		//만약 떠넘겨진(throws) 예외가 Checked Exception의 종류 중 하나라면..
		//사용하는 쪽에서 무조건 대시 예외처리 해야만 함.
		try {
			connectNetwork();
		}catch(MalformedURLException e) {
			
		}
		
		
		//폭탄 돌리기처럼..떠넘기고..또 떠 넘기고..또..떠 넘기고..할 수 도 있음.
		try {
			aaa();
		}catch(Exception e) {
			
		}
		
		
	}
	
	static void aaa() throws MalformedURLException{		
		bbb();
	}
	
	static void bbb() throws MalformedURLException{
		connectNetwork();
	}
	
	
	//Checked Exception을 throws 하는 메소드
	static void connectNetwork() throws MalformedURLException{		
		URL url= new URL("http://www.naver.com");
		System.out.println("접속 성공");
	}
	
	
//	static int divide(int x, int y) {
//		try {
//			return x/y;
//		}catch(ArithmeticException e) {
//			System.out.println("0나눗셈 불가!");
//			return ???;  //여기에 쓸 데이터가 없음..
//		}				
//	}
	
	//즉, 위처럼 예외가 발생할 가능성이 있는 코드가 있는 곳에서
	//try문으로 예외처리를 하기에 용이하지 않는 경우도 존재함.
	//이때 이 영역에서 예외처리를 하지 말고..
	//이 함수를 호출한 쪽으로 예외를 던저버리는 기법 : throws
	static int divide(int x, int y) throws ArithmeticException {
		return x/y;
	}

}
