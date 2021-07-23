package edymar.microservicios.commons.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tbstockguias")
public class StockGuia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private int serie;

	private int numero;

	private boolean emitido;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fechacreacion;

	@PrePersist
	public void prePersist() {
		this.fechacreacion = new Date();
		this.emitido = false;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getSerie() {
		return serie;
	}

	public void setSerie(int serie) {
		this.serie = serie;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public boolean isEmitido() {
		return emitido;
	}

	public void setEmitido(boolean emitido) {
		this.emitido = emitido;
	}

	public Date getFechacreacion() {
		return fechacreacion;
	}

	public void setFechacreacion(Date fechacreacion) {
		this.fechacreacion = fechacreacion;
	}

	public StockGuia(int serie, int numero) {
		super();
		this.serie = serie;
		this.numero = numero;
	}

	public StockGuia() {
		super();
	}
	
	
	

}
