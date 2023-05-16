//import aaa.Studnet;//error
//import bbb.Studnet; 
//import bbb.Person;

import java.util.Random;

//bbb패키지 안에 있는 모든 클래스들을 통으로 import
import bbb.*;

import mrhi.dev.World;


public class Main {
public static void main(String[] args) {
	
	//class를 정의 할때 같은 이름을 가진 class가 있으면 에러
	//그래서 같은 이름을 가진 class를 만들때 폴더를 구분시키는 문법
	//이를 package 라고 부름
	
	//일단 package없이 그냥 class 사용하는 모습
	
	Test t = new Test();
	t.a=10;   //멤버변수 사용
	t.show(); //멤버함수 사용
	
	//같은 이름이 사용될 가능성이 있는 class 2개 만들기
	//1) [이름,국어,영어] 값을 저장하는 class - Student
	aaa.Studnet stu = new aaa.Studnet();
	stu.name="sam";
	
	
	//2) [이름,나이,전공] 값을 저장하는 class - Student
	bbb.Studnet stu2 = new bbb.Studnet();
	stu2.name = "robin";
	stu2.age=20;
	stu2.major="android";
	
	// [이름,나이,전공] 값을 저장하는 객체가 또 필요하다면?
	// 매번 package명을 기입하는 것도 짜증!
	// 그래서 이를 생략하는 문법 - import
	Studnet stu3=new Studnet();
	Studnet stu4=new Studnet();
	
	//@@단 같은  class를 둘다 inport할 수는 없음
	
	//가만 보니 이런 import를 전에도 쓴적있음
	//Random, Scanner 같은 자바 기본클래스들 사용할때
	//즉 java의 2000여개의 클래스는 전부 여러패키지 안에있음
	java.util.Random rnd = new java.util.Random();
	
	//원래는 위처럼 패키지명을 쓰고사용하는것인데 불편하니
	//import 하는 것임
	Random rnd2=new Random();
	
	//단, 측별한 패키지가 한개 존재함. java.lang 이라는 패키지는
	//별도의 import 를 명시하지않아도 자동 import 되어 있음
	java.lang.String s = new java.lang.String("Hello");
	//별도의 import없이도
	String s2=new String();
	
	
	//패키지안에 여러 class위치 가능함.
	//bbb패키지 안에있는 Person클래스 만들어보기
	bbb.Person p = new bbb.Person();
	Person p2=new Person();
	
	//@@가급적 패키지명을 정할때.. 유의미한 이름사용을 권장
	//또한 가급적 패키지명을 .구분자로 2단어 이상을 권장함 [ 하위폴더구조 ]
	//ex) aaa.bbb , mrhi.dev, mrhi.dev.andriod, mrhi.dev.ios
	
	mrhi.dev.World w = new mrhi.dev.World();
	World w2=new World();
	
	
			
	}
}
