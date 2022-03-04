import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Quiz extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quiz frame = new Quiz();
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
	public Quiz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 410, 299);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(39, 11, 307, 225);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BTS Quiz!");
		lblNewLabel.setBounds(113, 28, 59, 30);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("How well do you know BTS?");
		lblNewLabel_1.setBounds(77, 59, 196, 14);
		panel.add(lblNewLabel_1);
		
		JButton btnBTSQuiz = new JButton("Start!");
		btnBTSQuiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBTSQuiz.setBounds(99, 134, 89, 23);
		panel.add(btnBTSQuiz);
		
		JLabel lblNewLabel_2 = new JLabel("\u10E6\u10E6\u10E6\u10E6\u10E6\u10E6\u10E6\u10E6\u10E6\u10E6\u10E6\u10E6\u10E6\u10E6");
		lblNewLabel_2.setBounds(77, 107, 146, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u10E6\u10E6\u10E6\u10E6\u10E6\u10E6\u10E6\u10E6\u10E6\u10E6\u10E6\u10E6\u10E6\u10E6");
		lblNewLabel_3.setBounds(77, 168, 136, 14);
		panel.add(lblNewLabel_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(39, 11, 307, 225);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblJungkook = new JLabel("What is Jungkook's nickname?");
		lblJungkook.setBounds(71, 42, 171, 14);
		panel_1.add(lblJungkook);
		
		JButton btnJungkookF = new JButton("Maknae on top");
		btnJungkookF.setBounds(10, 98, 112, 23);
		panel_1.add(btnJungkookF);
		
		JButton btnJungkookT = new JButton("Golden Maknae");
		btnJungkookT.setBounds(163, 98, 105, 23);
		panel_1.add(btnJungkookT);
		
		JLabel lblJungkookA = new JLabel("Answer");
		lblJungkookA.setBounds(127, 142, 46, 14);
		panel_1.add(lblJungkookA);
		
		JButton btnJungkookNext = new JButton("Next");
		btnJungkookNext.setBounds(103, 167, 89, 23);
		panel_1.add(btnJungkookNext);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(39, 11, 307, 225);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblRM = new JLabel("What position is RM?");
		lblRM.setBounds(105, 26, 146, 14);
		panel_2.add(lblRM);
		
		JButton btnRMF = new JButton("Dancer");
		btnRMF.setBounds(10, 73, 89, 23);
		panel_2.add(btnRMF);
		
		JButton btnRMT = new JButton("Leader");
		btnRMT.setBounds(188, 73, 89, 23);
		panel_2.add(btnRMT);
		
		JLabel lblRMA = new JLabel("Answer");
		lblRMA.setBounds(125, 119, 46, 14);
		panel_2.add(lblRMA);
		
		JButton btnRMNext = new JButton("Next");
		btnRMNext.setBounds(105, 154, 89, 23);
		panel_2.add(btnRMNext);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(39, 11, 307, 225);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblSuga = new JLabel("What is Suga's favourite drink?");
		lblSuga.setBounds(77, 29, 173, 14);
		panel_3.add(lblSuga);
		
		JButton btnSugaF = new JButton("Boba");
		btnSugaF.setBounds(21, 73, 89, 23);
		panel_3.add(btnSugaF);
		
		JButton btnSugaT = new JButton("Iced Americano");
		btnSugaT.setBounds(158, 73, 121, 23);
		panel_3.add(btnSugaT);
		
		JLabel lblSugaA = new JLabel("Answer");
		lblSugaA.setBounds(123, 124, 46, 14);
		panel_3.add(lblSugaA);
		
		JButton btnSugaNext = new JButton("Next");
		btnSugaNext.setBounds(98, 150, 89, 23);
		panel_3.add(btnSugaNext);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(39, 11, 307, 225);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblJimin = new JLabel("What is Jimin's BT21 character name?");
		lblJimin.setBounds(60, 31, 179, 14);
		panel_4.add(lblJimin);
		
		JButton btnJiminF = new JButton("ChimChim");
		btnJiminF.setBounds(10, 93, 89, 23);
		panel_4.add(btnJiminF);
		
		JButton btnJiminT = new JButton("Chimmy");
		btnJiminT.setBounds(208, 93, 89, 23);
		panel_4.add(btnJiminT);
		
		JLabel lblJiminA = new JLabel("Answer");
		lblJiminA.setBounds(133, 146, 46, 14);
		panel_4.add(lblJiminA);
		
		JButton btnJiminNext = new JButton("Next");
		btnJiminNext.setBounds(109, 171, 89, 23);
		panel_4.add(btnJiminNext);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(39, 11, 307, 225);
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblBTS = new JLabel("What electronic brand sponsors BTS?");
		lblBTS.setBounds(60, 33, 203, 14);
		panel_5.add(lblBTS);
		
		JButton btnBTSF = new JButton("Apple Inc.");
		btnBTSF.setBounds(25, 92, 89, 23);
		panel_5.add(btnBTSF);
		
		JButton btnBTST = new JButton("Samsung Electronics");
		btnBTST.setBounds(160, 92, 137, 23);
		panel_5.add(btnBTST);
		
		JLabel lblBTSA = new JLabel("Answer");
		lblBTSA.setBounds(128, 146, 46, 14);
		panel_5.add(lblBTSA);
		
		JButton btnBTSNext = new JButton("Next");
		btnBTSNext.setBounds(109, 171, 89, 23);
		panel_5.add(btnBTSNext);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(39, 11, 307, 225);
		contentPane.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblScore = new JLabel("Number");
		lblScore.setBounds(127, 119, 46, 14);
		panel_6.add(lblScore);
		
		JButton btnScore = new JButton("Score");
		btnScore.setBounds(103, 52, 89, 23);
		panel_6.add(btnScore);
		
		JLabel lblComment = new JLabel("Comment");
		lblComment.setBounds(127, 144, 46, 14);
		panel_6.add(lblComment);
	}
}
