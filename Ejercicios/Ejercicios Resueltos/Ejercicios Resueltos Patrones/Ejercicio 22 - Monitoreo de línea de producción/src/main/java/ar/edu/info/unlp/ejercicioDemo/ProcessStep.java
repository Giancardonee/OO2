package ar.edu.info.unlp.ejercicioDemo;

public abstract class ProcessStep {
	private boolean done; 
	
	public void execute (MixingTank tank)
	{
		done = basicExecute(tank);
	}
	
	public boolean isDone()
	{
		return done;
	}
	
	protected abstract boolean basicExecute(MixingTank tank); 
}
