package ar.edu.unlp.info.oo2.accesobd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseAccessTest {
	private DatabaseRealAccess realDb;
    private DatabaseAccessProxy proxyDb;

    @BeforeEach
    void setUp() {
        this.realDb = new DatabaseRealAccess();
        this.proxyDb = new DatabaseAccessProxy(realDb);
    }

    @Test
    void testRealAccess_GetExistingRow() {
        Collection<String> result = realDb.getSearchResults("select * from comics where id=1");
        assertEquals(Arrays.asList("Spiderman", "Marvel"), result);
    }

    @Test
    void testRealAccess_InsertAndGetRow() {
        int newId = realDb.insertNewRow(Arrays.asList("Patoruzú", "La flor"));
        assertEquals(3, newId);

        Collection<String> result = realDb.getSearchResults("select * from comics where id=3");
        assertEquals(Arrays.asList("Patoruzú", "La flor"), result);
    }

    @Test
    void testProxyAccessWithoutLogin_ThrowsException() {
        assertThrows(RuntimeException.class, () -> {
            proxyDb.getSearchResults("select * from comics where id=1");
        });

        assertThrows(RuntimeException.class, () -> {
            proxyDb.insertNewRow(Arrays.asList("Patoruzú", "La flor"));
        });
    }

    @Test
    void testProxyAccessWithLogin_AllowsAccess() {
        proxyDb.login("anyPassword"); // Tu implementación permite todo

        int newId = proxyDb.insertNewRow(Arrays.asList("Isidoro", "Patagonik"));
        assertEquals(3, newId);

        Collection<String> result = proxyDb.getSearchResults("select * from comics where id=3");
        assertEquals(Arrays.asList("Isidoro", "Patagonik"), result);
    }
}
