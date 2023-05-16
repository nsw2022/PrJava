
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//어떤 대학의 정보제공 앱 제작  - 회원가입기능
		//회원종류 : 일반회원, 학생, 교수, 근로학생
		
		//1. 일반회원 : 이름, 나이
		//2. 학   생 : 이름, 나이, 전공
		//3. 교   수 : 이름, 나이, 과제
		//4. 근로학생 : 이름, 나이, 전공, 업무
		
		//1)일반회원
		Person p= new Person("sam", 20);		
		p.show();
		System.out.println();
		
		//2)학생
		Student stu= new Student("robin", 23, "android");
		stu.show();
		System.out.println();
		
		//3)교수
		Professor pro= new Professor("hong", 50, "mobile optimization");
		pro.show();
		System.out.println();
		
		//4)근로학생
		AlbaStudent alba= new AlbaStudent("kim", 25, "ios", "pc manager");
		alba.show();
		 
		
		
		
		

	}

}




