package ar.edu.unpaz.factura.Service;

import java.util.List;

import ar.edu.unpaz.factura.Model.Vendedor;

public interface FactuService {
	public List<Vendedor> getAllVendedor();
	public Vendedor getVendePorNombre(String name );
	public int mostrarRecaudacion();
}
