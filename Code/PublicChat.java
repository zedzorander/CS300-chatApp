package PS_U_up;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;

public class PublicChat extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3809384817082795817L;
	private JPanel contentPane;
	private JTextField textField;

	public PublicChat(DefaultListModel<String> model) {
		super("Public Chat");
		
		setBackground(Color.GREEN);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 593, 458);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 248, 255));
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 368, 366);
		contentPane.add(scrollPane);
		
		//window where messages are posted
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			//posts a message to textArea if enter clicked in text field
			public void keyPressed(KeyEvent key) {
				if(key.getKeyChar() == KeyEvent.VK_ENTER){
					@SuppressWarnings("unused")
					PostMessage postMessage = new PostMessage(textField, textArea);
				}
			}
		});
		textField.setBounds(10, 388, 457, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		//post message button
		JButton sendButton = new JButton("Send");
		sendButton.addActionListener(new ActionListener()  {
			//posts a message to textArea if button clicked
			public void actionPerformed(ActionEvent e) {
				@SuppressWarnings("unused")
				PostMessage postMessage = new PostMessage(textField, textArea);
			}
		});
		sendButton.setBounds(478, 387, 89, 23);
		contentPane.add(sendButton);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(388, 45, 179, 332);
		contentPane.add(scrollPane_1);
		
		//online users list
		@SuppressWarnings({ "rawtypes", "unchecked" })
		JList list = new JList(model);
		scrollPane_1.setViewportView(list);
		list.addMouseListener(new MouseAdapter() {
			//open private chat if chatter in list is double clicked
			public void mouseClicked(MouseEvent clicked) {
				if(clicked.getClickCount() == 2){
					PrivateChat privChat = new PrivateChat(list.getSelectedValue());
					privChat.setVisible(true);
				}
			}
		});
		
		//JList title label
		JLabel lblOnlineUsers = new JLabel(" Online Users:");
		scrollPane_1.setColumnHeaderView(lblOnlineUsers);
		
		//Exit chat button
		JButton exitButton = new JButton("Exit Chat");
		exitButton.addActionListener(new ActionListener() {
			//close window if button pressed
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		exitButton.addKeyListener(new KeyAdapter() {
			//close window if enter pressed on button
			public void keyPressed(KeyEvent key){
				if(key.getKeyChar() == KeyEvent.VK_ENTER)
					dispose();
			}
		});
		exitButton.setBounds(388, 11, 89, 23);
		contentPane.add(exitButton);
		
		//Log out chat button
		JButton logOutButton = new JButton("Log Out");
		logOutButton.addActionListener(new ActionListener() {
			//log out and close program if button clicked
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		logOutButton.addKeyListener(new KeyAdapter() {
			//log out and close program if enter pressed on button
			public void keyPressed(KeyEvent key){
				if(key.getKeyChar() == KeyEvent.VK_ENTER)
					System.exit(0);
			}
		});
		logOutButton.setBounds(478, 11, 89, 23);
		contentPane.add(logOutButton);
	}
}

