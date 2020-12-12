package com.cos.soap.model.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "COW_BCS")
public class CowBcsEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5922557975561313072L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "condicion_corporal")
	private int condicionCorporal;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "cow_id",nullable = true)
	private CowEntity cowEntity;
	
	private Date fecha;







	public CowEntity getCowEntity() {
		return cowEntity;
	}



	public void setCowEntity(CowEntity cowEntity) {
		this.cowEntity = cowEntity;
	}



	public int getCondicionCorporal() {
		return condicionCorporal;
	}
	
	

	public void setCondicionCorporal(int condicionCorporal) {
		this.condicionCorporal = condicionCorporal;
	}
	
	public CowBcsEntity() {
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getCc() {
		return condicionCorporal;
	}

	public void setCc(int condicionCorporal) {
		this.condicionCorporal = condicionCorporal;
	}


//	@Override
//	public String toString() {
//		return "CowBcsEntity [id=" + id + ", condicionCorporal=" + condicionCorporal + ", cowBcsEntity=" + cowBcsEntity
//				+ ", fecha=" + fecha + "]";
//	}

	

}
