import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Set 인터페이스 : 순서 X, index X, 중복데이터 허용 X
		
		//Set<String> set= new Set<String>(); //interface 직접 객체생성불가
		
		//Set인터페이스를 구현한 하위클래스들을 사용 : HashSet, TreeSet, LinkedHashSet
		//1) HashSet : 저장순서 파악하기 어려움. 해시태이블이라는 것에 의해서 순서 결정. Set계열중에서 성능이 가장 좋음.
		//2) TreeSet : 저장한 데이터의 값에 따라 정렬되는 Set. 성능이 약간 떨어짐
		//3) LinkedHashSet : 저장된 순서대로 저장되어 있음. 성능이 가장 안좋음.
		
		HashSet<String> set= new HashSet<String>();
		//TreeSet<String> set= new TreeSet<String>(); //데이터값의 오름차순으로 정렬되어 저장됨.
		//LinkedHashSet<String> set= new LinkedHashSet<String>();
		
		//요소 추가
		set.add( new String("aaa") );
		set.add("bbb");
		set.add("ccc");
		set.add("ddd");
		set.add("ddc");
		set.add("ffc");
		set.add("ggg");
		set.add("eee");
		
		//요소 개수
		System.out.println( set.size() + " : " + set.toString() );
		
		set.add("ddd"); //중복데이터 추가해보기 - 이 데이터는 무시됨.
		System.out.println( set.size() + " : " + set.toString() );
		
		//요소 데이터값 얻어오기
		//set.get(); //이런 기능이 없음. why? 인덱스번호가 없어서..
		
		//요소를 얻어오려면? .. 순차적으로 접근하여 얻어옴
		// 반복문. X
//		for(int i=0; i<set.size(); i++) {
//			String t= set.get(i); //error  -- .get() 이 없음.
//		}
		
		// 방법1. for each문법
		for(String t : set) {
			System.out.println( t +" : " + t.toUpperCase());
		}
		System.out.println();
		
		// 방법2. 반복자를 이용하기 ( iterator )
		Iterator<String> datas= set.iterator();
		while( datas.hasNext() ) { //다음 데이터가 있다면?
			String s= datas.next();
			System.out.println(s +":" + s.length());			
		}
		System.out.println();
		
		// 방법3. 배열로 변환하여 접근하기
		String[] arr= new String[set.size()];
		set.toArray(arr);
		
		System.out.println( arr[0] );
		System.out.println( arr[1] );
		System.out.println( arr[2] );
		//....
		System.out.println( arr[7] );
		
		

	}

}
