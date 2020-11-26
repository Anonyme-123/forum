package forum;

import java.util.ArrayList;

public class Discussion {
	
	private ArrayList<Message> listDisc=new ArrayList<Message>();
	private String sujet;
	public ArrayList<Message> getListDisc() {
		return listDisc;
	}
	public void setListDisc(ArrayList<Message> listDisc) {
		this.listDisc = listDisc;
	}
	public String getSujet() {
		return sujet;
	}
	public void setSujet(String sujet) {
		this.sujet = sujet;
	}
	public Discussion(ArrayList<Message> listDisc, String sujet) {
		super();
		this.listDisc = listDisc;
		this.sujet = sujet;
	}
	

}
