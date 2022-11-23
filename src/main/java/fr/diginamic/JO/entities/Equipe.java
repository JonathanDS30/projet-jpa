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

/**
 * Table de équipe
 * 
 * @author jonat
 *
 */

@Entity
@Table(name = "NOM_EQUIPE")
public class Equipe {
	
	/** Id équipe */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	/** Nom équipe */
	@Column(name = "NOM_EQUIPE", nullable = false, length = 100)
	private String nomEquipe;
	
	@ManyToMany
	@JoinTable(name = "EQUIPE_ATHELETE",
				joinColumns = @JoinColumn(name = "ID_EQUIPE", referencedColumnName = "ID"),
				inverseJoinColumns = @JoinColumn(name = "ID_ATHELETE", referencedColumnName = "ID"))
	private List<Athelete> atheletes= new ArrayList<Athelete>();

	/**
	 * Constructeur
	 * 
	 */
	public Equipe() {
		super();
	}

	/**
	 * Constructeur
	 * 
	 * @param nomEquipe
	 */
	public Equipe(String nomEquipe) {
		super();
		this.nomEquipe = nomEquipe;
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
	 * Getter pour l'attribut nomEquipe
	 * 
	 * @return the nomEquipe
	 */
	public String getNomEquipe() {
		return nomEquipe;
	}

	/**
	 * Setter pour l'attribut nomEquipe
	 * 
	 * @param nomEquipe the nomEquipe to set
	 */
	public void setNomEquipe(String nomEquipe) {
		this.nomEquipe = nomEquipe;
	}

	/** Getter pour l'attribut atheletes 
	 * @return the atheletes
	 */
	public List<Athelete> getAtheletes() {
		return atheletes;
	}

}
