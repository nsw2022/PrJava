import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			//1. DatagramPacket을 받은 우체통 객체 생성
			DatagramSocket socket = new DatagramSocket(10002);//port 번호
			
			//2. 받은 우편물의 내용(데이터)를 담을 수 있는 빈 박스(DatagramPacket)를 준비하기 - 알비백
			byte[] buf=new byte[1024];//1024칸 짜리.. 빈배열.. 1KB사이즈
			DatagramPacket packet =new DatagramPacket(buf, buf.length);			
			
			//3.  우편물 오기를 기다리기.
			System.out.println("메세지를 기다립니다.");
			socket.receive(packet);//메세지를 받아서 packet안에 buf배열에 넣어줌. 메세지를 받을때까지 스레드는 여기서 대기하고 있음.\
			
			//4. 받은 데이터 배열을 문자열로 변환
			String msg=new String(buf);
			System.out.println("받은 메세지 : " + msg);
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	}
}
