package ar.com.unpaz.FacturaService;

import java.util.List;

import ar.com.unpaz.FacturaEntity.Vendedor;

public interface FacturaService {

	public List<Vendedor> getAllVendedor();
	public Vendedor getVendedorById(Long idbuscado);
	public void deleteVendedorById(Long id);
	public void saveVendedor(Vendedor ven);
	public void editVendedor(Long idviejo, Long idNuevo,
			String nombreCompleto,String tipoVendedor,double recaudacion);
	
}
