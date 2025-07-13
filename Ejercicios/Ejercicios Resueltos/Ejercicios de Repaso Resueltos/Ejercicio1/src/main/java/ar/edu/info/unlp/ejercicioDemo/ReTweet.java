package ar.edu.info.unlp.ejercicioDemo;

public class ReTweet implements Post {
	private Post referenciaPost; 
	
	public ReTweet (Post referenciaPost)
	{
		this.referenciaPost = referenciaPost;
	}
	
	@Override
	public Post referenciaPost()
	{
		return this.referenciaPost;
	}

}
