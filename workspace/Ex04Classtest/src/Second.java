
public class Second {
	//클래스는 변수와 함수를 가지고 있는 녀석
	
	//멤버변수 : 데이터를 저장
	int a;
	
	//멤버함수 : 기능, 동작
	void show() {
		System.out.println("Second show!");		
	}

}//Second class..


//하나의 .java문서 안에 또다른 class가 설계(작성)될 수 있음.
class Third{
	int a; //멤버변수 - Field
	void show() { //멤버함수 - Method
		System.out.println("Third show!");
		
		//함수안에 class 설계서 작성-- Local class라고 부름
		class Hello{
			int k;
			void aaa() {
				System.out.println("Hello");
			}
		}
		
		Hello h= new Hello();
		h.aaa();
		
	}//show method..
	
	void sss() {
		//Hello h;//지역클래스는 다른 함수에서도 사용불가
	}
	
	//class안에 새로운 class설계도면 작성
	//이너클래스라고 부름
	class Test{
		int a;
		void show() {
			System.out.println("Test show!");
		}		
	}
	
}//Third class..

