package ar.edu.info.unlp.ejercicioDemo;

import java.time.Duration;
import java.time.LocalDateTime;

public class PendingState extends ToDoItemState{

	@Override
	public void start(ToDoItem item) 
	{
		item.setStartTime(LocalDateTime.now());
		item.setState(new InProgressState());
	}
	
	@Override
	public void togglePause (ToDoItem item)
	{
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
	}
	@Override
	public void finish(ToDoItem item)
	{
		// no hace nada... 
	}
	@Override
	public Duration workedTime (ToDoItem item)
	{
		throw new RuntimeException("El objeto ToDoItem todavia no se incializo. ");
	}

}
