import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 파일 데이터 읽어보기 - 바이트스트림으로 읽기
		
		// 읽어올 파일의 경로와 파일명 정보를 가진 File객체 생성
		File file=new File("aaa.txt");
		
		//파일과 연결하는 무지개로드(Stream)
		//데이터를 읽어오는 방향의 InputStream 사용
		try {
			//만약 aaa.txt가 없으면 에러!
			FileInputStream fis=new FileInputStream(file);
		
//			//파일에서 데이터를 읽어오기
//			byte b = (byte)fis.read();//1바이트 읽어옴
//			//위 read() 작업을 더이상 읽을값이 없을때 까지 반복
//			while(b != -1) {
//				//System.out.println(b); //문자의 아스키값
//				System.out.print((char)b);
//				
//				b= (byte)fis.read();//다음 1바이트 읽어옴
//			}
//			System.out.println();
			
			//위 방식은 1바이트씩만 값을 읽어들이기에 영문자가 아니면
			//글씨가 깨져서 읽어짐.
			
			//그래서 byte를 덩어리 배열로 한방에 읽어들이고
			//그 byte[]을 String문자열로 변환하여 사용하는 것이 일반적임
			byte[] bytes=new byte[1024]; //글씨가 저장된 빈상자..[1kb]
			fis.read(bytes);//읽어들인 바이트값들을 bytes배열안에 넣어줌.
			
			//읽어들인 데이터를 가진 bytes배열을 String문자열로 변환
			String s = new String(bytes);
			System.out.println(s);
			
			System.out.println("파일로드가 종료되었습니다.");
			
			//작업이 끝났으면..무지개로드 닫기
			
			fis.close();
			
		}catch(FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		}catch(IOException e) {
			System.out.println("읽기작업 중 오류 발생");
		}
		
		
	}

}
