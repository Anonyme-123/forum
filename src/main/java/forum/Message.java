package forum;

import java.util.Date;

public class Message {
	private String detail;
	private User createur;
	private Date dteCreation;
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public User getCreateur() {
		return createur;
	}
	public void setCreateur(User createur) {
		this.createur = createur;
	}
	public Date getDteCreation() {
		return dteCreation;
	}
	public void setDteCreation(Date dteCreation) {
		this.dteCreation = dteCreation;
	}
	public Message(String detail, User createur, Date dteCreation) {
		super();
		this.detail = detail;
		this.createur = createur;
		this.dteCreation = dteCreation;
	}
	
	
	
	

}
