package fr.diginamic.JO.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TRADUCTION_SPORT")
public class TraductionSport {

	/** Id d'une traduction sport */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	/** Nom d'un sport en anglais */
	@Column(name = "LIBELLE_EN", nullable = false, length = 100)
	private String libelleSportEN;

	/** Nom d'un sport en français */
	@Column(name = "LIBELLE_FR", nullable = false, length = 100)
	private String libelleSportFR;

	@ManyToOne
	@JoinColumn(name = "SPORT_ID")
	private Sport sport;

	/**
	 * Constructeur
	 * 
	 */
	public TraductionSport() {
		super();
	}

	/**
	 * Constructeur
	 * 
	 * @param libelleSportEN
	 * @param libelleSportFR
	 */
	public TraductionSport(String libelleSportEN, String libelleSportFR) {
		super();
		this.libelleSportEN = libelleSportEN;
		this.libelleSportFR = libelleSportFR;
	}

	/**
	 * Getter pour l'attribut id
	 * 
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Setter pour l'attribut id
	 * 
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Getter pour l'attribut libelleSportEN
	 * 
	 * @return the libelleSportEN
	 */
	public String getLibelleSportEN() {
		return libelleSportEN;
	}

	/**
	 * Setter pour l'attribut libelleSportEN
	 * 
	 * @param libelleSportEN the libelleSportEN to set
	 */
	public void setLibelleSportEN(String libelleSportEN) {
		this.libelleSportEN = libelleSportEN;
	}

	/**
	 * Getter pour l'attribut libelleSportFR
	 * 
	 * @return the libelleSportFR
	 */
	public String getLibelleSportFR() {
		return libelleSportFR;
	}

	/**
	 * Setter pour l'attribut libelleSportFR
	 * 
	 * @param libelleSportFR the libelleSportFR to set
	 */
	public void setLibelleSportFR(String libelleSportFR) {
		this.libelleSportFR = libelleSportFR;
	}

	/** Getter pour l'attribut sport 
	 * @return the sport
	 */
	public Sport getSport() {
		return sport;
	}

	/** Setter pour l'attribut sport 
	 * @param sport the sport to set
	 */
	public void setSport(Sport sport) {
		this.sport = sport;
	}

}
