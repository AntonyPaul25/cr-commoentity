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
@Table(name = "tbvehiculos")
public class Vehiculo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String placa;

	private String configuracionvehicular;

	private String numerocertificadoinscripcion;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fechacreacion;

	private Boolean activo;

	@PrePersist
	public void prePersis() {
		this.fechacreacion = new Date();
		this.activo = true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getConfiguracionvehicular() {
		return configuracionvehicular;
	}

	public void setConfiguracionvehicular(String configuracionvehicular) {
		this.configuracionvehicular = configuracionvehicular;
	}

	public String getNumerocertificadoinscripcion() {
		return numerocertificadoinscripcion;
	}

	public void setNumerocertificadoinscripcion(String numerocertificadoinscripcion) {
		this.numerocertificadoinscripcion = numerocertificadoinscripcion;
	}

	public Date getFechacreacion() {
		return fechacreacion;
	}

	public void setFechacreacion(Date fechacreacion) {
		this.fechacreacion = fechacreacion;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

}
