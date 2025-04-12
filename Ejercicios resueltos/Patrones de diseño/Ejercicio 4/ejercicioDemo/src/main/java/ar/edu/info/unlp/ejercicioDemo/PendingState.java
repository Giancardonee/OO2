package ar.edu.info.unlp.ejercicioDemo;

import java.time.Duration;
import java.time.LocalDateTime;

public class PendingState implements ToDoItemState{

	
	public void start(ToDoItem item) 
	{
		item.setStartTime(LocalDateTime.now());
		item.setState(new InProgressState());
	}
	
	
	public void togglePause (ToDoItem item)
	{
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
	}
	
	public void finish(ToDoItem item)
	{
		// no hace nada... 
	}
	public Duration workedTime (ToDoItem item)
	{
		throw new RuntimeException("El objeto ToDoItem todavia no se incializo. ");
	}

	public void addComment(ToDoItem item, String comment)
	{
		item.addCommentInternally(comment);
	}
}
