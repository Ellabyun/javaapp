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
		setTitle("���������� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//���� contentPane��������
		Container contentPane = getContentPane();
		
		//��� �޽��� ���
		JLabel label = new JLabel("�Ʒ��� ��ư �߿��� �ϳ��� Ŭ���Ͻÿ�");
		label.setFont(new Font("����", Font.BOLD, 18));
		contentPane.add(label,BorderLayout.NORTH); //add(label,BorderLayout.NORTH);
		
		//��� �̹��� ���
		// JPanel�� CENTER�� ���� => JPanel�� GridLayout ���� => ��ư 3�� ����
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
		

		
		//�ϴ� ��� ���
		textField = new JTextField();
		textField.setFont(new Font("����", Font.BOLD, 18));
		contentPane.add(textField,BorderLayout.SOUTH);
		
		
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new RockScissorsPaper();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//�����ڰ� ���� ����,����,�� ��������
		String cmd = e.getActionCommand(); // rock, paper,scissors
		
		//��ǻ���� ����,����,�� ���� 
		int computer = (int)(Math.random()*3); //0,1,2
		//System.out.println(num);
				
		// ��ǻ�Ϳ� ������ ���̿��� ���� �̰���� ���
		// �����ڰ� �ָ��� �� ���
		if(cmd.equals("rock")) {
			if(computer==ROCK) {
				textField.setText("�����. �ٽ� ����������");
			}else if(computer==SCISSORS) {
				textField.setText("���� �̰���");
			}else {
				textField.setText("��ǻ�Ͱ� �̰���");
			}
		}else if(cmd.equals("paper")) {//�����ڰ� ������ �� ���
			if(computer==ROCK) {
				textField.setText("���� �̰���");
			}else if(computer==SCISSORS) {
				textField.setText("��ǻ�Ͱ� �̰���");
			}else {
				textField.setText("�����. �ٽ� ����������");
			}
		}else {//�����ڰ� ���ڱ⸦ �� ���

			if(computer==ROCK) {
				textField.setText("��ǻ�Ͱ� �̰���");
			}else if(computer==SCISSORS) {
				textField.setText("�����. �ٽ� ����������");
			}else {
				textField.setText("���� �̰���");
			}
		}

	}

}
