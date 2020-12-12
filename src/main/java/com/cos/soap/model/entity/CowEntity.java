package com.cos.soap.model.entity;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "COW")
public class CowEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -718124157157287796L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "electronic_id")
	private int electronicID;	

	@Column(name = "fecha_nacimiento")
	private Date fechaNacimiento;
	
	@Column(name = "ultima_fecha_parto", nullable = true)
	private Date ultimaFechaParto;
	
	@Column(name = "cantidad_partos")
	private int cantidadPartos;

	@OneToMany(mappedBy = "cowEntity",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@Column(nullable = true)
	private List<CowBcsEntity> cowBcsEntity =new ArrayList<CowBcsEntity>();
	
	@ManyToOne(fetch = FetchType.LAZY )
	private HerdEntity herd;
	
	

	public List<CowBcsEntity> getCowBcsEntity() {
		return cowBcsEntity;
	}

	public void setCowBcsEntity(List<CowBcsEntity> cowBcsEntity) {
		this.cowBcsEntity = cowBcsEntity;
	}

	public HerdEntity getHerd() {
		return herd;
	}

	public void setHerd(HerdEntity herd) {
		this.herd = herd;
	}

//	@Override
//	public String toString() {
//		return "CowEntity [id=" + id + ", electronicID=" + electronicID + ", fechaNacimiento=" + fechaNacimiento
//				+ ", ultimaFechaParto=" + ultimaFechaParto + ", cantidadPartos=" + cantidadPartos + ", cowBcsEntity="
//				+ cowBcsEntity + ", peso=" + peso + ", herd=" + herd + "]";
//	}

	private float peso;
	

//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "cow_id")
//	private CowBcsEntity cowBcsEntity;
//	
	
	
	public CowEntity() {
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getElectronicID() {
		return electronicID;
	}

	public void setElectronicID(int electronicID) {
		this.electronicID = electronicID;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Date getUltimaFechaParto() {
		return ultimaFechaParto;
	}

	public void setUltimaFechaParto(Date ultimaFechaParto) {
		this.ultimaFechaParto = ultimaFechaParto;
	}

	public int getCantidadPartos() {
		return cantidadPartos;
	}

	public void setCantidadPartos(int cantidadPartos) {
		this.cantidadPartos = cantidadPartos;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	
}
