package ar.edu.info.unlp.ejercicioDemo;

import java.time.Duration;
import java.time.LocalDateTime;

/* Opte por usar una clase abstracta por que la logica del metodo addComent se repite en la 
 * mayoria de los estados, menos en el estado Finished, entonces para no tener 
 * codigo repetido, cada estado que tenga comportmaiento en comun puede llamar al metodo
 * de la superclase ToDoItemState, mientras que el estado Finished debe redefinir el metodo. 
*/
public abstract class ToDoItemState {
	
	public abstract void start(ToDoItem item);
	public abstract void togglePause (ToDoItem item); 
	public abstract void finish(ToDoItem item); 
	
	// Los estados de In-progress y Paused, utilizan la misma logica del metodo, por lo que
	// Este metodo lo realizo en la clase abstracta para evitar tener codigo duplicado.
	// Mientras que los estados Finished y Pending, tienen otro comportamiento, deben ser 
	//      los encargados de redefinir este metodo. 
	public Duration workedTime (ToDoItem item) 
	{
		return Duration.between(item.getStartTime(), LocalDateTime.now());
	}
	
	// Los estados de : Pending, In-progress, Paused, utilizan este mismo metodo. 
	// Mientras que el estado Finished, lo redefine lanzando una excepcion. 
	public void addComment(ToDoItem item, String comment)
	{
		item.addCommentInternally(comment);
	}

}
