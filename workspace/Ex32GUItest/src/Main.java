import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// GUI (Graphic User Interface)
		
		// swing 패키지의 클래스들을 이용하여 제작
		
		//1. 최상위 컨테이너 생성
		JFrame frame= new JFrame();
		frame.setSize(500, 400);
		frame.setTitle("Swing GUI");
		
		// 기본적으로 JFrame은 BorderLayout이라는 배치관리자가 설정되어 있음.
		// 가장 간단한 구조의 배치방식인 FlowLayout으로 변경
		frame.setLayout( new FlowLayout() );
		
		// 2. 컴포넌트들 생성하기
		JButton btn= new JButton("Button");
		JButton btn2= new JButton("버튼");		
		
		// 3. 컴포넌트를 JFrame에 추가하기
		frame.add(btn);
		frame.add(btn2);
		
		
		// JLabel - 글씨를 보여주는 용도의 컴포넌트
		JLabel label= new JLabel("This is Label");
		frame.add(label);		
		
		// JTextField - 사용자로부터 글씨를 입력받는 컴포넌트
		JTextField tf= new JTextField(20); // 20글자 사이즈 .. 이상이면..자동 스크롤됨.
		frame.add(tf);
		
		// 이미지 - 이미지용 컴포넌트 없음.
		// 대신 JLabel 컴포넌트에 글씨 말고 아이콘도 보여줄 수 있는 능력이 있음.
		// 보통 아이콘은 이미지임. 그래서 JLabel의 아이콘 설정을 통해 이미지를 보여줌
		
		// 이미지 아이콘객체 생성
		ImageIcon icon= new ImageIcon("resource/ms16.png");
		
		//기본적으로는 이미지의 원본사이즈 크기로 만들어짐.
		//원하는 사이즈로 리사이징..
		Image im= icon.getImage();
		//사이즈를 조절한 새로운 Image객체를 리턴해줌.
		Image im2= im.getScaledInstance(280, 280, Image.SCALE_SMOOTH);
		//조절된 사이즈의 Image로 ImageIcon객체를 새로 생성
		ImageIcon icon2= new ImageIcon(im2);		
		
		// 아이콘을 JLabel의 아이콘으로 설정
		JLabel imgLabel= new JLabel();
		//imgLabel.setIcon(icon);
		imgLabel.setIcon(icon2);
		
		frame.add(imgLabel);		
		
		// JFrame의 X 버튼을 눌렀을때 프레임을 사라지지만 프로그램이 종료되지 않음
		// 만약. X 버튼을 눌렀을때 프로그램도 같이 종료하고 싶다면.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		// 컨테이너가 화면에 보여지도록 설정
		frame.setVisible(true);

	}

}
