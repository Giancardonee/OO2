package ar.edu.info.unlp.ejercicioDemo;

import java.time.Duration;
import java.time.LocalDateTime;

public class FinishedState extends ToDoItemState{

	@Override
	public void start(ToDoItem item) 
	{
		// no hace nada...
	}
	@Override
	public void togglePause (ToDoItem item)
	{
		// no hace nada...
	}
	@Override
	public void finish(ToDoItem item)
	{
		// no hace nada...
	}
	@Override
	public Duration workedTime (ToDoItem item)
	{
		return Duration.between(item.getStartTime(),item.getEndTime());
	}
	
	@Override
	public void addComment(ToDoItem item, String comment)
	{
		// no hace nada... 
	}
		
	
}
