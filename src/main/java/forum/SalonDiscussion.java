package forum;

import java.util.ArrayList;

public class SalonDiscussion {
	private ArrayList<Discussion> listDiscussion =new ArrayList<Discussion>();
	private ArrayList<User> listUser =new ArrayList<User>();
	public ArrayList<Discussion> getListDiscussion() {
		return listDiscussion;
	}
	public void setListDiscussion(ArrayList<Discussion> listDiscussion) {
		this.listDiscussion = listDiscussion;
	}
	public SalonDiscussion(ArrayList<Discussion> listDiscussion, ArrayList<User> listUser) {
		super();
		this.listDiscussion = listDiscussion;
		this.listUser = listUser;
	}
	public ArrayList<User> getListUser() {
		return listUser;
	}
	public void setListUser(ArrayList<User> listUser) {
		this.listUser = listUser;
	}


}
