
package mx.com.hsbc.registro;

import org.junit.Test;

public class HelloWorldImplTest {

    @Test
    public void testSayHi() {
      Cliente cliente = new Cliente();
      cliente.setNombre("Maya Díaz");
     System.out.println("Se creo el cliente" + cliente.getNombre());
    }
}
