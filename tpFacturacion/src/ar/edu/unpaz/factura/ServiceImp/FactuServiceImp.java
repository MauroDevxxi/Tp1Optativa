package ar.edu.unpaz.factura.ServiceImp;

import java.util.List;

import ar.edu.unpaz.factura.Model.Vendedor;
import ar.edu.unpaz.factura.Repository.FactuRepository;
import ar.edu.unpaz.factura.RepositoryImp.FactuRepositoryImp;
import ar.edu.unpaz.factura.Service.FactuService;

public class FactuServiceImp implements FactuService {
	
	FactuRepository fRepo = new FactuRepositoryImp();

	@Override
	public Vendedor getVendePorNombre(String name) {
		List<Vendedor> sVg = fRepo.getAllVendedor();
		for (Vendedor v : sVg) {
			if(name.equals(v.getNombreCompleto())) {
				return v;
			}
		}
		return null;
	}

	@Override
	public int mostrarRecaudacion() {
		List<Vendedor> sVg = fRepo.getAllVendedor();
		int total = 0;
		for (Vendedor v : sVg) {
			total += v.getRecaudacion();
		}
		return total;
	}

	@Override
	public List<Vendedor> getAllVendedor() {
		List<Vendedor> sVg = fRepo.getAllVendedor();
		return sVg;
	}

}
