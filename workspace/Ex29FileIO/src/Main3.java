import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 파일 읽고 쓰기를 하나의 예제에..
		// 파일복사프로그램 만들기.. 일종의 해킹..
		
		// 원본파일의 경로와 파일명.확장자를 가진 문자열
		String srcFile= "D:/files/aaa.txt";
		
		// 위 파일을 복제해서..D:copy/bbb.txt. 라는 문서에 저장.하는 프로그램
		
		// 원본파일과 연결되는 무지개로드(Stream)
		try {
			FileInputStream fis= new FileInputStream(srcFile);
			
			//읽어들인 데이터를 저장할 파일의 경로와 파일명 지정
			File path= new File("D:/copy");
			if(!path.isDirectory())	path.mkdirs();
			
			File dstFile=new File(path,"bbb.txt");
			
			//목적지 파일경로와 연결하는 무지개로드 생성
			FileOutputStream fos=new FileOutputStream(dstFile);
			
			//aaa.txt에서 1바이트씩 데이터를 읽어오면서 곧바로..
			//bbb.txt에 1바이트씩 데이터를 저장하기.
			while(true) {
				byte b= (byte)fis.read();
				if(b==-1) break;
				
				//읽어들인 1바이트를 목적지파일에 저장
				fos.write(b);
			}
			
			fos.flush();
			
			//복사 끝났으니 무지개로드 닫기
			fis.close();
			fos.close();
			
			System.out.println("복사 완료되었습니다.");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("복사중에 오류가 발생하였습니다.");
		}
	}

}
