package layout;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;

/* 상,하,좌,우,가운데
 * BorderLayout.EAST
 * BorderLayout.WEST
 * BorderLayout.CENTER
 * BorderLayout.SOUTH
 * BorderLayout.NORTH
 */

public class BorderLayoutTest1 extends JFrame{
	
	public BorderLayoutTest1() {
		setTitle("BoarderLayout 테스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 기본 레이아웃 BorderLayout
		
		JButton btn1 = new JButton("버튼1");
		add(btn1,BorderLayout.EAST);
		
		
		JButton btn2 = new JButton("버튼2");
		add(btn2,BorderLayout.WEST);
		
		
		JButton btn3 = new JButton("버튼3");
		add(btn3,BorderLayout.CENTER);
		
		JButton btn4 = new JButton("버튼4");
		add(btn4,BorderLayout.SOUTH);
		
		JButton btn5 = new JButton("버튼5");
		add(btn5,BorderLayout.NORTH);
		
		setSize(300,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		BorderLayoutTest1 f = new BorderLayoutTest1();

	}

}
