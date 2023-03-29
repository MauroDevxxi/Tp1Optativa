package ar.edu.unpaz.factura.Model;

public class Vendedor {
	private int id;
	private String nombreCompleto;
	private String tipoVendedor;
	private int recaudacion;
	
	public Vendedor() {}
	
	public Vendedor(int id, String nombreCompleto, String tipoVendedor, int recaudacion) {
		super();
		this.id = id;
		this.nombreCompleto = nombreCompleto;
		this.tipoVendedor = tipoVendedor;
		this.recaudacion = recaudacion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getTipoVendedor() {
		return tipoVendedor;
	}

	public void setTipoVendedor(String tipoVendedor) {
		this.tipoVendedor = tipoVendedor;
	}

	public int getRecaudacion() {
		return recaudacion;
	}

	public void setRecaudacion(int recaudacion) {
		this.recaudacion = recaudacion;
	}
	
	
	
	
}
