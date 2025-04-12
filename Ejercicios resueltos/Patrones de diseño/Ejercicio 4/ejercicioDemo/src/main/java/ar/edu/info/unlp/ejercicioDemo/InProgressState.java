package ar.edu.info.unlp.ejercicioDemo;

import java.time.Duration;
import java.time.LocalDateTime;

public class InProgressState implements ToDoItemState {
	
	public void start(ToDoItem item) 
	{
		// no hace nada... 
	}
	public void togglePause (ToDoItem item)
	{
		item.setState(new PausedState());
	}
	public void finish(ToDoItem item)
	{
		item.setEndTime(LocalDateTime.now());
		item.setState(new FinishedState());
	}
	public Duration workedTime (ToDoItem item)
	{
		return Duration.between(item.getStartTime(), LocalDateTime.now());
	}
	
	public void addComment(ToDoItem item, String comment)
	{
		item.addCommentInternally(comment);
	}
	
		
	
}
