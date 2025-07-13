package ar.edu.info.unlp.ejercicioDemo;

import java.time.Duration;
import java.time.LocalDateTime;

public class StateInProgress extends State {
    
    @Override
    public void start(ToDoItem context) {
       // no hace nada.
    }

    @Override
    public void togglePause(ToDoItem context) {
        context.setState(new StatePaused());
    }

    @Override
    public void finish(ToDoItem context) {
       context.setState(new StateFinished());
       context.setEnd();
    }

    @Override
    public Duration workedTime(ToDoItem context) {
        return Duration.between(context.getBegin(), LocalDateTime.now());
    }

    @Override
    public void addComent(ToDoItem context,String comment) {
        context.addComentAux(comment);
    }
}
