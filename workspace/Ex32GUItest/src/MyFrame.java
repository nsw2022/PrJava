import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
		
	//생성자 메소드
	public MyFrame() {
				
		this.setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn= new JButton();
		add(btn);		
		
		setVisible(true);		
	}
	

}
