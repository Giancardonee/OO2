package ar.edu.info.unlp.ejercicioDemo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Twitter {

	// Estructura mas flexible para trabajar con valores unicos como screenName
	// Map: Clave, tipoDeDato 
	private Map<String,Usuario> usuarios; 
	
	
	public Twitter ()
	{
		this.usuarios = new HashMap<>(); 
	}
	
	public boolean agregarUsuario (Usuario usuarioNuevo)
	{
		// Si el usuario es null o ya se encuentra en la estructura, retornamos false. 
		if (usuarioNuevo == null || this.existeUsuario(usuarioNuevo)) return false; 
		// Agregamos al usuario. 
		usuarios.put(usuarioNuevo.getScreenName(), usuarioNuevo);
		return true; 
	}
	
	public boolean eliminarUsuario (Usuario usuario)
	{
		if (usuario != null && this.existeUsuario(usuario))
		{	
			// Nos traemos los posts del usuario
			List<Post> postsUsuarioEliminar= usuario.getPosts();

			// Para cada usuario eliminamos las referencias de posts del usuario a borrar. 
			for (Usuario usuarioActual : this.usuarios.values())
			{
				usuarioActual.getPosts().removeIf( post ->
					this.eliminarReferencias(post, postsUsuarioEliminar)
				);
			}	
			// Borramos el usuario de la estructura. 
			this.usuarios.remove(usuario.getScreenName());
			return true;
		}
		return false;
	}
	
	// Elimina los retweets recursivamente. 
	private boolean eliminarReferencias(Post post, List<Post> postsUsuarioEliminar)
	{
		if (post.referenciaPost() == null) {
	        return false;
	    }
	    if (postsUsuarioEliminar.contains(post.referenciaPost())) {
	        return true;
	    }
	    return eliminarReferencias(post.referenciaPost(), postsUsuarioEliminar);
	}
	
	private boolean existeUsuario (Usuario usuario)
	{
		return this.usuarios.containsKey(usuario.getScreenName());
	}
}
 