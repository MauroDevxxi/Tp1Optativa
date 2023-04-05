package ar.com.unpaz.FacturaEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter@Setter@AllArgsConstructor@NoArgsConstructor
@ToString
@Entity
public class Vendedor {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	private String nombreCompleto;
	private String tipoVendedor;
	private double recaudacion;
}
