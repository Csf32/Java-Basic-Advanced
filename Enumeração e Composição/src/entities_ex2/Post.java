package entities_ex2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	//Criação de variável para chamar no StringBuilder
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	
	//lista de comentários
	
	private List<Comment> comments = new ArrayList<>();
	
	//Construtor padrão
	public Post() {
		
	}
	//Construtor com os argumentos
	public Post(Date moment, String title, String content, Integer likes, List<Comment> comments) {
		
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
		this.comments = comments;
	}
	
	public Post(Date moment, String title, String content, Integer likes) {
		
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
		
	}
	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getLikes() {
		return likes;
	}
	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	public List<Comment> getComments() {
		return comments;
	}
	
	public void addComment(Comment comment) {
	
		comments.add(comment);
		
	}
	
	public void removeComment(Comment comment) {
	
		comments.remove(comment);
		
	}
	
	public String toString() {
		
		
		StringBuilder sb = new StringBuilder();
	
		
		sb.append(title + "\n"); 
		sb.append(likes);
		sb.append(" likes - " );

		sb.append(sdf.format(moment) + "\n");
		sb.append(content + "\n");
		sb.append("Comments" + "\n");

		
		for(Comment c: comments) {
			
		
			sb.append(c.getText());
			
			
		}
		return sb.toString();
		
	}
	
	
	
	
	
	
}
