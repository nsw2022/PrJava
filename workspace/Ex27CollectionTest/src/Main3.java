import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Map : 키-벨류 쌍으로 데이터를 저장하는 방식
		
		// Map도 인터페이스이므로 직접 객체 생성 불가
		// Map인터페이스를 구현한 하위 클래스들을 객체로 생성하여 사용
		// 1) HashMap : 저장순서 X, 저장순서파악 어려움. Map중에 가장 성능좋음
		// 2) TreeMap : 키값(식별자)에 따라 오름차수능로 정렬
		// 3) LinkedHashMap : 저장된 순서대로 정렬됨. 성능 가장 안 좋음
		// 4) HashTable : HashMap과 똑같음. 다만, 동기화 처리가 되어 있음 (스레드 수업에 소개가능함)
		
		// <키(식별자) 타입, 벨류(데이터) 타입> 
		
		HashMap<String, String> map= new HashMap<String, String>();
		//TreeMap<String, String> map= new TreeMap<String, String>();
		//LinkedHashMap<String, String> map= new LinkedHashMap<String, String>();
		
		//요소 추가 (식별자, 데이터)
		map.put("Name", "Hong");
		map.put("Id", "abcd");
		map.put("PW", "1234");	
		
		map.put("kkk", "Hong"); //키값을 다르고, 데이터는 같은 상황은 저장 가능함.
		map.put("kkk", "asdf"); //키값은 같고, 데이터가 다른 상황은 추가가 아니라 값 변경이 됨.
		
		System.out.println("요소개수 : " + map.size() );
		
		//요소 얻어오기
		System.out.println(  map.get("Name") );
		System.out.println(  map.get("Id") );
		System.out.println(  map.get("PW") );
		System.out.println(  map.get("kkk") );
		
		//요소 제거하기
		map.remove("kkk"); //식별자를 index번호 대신 사용
		System.out.println("요소개수 : " + map.size() );
		System.out.println();
		
		//요소를 순차적으로 얻어와 보기..
		// index번호가 없기에 일반 for문법은 불가능
		// for each문법도 사용불가.
//		for(String t : map) { //error			
//		}
		
		//방법1.
		// 일단, Map에서 key값들만 빼오기..
		Set<String> keys= map.keySet(); // key값들을 Set객체로 묶어서 리턴해줌.
		// 1.1 key 값들을 for each문법으로 순차접근
		for( String key : keys ) {
			String value= map.get(key);		
			System.out.println( key + " : " + value);
		}
		System.out.println();
		
		
		// 1.2 key 값들을 iterator(반복자)를 이용
		Iterator<String> datas= keys.iterator();
		while( datas.hasNext() ) {
			String key= datas.next();
			System.out.println( key + " : " + map.get(key) );
		}
		System.out.println();
		
		// 방법2. Map 요소객체를 Set객체로 묶에서 순차 접근
		// Map 요소객체 Entry(키-벨류 쌍) 객체를 Set으로 묶기.
		Set< Entry<String, String>  > set= map.entrySet();
		
		for( Entry<String, String> e: set ) {
			System.out.println( e.getKey() + " : " + e.getValue() );			
		}
		System.out.println();
		
		
		// 식별자를 int형으로 설정해보기..
		//HashMap<int, String> map2; //error- <>제네릭은 참조형만 가능
		HashMap<Integer, String> map2= new HashMap<Integer, String>();
		map2.put(0, "aaa");
		map2.put(1, "bbb");
		map2.put(2, "ccc");
		
		for(int i=0; i<map2.size(); i++) {
			String s= map2.get(i);
			System.out.println(s);
		}
		
		

	}

}
