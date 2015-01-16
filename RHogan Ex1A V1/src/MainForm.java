import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MainForm extends JFrame {

	private JPanel contentPane;
	private JLabel GrossPayLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainForm frame = new MainForm();
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
	public MainForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Gross Pay:");
		lblNewLabel.setBounds(90, 45, 100, 15);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_btnNewButton_actionPerformed(arg0);
			}
		});
		btnNewButton.setBounds(90, 85, 90, 25);
		contentPane.add(btnNewButton);
		
		GrossPayLabel = new JLabel("");
		GrossPayLabel.setBounds(200, 45, 180, 15);
		contentPane.add(GrossPayLabel);
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent arg0) {
		int hours = 40;
		double grossPay, payRate = 25.0;
		
		grossPay = hours * payRate;
		
		GrossPayLabel.setText("Your Gross Pay Is $" + grossPay);
	}
}
