import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	// Java언어에서는 문자열(String)을 객체로 관리함.
	// 즉, 자바에서 문자열을 사용하려면 일단, 문자열(String)객체를 생성(new)하여 사용함.
	// 문자열객체의 값을 절대불변!!
	
	String str= new String("Hello");
	
	//문자열객체가 가진 값을 출력하고 싶다면?
	System.out.println( str.toString()  );
	//매번 출력할때마다 .toString()을 쓰는게 불편해서.. 
	//println()기능이 참조변수만 써도 알아서 .toString() 해줌.
	System.out.println( str );
	
	//String객체를 가장 많이 사용되는 데이터유형의 객체임. 그래서..
	//매번 new String()이 번거로움. 그래서 아주 특별하게..
	//그냥 문자열만 써도 new String()을 자동으로 해줌
	String str2= "Nice";  //자동 new String("Nice");
	System.out.println( str2.toString() );
	System.out.println( str2 ); 
	
	
	String str3= "Good";
	System.out.println( str3 );
	
	
	//객체는 기능(Method)들을 보유하고 있음.
	//String class의 유용한 메소드들..
	
	//1. 문자열 데이터의 길이(글자수)를 리턴해주는 기능(Method)	
	int len= str.length();
	System.out.println("글자수 : " + len);
	
	//2. 문자열값 비교기능 - 리턴결과는 true/false
	System.out.println( str == "Hello" ); //false :주소비교
	System.out.println( str.equals("Hello") ); //값비교 기능
	System.out.println( str.equals( new String("Hello") ) );
	String s1="Hello";
	System.out.println( str.equals(s1) );
	System.out.println( "Hello".equals(str)  );
	
	//2-1. 대소문자 비교
	System.out.println( str.equals("hello") ); //false
	System.out.println( str.equalsIgnoreCase("hello") );//true
	
	
	//3. 문자열에서 특정 char(한문자) 얻어오기!
	char ch= str.charAt(0);
	System.out.println(ch);
	System.out.println( str.charAt(1) );
	System.out.println( str.charAt(2) );
	System.out.println( str.charAt(3) );
	System.out.println( str.charAt(4) );
	//System.out.println( str.charAt(5) );//error
	
	//반복문으로 char값을 하나씩 출력해보기
	for(int i=0; i<5; i++) {
		System.out.println( str.charAt(i) );
	}
	
	//Scanner를 이용해서 정수형받기
	Scanner scan= new Scanner(System.in);
//	int n= scan.nextInt();
//	System.out.println("n : " + n);
	
	//Scanner를 이용해서 한문자(char) 받기 - 없음 [ 문자열로 받아서 한글자를 뽑아냄 ]
//	String s2= scan.next();
//	char c= s2.charAt(0);
//	System.out.println("한문자 : " + c);
	
	
	//4. 문자열안에 특정 문자가 몇번째에 있는지..
	int index= str.indexOf('l'); //못찾으면 -1
	System.out.println(index);
	System.out.println( str.lastIndexOf('l')  );
	
	//문자열 검색도 가능함
	System.out.println( str.indexOf("el")  );
	System.out.println( str.indexOf("el", 2)  ); //2번방부터 검사시작
	
	//5. 파라미터로 전달된 문자열이 내 문자열안에 포함되어 있는가? true/false
	String s="Hello world! Hello android! nice world!";
	boolean b= s.contains("world");
	System.out.println(b);
	
	//6. 문자열 결합 기능
	String ss= s.concat("nice android!"); //원본변경X, 새로운 문자열 리턴
	System.out.println( s );    //원본은 그대로....
	System.out.println( ss );
	
	// concat()메소드는 잘 사용안함. why? + 연산자가 존재하기에..
	ss= s + "aaa";
	System.out.println( ss );
	System.out.println( s );
	
	//7. 특정문자열로 시작되는가?
	System.out.println( s.startsWith("Hello") );
	System.out.println( s.startsWith("world") );
	
	//7-1. 특정문자열로 종료되는가?
	System.out.println( s.endsWith("Hello")  );
	System.out.println( s.endsWith("world!")  );
	
	
	//8. 대소문자 자동 변환
	System.out.println( s.toUpperCase() );
	System.out.println( s.toLowerCase() );
	System.out.println( s );  //원본은 변경되지 않음.
	
	
	//9. 문자열의 양끝쪽 공백문자를 제거하기!! - 중간공백은? 제거안함
	s="  Hello     ";
	System.out.println( "["+ s +"]" );
	System.out.println( s.equals("Hello") ); //false
			
	s= s.trim();
	System.out.println( "["+ s +"]" );
	System.out.println( s.equals("Hello") ); //true
	
	
	//10. 특정문자 바꿔치기!
	s= "Hello world! Hello android! nice world!";
	System.out.println( s.replace('H', 'K') );
	System.out.println( s.replace("android", "ios"));
	
	// 중간공백문자를 없애고 싶다면. trim()이 아니라 
	// replace()를 사용함.
	System.out.println( s.replace(" ", "")  );
	
	System.out.println( s ); //원본 불변
		
			
	//11. 문자열 잘라내기
	String s4= s.substring(6);
	System.out.println( s4 );
	
	String s5= s.substring(6, 12); //6~11번 까지
	System.out.println( s5 );
	
	
	// 12. 문자열 대소 비교 [정렬할때 사용]
	char ch1= 'a';
	char ch2= 'b';
	System.out.println(  ch1 > ch2 );
	
	String s6= "aaa";
	String s7= "aac";		
	
	//System.out.println( s6 > s7 ); //error - 주소비교는 안됨
	System.out.println( s6.compareTo(s7) );
	
	
	//13. 문자열 분리해서 결과를 배열로 만들어 줌
	s= "android:ios:web:windows:hello";
	String[] arr= s.split(":");
	System.out.println( arr[0] );
	System.out.println( arr[1] );
	System.out.println( arr[2] );
	System.out.println( arr[3] );
	System.out.println( arr[4] );
	

	// 객체지향에서 기능(함수-메소드)는 반드시 객체가 있어야만 사용할 수 있음.
	// 근데 String class 안에 객체를 생성하지 않고도 사용이 가능한 기능도 일부 존재함
	// 이렇게 객체 생성없이 설계도면만으로 사용가능한 함수를 static 함수라고 부름
	// static 메소드 : 객체생성없이 바로 사용할 수 있는 메소드 [ 클래스명.메소드명() ]
	
	//1) 문자열객체를 만들때 데이터의 포멧을 만들어주는 기능 [ 마치 printf() 같은 기능 ]
	int hour= 10;  //시
	int min = 5;   //분
	int sec = 12;  //초
	System.out.println(hour+":"+min+":"+sec);
	System.out.printf("%02d:%02d:%02d\n",hour, min, sec);
	
	//System.out.printf()는 포멧된 글씨를 무조건 console창에만 출력함
	
	String s10= String.format("%02d:%02d:%02d", hour, min, sec);
	System.out.println(s10);
	
	
	//2) 기본(primitive) 자료형을 String객체로 변환해주는 기능
	int num= 100;
	//String s11= (String)10; //error - 형변환연산자는 기본형끼리..또는 참조형끼리만 가능함
	String s11= String.valueOf(num); //100 --> "100"
	System.out.println( s11.length() );
	
	s11= String.valueOf(3.14);       //3.14 --> "3.14"
	System.out.println( s11.length() );
	
	s11= String.valueOf(false);      //false --> "false"
	System.out.println( s11.length() );
	
	//기본형을 String으로 변환하는 작업은 앱개발 과정에서 아주 많이 사용됨
	//하지만, String.valueOf()는 별로 애용되지 않음.
	// why?  + 결합연산자를 애용하기에.
	String s12;
	
	s12= 10 + "";
	System.out.println(s12.length());
	
	s12= 5.24 + "";
	System.out.println(s12.length());
	
	s12= true + "";
	System.out.println(s12.length());
	
	
	//별외. 반대로.String을 기본형 자료형값으로 변화하고 싶다면?
	//String class에는 기능이 없음. 그래서 Wrapper 클래스(기본형 자료형 별로 준비되어 있음)를 사용함.
	String sss="100";
	
	int n = Integer.parseInt(sss);
	System.out.println(n+2);//산술연산
	
	double d = Double.parseDouble("3.14");
	System.out.println(d+1.1);
	
	
}
}
