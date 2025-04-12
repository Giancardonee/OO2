package ar.edu.info.unlp.ejercicioDemo;

import java.time.Duration;
import java.time.LocalDateTime;

public class FinishedState implements ToDoItemState{

	
	public void start(ToDoItem item) 
	{
		// no hace nada...
	}
	public void togglePause (ToDoItem item)
	{
		// no hace nada...
	}
	public void finish(ToDoItem item)
	{
		// no hace nada...
	}
	public Duration workedTime (ToDoItem item)
	{
		return Duration.between(item.getStartTime(),item.getEndTime());
	}
	
	public void addComment(ToDoItem item, String comment)
	{
		// no hace nada... 
	}
		
	
}
