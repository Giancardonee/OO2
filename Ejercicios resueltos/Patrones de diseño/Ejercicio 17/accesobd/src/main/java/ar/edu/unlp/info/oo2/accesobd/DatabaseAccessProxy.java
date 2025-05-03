package ar.edu.unlp.info.oo2.accesobd;

import java.util.Collection;
import java.util.List;

public class DatabaseAccessProxy implements DatabaseAccess{
	private boolean accesoPermitido;
	private DatabaseRealAccess databaseRealAccess;
	
	public DatabaseAccessProxy(DatabaseRealAccess databaseRealAccess)
	{
		this.accesoPermitido = false;
		this.databaseRealAccess = databaseRealAccess;
	}
	
	// Literalmente esto no hace nada, solo recibe el password y pone 
	// la variable de instancia accesoPermitido en true
	public void login (String password)
	{
		this.accesoPermitido = true;
	}
	
	
	@Override
	public Collection<String> getSearchResults(String queryString) {
		if (this.accesoPermitido) 
			return this.databaseRealAccess.getSearchResults(queryString);
		
		throw new RuntimeException("Acceso no permitido.");
	}

	@Override
	public int insertNewRow(List<String> rowData) {
		if (this.accesoPermitido)
			return this.databaseRealAccess.insertNewRow(rowData); 
		
		throw new RuntimeException("Acceso no permitido"); 
	}

}
