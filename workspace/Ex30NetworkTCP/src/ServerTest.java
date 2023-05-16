import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class ServerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 통신을 하려면 일단 서버IP주소는 알아야 함.
		
		// 자바에서 IP주소에 관련된 정보를 가지고 있는 클래스 : InetAddress
		// 본인의 IP주소를 확인하는 방법
		
		try {
			System.out.println( InetAddress.getLocalHost().getHostAddress()    );
			System.out.println( InetAddress.getLoopbackAddress().toString()   );
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//////////////////////////////////////////////////////////////////////////////////////
		
		//통신을 하려면 알아야할 2가지 용어
		//1. IP주소 - 그 컴퓨터의 고유한 주소(숫자): 42억개..
		//2. port번호 - 그 컴퓨터안에서의 프로그램 분류번호(65천개) : 0~1024까지는 사용하지 않는 것을 권장.(잘 알려진 포트번호)
		//EX) - 부산항(IP주소), 3번항구(port번호) 
		
		// 서버용 프로그램
		//1. 서버소켓을 만들어 내는 작업
		
		try {
			ServerSocket serversocket = new ServerSocket(10001);//port번호
			System.out.println("서버소켓이 생성되었습니다.");
			
			//2. 클라이언트 접속 기다리기..
			System.out.println("클라이언트의 접속을 기다립니다...");
			Socket socket= serversocket.accept(); //여기서 접속할때까지 커서가 대기함
			System.out.println("클라이언트가 접속하셨습니다.");
			
			//3. 데이터를 입력받는 스트림 만들기.
			// 해임달(Socket)에게 무지개로드(Stream) 달라고 요청
			InputStream is=socket.getInputStream();//바이트스트림
			InputStreamReader isr=new InputStreamReader(is);//바이트->문자
			BufferedReader reader=new BufferedReader(isr);//문자->보조스트림
			
			//클라이언트가 보낸 메세지를 한줄씩 읽어들이기
//			String msg=reader.readLine();
//			System.out.println("받은 데이터 : "+msg);
			
			// 반복적으로 입력을 받고 싶다면..
			while(true) {
				String msg=reader.readLine();//클라이언트가 데이터를 보내면 한줄 읽어오기.. 여기서 클라리언트가 데이터를 보낼때까지 대기..
				if(msg==null)break;//클라리언트가 Stream 을 닫으면 msg에 null이 전달됨
				System.out.println("받은 메세지 : "+msg);
				
			}
			
			reader.close();
			
			System.out.println("서버 통신 종료");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
