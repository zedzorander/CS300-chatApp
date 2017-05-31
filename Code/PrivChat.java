package PS_U_up;

public class PrivChat extends Chat{
	private String id;
	
	PrivChat(String id){
		super();
		this.id = id;
	}
	
	public void addMessage(String message, String id){
		super.addMessage(message, id);
	}
	
	public void setId(String id){
		this.id = id;
	}
	
	public String getId(){
		return id;
	}
	
	public void print(){
		super.print();
	}
}
