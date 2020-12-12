package com.cos.soap.model.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "HERD")
public class HerdEntity implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8451490216222010903L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String location;
	
	@OneToMany(mappedBy = "herd", cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	private List<CowEntity> cows = new ArrayList<>();

	public int getId() {
		return id;
	}
	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<CowEntity> getCows() {
		return cows;
	}

	public void setCows(List<CowEntity> cows) {
		this.cows = cows;
	}
	
	public void addCow(CowEntity cow) {
		this.cows.add(cow);
	}
	
	
	
}
