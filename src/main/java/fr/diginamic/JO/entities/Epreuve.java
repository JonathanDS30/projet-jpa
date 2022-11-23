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
	
	/** Récupere la liste des traductions des epreuves  */
	@ManyToMany(mappedBy = "epreuves")
	private List<TraductionEpreuve> traductionEpreuves  = new ArrayList<TraductionEpreuve>();
	
	@ManyToMany
	@JoinTable(name = "EPREUVE_MEDAILLE",
				joinColumns = @JoinColumn(name = "ID_EPREUVE", referencedColumnName = "ID"),
				inverseJoinColumns = @JoinColumn(name = "ID_MEDAILLE", referencedColumnName = "ID"))
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

	/** Getter pour l'attribut traductionEpreuves 
	 * @return the traductionEpreuves
	 */
	public List<TraductionEpreuve> getTraductionEpreuves() {
		return traductionEpreuves;
	}

	/** Getter pour l'attribut medailles 
	 * @return the medailles
	 */
	public List<Medaille> getMedailles() {
		return medailles;
	}
	
	
}
