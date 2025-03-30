package ar.edu.info.unlp.ejercicioDemo;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TwitterTest {
	 	private Twitter twitter;
	    private Usuario usuario1, usuario2;
	    
	    
	    @BeforeEach
	    void setUp() {
	        twitter = new Twitter();
	        usuario1 = new Usuario("Juan");
	        usuario2 = new Usuario("Pedro");
	    }

	    @Test
	    void testAgregarUsuario() {
	        assertTrue(twitter.agregarUsuario(usuario1));
	        assertFalse(twitter.agregarUsuario(usuario1)); // /No se debe agregar a un usuario con el mismo screenName. 
	    }

	    @Test
	    void testAgregarTweetsYRetweets() {
	        twitter.agregarUsuario(usuario1);
	        twitter.agregarUsuario(usuario2);
	        
	        Tweet tweet1 = new Tweet("Hola mundo");
	        usuario1.agregarTweet(tweet1);
	        usuario2.agregarReTweet(tweet1);
	        
	        assertEquals(1, usuario1.getPosts().size());
	        assertEquals(1, usuario2.getPosts().size());
	    }

	    @Test
	    void testEliminarUsuarioYReferencias() {
	    	// Agregamos 3 usuarios
	    	Usuario usuarioMessi = new Usuario ("Messi"); 
	    	Usuario usuarioDibu = new Usuario ("Dibu");
	    	Usuario usuarioScaloni = new Usuario ("Scaloni");
	    	twitter.agregarUsuario(usuarioMessi);
	    	twitter.agregarUsuario(usuarioDibu);
	    	twitter.agregarUsuario(usuarioScaloni);
	    	
	    	// Agregamos 2 tweets a messi
	    	Tweet tweetMessi1 = new Tweet("Anda palla b#b@");
	    	Tweet tweetMessi2 = new Tweet("Hola");
	    	usuarioMessi.agregarTweet(tweetMessi1); 
	    	usuarioMessi.agregarTweet(tweetMessi2); 
	    	
	    	// Rewteet del tweet1 de messi. 
	    	usuarioDibu.agregarReTweet(tweetMessi1); 
	    	usuarioScaloni.agregarReTweet(tweetMessi2);
	    	
	    	// Agregamos un tweet al dibu 
	    	usuarioDibu.agregarTweet(new Tweet ("AAAA"));

	    	assertEquals(usuarioDibu.getPosts().size(),2); // 1 tweet y 1 retweet
	    	assertEquals(usuarioScaloni.getPosts().size(),1);
	    	
	    	// Agregamos un retweet del retweet de messi
	    	ReTweet rt = new ReTweet(new ReTweet(tweetMessi1)); 
	    	usuarioScaloni.agregarReTweet(rt); 
	    	assertEquals(usuarioScaloni.getPosts().size(),2); 
	    	
	    	twitter.eliminarUsuario(usuarioMessi); 
	    	
	    	// Se eliminan las referencias
	    	assertEquals(usuarioDibu.getPosts().size(),1);  // le queda solo el tweet publicado
	    	assertEquals(usuarioScaloni.getPosts().size(),0); // el retweet de messi desaparece	y el retweet del rw tambien. 
	    }
}
