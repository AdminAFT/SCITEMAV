package com.scitemav.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Vehiculo {
	@Id @GeneratedValue @Column(name = "idvehiculo")
	private Integer idVehiculo;
	
	@ManyToOne
	@JoinColumn(name = "idcliente",nullable = false)
	private Cliente vehCliente;
	
	@ManyToOne
	@JoinColumn(name = "idmarca",nullable = false)
	private Marca vehMarca;
	
	@ManyToOne
	@JoinColumn(name = "idtipovehiculo",nullable = false)
	private TipoVehiculo vehTipoVehiculo;
	
	@Column(length = 4, nullable = false)
	private String fabricacion;
	
	@Column(length = 60, nullable = false)
	private String color; 
	
	@Column(name = "numeromotor", nullable = true)
	private Integer numeroMotor;
	
	@Column(name = "numeroplaca", nullable = true)
	private Integer numeroPlaca;
	
	@Column(name = "numeroejes", nullable = true)
	private Integer numeroEjes;
	
	@Column(name = "numeroruedas", nullable = true)
	private Integer numeroRuedas;
	
	@Column(name = "numerocilindros", nullable = true)
	private Integer numeroCilindros;
	
	@Column(name = "numeroserie", nullable = true)
	private Integer numeroSerie;
	
	@Column(name = "numeropasajeros", nullable = true)
	private Integer numeroPasajeros;
	
	@Column(name = "numeroasientos", nullable = true)
	private Integer numeroAsientos;
	
	@Column(name = "pesoSeco", nullable = true)
	private Double pesoSeco;
	
	@Column(name = "pesobruto", nullable = true)
	private Double pesoBruto;

	@Column(name = "longitud", nullable = true)
	private Double longitud;
	
	@Column(name = "altura", nullable = true)
	private Double altura;
	
	@Column(name = "ancho", nullable = true)
	private Double ancho;

	@Column(name = "cargautil", nullable = true)
	private Double cargaUtil;

	public Integer getIdVehiculo() {
		return idVehiculo;
	}

	public void setIdVehiculo(Integer idVehiculo) {
		this.idVehiculo = idVehiculo;
	}

	public Cliente getVehCliente() {
		return vehCliente;
	}

	public void setVehCliente(Cliente vehCliente) {
		this.vehCliente = vehCliente;
	}

	public Marca getVehMarca() {
		return vehMarca;
	}

	public void setVehMarca(Marca vehMarca) {
		this.vehMarca = vehMarca;
	}

	public TipoVehiculo getVehTipoVehiculo() {
		return vehTipoVehiculo;
	}

	public void setVehTipoVehiculo(TipoVehiculo vehTipoVehiculo) {
		this.vehTipoVehiculo = vehTipoVehiculo;
	}

	public String getFabricacion() {
		return fabricacion;
	}

	public void setFabricacion(String fabricacion) {
		this.fabricacion = fabricacion;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getNumeroMotor() {
		return numeroMotor;
	}

	public void setNumeroMotor(Integer numeroMotor) {
		this.numeroMotor = numeroMotor;
	}

	public Integer getNumeroPlaca() {
		return numeroPlaca;
	}

	public void setNumeroPlaca(Integer numeroPlaca) {
		this.numeroPlaca = numeroPlaca;
	}

	public Integer getNumeroEjes() {
		return numeroEjes;
	}

	public void setNumeroEjes(Integer numeroEjes) {
		this.numeroEjes = numeroEjes;
	}

	public Integer getNumeroRuedas() {
		return numeroRuedas;
	}

	public void setNumeroRuedas(Integer numeroRuedas) {
		this.numeroRuedas = numeroRuedas;
	}

	public Integer getNumeroCilindros() {
		return numeroCilindros;
	}

	public void setNumeroCilindros(Integer numeroCilindros) {
		this.numeroCilindros = numeroCilindros;
	}

	public Integer getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(Integer numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public Integer getNumeroPasajeros() {
		return numeroPasajeros;
	}

	public void setNumeroPasajeros(Integer numeroPasajeros) {
		this.numeroPasajeros = numeroPasajeros;
	}

	public Integer getNumeroAsientos() {
		return numeroAsientos;
	}

	public void setNumeroAsientos(Integer numeroAsientos) {
		this.numeroAsientos = numeroAsientos;
	}

	public Double getPesoSeco() {
		return pesoSeco;
	}

	public void setPesoSeco(Double pesoSeco) {
		this.pesoSeco = pesoSeco;
	}

	public Double getPesoBruto() {
		return pesoBruto;
	}

	public void setPesoBruto(Double pesoBruto) {
		this.pesoBruto = pesoBruto;
	}

	public Double getLongitud() {
		return longitud;
	}

	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getAncho() {
		return ancho;
	}

	public void setAncho(Double ancho) {
		this.ancho = ancho;
	}

	public Double getCargaUtil() {
		return cargaUtil;
	}

	public void setCargaUtil(Double cargaUtil) {
		this.cargaUtil = cargaUtil;
	}
}
