package layout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;

/* FlowLayout : 컴포넌트를 왼쪽에서 오른쪽으로 배치
 * 				오른쪽 공간이 없으면 아래로 내려감
 */

public class FlowLayoutTest1 extends JFrame{
	
	public FlowLayoutTest1() {
		setTitle("BoarderLayout 테스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 기본 레이아웃 BorderLayout
		// 레이아웃 변경
		
		// setLayout(new FlowLayout())
	
		// 현재 프레임의 contentPane 가져오기
//		Container container = getContentPane();
//		//contentPane에 새로운 레이아웃 설정
//		container.setLayout(new FlowLayout());
		
		JPanel panel = new JPanel();//기본레이아웃 FlowLayout
		//panel.setLayout(mgr);
		setContentPane(panel);
		
		JButton btn1 = new JButton("버튼1");
		add(btn1);
		
		
		JButton btn2 = new JButton("버튼2");
		add(btn2);
		
		
		JButton btn3 = new JButton("버튼3");
		add(btn3);
		
		JButton btn4 = new JButton("버튼4");
		add(btn4);
		
		JButton btn5 = new JButton("버튼5");
		add(btn5);
		
		setSize(300,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		FlowLayoutTest1 f = new FlowLayoutTest1();

	}

}
