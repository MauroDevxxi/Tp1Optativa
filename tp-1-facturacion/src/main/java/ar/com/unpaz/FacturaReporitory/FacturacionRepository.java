package ar.com.unpaz.FacturaReporitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.unpaz.FacturaEntity.Vendedor;
@Repository
public interface FacturacionRepository extends JpaRepository<Vendedor, Long> {
	
}
