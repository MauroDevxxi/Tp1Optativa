package ar.com.unpaz.FacturaServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.unpaz.FacturaEntity.Vendedor;
import ar.com.unpaz.FacturaReporitory.FacturacionRepository;
import ar.com.unpaz.FacturaService.FacturaService;

@Service
public class FacturaServiceImp implements FacturaService{
	
	@Autowired
	private FacturacionRepository fRepo;

	@Override
	public List<Vendedor> getAllVendedor() {
		List<Vendedor> lGA = fRepo.findAll();
		return lGA;
	}

	@Override
	public Vendedor getVendedorById(Long idbuscado) {
		Vendedor ven = fRepo.findById(idbuscado).orElse(null);
		return ven;
	}

	@Override
	public void deleteVendedorById(Long id) {
		fRepo.deleteById(id);
		
	}

	@Override
	public void saveVendedor(Vendedor ven) {
		fRepo.save(ven);
		
	}

	@Override
	public void editVendedor(Long idViejo, Long idNuevo, String nNombreCompleto, 
			String nTipoVendedor,double nRecaudacion) {
		Vendedor vendedor = this.fRepo.findById(idViejo).orElse(null);
		vendedor.setId(idNuevo);
		vendedor.setNombreCompleto(nNombreCompleto);
		vendedor.setTipoVendedor(nTipoVendedor);
		vendedor.setRecaudacion(nRecaudacion);
	}

	



}
