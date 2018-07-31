package mx.com.hsbc.registro;

import javax.jws.WebService;

@WebService
public interface RegistroCliente {
 public void agregarCliente(String nombre);
 public void eliminarCliente(Cliente cliente);
 public void actualizarCliente(Cliente cliente);
}
