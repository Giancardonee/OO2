package ar.info.unlp.arboles;

public interface IArbolBinario {
	public int getValor();
	public void setValor(int valor);
	public void setHijoIzquierdo(ArbolBinario hijoIzquierdo);
	public void setDerecha(ArbolBinario hijoDerecho);
	public IArbolBinario getHijoIzquierdo();
	public IArbolBinario getHijoDerecho();
	public String recorrerPreorden();
	public String recorrerInorden();
	public String recorrerPostorden();
}
