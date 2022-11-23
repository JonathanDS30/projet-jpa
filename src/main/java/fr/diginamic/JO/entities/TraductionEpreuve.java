package fr.diginamic.JO.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TRADUCTION_EPREUVE")
public class TraductionEpreuve {
	
	/** Id d'une traduction épreuve */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	/** Nom d'une epreuve en anglais */
	@Column(name = "EVENT_EN", nullable = false, length = 100)
	private String libelleEpreuveEN;
	
	/** Nom d'une epreuve en français */
	@Column(name = "EVENT_FR", nullable = false, length = 100)
	private String libelleEpreuveFR;
	
	@ManyToMany
	@JoinTable(name = "TRAD_EPREUVE",
				joinColumns = @JoinColumn(name = "ID_TRAD_EPREUVE", referencedColumnName = "ID"),
				inverseJoinColumns = @JoinColumn(name = "ID_EPREUVE", referencedColumnName = "ID"))
	private List<Epreuve> epreuves = new ArrayList<Epreuve>();
	
	

	/** Constructeur
	 * 
	 */
	public TraductionEpreuve() {
		super();
	}


	/** Constructeur
	 * @param libelleEpreuveEN
	 * @param libelleEpreuveFR
	 */
	public TraductionEpreuve(String libelleEpreuveEN, String libelleEpreuveFR) {
		super();
		this.libelleEpreuveEN = libelleEpreuveEN;
		this.libelleEpreuveFR = libelleEpreuveFR;
	}


	/** Getter pour l'attribut id 
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/** Setter pour l'attribut id 
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/** Getter pour l'attribut libelleEpreuveEN 
	 * @return the libelleEpreuveEN
	 */
	public String getLibelleEpreuveEN() {
		return libelleEpreuveEN;
	}


	/** Setter pour l'attribut libelleEpreuveEN 
	 * @param libelleEpreuveEN the libelleEpreuveEN to set
	 */
	public void setLibelleEpreuveEN(String libelleEpreuveEN) {
		this.libelleEpreuveEN = libelleEpreuveEN;
	}


	/** Getter pour l'attribut libelleEpreuveFR 
	 * @return the libelleEpreuveFR
	 */
	public String getLibelleEpreuveFR() {
		return libelleEpreuveFR;
	}


	/** Setter pour l'attribut libelleEpreuveFR 
	 * @param libelleEpreuveFR the libelleEpreuveFR to set
	 */
	public void setLibelleEpreuveFR(String libelleEpreuveFR) {
		this.libelleEpreuveFR = libelleEpreuveFR;
	}


	/** Getter pour l'attribut epreuves 
	 * @return the epreuves
	 */
	public List<Epreuve> getEpreuves() {
		return epreuves;
	}
	
	
	
}
