package ar.edu.unpaz.factura.Controller;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import ar.edu.unpaz.factura.Model.Vendedor;
import ar.edu.unpaz.factura.Service.FactuService;
import ar.edu.unpaz.factura.ServiceImp.FactuServiceImp;

public class FactuController {
	public static void main(String[] args) {
		FactuService fC = new FactuServiceImp();
		
		Scanner sn = new Scanner(System.in);
		Boolean salir = false;
		int opcion; //guardo la opcion del usuario
		
		while (!salir) {
			
			System.out.println("1. Opcion 1: Listar todos los empleados: ");
	        System.out.println("2. Opcion 2: buscar vendedor por nombre y mostrar");
	        System.out.println("3. Opcion 3: Mostrar recaudacion total");
	        System.out.println("4. Salir");
			
	        try {
	        	System.out.println("Escribe una de las opciones");
	            opcion = sn.nextInt();
	        	
	        	switch (opcion) {
	        	//Listar todos
				case 1: 
					List<Vendedor> lVen = fC.getAllVendedor();
					for (Vendedor v : lVen) {
						System.out.println("id :  "+v.getId()
					+" nombreCompleto : "+v.getNombreCompleto()+" tipoVendedor : "+
					v.getTipoVendedor()+" recaudacion : "+v.getRecaudacion()+"\n");
					}
					break;
				//buscar por nombrecompleto
				case 2: 
					System.out.println("\n\n"+"Ingresenombre a buscar : ");
					String nombre = sn.next();
					Vendedor ven = fC.getVendePorNombre(nombre);
					System.out.println("id :  "+ven.getId()
					+" nombreCompleto : "+ven.getNombreCompleto()+" tipoVendedor : "+
					ven.getTipoVendedor()+" recaudacion : "+ven.getRecaudacion()+"\n");
					System.out.println("\n\n");
					break;
				//mostrar recudacion total
				case 3: 
					int recaudacion = fC.mostrarRecaudacion();
					System.out.println("\n\n"+"La recaudacion total fue de : "+ 
					recaudacion+"\n\n"+"\n\n");
					break;
				case 4: 
					salir = true;
					break;
				default:
					System.out.println("Solo nums entre 1 y 4");
				}
				
			} catch (InputMismatchException e) {
				System.out.println("Debes insertar un numero");
				sn.next();
			}
		}
	  }
	}

