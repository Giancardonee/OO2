package ar.edu.info.unlp.ejercicioDemo;

import java.util.LinkedList;
import java.util.List;

public class Usuario {
	private String screenName; 
	private List<Post> posts; 
	
	public Usuario (String screenName)
	{
		this.screenName = screenName;
		this.posts = new LinkedList<>(); 
	}
	
	public String getScreenName()
	{
		return this.screenName;
	}
	
	public boolean agregarTweet(Tweet tweet)
	{
		if (tweet != null && tweet.esTweetValido())
		{
			this.posts.add(tweet); 
			return true; 
		}
		return false;
	}
	
	public boolean agregarReTweet(Post post)
	{
		if (post == null ) return false;
		this.posts.add(new ReTweet(post)); 
		return true; 
	}
	
	// Retornamos la lista original para mantener las referencias... 	
	public List<Post> getPosts()
	{
		return this.posts;
	}
}
