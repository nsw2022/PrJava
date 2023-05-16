import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 기존 바이트 스트림은 [ InputStream, OutputStream ]
		// 문자열데이터를 한줄씩 또는 한단어씩 읽어드링기에 적합하지않음
		// 몇 바이트를 읽어야 할지 예측할 수 없어서..
		// 그래서 좀더 편하게 문자열단위로 데이터의 I/O을 수행하기 위해
		// 문자 스트림 방식을 사용 [ Reader, Writer ]
		
		// 사용자로부터 키보드로 문자열을 입력받아 그 데이터를 파일에 지속적으로 저장하는 프로그램.
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("저장할 단어를 입력(no를 입력하면 종료) : ");
			String str=scan.next();
			
			//자바에서는 문자열은 절대로 == 비교하지 않음!!
			if(str.equalsIgnoreCase("no")) {
				System.out.println("입력이 종료됩니다.");
				break;
			}
			
			//입력된 문자열을 저장하기 위해 File객체 생성
			//목표위치 : "본인프로젝트폴더/files/data.txt"
			File path=new File("files");//폴더명만
			if( !path.exists() ) path.mkdirs();
			
			// 경로 + 파일명.확장자
			File file=new File(path, "data.txt");
			
			// 파일과 연결하는 무지개로드[ 문자 스트림 ]
			// 내 데이터를 파일쪽으로 내보내기 위한 스트림[ OutputStream --> Writer ]
			// 자바문서에서 data.txt파일 사이의 무지개로드 [ FileWriter ]객체 생성
			
			try {
				FileWriter fr= new FileWriter(file, true);//append모드 : true
//				fr.write(str); //저장은 되지만.. 단어구분이나.. 특정 포멧으로 저장하기 것이 까다로움.
//				fr.flush();
//				fr.close();
				
				//FileWriter를 바로 사용하기 보다는 좀더 편하게 사용할 수 있는 기능을 가진
				//보조 스트림을 사용해보기..[ PriteWriter ]
				//PriteWriter : 마치..콘솔창에 데이터 출력하듯이.. 즉,  System.out.println()쓰듯이
				PrintWriter writer=new PrintWriter(fr);
				writer.println(str);
				writer.flush();
				
				writer.close();//보조스트림을 닫으면 주 스트림도 같이 닫힘.
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("파일 쓰기 작업중에 오류발생");
			}
			
			
		}//while..
		
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println("저장된 파일의 데이터들을 화면에 출력합니다");
		System.out.println("--------------------------------");
		System.out.println();
		
		//파일에 저장된 단어들을 하나씩 읽어들여서 보관..
		ArrayList<String> datas=new ArrayList<String>();
		
		//읽어올 파일의 경로 객체 생성
		File file = new File("files/data.txt");
		
		//읽어올 파일과 연결하는 무지개로드(InputStream --> Reader )
		try {
			FileReader fr= new FileReader(file);
			
			//int a=fr.read();//한글자씩 읽어들임. 영어 1바이트, 한글 2~3바이트가 읽어짐.
			//결국 여러그라 읽으려면 반복문도 써야하고.. 한단어가 몇글자인지 
			//알기 어려움..
			
			//그래서 fileReader를 그냥 쓰지않고 좀 더 편하게 사용할 수 있는 
			//보조 스트림 사용[ BufferedReader ]
			
			BufferedReader reader=new BufferedReader(fr);
			//한줄 단위로 문자열 읽어오기
			String line=reader.readLine();
			while( line !=null ) {
				//읽어온 데이터(한단어)를 ArrayList에 추가
				datas.add(line);
				
				line=reader.readLine();//다음 줄 읽기
				
			}
			
			System.out.println("파일 읽기 종료!!");
			
			//ArrayList에 보관되어 있는 String 데이터들을 하나씩 순차적으로
			//콘솔창에 출력해보기
//			for(int i=0;i<datas.size();i++) {
//				String t=datas.get(i);
//				
//				System.out.println(i + " : "+ t);
//			}
			
			//for each문
			for( String t : datas) {
				System.out.println(t);
			}
			
			
			
			
			//읽어오는 작업이 끝났으나.. 스트림 닫기
			reader.close();
			fr.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("문서가 존재하지 않습니다.");
		} catch (IOException e) {
			System.out.println("읽기작업중 오류가 발생했습니다.");
		}
		
	}//main method..

}//Main4 class..
