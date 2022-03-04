import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BobaShop extends JFrame {

	private JPanel contentPane;
	private JTextField txtBlackSugar;
	private JTextField txtCoffeeMilk;
	private JTextField txtMatchaMilk;
	private JTextField txtTabascoBubble;
	private JTextField txtDripMilkTea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BobaShop frame = new BobaShop();
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
	public BobaShop() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 414, 239);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Chuuyarx's Anime Boba Shop!");
		lblNewLabel.setBounds(122, 11, 163, 30);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("      \u2615\u2615\u2615\u2615\u2615\u2615");
		lblNewLabel_1.setBounds(150, 35, 91, 30);
		panel.add(lblNewLabel_1);
		
		JLabel lblNanamin = new JLabel("Nanamin's Black Sugar Milk Tea");
		lblNanamin.setBounds(10, 76, 147, 14);
		panel.add(lblNanamin);
		
		JLabel lblSakusa = new JLabel("Sakusa Supremacy Coffee Milk w/Boba");
		lblSakusa.setBounds(10, 101, 188, 14);
		panel.add(lblSakusa);
		
		JLabel lblMegumi = new JLabel("Megumi's Eyelashes Matcha Milk Tea w/Boba");
		lblMegumi.setBounds(10, 126, 219, 14);
		panel.add(lblMegumi);
		
		JLabel lblBakugou = new JLabel("Bakugou Tabasco Bubble Tea");
		lblBakugou.setBounds(10, 151, 157, 14);
		panel.add(lblBakugou);
		
		JLabel lblJinwoo = new JLabel("Jin \"Drip\" woo Milk Tea");
		lblJinwoo.setBounds(10, 176, 111, 14);
		panel.add(lblJinwoo);
		
		txtBlackSugar = new JTextField();
		txtBlackSugar.setText("0");
		txtBlackSugar.setBounds(162, 73, 46, 20);
		panel.add(txtBlackSugar);
		txtBlackSugar.setColumns(10);
		
		txtCoffeeMilk = new JTextField();
		txtCoffeeMilk.setText("0");
		txtCoffeeMilk.setBounds(201, 98, 46, 20);
		panel.add(txtCoffeeMilk);
		txtCoffeeMilk.setColumns(10);
		
		txtMatchaMilk = new JTextField();
		txtMatchaMilk.setText("0");
		txtMatchaMilk.setBounds(225, 123, 46, 20);
		panel.add(txtMatchaMilk);
		txtMatchaMilk.setColumns(10);
		
		txtTabascoBubble = new JTextField();
		txtTabascoBubble.setText("0");
		txtTabascoBubble.setBounds(162, 148, 46, 20);
		panel.add(txtTabascoBubble);
		txtTabascoBubble.setColumns(10);
		
		txtDripMilkTea = new JTextField();
		txtDripMilkTea.setText("0");
		txtDripMilkTea.setBounds(122, 173, 46, 20);
		panel.add(txtDripMilkTea);
		txtDripMilkTea.setColumns(10);
		
		
		
		JLabel lblNewLabel_7 = new JLabel("Scam dollars (13%)");
		lblNewLabel_7.setBounds(293, 101, 100, 14);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("All Drinks $6.99");
		lblNewLabel_8.setBounds(23, 43, 98, 14);
		panel.add(lblNewLabel_8);
		
		JLabel lblTax = new JLabel("$0.00");
		lblTax.setBounds(314, 123, 79, 14);
		panel.add(lblTax);
		
		JLabel lblNewLabel_10 = new JLabel("Subto\"ga\"tal");
		lblNewLabel_10.setBounds(304, 151, 100, 14);
		panel.add(lblNewLabel_10);
		
		JLabel lblsubtotal = new JLabel("$0.00");
		lblsubtotal.setBounds(314, 173, 79, 14);
		panel.add(lblsubtotal);
		
		JLabel lblNewLabel_12 = new JLabel("Total \"simp\" Drinks");
		lblNewLabel_12.setBounds(293, 193, 111, 14);
		panel.add(lblNewLabel_12);
		
		JLabel lblTotal = new JLabel("$0.00");
		lblTotal.setBounds(314, 218, 79, 14);
		panel.add(lblTotal);
		
		JButton btnAddDrinks = new JButton("Add \"simp\" Drinks");
		btnAddDrinks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final double priceNanamin = 6.99;
				final double priceSakusa = 6.99;
				final double priceMegumi = 6.99;
				final double priceBakugou = 6.99;
				final double priceJinwoo = 6.99;
				final double TAX = .13;
				double subtotal;
				double tax;
				double total;
				int qtyNanamin, qtySakusa, qtyMegumi, qtyBakugou, qtyJinwoo;
				qtyNanamin = Integer.parseInt(txtBlackSugar.getText());
				qtySakusa = Integer.parseInt(txtCoffeeMilk.getText());
				qtyMegumi = Integer.parseInt(txtMatchaMilk.getText());
				qtyBakugou = Integer.parseInt(txtTabascoBubble.getText());
				qtyJinwoo = Integer.parseInt(txtDripMilkTea.getText());
				subtotal = (qtyNanamin * priceNanamin) + (qtySakusa * priceSakusa) + (qtyMegumi * priceMegumi) + (qtyBakugou * priceBakugou) + (qtyJinwoo * priceJinwoo);
				lblsubtotal.setText(String.valueOf(subtotal));
				tax = (subtotal * TAX);
				lblTax.setText(String.valueOf(tax));
				total = (subtotal + TAX);
				lblTotal.setText(String.valueOf(total));
				
				
				
			}
		});
		btnAddDrinks.setBounds(283, 72, 121, 23);
		panel.add(btnAddDrinks);
	}
}
