package PS_U_up;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.border.MatteBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Font;

public class Register extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = -9007761151483354099L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JLabel lblId;
	private JLabel lblPassword;
	private JLabel lblConfirmPassword;
	private JLabel label_1;

	/**
	 * Create the frame.
	 */
	public Register() {
		super("Register");
		setBackground(Color.GREEN);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 522, 373);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 248, 255));
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(166, 128, 160, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(166, 173, 160, 20);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(166, 218, 160, 20);
		contentPane.add(passwordField_1);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//String id = textField.getText();
				String p1 = new String(passwordField.getPassword());
				String p2 = new String(passwordField_1.getPassword());
				if(p1.equals(p2)){
					HomeScreen homeScreen = new HomeScreen();
					homeScreen.setVisible(true);
					dispose();
				}else{
					JLabel label = new JLabel("The ID entered already exists!!");
					label.setBounds(200, 130, 200, 400);
					label.setVisible(true);
				}
			}
		});
		btnRegister.setBounds(201, 267, 89, 23);
		contentPane.add(btnRegister);
		
		lblId = new JLabel("ID");
		lblId.setBounds(166, 115, 46, 14);
		contentPane.add(lblId);
		
		lblPassword = new JLabel("Password");
		lblPassword.setBounds(166, 159, 60, 14);
		contentPane.add(lblPassword);
		
		lblConfirmPassword = new JLabel("Retype Password");
		lblConfirmPassword.setBounds(166, 204, 100, 14);
		contentPane.add(lblConfirmPassword);
		
		label_1 = new JLabel("PS_U_up Registration");
		label_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		label_1.setBounds(99, 38, 321, 36);
		contentPane.add(label_1);
	}
}

