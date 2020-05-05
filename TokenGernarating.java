import java.awt.BorderLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.EventQueue;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class TokenGernarating extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
 static int count =0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TokenGernarating frame = new TokenGernarating();
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
	public TokenGernarating() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 804, 588);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCurrentDate = new JLabel("current date");
		lblCurrentDate.setBounds(512, 121, 94, 16);
		contentPane.add(lblCurrentDate);
		
		textField = new JTextField();
		textField.setBounds(638, 118, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		this.textField.setText(formatter.format(date));
		
		
		
		JLabel lblTokenGeneration = new JLabel("token generation");
		lblTokenGeneration.setBounds(50, 268, 116, 16);
		contentPane.add(lblTokenGeneration);
		
		textField_1 = new JTextField();
		textField_1.setBounds(225, 265, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPhoneNumber = new JLabel("phone number");
		lblPhoneNumber.setBounds(50, 330, 101, 16);
		contentPane.add(lblPhoneNumber);
		
		textField_2 = new JTextField();
		textField_2.setBounds(225, 327, 116, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnSend = new JButton("send");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				/*SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
				Date currentdate = new Date();
				formatter.format(currentdate);
				if(date.equals(currentdate))
				*/
					count++;
					String mystring=Integer.toString(count);
					textField_1.setText(mystring);
				
				
				
			}
		});
		btnSend.setBounds(136, 429, 97, 25);
		contentPane.add(btnSend);
	}
}
