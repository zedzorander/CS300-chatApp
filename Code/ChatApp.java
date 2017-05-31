package PS_U_up;

public class ChatApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Chatter aChatter = new Chatter("zedzorander", "123456");
		//Chatter bChatter = new Chatter("jamison", "password");
		
		//private chat test case
		PrivChat privChat = new PrivChat("zedzorander");
		System.out.println("Private Chat with " + privChat.getId());
		privChat.addMessage("Hello Bitch!!!!!", "zedzorander");
		privChat.addMessage("OMG Stop!!!", "eggcelent");
		privChat.addMessage("What's for dinner", "zedzorander");
		privChat.print();
		
		//public chat test case
		Chat chat = new Chat();
		System.out.println("\n\nPublic Chat");
		chat.addMessage("Netflix & Chill any1?", "zedzorander");
		chat.addMessage("I'm down, sexy!!", "ladyMaestro");
		chat.addMessage("You guys are disgusting", "prudytudy");
		chat.addMessage("I'm down to0 zed", "gentleMan");
		chat.print();
	}
}
