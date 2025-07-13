package ar.edu.info.unlp.ejercicioDemo;

import java.time.Duration;

public class StateFinished extends State{
    @Override
    public void start(ToDoItem context) {
       // no hace nada
    }

    @Override
    public void togglePause(ToDoItem context) {
       throw new RuntimeException("The ToDoItem is already in the finished state and cannot perform this action.");
    }

    @Override
    public void finish(ToDoItem context) {
        // no hace nada
    }

    @Override
    public Duration workedTime(ToDoItem context) {
        return Duration.between(context.getBegin(), context.getEnd());
    }

    @Override
    public void addComent(ToDoItem context,String comment) {
        // no hace nada
    }
}
