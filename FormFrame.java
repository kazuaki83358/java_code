import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormFrame extends JFrame {

	private JPanel contentPane;
	private final JLabel lblNewLabel = new JLabel("First Name");
	private JTextField tfFirstName;
	private JLabel lblNewLabel_1;
	private final JTextField tfLastName = new JTextField();
	private JLabel lbThankYou;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormFrame frame = new FormFrame();
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
	public FormFrame() {
		setTitle("Welcome");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 629, 454);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblNewLabel.setBounds(10, 10, 542, 21);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblNewLabel);
		
		tfFirstName = new JTextField();
		tfFirstName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfFirstName.setBounds(10, 41, 542, 34);
		contentPane.add(tfFirstName);
		tfFirstName.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Last Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(10, 94, 542, 21);
		contentPane.add(lblNewLabel_1);
		tfLastName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfLastName.setBounds(10, 125, 542, 34);
		contentPane.add(tfLastName);
		tfLastName.setColumns(10);
		
		lbThankYou = new JLabel("");
		lbThankYou.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbThankYou.setBounds(10, 225, 542, 25);
		contentPane.add(lbThankYou);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String firstName = tfFirstName.getText();
				String lastName = tfLastName.getText();
				if(firstName.isEmpty()||lastName.isEmpty()) {
					lbThankYou.setText("please complete the form then click submit");
				}else {
					lbThankYou.setText("Thank you "+firstName+" "+lastName);
				}
			
			}
		});
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSubmit.setBounds(10, 312, 169, 45);
		contentPane.add(btnSubmit);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfFirstName.setText("");
				tfLastName.setText("");
				lbThankYou.setText("Form is Cleared");
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnClear.setBounds(419, 312, 169, 45);
		contentPane.add(btnClear);
	}
}
