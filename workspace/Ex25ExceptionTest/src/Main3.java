
public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// throw : 코드를 통해서 강제 예외를 발동하는 문법 [ throws와는 다른 문법 ]
		try {
			System.out.println("aa");
			//억지로 예외발동하는 문법
			throw new MyException();
			
		}catch(Exception e) {
			System.out.println("예외 발생!");
		}
		
		System.out.println();
		
		// [ 활용 예 ]
		// Java언어체계에서는 예외가 아닌 상황을 개발자가 마음대로 예외라고 하고 싶을때
		// 예) 메소드의 계산결과가 음수가 나오면 예외라고 하고 싶을때..
		// java 언어에서는 음수라고 예외를 발동하는 그런 메카니즘은 없음...
		
		int n;
		
		try {
			n= aaa(10, 5);
			System.out.println("n : " + n);
			
			n= aaa(10, 15);
			System.out.println("n : " + n);
			
		}catch(Exception e) {
			System.out.println("음수 결과는 유효하지 않은 값입니다.");
			System.out.println("에러 메세지 : " + e.getMessage());
		}
		
		

	}
	
	static int aaa(int a, int b) throws Exception {
		//음수결과가 나올 수 있는 상황		
		if(a<b) {
			throw new Exception("에러지롱~~~"); //예외를 강제로 발동!!
		}
		
		return a-b;		
	}

}


class MyException extends Exception{
	
}
