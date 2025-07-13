package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

public class JacksonAdapter extends VoorheesExporter {
 private Jackson adaptee; 
 
 public JacksonAdapter ()
 {
	 this.adaptee = new Jackson(); 
 }
 
 
 public String exportar (Socio socio) 
 {
	 return this.adaptee.toJSON(socio);
 }
 
 public String exportar (List<Socio> Socios)
 {
	return this.adaptee.toJSON(Socios);
 }
 
 
 
}
