package ar.edu.info.unlp.ejercicioDemo;

import java.time.Duration;

public abstract class State {
    public abstract void start(ToDoItem context);
    public abstract void togglePause(ToDoItem context);
    public abstract void finish(ToDoItem context);
    public abstract Duration workedTime(ToDoItem context);
    public abstract void addComent(ToDoItem context,String comment);
}
