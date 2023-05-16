import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 사용자로부터 키보드로 데이터를 입력받아 File에 저장하는 프로그램
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("저장할 데이터 입력 : ");
		//파일에 저장할 데이터
		String data=scan.next();
		
		//데이터를 저장할 파일의 경로와 파일명.확장자까지 관리해주는 객체 생성
		//File 클래스 : 파일에 대한 정보를 관리하는 클래스
		//저장 경로를 지정하지 않으면 기본적으로 이 자바문서가 있는 프로젝트폴더에 저장됨.
		File file=new File("aaa.txt");
		
		//############파일 경로를 추가해보기 #######################
		
		// 'kkk'라는 이름의 폴더 안에 aaa.txt 문서 만들고 저장.
		// 경로구분자로 역슬래시(\)와 슬래시(/)가 존재함
		// windows운영체제에서는 역슬래시와 슬래시 모두 가능함.
		//linux, max OS에서는 슬래시만 가능함.
		file = new File("kkk\\aaa.txt");
		file = new File("kkk/aaa.txt");//대부분 이방식을 선호.
		
		// 파일은 자동으로 생성되지만 폴더(디렉토리)는 자동으로 만들지 않음.
		// 즉, kkk라는 폴더가 없으면 에러남.
		
		// 폴더를 프로그래밍을 통해 만들어 달라고 요청.
		// 우선 폴더 경로만 가지는 File객체 생성
		File path = new File("kkk");
		if( !path.isDirectory()) {// 그 폴더가 없는가?
			path.mkdirs(); //하위폴더가 있다면 모두 만들어 주는 기능
			
		}
		
		//위에서 만든 경로와 파일명을 연결하여 최종 File객체 생성
		file = new File(path, "aaa.txt");//"kkk/aaa.txt"		
		
		//내 프로젝트가 아니라 특정 폴더위치도 가능함.
		file = new File("D:/aaa.txt");
		
		//경로까지 한번에.
		path = new File("D:/files/kkk");
		if(!path.isDirectory()) {
			path.mkdirs();
}
		file=new File(path,"hello.txt");
		
		////##################################################
		
		
		//파일객체에 지정된 파일에(aaa.txt) 데이터를 보내기위해 무지개로드(Stream) 생성
		//Stream 중에서 내보내는 방향의 OutputStream 를 사용
		
		//그 중에서도 파일에 내보내는 능력을 가진 FileOutputStream클래스를 객체로 생성하여 사용
		//FileOutputStream은 예외처리가 필수임.
		
		try {
			//만약 aaa.txt.문서가 없다면 자동 생성시킴. 단, 폴더는 자동으로 생성되지 않음.
			//FileOutputStream fos=new FileOutputStream(file);
			//그냥 FileOutputStream을 만들면 덮어쓰기가 됨. 혹시 이어붙이기를 하고 싶다면. 두번째 파라미터에 true 값 지정
			FileOutputStream fos=new FileOutputStream(file,true);//두번째 파라미터 : append여부 [true/false]
			
			//무지개로드(Stream)를 통해 데이터를 파일에 보내기.(파일안에 데이터를 작성)
			//fos.write(65);//데이터를 유니코드값으로 보내기. - 'A'
			
			//보낼 문자열데이터(data)를 byte[]로 변환하여 전송하기
			//String객체의 데이터를 byte[]로 변환하는 기능이 이미 존재함
			byte[] bytes=data.getBytes();
			fos.write(bytes);//보낼 데이터를 한방에 모두 보내기
			fos.flush();
			
			//무지개로드의 작업이 끝나면 반드시 닫아줄 것을 권장
			fos.close();
			
			System.out.println("파일 저장 성공!");
			
		}catch(FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		}catch(IOException e) {
			System.out.println("쓰기작업 중 오류가 발생했습니다.");
		}
		
		
		
		
		
	}

}
