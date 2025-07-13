package ar.edu.unlp.objetos.uno.DEMO;

import java.time.LocalDate;

public class RealMamifero implements IMamifero{
	
    private String identificador;
    private String especie;
    private LocalDate nacimiento;
    private IMamifero padre;
    private IMamifero madre;
    
    
	public RealMamifero(String identificador) {
		this.identificador = identificador;
		this.padre = new NullMamifero();
		this.madre = new NullMamifero();
	}

	@Override
	public String getIdentificador() {
		return this.identificador;
	}


	@Override
	public String getEspecie() {
		return this.especie;
	}


	@Override
	public LocalDate getFechaNacimiento() {
		return this.nacimiento;
	}


	@Override
	public IMamifero getPadre() {
		return this.padre;
	}


	@Override
	public IMamifero getMadre() {
		return this.madre;
	}


	@Override
	public IMamifero getAbueloMaterno() {
		return this.getMadre().getPadre();
	}


	@Override
	public IMamifero getAbuelaMaterna() {
		return this.getMadre().getMadre();
	}


	@Override
	public IMamifero getAbueloPaterno() {
		return this.getPadre().getPadre();
	}


	@Override
	public IMamifero getAbuelaPaterna() {
		return this.getPadre().getMadre();
	}


	@Override
	public void setIdentificador(String id) {
		this.identificador = id;
	}


	@Override
	public void setEspecie(String especie) {
		this.especie = especie;
	}


	@Override
	public void setFechaNacimiento(LocalDate fecha) {
		this.nacimiento = fecha;
	}


	@Override
	public void setPadre(IMamifero padre) {
		this.padre = padre;
	}


	@Override
	public void setMadre(IMamifero madre) {
		this.madre = madre;
	}


	@Override
	public Boolean tieneComoAncestroA(IMamifero unMamifero) {
	    return unMamifero.equals(this.getPadre()) 
	            || unMamifero.equals(this.getMadre()) 
	            || this.getPadre().tieneComoAncestroA(unMamifero) 
	            || this.getMadre().tieneComoAncestroA(unMamifero);
	}

}
