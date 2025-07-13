package ar.edu.unlp.oo2.persitencia;

import java.util.List;

public class UserProxy implements PersistableUser{
	
	private User usuario;
	private PostRepository postRepositorio;
	private boolean postCargados; 
	
	public UserProxy(User usuario, PostRepository postRepositorio)
	{
		this.usuario = usuario;
		this.postRepositorio = postRepositorio;
		this.postCargados = false;
	}
	
	@Override
	public String getUsername() {
		return this.usuario.getUsername();
	}

	@Override
	public String getEmail() {
		return this.usuario.getEmail();
	}

	@Override
	public List<Post> getPosts() {
		if (postCargados == false)
		{
			List<Post> posts = this.postRepositorio.findPostsByUsername(this.usuario.getUsername());
			usuario.addPosts(posts);
			this.postCargados = true;
		}
		return usuario.getPosts();
	}
	
	// Este metodo lo uso para el test
	public int getCantPosts()
	{
		if (postCargados == false) return 0;
		else return this.getPosts().size();
	}
}
