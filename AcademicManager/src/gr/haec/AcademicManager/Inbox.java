package gr.haec.AcademicManager;

public class Inbox {
	
	private int messageID;
	private int from;
	private int to;
	private String messageDate;
	private String messageMedium;
	private int read;
	
	
	public int getMessageID() {
		return messageID;
	}
	public void setMessageID(int messageID) {
		this.messageID = messageID;
	}
	public int getFrom() {
		return from;
	}
	public void setFrom(int from) {
		this.from = from;
	}
	public int getTo() {
		return to;
	}
	public void setTo(int to) {
		this.to = to;
	}
	public String getMessageDate() {
		return messageDate;
	}
	public void setMessageDate(String messageDate) {
		this.messageDate = messageDate;
	}
	public String getMessageMedium() {
		return messageMedium;
	}
	public void setMessageMedium(String messageMedium) {
		this.messageMedium = messageMedium;
	}
	public int getRead() {
		return read;
	}
	public void setRead(int read) {
		this.read = read;
	}
	

}
