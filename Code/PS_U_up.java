package PS_U_up;
import java.awt.Color;
//import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class PS_U_up extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3445760518806943813L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PS_U_up frame = new PS_U_up();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public PS_U_up() {
		super("Welcome");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 522, 373);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(166, 128, 160, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblWelcomeToPsuup = new JLabel("Welcome to PS_U_up?");
		lblWelcomeToPsuup.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		lblWelcomeToPsuup.setBounds(96, 39, 338, 36);
		contentPane.add(lblWelcomeToPsuup);
		
		//log in button
		JButton logInButton = new JButton("Log In");
		logInButton.addActionListener(new ActionListener() {
			//logs the user in, opens home screen and disposes of current page
			public void actionPerformed(ActionEvent e) {
				//String id = new String(textField.getText());
				//String p1 = new String(passwordField.getPassword());
				HomeScreen homeScreen = new HomeScreen();
				homeScreen.setVisible(true);
				//add chatter to tree
				/*if(!homeScreen.verifyId(id, p1)){
					homeScreen.setVisible(true);
					dispose();
				}else{
					JLabel label = new JLabel("The ID entered already exists!!");
					label.setBounds(200, 130, 200, 400);
					label.setVisible(true);
				}*/
				dispose();
			}
		});
		logInButton.setBounds(201, 218, 89, 23);
		contentPane.add(logInButton);
		
		//register button
		JButton registerButton = new JButton("Register");
		registerButton.addActionListener(new ActionListener() {
			//opens the register page and disposes of current page
			public void actionPerformed(ActionEvent e) {
				Register regPage = new Register();
				regPage.setVisible(true);
				dispose();
			}
		});
		registerButton.setBounds(201, 252, 89, 23);
		contentPane.add(registerButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(166, 173, 160, 20);
		contentPane.add(passwordField);
		
		//id title
		JLabel idLabel = new JLabel("ID");
		idLabel.setBounds(166, 114, 46, 14);
		contentPane.add(idLabel);
		
		//password title
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(166, 159, 46, 14);
		contentPane.add(passwordLabel);
	}

}
