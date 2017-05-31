package PS_U_up;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class HomeScreen extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5033307965870528143L;
	private JPanel contentPane;
	//private ChatterTree chatterTree;

	/**
	 * Create the frame.
	 */
	public HomeScreen() {
		super("Home Screen");
		
		//call read in file instead of initializing tree everytime
		//chatterTree = new ChatterTree();
		DefaultListModel<String> names = new DefaultListModel<String>();
		names.addElement("zedzorander");
		names.addElement("cassidyjones");
		names.addElement("firstName lastName");
		names.addElement("joeVSthevolcano");
		names.addElement("thunderbolt");
		names.addElement("metallica");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 508, 363);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcomeToPsuup = new JLabel("Welcome to PS_U_up?");
		lblWelcomeToPsuup.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		lblWelcomeToPsuup.setBounds(96, 39, 338, 36);
		contentPane.add(lblWelcomeToPsuup);
		
		JButton chatButton = new JButton("Enter Chat");
		chatButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PublicChat chat = new PublicChat(names);
				chat.setVisible(true);
			}
		});
		chatButton.setBounds(173, 137, 141, 23);
		contentPane.add(chatButton);
		
		JButton recordsButton = new JButton("Access Chat Records");
		recordsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Records records = new Records();
				records.setVisible(true);
			}
		});
		recordsButton.setBounds(173, 171, 141, 23);
		contentPane.add(recordsButton);
		
		JButton logOutButton = new JButton("Log Out");
		logOutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				System.exit(0);;
			}
		});
		logOutButton.setBounds(173, 205, 141, 23);
		contentPane.add(logOutButton);
	}
	/*
	public boolean verifyId(String id, String password){
		return chatterTree.verifyTree(id, password);
	}
	*/
}

