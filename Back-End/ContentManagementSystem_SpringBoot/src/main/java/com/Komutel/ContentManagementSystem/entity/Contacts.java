package com.Komutel.ContentManagementSystem.entity;


import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "contacts",
		uniqueConstraints = {
		@UniqueConstraint(columnNames = "telephone")})
public class Contacts {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String adresse;
	private String ville;
	private String pays;
	private String telephone;
	@JsonFormat(pattern="yyyy-MM-dd", shape = JsonFormat.Shape.STRING)
	private LocalDate debut_de_contract;
	
	
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
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public LocalDate getDebut_de_contract() {
		return debut_de_contract;
	}
	public void setDebut_de_contract(LocalDate debut_de_contract) {
		this.debut_de_contract = debut_de_contract;
	}

	public Contacts(Long id, String nom, String adresse, String ville, String pays, String telephone,
		LocalDate debut_de_contract) {
	this.id = id;
	this.nom = nom;
	this.adresse = adresse;
	this.ville = ville;
	this.pays = pays;
	this.telephone = telephone;
	this.debut_de_contract = debut_de_contract;
}
	public Contacts() {
		super();
	}
	@Override
	public String toString() {
		return "Contacts [id=" + id + ", nom=" + nom + ", adresse=" + adresse + ", ville=" + ville + ", pays=" + pays
				+ ", telephone=" + telephone + ", debut_de_contract=" + debut_de_contract + "]";
	}
		
	
	
}
