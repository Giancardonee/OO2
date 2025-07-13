import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PasswordServer extends SingleThreadTCPServer {

	private String letras; 
	private String numeros;
	private String especiales; 
	
	@Override
	public void handleMessage(String message, PrintWriter out) {
		if (this.parametrosValidos(message))
		{
			System.out.print("Generando Password....");
			String passwordGenerado = this.generarPassword(letras,numeros,especiales);
			System.out.print("Password generado: "+passwordGenerado);
		}
		System.out.println("Parametros invalidos.");
	}
	
	private boolean parametrosValidos(String message)
	{
		String[] args = message.split(" ");
		if (args.length == 3) 
		{
			letras = args[0];
		    numeros = args[1];
		    especiales = args[2];
			if (!letras.isEmpty() && !numeros.isEmpty() && !especiales.isEmpty())
			{
				return true;
			}
		}
		return false;	
	}
	
	private String generarPassword (String letras, String numeros, String especiales)
	{
		 	Random rand = new Random();
	        ArrayList<Character> passwordChars = new ArrayList<>();

	        // 1 numero
	        passwordChars.add(numeros.charAt(rand.nextInt(numeros.length())));
	        // 1 especial
	        passwordChars.add(especiales.charAt(rand.nextInt(especiales.length())));
	        // 6 letras
	        
	        for (int i = 0; i < 6; i++) {
	            passwordChars.add(letras.charAt(rand.nextInt(letras.length())));
	        }

	        // Mezclar
	        Collections.shuffle(passwordChars);

	        // Construir el string
	        StringBuilder password = new StringBuilder();
	        for (char c : passwordChars) {
	            password.append(c);
	        }

	        return password.toString();
	}
	
    public static void main(String[] args) {
        new PasswordServer().startLoop(args);
    }

}
