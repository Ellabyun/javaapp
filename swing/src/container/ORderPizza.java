package container;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class ORderPizza extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ORderPizza frame = new ORderPizza();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ORderPizza() {
		setTitle("MyFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 579, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("\uC790\uBC14\uD53C\uC790\uC5D0 \uC624\uC2E0\uAC83\uC744 \uD658\uC601\uD569\uB2C8\uB2E4. \uD53C\uC790\uC758 \uC885\uB958\uB97C \uC120\uD0DD\uD558\uC2DC\uC624");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
	}

}
