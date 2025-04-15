package ar.edu.info.unlp.ejercicioDemo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem  {
	private String name;
	private List<String> comments;
	private LocalDateTime startTime;
	private LocalDateTime endTime; 
	private ToDoItemState state; 
	
	
	public ToDoItem (String name)
	{
		this.name = name; 
		this.comments = new ArrayList<String>(); // inicializamos la lista, IMPORTANTISIMO! 
		this.state = new PendingState(); 
	}
	
	public void start()
	{
		state.start(this);
	}
	
	public void togglePause()
	{
		state.togglePause(this);
	}
	
	public void finish()
	{
		state.finish(this);
	}
	
	public Duration workedTime()
	{
		return state.workedTime(this);
	}
	
	public void addComment(String comment)
	{
		state.addComment(this, comment);
	}
	
	
	public void addCommentInternally(String comment)
	{
		this.comments.add(comment);
	}
	
	 // Algunos  Getters y Setters necesarios para que los estados accedan
    public void setState(ToDoItemState state) {
        this.state = state;
    }

    public void setStartTime(LocalDateTime time) {
        this.startTime = time;
    }

    public void setEndTime(LocalDateTime time) {
        this.endTime = time;
    }

    public LocalDateTime getStartTime() {
        return this.startTime;
    }

    public LocalDateTime getEndTime() {
        return this.endTime;
    }	
}
