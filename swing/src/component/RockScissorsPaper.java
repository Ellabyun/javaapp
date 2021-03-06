package component;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RockScissorsPaper extends JFrame implements ActionListener {
	
	private JTextField textField;
	private JButton btnRock, btnScissors, btnPaper;
	
	static final int ROCK = 0;
	static final int PAPER = 1;
	static final int SCISSORS = 2;

	public RockScissorsPaper() {
		setTitle("가위바위보 게임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//현재 contentPane가져오기
		Container contentPane = getContentPane();
		
		//상단 메시지 출력
		JLabel label = new JLabel("아래의 버튼 중에서 하나를 클릭하시오");
		label.setFont(new Font("굴림", Font.BOLD, 18));
		contentPane.add(label,BorderLayout.NORTH); //add(label,BorderLayout.NORTH);
		
		//가운데 이미지 출력
		// JPanel을 CENTER에 부착 => JPanel을 GridLayout 변경 => 버튼 3개 부착
		JPanel panel= new JPanel();
		panel.setLayout(new GridLayout(0,3));
		
		btnRock = new JButton();
		btnRock.setIcon(new ImageIcon(RockScissorsPaper.class.getResource("/component/rock.png")));
		btnRock.setActionCommand("rock");
		btnRock.addActionListener(this);
		panel.add(btnRock);
		
		btnScissors = new JButton();
		btnScissors.setIcon(new ImageIcon(RockScissorsPaper.class.getResource("/component/scissor.png")));
		btnScissors.setActionCommand("scissors");
		btnScissors.addActionListener(this);
		panel.add(btnScissors);
		
		btnPaper = new JButton();
		btnPaper.setIcon(new ImageIcon(RockScissorsPaper.class.getResource("/component/paper.png")));
		btnPaper.setActionCommand("paper");
		btnPaper.addActionListener(this);
		panel.add(btnPaper);
		
		
		contentPane.add(panel,BorderLayout.CENTER);
		

		
		//하단 결과 출력
		textField = new JTextField();
		textField.setFont(new Font("굴림", Font.BOLD, 18));
		contentPane.add(textField,BorderLayout.SOUTH);
		
		
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new RockScissorsPaper();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//게임자가 누른 가위,바위,보 가져오기
		String cmd = e.getActionCommand(); // rock, paper,scissors
		
		//컴퓨터의 가위,바위,보 결정 
		int computer = (int)(Math.random()*3); //0,1,2
		//System.out.println(num);
				
		// 컴퓨터와 게임자 사이에서 누가 이겼는지 출력
		// 게임자가 주먹을 낸 경우
		if(cmd.equals("rock")) {
			if(computer==ROCK) {
				textField.setText("비겼음. 다시 가위바위보");
			}else if(computer==SCISSORS) {
				textField.setText("내가 이겼음");
			}else {
				textField.setText("컴퓨터가 이겼음");
			}
		}else if(cmd.equals("paper")) {//게임자가 가위를 낸 경우
			if(computer==ROCK) {
				textField.setText("내가 이겼음");
			}else if(computer==SCISSORS) {
				textField.setText("컴퓨터가 이겼음");
			}else {
				textField.setText("비겼음. 다시 가위바위보");
			}
		}else {//게임자가 보자기를 낸 경우

			if(computer==ROCK) {
				textField.setText("컴퓨터가 이겼음");
			}else if(computer==SCISSORS) {
				textField.setText("비겼음. 다시 가위바위보");
			}else {
				textField.setText("내가 이겼음");
			}
		}

	}

}
