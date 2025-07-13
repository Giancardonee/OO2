package ar.info.unlp.arboles;

public class NullArbolBinario implements IArbolBinario{

	@Override
	public int getValor() {
		return 0;
	}

	@Override
	public void setValor(int valor) {

	}

	@Override
	public void setHijoIzquierdo(ArbolBinario hijoIzquierdo) {
	}

	@Override
	public void setDerecha(ArbolBinario hijoDerecho) {
	}

	@Override
	public IArbolBinario getHijoIzquierdo() {
		return this;
	}

	@Override
	public IArbolBinario getHijoDerecho() {
		return this;
	}

	@Override
	public String recorrerPreorden() {
		return "";
	}

	@Override
	public String recorrerInorden() {
		return "";
	}

	@Override
	public String recorrerPostorden() {
		return "";
	}

}
