import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 클라이언트는 서버의 IP주소, port번호를 알아야 접속할 수 있음.
		
		String serverIP="172.30.1.21";
//		serverIP="127.0.0.1";//본인 pc의 주소
//		serverIP="localhost";//본인 pc의 도메인
		
		//클라리언트 작업
		//1. 서버와 연결하는 Socket생성(ip주소,port번호)
		try {
			Socket socket=new Socket(serverIP, 10001);
			System.out.println("서버와 연결이 되었습니다.");
			
			//2. 데이터를 보내기위한 무지개로드(Stream)만들기
			// 해임달(Socket)에게 무지개로드(Stream)를 달라고 요청.
			OutputStream os = socket.getOutputStream();
			//위 바이트스트림으로 작업하기에 좀 짜증. 그래서 좀 쉽게 
			//데이터를 스트림으로 보내기위한 보조문자스트림으로 변환
			PrintWriter writer= new PrintWriter(os);
			
			System.out.println("스트림 연결 성공!!..데이터 전송 가능상태");
			
			//3. 서버로 보낼 데이터를 키보드로 입력받기
			Scanner scanner = new Scanner(System.in);
			
//			//먼저 데이터 1개만 보내기
//			System.out.print("보낼 메세지를 입력하세요");
//			String msg=scanner.nextLine();
//			
//			//4. 입력받은 메세지 msg 를 스트림을 통해서 서버로 보내기
//			writer.println(msg);
//			writer.flush();
//		
			
			// 반복적으로 메세지를 보내고 싶다면..
			while(true) {
				System.out.print("보낼 메세지 입력 : ");
				String msg=scanner.nextLine();
				
				if(msg.equals("quit"))break;
				
				writer.println(msg);
				writer.flush();
			}
			
			writer.close();
			
			System.out.println("메서지 전송이 완료되었습니다.");
			
		} catch (UnknownHostException e) {
			System.out.println("서버주소가 잘못되었습니다.");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("서버와 통신이 불가합니다.");
		}
		
		
	}

}
