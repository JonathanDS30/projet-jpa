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
import javax.persistence.Table;

@Entity
@Table(name = "SPORT")
public class Sport {
	
	/** Id d'un sport */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	/** Nom d'un sport */
	@Column(name = "NOM_SPORT", nullable = false, length = 100)
	private String libelleSport;
	
	@ManyToOne
	@JoinColumn(name="EPREUVE_ID")
	private Epreuve epreuve;
	
	/** Récupere la liste des traductions des sports  */
	@ManyToMany(mappedBy = "sports")
	private List<TraductionSport> traductionSports= new ArrayList<TraductionSport>();

	/** Constructeur
	 * 
	 */
	public Sport() {
		super();
	}

	/** Constructeur
	 * @param libelleSport
	 * @param epreuve
	 */
	public Sport(String libelleSport, Epreuve epreuve) {
		super();
		this.libelleSport = libelleSport;
		this.epreuve = epreuve;
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

	/** Getter pour l'attribut libelleSport 
	 * @return the libelleSport
	 */
	public String getLibelleSport() {
		return libelleSport;
	}

	/** Setter pour l'attribut libelleSport 
	 * @param libelleSport the libelleSport to set
	 */
	public void setLibelleSport(String libelleSport) {
		this.libelleSport = libelleSport;
	}

	/** Getter pour l'attribut epreuve 
	 * @return the epreuve
	 */
	public Epreuve getEpreuve() {
		return epreuve;
	}

	/** Setter pour l'attribut epreuve 
	 * @param epreuve the epreuve to set
	 */
	public void setEpreuve(Epreuve epreuve) {
		this.epreuve = epreuve;
	}

	/** Getter pour l'attribut traductionSports 
	 * @return the traductionSports
	 */
	public List<TraductionSport> getTraductionSports() {
		return traductionSports;
	} 
	
	
	
}
