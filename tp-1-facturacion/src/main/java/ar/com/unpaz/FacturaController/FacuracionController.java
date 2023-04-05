package ar.com.unpaz.FacturaController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

import ar.com.unpaz.FacturaEntity.Vendedor;
import ar.com.unpaz.FacturaServiceImp.FacturaServiceImp;

@RestController
public class FacuracionController {
	
	@Autowired
	private FacturaServiceImp sSer; 
	
	@GetMapping("hola/{nombre}")
	public String sayHello(@PathVariable String nombre) {
		return "esta es una prueba y lo que escribi por teclado es : " +nombre;
	}
	
	@GetMapping("/facturacion/getAll")
	public List<Vendedor> getvendedores(){
		return sSer.getAllVendedor();
	}
	
	@GetMapping("/facturacion/getById/{id}")
	public Vendedor getVendedor(@PathVariable Long id) {
		//Vendedor vended = ;
		return sSer.getVendedorById(id) ;
	}
	
	@DeleteMapping("/facturacion/borrar/{id}")
	public String borrado (@PathVariable Long id) {
		sSer.deleteVendedorById(id);
		return "El vendedor se borro correctamente";	
		
	}
	
	@PostMapping("/facturacion/crear")
	public String crear(@RequestBody Vendedor ven) {
		sSer.saveVendedor(ven);
		return "la persona fue creada correctamente";
	}
	
	
	
	
	
}
