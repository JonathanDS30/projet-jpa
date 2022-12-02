package fr.diginamic.JO.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "EPREUVE")
public class Epreuve {
	
	/** Id d'une épreuve */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	/** Nom d'une epreuve */
	@Column(name = "NOM_EPREUVE", nullable = false, length = 100)
	private String libelleEpreuve;
	
	/** Récupere la liste des jeux  */
	@ManyToMany(mappedBy = "epreuves")
	private List<Jeu> jeux = new ArrayList<Jeu>();
	
	/** Plusieurs epreuve pour un sport */
	@ManyToOne
	@JoinColumn(name = "SPORT_ID")
	private Sport sport;
	
	/** Une épreuve possède possède plusieurs traduction  */
	@OneToMany(mappedBy = "epreuve")
	private List<TraductionEpreuve> traductionsEpreuves = new ArrayList<TraductionEpreuve>();
	
	/** Une epreuve distribue 1 à 3 médailles  */
	@OneToMany(mappedBy = "epreuve")
	private List<Medaille> medailles = new ArrayList<Medaille>();
	
	/** Constructeur
	 * 
	 */
	public Epreuve() {
		super();
	}

	/** Constructeur
	 * @param libelleEpreuve
	 */
	public Epreuve(String libelleEpreuve) {
		super();
		this.libelleEpreuve = libelleEpreuve;
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

	/** Getter pour l'attribut libelleEpreuve 
	 * @return the libelleEpreuve
	 */
	public String getLibelleEpreuve() {
		return libelleEpreuve;
	}

	/** Setter pour l'attribut libelleEpreuve 
	 * @param libelleEpreuve the libelleEpreuve to set
	 */
	public void setLibelleEpreuve(String libelleEpreuve) {
		this.libelleEpreuve = libelleEpreuve;
	}

	/** Getter pour l'attribut jeux 
	 * @return the jeux
	 */
	public List<Jeu> getJeux() {
		return jeux;
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

	/** Getter pour l'attribut traductionsEpreuves 
	 * @return the traductionsEpreuves
	 */
	public List<TraductionEpreuve> getTraductionsEpreuves() {
		return traductionsEpreuves;
	}

	/** Setter pour l'attribut traductionsEpreuves 
	 * @param traductionsEpreuves the traductionsEpreuves to set
	 */
	public void setTraductionsEpreuves(List<TraductionEpreuve> traductionsEpreuves) {
		this.traductionsEpreuves = traductionsEpreuves;
	}

	/** Getter pour l'attribut medailles 
	 * @return the medailles
	 */
	public List<Medaille> getMedailles() {
		return medailles;
	}

	/** Setter pour l'attribut medailles 
	 * @param medailles the medailles to set
	 */
	public void setMedailles(List<Medaille> medailles) {
		this.medailles = medailles;
	}
	
}
