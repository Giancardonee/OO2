package ar.edu.info.unlp.ejercicioDemo;

import java.time.Duration;
import java.time.LocalDateTime;

public class ToDoItem {
    private State state;
    private String name;
    private String comments;
    private LocalDateTime begin;
    private LocalDateTime end;
    
    /**
    * Instancia un ToDoItem nuevo en estado pending con name como nombre.
    */
    public ToDoItem(String name)
    {
        this.name = name;
        this.state = new StatePending();
        this.comments ="";
    }
    
    /**
    * Pasa el ToDoItem a in-progress, siempre y cuando su estado actual sea
    * pending. Si se encuentra en otro estado, no hace nada.
    */
    public void start()
    {
        this.state.start(this);
    }
    
    /**
    * Pasa el ToDoItem a paused si su estado es in-progress, o a in-progress si su
    * estado es paused. Caso contrario (pending o finished) genera un error
    * informando la causa específica del mismo.
    */
    public void togglePause()
    {
        this.state.togglePause(this);
    }

    
    /**
    * Pasa el ToDoItem a finished, siempre y cuando su estado actual sea 
    * in-progress o paused. Si se encuentra en otro estado, no hace nada.
    */
    public void finish()
    {
        this.state.finish(this);
    }
    
    /**
    * Retorna el tiempo que transcurrió desde que se inició el ToDoItem (start)
    * hasta que se finalizó. En caso de que no esté finalizado, el tiempo que
    * haya transcurrido hasta el momento actual. Si el ToDoItem no se inició,
    * genera un error informando la causa específica del mismo.
    */
    public Duration workedTime()
    {
       return this.state.workedTime(this);
    }

    /**
    * Agrega un comentario al ToDoItem siempre y cuando no haya finalizado. Caso
    * contrario no hace nada."
    */
    public void addComent(String comment)
    {
        this.state.addComent(this,comment);
    }

    public void addComentAux(String comment)
    {
        this.comments+= "\n" + comment;
    }
    
    public void setState(State newState)
    {
        this.state = newState;
    }
    
    public void setBegin()
    {
        this.begin = LocalDateTime.now();
    }
    
    public void setEnd()
    {
        this.end = LocalDateTime.now();
    }
    
    public LocalDateTime getBegin()
    {
        return this.begin;
    }
    
    public LocalDateTime getEnd()
    {
        return this.end;
    }
}
