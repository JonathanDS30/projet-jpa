package fr.diginamic.JO.entities;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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


	/**
	 * Constructeur
	 * 
	 */
	public Sport() {
		super();
	}

	/**
	 * Constructeur
	 * 
	 * @param libelleSport
	 * @param epreuve
	 */
	public Sport(String libelleSport) {
		super();
		this.libelleSport = libelleSport;
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
	 * Getter pour l'attribut libelleSport
	 * 
	 * @return the libelleSport
	 */
	public String getLibelleSport() {
		return libelleSport;
	}

	/**
	 * Setter pour l'attribut libelleSport
	 * 
	 * @param libelleSport the libelleSport to set
	 */
	public void setLibelleSport(String libelleSport) {
		this.libelleSport = libelleSport;
	}
}
