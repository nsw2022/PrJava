import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame2 extends JFrame{	
	
	//멤버변수
	JLabel label;  //참조변수
	JButton btn;
	
	JLabel imgLabel;
	JButton btn2;
	
	// 그림이미지의 경로를 가진 문자열배열
	String[] imgs= new String[]{
			"resource/ms_01.png",
			"resource/ms_02.png",
			"resource/ms_03.png",
			"resource/ms_04.png",
			"resource/ms_05.png"
	};
	
	//그림 경로 인덱스번호
	int index=0;
	
	//생성자
	public MyFrame2() {
		
		this.setSize(400, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Button Click Event");
		setLocation(800, 100);
		
		// 간단하게 옆으로 배치해주는 배치관리자 설정
		setLayout( new FlowLayout() );
		
		// 버튼을 클릭하여 Label의 글씨를 변경하는 코드
		//JLabel label= new JLabel();
		// 컴포넌트들의 참조변수는 가급적 멤버변수로 만들것을 권장.
		label= new JLabel("Hello world");
		btn= new JButton("button");
		
		// JFrame에 컴포넌트들 추가
		add(btn);
		add(label);		
		
		// 버튼(btn)을 클릭했을때 JLabel(label)의 글씨 변경
		
		// 버튼의 클릭이벤트를 듣는 리스너객체 생성
		//ActionListener listener= new ActionListener(); //error - why? ActionListener는 인터페이스임. 
		//인터페이스는 곧바로 객체 생성이 불가능
		//인터페이스는 추상메소드를 보유하고 있기에 반드시 그 메소드를 구현해야만 함.
		//그래서 인터페이스를 구현하는 별도의 class를 새로 설계하여 사용해야 함.	
//		ClickListener listener= new ClickListener();
//		//리스너를 버튼에 액션을 듣는 녀석으로 추가.
//		btn.addActionListener(listener);
		
		// 별도의 클래스(ClickListener)를 만드는 것이 번거로움
		// 객체를 생성하면서 이름없는 클래스(익명클래스)를 만들어 추상메소드를 곧바로 구현하는 방식선호
		ActionListener listener= new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				label.setText("Good job!");
			}
		};
		
		btn.addActionListener(listener);
		
		
		// 버튼 클릭시에 이미지를 변경해보기
		ImageIcon icon= new ImageIcon("resource/ms16.png");
		// 이미지 리사이징
		Image im= icon.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
		icon= new ImageIcon(im);
		
		imgLabel= new JLabel();
		imgLabel.setIcon(icon);
		
		add(imgLabel);
		
		btn2= new JButton("change image");
		add(btn2);
				
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
//				index++;
//				if(index>4) index=0;
				
				//랜덤값 만들어주는 능력가진 객체
				Random rnd=new Random();
				index=rnd.nextInt(5);// 0~4
				
				// imgLabel의 이미지를 변경
				ImageIcon icon= new ImageIcon( imgs[index] );
				Image im= icon.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
				icon= new ImageIcon(im);
				
				imgLabel.setIcon(icon);
			}
			
		});
		
		
		
		setVisible(true);
		
	}//생성자
	
	// inner class - 장점 : 아웃터클래스의 멤버를 내것인양 사용가능
	// ActionListener인터페이스를 구현하는 클래스
	class ClickListener implements ActionListener{

		//이 리스너가 감시하는 버튼이 클릭되면 이 메소드가 자동으로 발동..
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			label.setText("Nice to meet you.");
		}		
	}

}//MyFrame class..
