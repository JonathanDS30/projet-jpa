package fr.diginamic.JO.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity
@Table(name = "JEU")
public class Jeu {
	
	/** Id Jeu */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	/** Nom du jeu olympique */
	@Column(name = "NOM_JEU", nullable = false, length = 100)
	private String nomJeu;
	
	
	/** L'année du jeu  */
	@Column(name = "ANNEE", nullable = false, length = 4)
	private Date annee;
	
	/** Saison du jeu */
	@Column(name = "SAISON", nullable = false, unique = false)
	@Enumerated(EnumType.STRING)
	private Saison saison;
	
	/** Nom de la ville ou est organisé les jeux */
	@Column(name = "NOM_VILLE", nullable = false, length = 100)
	private String nomVille;
	
	@ManyToMany
	@JoinTable(name = "JEU_ATHELETE",
				joinColumns = @JoinColumn(name = "ID_JEU", referencedColumnName = "ID"),
				inverseJoinColumns = @JoinColumn(name = "ID_ATHELETE", referencedColumnName = "ID"))
	private List<Athelete> atheletes= new ArrayList<Athelete>();
	
	@ManyToMany
	@JoinTable(name = "JEU_EPREUVE",
				joinColumns = @JoinColumn(name = "ID_JEU", referencedColumnName = "ID"),
				inverseJoinColumns = @JoinColumn(name = "ID_EPREUVE", referencedColumnName = "ID"))
	private List<Epreuve> epreuves= new ArrayList<Epreuve>();

	/** Constructeur vide
	 * 
	 */
	public Jeu() {
		super();
	}

	/** Constructeur jeu
	 * @param nomJeu
	 * @param annee
	 * @param saison
	 * @param nomVille
	 */
	public Jeu(String nomJeu, Date annee, Saison saison, String nomVille) {
		super();
		this.nomJeu = nomJeu;
		this.annee = annee;
		this.saison = saison;
		this.nomVille = nomVille;
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

	/** Getter pour l'attribut nomJeu 
	 * @return the nomJeu
	 */
	public String getNomJeu() {
		return nomJeu;
	}

	/** Setter pour l'attribut nomJeu 
	 * @param nomJeu the nomJeu to set
	 */
	public void setNomJeu(String nomJeu) {
		this.nomJeu = nomJeu;
	}

	/** Getter pour l'attribut annee 
	 * @return the annee
	 */
	public Date getAnnee() {
		return annee;
	}

	/** Setter pour l'attribut annee 
	 * @param annee the annee to set
	 */
	public void setAnnee(Date annee) {
		this.annee = annee;
	}

	/** Getter pour l'attribut saison 
	 * @return the saison
	 */
	public Saison getSaison() {
		return saison;
	}

	/** Setter pour l'attribut saison 
	 * @param saison the saison to set
	 */
	public void setSaison(Saison saison) {
		this.saison = saison;
	}

	/** Getter pour l'attribut nomVille 
	 * @return the nomVille
	 */
	public String getNomVille() {
		return nomVille;
	}

	/** Setter pour l'attribut nomVille 
	 * @param nomVille the nomVille to set
	 */
	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}

	/** Getter pour l'attribut atheletes 
	 * @return the atheletes
	 */
	public List<Athelete> getAtheletes() {
		return atheletes;
	}
	
	
	
}
