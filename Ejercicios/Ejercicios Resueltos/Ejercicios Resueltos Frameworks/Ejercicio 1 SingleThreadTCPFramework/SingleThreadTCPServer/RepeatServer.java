import java.io.PrintWriter;
import java.util.Collections;

public class RepeatServer extends SingleThreadTCPServer{

	private String texto;
	private int cantRepeticiones;
	private String delimitador; 
	
	@Override
	public void handleMessage(String message, PrintWriter out) {
		if (this.parametrosValidos(message))
		{
			System.out.println(this.repetirTexto());
		}
		else System.out.println("Parametros invalidos.");
	}
	
	private boolean parametrosValidos(String message)
	{
		String[] args = message.split(" ");
		if (args.length >=2)
		{
			this.texto = args[0];
			
			try {
	            this.cantRepeticiones = Integer.parseInt(args[1]);
	        } catch (NumberFormatException e) {
	            return false; // Número inválido
	        }
			
			this.delimitador = args.length >= 3 ? args[2] : " ";
			
			return !this.texto.isEmpty() && this.cantRepeticiones > 0;
		}
		return false;
	}
	
	private String repetirTexto()
	{
		return String.join(this.delimitador, Collections.nCopies(this.cantRepeticiones, this.texto));
	}
}
