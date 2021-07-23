package edymar.microservicios.commons.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tbclientes")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty
	@Size(max = 200)
	private String razonsocial;

	@NotEmpty
	@Size(max = 11)
	@Column(unique = true)
	private String ruc;

	@NotEmpty
	@Size(max = 60)
	private String alias;

	@JsonIgnoreProperties({ "cliente" })
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "idcliente")
	private List<ClienteDireccion> direcciones;

	private Date fechacreacion;

	@PrePersist
	public void prePersist() {
		this.fechacreacion = new Date();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRazonsocial() {
		return razonsocial;
	}

	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public List<ClienteDireccion> getDirecciones() {
		return direcciones;
	}

	public void setDirecciones(List<ClienteDireccion> direcciones) {
		if (this.direcciones == null) {
			this.direcciones = new ArrayList<ClienteDireccion>();
		}

		this.direcciones.clear();
		this.direcciones = direcciones;
	}

	public Date getFechacreacion() {
		return fechacreacion;
	}

	public void setFechacreacion(Date fechacreacion) {
		this.fechacreacion = fechacreacion;
	}

}
