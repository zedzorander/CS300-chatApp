package PS_U_up;
/* Class Name: ChatterNode
 * Description: contains the chatter account information
 * Programmer Name: Cole Phares
 * Date Written: 5/16/2017
 * 
 * 
 * 
 * 
 * 
 */
public class ChatterNode {
	private Chatter aChatter;
	private ChatterNode left;
	private ChatterNode right;
	
	ChatterNode(){
		aChatter = null;
		left = null;
		right = null;
	}
	
	ChatterNode(Chatter newChatter){
		aChatter = newChatter;
		left = null;
		right = null;
	}
	
	//updates chatters status
	public void updateStatus(){
		aChatter.updateStatus();
	}
	
	//compares chatter id
	public int compareTo(String id){
		return aChatter.compareTo(id);
	}
	
	//compares chatter password
	public int comparePassword(String password){
		return aChatter.comparePassword(password);
	}
	
	//sets the left reference
	public void setLeft(ChatterNode cNode){
		left = cNode;
	}
	
	//sets the right reference
	public void setRight(ChatterNode cNode){
		right = cNode;
	}
	
	public String getId(){
		return aChatter.getId();
	}
	
	//returns left reference
	public ChatterNode getLeft(){
		return left;
	}
	
	//returns right reference
	public ChatterNode getRight(){
		return right;
	}
	
	//prints the chatter id
	public void print(){
		aChatter.print();
	}
}
