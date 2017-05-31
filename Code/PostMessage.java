package PS_U_up;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PostMessage extends AbstractAction{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// add message to database
		
		
		return;
	}
	
	//posts messages to the textArea sent in
	public PostMessage(JTextField textField, JTextArea textArea){
		String message = textField.getText();
		if(message.compareTo("") != 0){
			textArea.setLineWrap(true);
			textArea.append(message + '\n');
			textField.setText("");
		}
	}
}
