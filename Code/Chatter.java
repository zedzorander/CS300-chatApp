package PS_U_up;

public class Chatter {
	private String id;
	private String password;
	private boolean status;
	
	Chatter(){
		id = null;
		password = null;
		status = false;
	}
	
	Chatter(String id, String password){
		setData(id, password);
		status = true;
	}
	
	//sets the id and password
	public void setData(String id, String password){
		this.id = id;
		this.password = password;
		status = true;
	}
	
	//updates chatter when logging in or logging out
	public void updateStatus(){
		status = !status;
	}
	
	//compares chatters id
	public int compareTo(String id){
		return this.id.compareTo(id);
	}
	
	//compares chatters password
	public int comparePassword(String password){
		return this.password.compareTo(password);
	}

	//returns id
	public String getId(){
		return id;
	}
	
	//prints id if chatter is logged in
	public void print(){
		if(status)
			System.out.println("ID: " + id);
	}
}
