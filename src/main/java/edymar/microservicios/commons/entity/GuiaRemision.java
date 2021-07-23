package edymar.microservicios.commons.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tbguiasremision")
public class GuiaRemision {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaemision;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fechatraslado;

	private String numeroserie;

	private String numeroguia;

	private String observaciones;

	private boolean facturado;

	@OneToOne(orphanRemoval = true)
	@JoinColumn(name = "idcliente")
	private Cliente cliente;
	
	@OneToOne(orphanRemoval = true)
	@JoinColumn(name = "iddireccionorigen")
	private ClienteDireccion direccionorigen;
	
	@OneToOne(orphanRemoval = true)
	@JoinColumn(name = "iddirecciondestino")
	private ClienteDireccion direcciondestino;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "idguia")
	private List<GuiaRemisionDetalle> detalle;

	@OneToOne(orphanRemoval = true)
	@JoinColumn(name = "idconductor")
	private Colaborador conductor;

	@OneToOne(orphanRemoval = true)
	@JoinColumn(name = "idvehiculo")
	private Vehiculo vehiculo;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fechacreacion;

	@PrePersist
	public void prePersis() {
		this.fechacreacion = new Date();
		this.facturado = false;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFechaemision() {
		return fechaemision;
	}

	public void setFechaemision(Date fechaemision) {
		this.fechaemision = fechaemision;
	}

	public Date getFechatraslado() {
		return fechatraslado;
	}

	public void setFechatraslado(Date fechatraslado) {
		this.fechatraslado = fechatraslado;
	}

	public String getNumeroserie() {
		return numeroserie;
	}

	public void setNumeroserie(String numeroserie) {
		this.numeroserie = numeroserie;
	}

	public String getNumeroguia() {
		return numeroguia;
	}

	public void setNumeroguia(String numeroguia) {
		this.numeroguia = numeroguia;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public boolean isFacturado() {
		return facturado;
	}

	public void setFacturado(boolean facturado) {
		this.facturado = facturado;
	}

	public List<GuiaRemisionDetalle> getDetalle() {
		return detalle;
	}

	public void setDetalle(List<GuiaRemisionDetalle> detalle) {
		this.detalle = detalle;
	}

	public Colaborador getConductor() {
		return conductor;
	}

	public void setConductor(Colaborador conductor) {
		this.conductor = conductor;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Date getFechacreacion() {
		return fechacreacion;
	}

	public void setFechacreacion(Date fechacreacion) {
		this.fechacreacion = fechacreacion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ClienteDireccion getDireccionorigen() {
		return direccionorigen;
	}

	public void setDireccionorigen(ClienteDireccion direccionorigen) {
		this.direccionorigen = direccionorigen;
	}

	public ClienteDireccion getDirecciondestino() {
		return direcciondestino;
	}

	public void setDirecciondestino(ClienteDireccion direcciondestino) {
		this.direcciondestino = direcciondestino;
	}

}
