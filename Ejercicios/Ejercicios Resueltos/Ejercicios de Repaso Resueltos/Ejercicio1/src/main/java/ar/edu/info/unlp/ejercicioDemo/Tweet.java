package ar.edu.info.unlp.ejercicioDemo;

public class Tweet implements Post{
	
	private String text;
	
	public Tweet (String text)
	{
		super();
		this.text = text;
	}
	
	public String getText()
	{
		return this.text;
	}
	
	public boolean esTweetValido ()
	{
		return this.text.length()>=1 && this.text.length()<=280;
	}
	
	@Override
	public Post referenciaPost()
	{
		return null; // un Tweet no referencia a otro post.
	}
}
