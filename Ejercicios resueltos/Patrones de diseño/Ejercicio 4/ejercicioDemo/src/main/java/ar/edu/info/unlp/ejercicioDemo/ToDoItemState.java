package ar.edu.info.unlp.ejercicioDemo;

import java.time.Duration;

public interface ToDoItemState {
	
	public void start(ToDoItem item);
	public void togglePause (ToDoItem item); 
	public void finish(ToDoItem item); 
	public Duration workedTime (ToDoItem state); 
	public void addComment(ToDoItem item, String comment); 
}
