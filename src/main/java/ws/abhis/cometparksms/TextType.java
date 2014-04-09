package ws.abhis.cometparksms;

public class TextType {
	private String sid;
	private String body;
	private String from;
	
	public TextType(String sid, String body, String from) {
		this.sid = sid;
		this.body = body;
		this.from = from;
	}
	
	
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
}
