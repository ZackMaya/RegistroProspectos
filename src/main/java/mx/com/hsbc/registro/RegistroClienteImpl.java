package mx.com.hsbc.registro;

import javax.jws.WebService;

@WebService(endpointInterface ="mx.com.hsbc.registro.RegistroCliente")
public class RegistroClienteImpl implements RegistroCliente{

	@Override
	public void agregarCliente(String nombre) {
		// TODO Auto-generated method stub		
	Cliente cliente = new Cliente(nombre);
	System.out.println("Se agrego un nuevo cliente" + cliente);

	}

	@Override
	public void eliminarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		cliente.getNombre();
		System.out.println("Se elimino el cliente" + cliente.getNombre());		
	}

	@Override
	public void actualizarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		cliente.getNombre();
		System.out.println("Se actualizará el cliente" + cliente.getNombre());
		cliente.setNombre("Maya");
		System.out.println("");
	}
}
