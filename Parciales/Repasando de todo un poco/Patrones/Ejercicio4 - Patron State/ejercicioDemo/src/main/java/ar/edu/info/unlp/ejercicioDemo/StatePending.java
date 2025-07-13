package ar.edu.info.unlp.ejercicioDemo;

import java.time.Duration;

public class StatePending extends State {

    @Override
    public void start(ToDoItem context) {
       context.setState(new StateInProgress());
       context.setBegin();
    }

    @Override
    public void togglePause(ToDoItem context) {
       throw new RuntimeException("The ToDoItem must be in paused or in-progress state to perform this action.");
    }

    @Override
    public void finish(ToDoItem context) {
        // no hace nada.
    }

    @Override
    public Duration workedTime(ToDoItem context) {
        throw new RuntimeException("The ToDoItem is currently in a pending state and has not been started.");
    }

    @Override
    public void addComent(ToDoItem context, String comment) {
        context.addComentAux(comment);
    }
    
}

