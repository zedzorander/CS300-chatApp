package PS_U_up;
import javax.swing.DefaultListModel;

public class ChatterTree {
	private ChatterNode root;
	
	ChatterTree(){
		root = null;
		/*recAddChatter("zedzorander", "eabfd", root);
		recAddChatter("cassidyjones", "shit", root);
		recAddChatter("poopybutt", "fuck", root);
		recAddChatter("shitfuck", "hello", root);
		recAddChatter("thundercunt", "lettuce", root);
		recAddChatter("metallica", "password", root);
		*/
	}
	
	ChatterTree(Chatter newChatter){
		root = new ChatterNode(newChatter);
	}
	
	//calls recursive add function
	public void addChatter(String id, String password){
		root = recAddChatter(id, password, root);
	}
	
	//recursively adds new Chatter to tree
	private ChatterNode recAddChatter(String id, String password, ChatterNode curr){
		if(curr == null){
			return new ChatterNode(new Chatter(id, password));
		}
		int temp = curr.compareTo(id);
		if(temp == 0){
			return curr;
		}else if(temp < 0)
			curr.setLeft(recAddChatter(id, password, curr.getLeft()));
		else
			curr.setRight(recAddChatter(id, password, curr.getRight()));
		
		return curr;
	}
	
	public DefaultListModel<String> getIds(){
		DefaultListModel<String> tempModel = new DefaultListModel<String>();
		return recGetIds(tempModel, root);
	}
	
	private DefaultListModel<String> recGetIds(DefaultListModel<String> model, ChatterNode curr){
		if(curr == null)
			return null;
		model = recGetIds(model, curr.getLeft());
		model.addElement(curr.getId());
		model = recGetIds(model, curr.getRight());
		return model;
	}
	
	public boolean verifyTree(String id, String password){
		return recVerifyTree(id, password, root);
	}
	
	private boolean recVerifyTree(String id, String password, ChatterNode curr){
		boolean found = false;
		if(curr == null)
			return false;
		int sameId = curr.compareTo(id);
		if(sameId == 0){
			int samePassword = curr.comparePassword(password);
			if(samePassword == 0)
				found = true;
		}else if(sameId < 0)
			return recVerifyTree(id, password, curr.getLeft());
		else
			return recVerifyTree(id, password, curr.getRight());
		return found;
	}
	
	//calls recursive print function
	public void print(){
		recPrint(root);
	}
	
	//recursive print function
	private void recPrint(ChatterNode curr){
		if(curr == null)
			return;
		recPrint(curr.getLeft());
		curr.print();
		recPrint(curr.getRight());
	}
	
	//print single chatter??????
	
	//retrieve chatter?????
}
