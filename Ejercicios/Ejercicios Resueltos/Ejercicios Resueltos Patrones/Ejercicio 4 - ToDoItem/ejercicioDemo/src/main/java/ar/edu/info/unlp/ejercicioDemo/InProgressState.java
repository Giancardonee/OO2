package ar.edu.info.unlp.ejercicioDemo;
import java.time.LocalDateTime;

public class InProgressState extends ToDoItemState {
	
	@Override
	public void start(ToDoItem item) 
	{
		// no hace nada... 
	}
	@Override
	public void togglePause (ToDoItem item)
	{
		item.setState(new PausedState());
	}
	@Override
	public void finish(ToDoItem item)
	{
		item.setEndTime(LocalDateTime.now());
		item.setState(new FinishedState());
	}
}
