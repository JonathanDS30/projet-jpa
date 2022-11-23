package fr.diginamic.JO.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author jonat
 *
 */
@Entity
@Table(name = "ATHELETE")
public class Athelete {

	/** Id de athelète */
	@Id
	@Column(name = "ID", nullable = false)
	private int id;

	/** Nom de athelète */
	@Column(name = "NOM", nullable = false, length = 40)
	private String nom;

	/** Sexe de l'athelète */
	@Column(name = "SEXE", nullable = false, length = 1)
	private char sexe;

	/** Age de l'athelète */
	@Column(name = "AGE", nullable = true, length = 3)
	private int age;

	/** Taille de l'athelète */
	@Column(name = "TAILLE", nullable = true, length = 3)
	private double taille;

	/** Poids de l'athelète */
	@Column(name = "POIDS", nullable = true, length = 3)
	private double poids;

	/** Récupere la liste pays */
	@ManyToMany(mappedBy = "atheletes")
	private List<Pays> pays = new ArrayList<Pays>();
	
	/** Récupere la liste d'equipes */
	@ManyToMany(mappedBy = "atheletes")
	private List<Equipe> equipes = new ArrayList<Equipe>();
	
	/** Récupere la liste de jeu olympique jouer  */
	@ManyToMany(mappedBy = "atheletes")
	private List<Jeu> jeux = new ArrayList<Jeu>();

	/** Constructeur vide
	 * 
	 * 
	 */
	public Athelete() {
		super();
	}

	
	/** Constructeur Athelète 
	 * @param id
	 * @param nom
	 * @param sexe
	 * @param age
	 * @param taille
	 * @param poids
	 */
	public Athelete(int id, String nom, char sexe, int age, double taille, double poids) {
		super();
		this.id = id;
		this.nom = nom;
		this.sexe = sexe;
		this.age = age;
		this.taille = taille;
		this.poids = poids;
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
	 * Getter pour l'attribut nom
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter pour l'attribut nom
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter pour l'attribut sexe
	 * 
	 * @return the sexe
	 */
	public char getSexe() {
		return sexe;
	}

	/**
	 * Setter pour l'attribut sexe
	 * 
	 * @param sexe the sexe to set
	 */
	public void setSexe(char sexe) {
		this.sexe = sexe;
	}

	/**
	 * Getter pour l'attribut age
	 * 
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Setter pour l'attribut age
	 * 
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * Getter pour l'attribut taille
	 * 
	 * @return the taille
	 */
	public double getTaille() {
		return taille;
	}

	/**
	 * Setter pour l'attribut taille
	 * 
	 * @param taille the taille to set
	 */
	public void setTaille(double taille) {
		this.taille = taille;
	}

	/**
	 * Getter pour l'attribut poids
	 * 
	 * @return the poids
	 */
	public double getPoids() {
		return poids;
	}

	/**
	 * Setter pour l'attribut poids
	 * 
	 * @param poids the poids to set
	 */
	public void setPoids(double poids) {
		this.poids = poids;
	}

	/**
	 * Getter pour l'attribut pays
	 * 
	 * @return the pays
	 */
	public List<Pays> getPays() {
		return pays;
	}

	/** Getter pour l'attribut equipes 
	 * @return the equipes
	 */
	public List<Equipe> getEquipes() {
		return equipes;
	}

	/** Getter pour l'attribut jeux 
	 * @return the jeux
	 */
	public List<Jeu> getJeux() {
		return jeux;
	}

}
