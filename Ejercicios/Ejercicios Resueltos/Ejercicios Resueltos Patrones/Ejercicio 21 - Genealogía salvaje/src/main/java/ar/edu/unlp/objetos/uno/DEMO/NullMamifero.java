package ar.edu.unlp.objetos.uno.DEMO;

import java.time.LocalDate;

public class NullMamifero implements IMamifero{

	@Override
	public IMamifero getPadre() {
		return this;
	}

	@Override
	public IMamifero getMadre() {
		return this;
	}

	@Override
	public IMamifero getAbueloMaterno() {
		return this;
	}

	@Override
	public IMamifero getAbuelaMaterna() {
		return this;
	}

	@Override
	public IMamifero getAbueloPaterno() {
		return this;
	}

	@Override
	public IMamifero getAbuelaPaterna() {
		return this;
	}

	@Override
	public void setIdentificador(String id) {
	
	}

	@Override
	public void setEspecie(String especie) {

	}

	@Override
	public void setFechaNacimiento(LocalDate fecha) {

	}

	@Override
	public void setPadre(IMamifero padre) {

	}

	@Override
	public void setMadre(IMamifero madre) {

	}

	@Override
	public Boolean tieneComoAncestroA(IMamifero unMamifero) {
		return false;
	}

        @Override
	public String getIdentificador() {
		return "NullMamifero";
	}

	@Override
	public String getEspecie() {
		return "NullMamifero";
	}

	@Override
	public LocalDate getFechaNacimiento() {
		return null; // podria retornar otra cosa para no retornar null.
	}
	
}
