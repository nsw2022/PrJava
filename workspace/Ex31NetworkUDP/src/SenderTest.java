import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SenderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// UDP : User Datagram Protocol - 마치 편지보내기와 비슷한 방식
		
		
		
				try {
					//1. 우편보낼 우체통 만들기
					DatagramSocket socket = new DatagramSocket();
					
					// 보낼데이터
					Scanner scanner= new Scanner(System.in);
					System.out.print("보낼 메세지 : ");
					String msg=scanner.nextLine();
					
					//2. 데이터(msg)를 우편으로 보내기 위해 우편상자(DatagramPaket)에 동봉, 그 상자에 받는사람 주소(ip, port)를 작성
					InetAddress addr=InetAddress.getByName("127.0.0.01");
					DatagramPacket packet=new DatagramPacket(msg.getBytes(), msg.getBytes().length, addr, 10002);//포트번호 10002
					
					//3. 우체퐅에 우편박스 보내기..
					socket.send(packet);
					
					System.out.println("전송완료!!");
					
					
					
					
				} catch (SocketException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (UnknownHostException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
			
		
		
		
	}

}
