package ar.edu.unlp.oo2.persitencia;

import java.io.FileReader;
import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class UserRepository {

	private PostRepository postRepository;
	
	public UserRepository (PostRepository postRepository)
	{
		this.postRepository = postRepository;
	}
	
	@SuppressWarnings("unchecked")
    public PersistableUser findUserByUsername(String aUsername) {
        JSONParser parser = new JSONParser();
        try {
            List<JSONObject> usersData = (List<JSONObject>) parser.parse(new FileReader("users.json"));
            return usersData.stream()
                .filter(userData -> userData.get("username").equals(aUsername))
                .findFirst()
                .map(userData -> {
                    // preguntar si es valido crear un UserProxy directamente, sin crear un User como en el codigo original
                    String username = (String) userData.get("username");
                    String email = (String) userData.get("email");
                    UserProxy userProxy = new UserProxy(new User(username, email), postRepository);
                    return userProxy; 
                })
                .orElse(null); 
        } catch (Exception e) {
            return null; 
        }
    }
}
