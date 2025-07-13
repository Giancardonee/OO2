package ar.edu.unlp.oo2.persitencia;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
public class UserRepositoryTest {

	@Mock
    private PostRepository postRepository;

    @Mock
    private PersistableUser user;

    @Mock
    private Post post;

    private UserRepository userRepository;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this); // Inicia los mocks
        userRepository = new UserRepository(postRepository); // Crea el repositorio usando el postRepository mockeado
    }

    @Test
    public void testFindUserByUsername() {
        // Creamos el repositorio con el repositorio de posts mockeado
        PostRepository postRepository = mock(PostRepository.class); // Mockeamos el repositorio de posts
        UserRepository userRepository = new UserRepository(postRepository);

        // Simulamos la respuesta de los posts para el usuario
        List<Post> mockPosts = Arrays.asList(new Post("¡Acabo de publicar mi primer post!"));
        when(postRepository.findPostsByUsername("john_doe")).thenReturn(mockPosts);

        // Llamamos al método que debería devolver un UserProxy
        PersistableUser user = userRepository.findUserByUsername("john_doe");

        // Verificamos que el usuario fue encontrado correctamente
        assertEquals("john_doe", user.getUsername());
        assertEquals("john.doe@example.com", user.getEmail());

        // Verificamos que los posts aún no están cargados al principio (usando getCantPosts)
        assertEquals(0, ((UserProxy) user).getCantPosts(), "Los posts no deberían estar cargados aún.");

        // Llamamos a getPosts() para que se carguen los posts
        user.getPosts();

        // Verificamos que los posts se han cargado correctamente
        assertTrue(user.getPosts().size() > 0, "Los posts deberían haberse cargado.");

        // Verificamos que el post con el texto esperado está entre los posts cargados
        assertTrue(user.getPosts().stream()
            .anyMatch(post -> post.getText().equals("¡Acabo de publicar mi primer post!")),
            "El post con el texto esperado debería estar entre los posts.");
    }


    
    
}
