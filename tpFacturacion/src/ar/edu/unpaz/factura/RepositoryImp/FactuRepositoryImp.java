package ar.edu.unpaz.factura.RepositoryImp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ar.edu.unpaz.factura.Configuracion.FactuConfig;
import ar.edu.unpaz.factura.Model.Vendedor;
import ar.edu.unpaz.factura.Repository.FactuRepository;

public class FactuRepositoryImp implements FactuRepository{

	@Override
	public List<Vendedor> getAllVendedor() {
		
		FactuConfig fC = new FactuConfig();
		List<Vendedor> sVend = new ArrayList<Vendedor>();
		File sFile = new File(fC.leeme);
		try {
			FileReader sFR = new FileReader(sFile);
			BufferedReader sBf = new BufferedReader(sFR);
			String linea = "";
			while((linea = sBf.readLine())!= null) {
				String [] spli = linea.split(",");
				Vendedor ven = new Vendedor(Integer.parseInt(spli[0]),spli[1],spli[2],
						Integer.parseInt(spli[3]));
				sVend.add(ven);
			}
			
		} catch (Exception e) {
		
		}
		return sVend;
	}

}
