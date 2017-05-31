package PS_U_up;

public class Chat {
	private String[] messages;
	private String[] ids;
	protected final static int MAX = 2000;
	
	Chat(){
		messages = new String[MAX];
		ids = new String[MAX];
	}
	
	//adds message at specified index
	protected void addMessage(String message, String id){
		int upLimit = MAX - 1;
		int lowLimit = 0;
		int index = upLimit/2;
		
		if(messages[lowLimit] == null){
			messages[lowLimit] = message;
			ids[lowLimit] = id;
			return;
		}
		
		while(index - 1 >= 0 && index < MAX){
			//if no message in index AND no message in previous index
			if(messages[index] == null && messages[index - 1] == null){
				//update upper limit to current index, update index to new middle
				upLimit = index;
				if(index % 2 == 1){
					index = ((upLimit) - lowLimit)/2;
				}else
					index = (upLimit - lowLimit)/2;
			}
			//if no message in index AND message in previous index
			else if(messages[index] == null && messages[index - 1] != null){
				//add message and who sent message to arrays
				messages[index] = message;
				ids[index] = id;
				return;
			}
			//if both index and previous index are non-empty
			else{
				//update lower limit to current index, update index to new middle;
				lowLimit = index;
				index = ((upLimit - lowLimit)/2) + lowLimit;
			}
		}
	}
	
	//call when user opens public or previously existing private chat
	protected void print(){
		
		for(int i = 0; i < MAX; ++i){
			if(messages[i] != null)
				System.out.println(ids[i] + ": " + messages[i]);
		}
	}
}
