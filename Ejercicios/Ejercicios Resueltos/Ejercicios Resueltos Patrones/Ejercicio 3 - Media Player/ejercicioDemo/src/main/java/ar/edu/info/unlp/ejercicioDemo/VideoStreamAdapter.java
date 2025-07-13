package ar.edu.info.unlp.ejercicioDemo;

public class VideoStreamAdapter extends Media{
	
	private VideoStream adaptee;
	
	public VideoStreamAdapter (VideoStream adaptado)
	{
		this.adaptee = adaptado;
	}
	
	@Override
	public void play()
	{
		this.adaptee.reproduce();
	}
}
