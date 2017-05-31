package PS_U_up;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

public class PrivateChat extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1461959771653970728L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Create the frame.
	 * @param object 
	 */
	public PrivateChat(Object object) {
		super("Private Chat with " + object.toString());
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textField.addKeyListener(new KeyAdapter() {
			//posts message when chatter presses enter in text field
			public void keyPressed(KeyEvent key) {
				if(key.getKeyChar() == KeyEvent.VK_ENTER){
					@SuppressWarnings("unused")
					PostMessage postMessage = new PostMessage(textField, textArea);
				}
			}
		});
		textField.setBounds(10, 230, 315, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 315, 208);
		contentPane.add(scrollPane);
		scrollPane.setViewportView(textArea);
		
		//post message button
		JButton sendButton = new JButton("Send");
		sendButton.addActionListener(new ActionListener() {
			//posts message to textArea
			public void actionPerformed(ActionEvent arg0) {
				@SuppressWarnings("unused")
				PostMessage postMessage = new PostMessage(textField, textArea);
			}
		});
		sendButton.setBounds(335, 229, 89, 23);
		contentPane.add(sendButton);
		
		//exit private chat button
		JButton exitButton = new JButton("Exit Chat");
		exitButton.addActionListener(new ActionListener() {
			//closes window if button clicked
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		exitButton.addKeyListener(new KeyAdapter() {
			//closes window if enter is pressed while on button
			public void keyPressed(KeyEvent key) {
				dispose();
			}
		});
		exitButton.setBounds(335, 11, 89, 23);
		contentPane.add(exitButton);
		
		//log out button
		JButton logOutButton = new JButton("Log Out");
		logOutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		logOutButton.addKeyListener(new KeyAdapter() {
			//logs out and closes program if enter pressed on button
			public void keyPressed(KeyEvent key) {
				System.exit(0);
			}
		});
		logOutButton.setBounds(335, 45, 89, 23);
		contentPane.add(logOutButton);
		
	}
}

