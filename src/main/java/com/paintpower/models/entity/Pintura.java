package com.paintpower.models.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "pintures")
public class Pintura implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nom;
	private String marca;
	private String tipus;
	/*The @Lob annotation specifies that the database should store the property as Large Object. The columnDefinition in the @Column annotation defines the column type for the property.
	Since we’re going to save byte array, we’re using BLOB.*/
	@Lob
   /* @Column(name = "imatge", columnDefinition="MEDIUMBLOB")*/
	private byte[] imatge;
	@Lob
	private byte[] imatgeDetall;
	@Column( length = 1000 )
	private String descripcio;
	@Column( length = 1500 )
	private String descripcioDetall;
	private BigDecimal preu;
	//private HashMap<Float, Float> llistaQuantitatPreu = new HashMap<Float, Float>();
	//private HashMap<String, String> llistaCaracteristiques = new HashMap<String, String>();
/*
	array colors;
		*/
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTipus() {
		return tipus;
	}
	public void setTipus(String tipus) {
		this.tipus = tipus;
	}
	public byte[] getImatge() {
		return imatge;
	}
	public void setImatge(byte[] imatge) {
		this.imatge = imatge;
	}
	public byte[] getImatgeDetall() {
		return imatgeDetall;
	}
	public void setImatgeDetall(byte[] imatgeDetall) {
		this.imatgeDetall = imatgeDetall;
	}
	public String getDescripcio() {
		return descripcio;
	}
	public void setDescripcio(String descripcio) {
		this.descripcio = descripcio;
	}
	public String getDescripcioDetall() {
		return descripcioDetall;
	}
	public void setDescripcioDetall(String descripcioDetall) {
		this.descripcioDetall = descripcioDetall;
	}
	public BigDecimal getPreu() {
		return preu;
	}
	public void setPreu(BigDecimal preu) {
		this.preu = preu;
	}/*
	public HashMap<Float, Float> getLlistaQuantitatPreu() {
		return llistaQuantitatPreu;
	}
	public void setLlistaQuantitatPreu(HashMap<Float, Float> llistaQuantitatPreu) {
		this.llistaQuantitatPreu = llistaQuantitatPreu;
	}
	public HashMap<String, String> getLlistaCaracteristiques() {
		return llistaCaracteristiques;
	}
	public void setLlistaCaracteristiques(HashMap<String, String> llistaCaracteristiques) {
		this.llistaCaracteristiques = llistaCaracteristiques;
	}
	*/
	
}
