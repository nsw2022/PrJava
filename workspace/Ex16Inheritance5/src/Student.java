
public class Student extends Person{
	//이미 name,age를 보유한 상태
	
	private String major;//전공
	
	//생성자
	public Student() {
		super();
		major="";
		
	}
	
	//파라미터 받는 생성자 오버로딩
	public Student(String name, int age, String major) {
		super(name, age);
		this.major=major;
	}
	
	//상속받은 show() 기능이 이름, 나이만 출력하기에.. 추가로 전공도 출력하도록
	//기능을 개선하기.. Override
	public void show() {
		//이름, 나이를 출력하는 부모의 show()기능을 호출
		super.show();
		System.out.println("major: " + major);
		
	}
}
