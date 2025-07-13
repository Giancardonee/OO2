package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ToDoItemTest {
	 private ToDoItem item;

	    @BeforeEach
	    public void setUp() {
	        item = new ToDoItem("Testeo");
	    }

	    @Test
	    public void testEstadoInicialEsPending() {
	        assertThrows(RuntimeException.class, () -> {
	            item.workedTime(); // Debería lanzar excepción porque está en Pending
	        });
	    }

	    @Test
	    public void testAgregarComentarioEnPending() {
	        item.addComment("Comentario 1");
	        List<String> comentarios = item.getComments();
	        assertEquals(1, comentarios.size());
	        assertEquals("Comentario 1", comentarios.get(0));
	    }

	    @Test
	    public void testStartCambiaAInProgressYSeteaStartTime() {
	        item.start();
	        assertNotNull(item.getStartTime());
	    }

	    @Test
	    public void testAgregarComentarioEnInProgress() {
	        item.start();
	        item.addComment("Comentario en progreso");
	        assertTrue(item.getComments().contains("Comentario en progreso"));
	    }

	    @Test
	    public void testTogglePauseDesdeInProgress() {
	        item.start();
	        item.togglePause(); // cambia a Paused
	        item.addComment("Comentario en pausa");
	        assertTrue(item.getComments().contains("Comentario en pausa"));
	    }

	    @Test
	    public void testTogglePauseDesdePausedVuelveAInProgress() {
	        item.start();
	        item.togglePause(); // va a Paused
	        item.togglePause(); // vuelve a InProgress
	        item.addComment("Comentario al reanudar");
	        assertTrue(item.getComments().contains("Comentario al reanudar"));
	    }

	    @Test
	    public void testFinishDesdeInProgress() {
	        item.start();
	        item.finish();
	        assertNotNull(item.getEndTime());
	    }

	    @Test
	    public void testFinishDesdePaused() {
	        item.start();
	        item.togglePause();
	        item.finish();
	        assertNotNull(item.getEndTime());
	    }

	    @Test
	    public void testNoSePuedeAgregarComentarioEnFinished() {
	        item.start();
	        item.finish();
	        item.addComment("No debería agregarse");
	        assertFalse(item.getComments().contains("No debería agregarse"));
	    }

	    @Test
	    public void testWorkedTimeDesdePendingTiraExcepcion() {
	        assertThrows(RuntimeException.class, () -> {
	            item.workedTime();
	        });
	    }

	    @Test
	    public void testWorkedTimeDesdeFinished() {
	        item.start();
	        item.finish();
	        Duration duracion = item.workedTime();
	        assertNotNull(duracion);
	        assertTrue(duracion.toMillis() >= 0);
	    }
}
