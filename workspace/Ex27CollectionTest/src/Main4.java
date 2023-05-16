import java.util.ArrayList;
import java.util.Collections;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Collections 클래스의 static 기능 메소드
		// 1) Collections.sort()
		// 2) Collections.shuffle()
		
		ArrayList<String> datas= new ArrayList<String>();
		
		datas.add("Nice");
		datas.add("World");
		datas.add("Hello");
		datas.add("Android");
		datas.add("hello");
		datas.add("good");
		datas.add("bad");
		
		System.out.println( datas.toString() );
		
		Collections.sort(datas); //리스트객체의 요소들을 오름차순 정렬
		System.out.println( datas.toString() );
		
		
		Collections.shuffle(datas); //요소의 위치를 마구잡이로 섞기.
		System.out.println( datas.toString() );
		

	}

}
