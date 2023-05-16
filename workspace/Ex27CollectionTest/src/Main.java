import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Collection 클래스들 : 자료구조를 구현한 Java API 클래스들 - 대량의 데이터를 관리.
		
		// 배열과 차이점.
		// 배열은 새로운 데이터를 삽입하거나 삭제할때 그 위치 다음의 데이터들을 모두 이동시켜야 해서 프로그램 속도가 저하됨.
		// 배열의 초기 길이보다 데이터의 개수가 더 많아지면..저장 불가..
		// 만약하고 싶다면..더 사이즈가 긴 배열을 새로만들어서 기존 배열데이터를 모두 복사한 후 새로운 데이터를 추가해야만 함.
		// 즉, 배열을 처음 배열객체를 만들때 길이값을 고정적으로 정해야만 만들어진 다는 특징이 있음.
		// 그래서 인스타그램의 피드글이나, 게임 캐릭터 생성등.. 데이터의 개수가 지속적으로 추가되거나 삭제되는 경우에는 배열이 효과적이지 않음.
		
		// 이런 데이터의 추가/삭제/변경/정렬 등의 작업을 편하게 해주기 위해 만들어진 클래스들을 Collection 이라고 부름
		// 단, Collection은 인터페이스 임.
		
		// 컬렉션의 저장 방법론에 따라 크게 3가지 종류로 구분됨.
		
		// - Collection 인터페이스의 3가지 큰 분류 : List, Set, Map
		// 1) List :  자료들이 저장된 순서대로 존재함. 자동 인덱스번호 부여. 중복데이터가 허용됨. 
		// 2) Set  :  저장된 순서대로 존재하지 않음. 인덱스번호 없음. 중복데이터가 허용되지 않음.
		// 3) Map  :  자된된 순서대로 존재하지 않음. 인덱스번호대신 특정 데이터(문자열)를 식별자로 사용함.(키-벨류 쌍), 중복데이터는 허용. 중복된 key는 허용하지 않음.
		
		
		// 위 3가지 종류 모두 고유한 저장방식을 가지고 있으나 인터페이스 이므로 직접 사용할 수 없음.
		// 각 인터페이스를 구현하여 설계된 하위 클래스들을 사용하는 것임.
		// 1) List :  ArrayList, LinkedList, Vector
		// 2) Set  :  HashSet, TreeSet, LinkedHashSet
		// 3) Map  :  HashMap, TreeMap, LinkedHashMap, HashTable
		
		// 이 중에서 먼저 List계열에 대한 실습
		
		// List는 인터페이스임. 직접 객체 생성 불가
		//List list= new List();
		
		// List인터페이스를 구현한 하위 클래스들을 사용해야 함.		
		// 먼저, 가장 많이 사용되는 ArrayList부터 실습
		// 리스트객체가 저장할 데이터의 자료형(종류)을 Generic<>문법으로 지정해야만 함.
		// 즉, 리스트도 결국 배열처럼 같은 자료형만 추가할 수 있음. 단, 제네릭타입을 지정하지 않으면 자동 Object타입으로 설정됨. 
		ArrayList<String> list= new ArrayList<String>();
		
		// List가 가지고 있는 주요 기능 메소드들 알아보기..
		
		//1. 요소의 개수
		System.out.println( "요소 개수 : " + list.size() );
		
		//2. 요소 추가
		String s= new String("aa");
		list.add(s);
		list.add( new String("bb") );
		list.add("cc"); //자동 new String()
		System.out.println( "요소 개수 : " + list.size() );
		
		//3. 요소 얻어오기
		String str= list.get(0);
		System.out.println(str);
		System.out.println( list.get(1) );
		System.out.println( list.get(2) );
						
		//4. 요소 삭제
		list.remove(1);
		System.out.println( "요소 개수 : " + list.size() );
		System.out.println( list.get(0) );
		System.out.println( list.get(1) );
		//System.out.println( list.get(2) ); //Exception발생
		
		//5. 특정위치에 요소추가
		list.add(1, "dd"); //1번방에 "dd"문자열 삽입
		System.out.println( "요소 개수 : " + list.size() );
		System.out.println( list.get(0) );
		System.out.println( list.get(1) );
		System.out.println( list.get(2) );
		
		//6. 요소제거 할때 인덱스 번호가 아니라 객체참조변수로도 삭제 가능
		String s2= new String("Test");
		list.add(s2);
		System.out.println( "요소 개수 : " + list.size() );
		list.remove(s2);
		System.out.println( "요소 개수 : " + list.size() );
		
		//7. 요소 모두 지우기
		list.clear();
		System.out.println( "요소 개수 : " + list.size() );
		
		//8. 중복된 데이터 추가 가능함.
		list.add("aa");
		list.add("aa");
		list.add("aa");
		System.out.println( list.get(0) );
		System.out.println( list.get(1) );
		System.out.println( list.get(2) );
		
		//9. 요소의 검색 관련 기능들.
		System.out.println( list.contains("aa") ); //그 데이터가 존재하는지 여부[true/false]
		System.out.println( list.contains("bb") );
		
		list.clear();
		System.out.println( list.isEmpty() ); // 리스트가 비어있는지 여부
		
		
		//10. 한번에 여러요소들을 추가하기.
		list.add("aa");
		list.add("bb");
		list.add("cc");
		
		//또 다른 리스트객체
		ArrayList<String> list2= new ArrayList<String>();
		list2.add("kk");
		list2.add("ss");
		
		// 다른 리스트의 요소들을 한방에 추가시키는 기능
		list.addAll(list2);
		System.out.println( list.toString() ); //자동 요소들을 [,,,]해서 문자열로 리턴해줌
		
		// 10.1 여러요소를 한방에 추가할때 특정위치에 통으로 삽입하기.
		list.addAll(1, list2);
		System.out.println( list.toString() );
		
		// 11. 특정요소들을 한방에 제거하기
		
		// 지울 목록을 지는 리스트객체 - 데스노트 (살생부)
		ArrayList<String> list3= new ArrayList<String>();
		list3.add("aa");
		list3.add("kk");
		
		list.removeAll(list3);
		System.out.println( list.toString() );
		
		// 12. 특정요소들만 남기고 모두 제거.. 
		ArrayList<String> list4= new ArrayList<String>();
		list4.add("ss");
		
		list.retainAll(list4);
		System.out.println( list.toString() );
		
		
		//13. 특정 요소들이 모두 포함되어 있는지 비교.
		list.clear();
		
		list.add("aa");
		list.add("bb");
		list.add("cc");
		list.add("dd");
		list.add("ee");
		list.add("ff");
		list.add("cc");
		list.add("aa");
		list.add("gg");
		
		// 검색할 데이터들을 가진 또 다른 리스트객체
		ArrayList<String> list5= new ArrayList<String>();
		list5.add("aa");
		list5.add("bb");		
		System.out.println( list.containsAll(list5) ); //true
		
		list5.add("kk");
		System.out.println( list.containsAll(list5) ); //false
		
		
		//14. 특정 데이터가 몇번 방에 있는지..알려주는 기능
		System.out.println(  list.indexOf("cc") );
		System.out.println(  list.lastIndexOf("cc") );
		
		
		// 요소값을 순차적으로 모두 얻어와 보기
//		String ss= list.get(0);
//		System.out.println(ss);
//		System.out.println(ss.length());
//		System.out.println(ss.toUpperCase());
		
		//반복문 이용.
		// 방법1. for문 이용
		for(int i=0; i<list.size(); i++) {
			String t= list.get(i);
			System.out.println( t +" : " + t.length() );
		}
		System.out.println();
		
		// 방법2. for each문
		for( String t : list) {
			System.out.println( t +" : " + t.toUpperCase());			
		}
		
		// 방법3. iterator()..이용하는 방법 --> Set수업때 소개..
		
		System.out.println();
		
		// 리스트는 제네릭을 사용함. 이 제네릭에는 참조형만 가능함.
		// 즉, 정수형 숫자를 대량으로 리스트로 저장하고 싶다면. Wrapper class이용
		ArrayList<Integer> list6= new ArrayList<Integer>();
		list6.add( new Integer(10) );
		list6.add( 20 ); //자동 new Integer()
		list6.add( 30 );
		System.out.println( list6.size() );
		
		for( int i=0; i<list6.size(); i++) {
			System.out.println( list6.get(i) );
		}
		System.out.println();
		
		
		
		// 또다른 List계열의 하위 클래스 : LinkedList, Vector
		// 사용하는 방법은 ArrayList와 똑같음.
		// ArrayList는 실제 내부는 배열로 만들어져 있기에..
		// 실제 데이터를 추가/삭제/이동 같은 것을 할때 배열처럼 많은 연산과정이 이루어짐. 즉, 속도가 느림 - 대신 특정 요소값을 얻어오는 속도는 빠름.
		// 그래서 이를 개선하기 위해 등장한 클래스임.
		// LinkedList는 데이터의 삽입/삭제 등에 매우 높은 성능을 보여줌. 대신..특정 위치의 요소 검색을 다소 느림.
		LinkedList<String> aaa= new LinkedList<String>();
		System.out.println("요소개수 : " + aaa.size());
		
		aaa.add("aaa");
		aaa.add("bbb");
		aaa.add("ccc");
		
		System.out.println( aaa.get(0) );
		System.out.println( aaa.get(1) );
		System.out.println( aaa.get(2) );
		System.out.println();
		
		aaa.remove(1);
		System.out.println( aaa.get(0) );
		System.out.println( aaa.get(1) );
		
		System.out.println();
		
		// 또다른 List계열의 클래스 : Vector 
		// 사용방법도 똑같고.. ArrayList와 완전 메모리구조도 똑같음.(성능이 같음) - 단, 동기화 처리가 되어 있음.(스레드수업에 소개가 가능함)
		Vector<String> bbb= new Vector<String>();
		bbb.add("aaa");
		bbb.add("bbb");
		
		System.out.println(bbb.get(0));
		System.out.println(bbb.get(1));
		
		
		
		
		
		
		
		
		

	}

}





