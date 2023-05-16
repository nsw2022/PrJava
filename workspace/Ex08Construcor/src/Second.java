
public class Second {
	
	//멤버변수
		int a;
		int b;
		
		//멤버변수를 초기화하는 특별한 메소드 - 생성자메소드
		Second(int a, int b){
			this.a= a;
			this.b= b;
			System.out.println("Second int,int");
		}
		
		//파라미터 없는 생성자 오버로딩
		Second(){
			// System.out.println("Second");
			
			//값을 전달받지 않았을때 저장될 멤버변수의 기본값을 대입해주는 작업
//			this.a= -1;
//			this.b= -2;
			//멤버변수에 일일이 값을 대입해주는 코드가 번거로워 보임.. 여러줄...
			//그래서 이 클래스안에 있는 다른 생성자를 호출하여 대신 대입해달라고
			//요청하는 문법이 존재함. -- this();
			//저 위에 만든 파라미터 2개짜리 생성자를 호출해보기
			this(-1, -2);
			//this()생성자 호출문을 반드시 첫줄에 있아야만 함.
			System.out.println("Second");
		}
		
		
		//파라미터 1개짜리 생성자 오버로딩
		Second(int a){
			//this.a= a;
			//this.b= a;
			this(a, a);
			System.out.println("Second int");
		}

	
}
