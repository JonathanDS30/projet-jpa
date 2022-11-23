package fr.diginamic.JO.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/** Table de Pays
 * @author jonat
 *
 */

@Entity
@Table(name = "PAYS")
public class Pays {
	
	/** code CIO */
	@Id
	@Column(name = "CIO", nullable = false, length = 3)
	private String cio;
	
	/** nom des Pays en Fr */
	@Column(name = "NOM_PAYS_FR", nullable = false, length = 100)
	private String nomPaysFr;
	
	/** nom des Pays en En */
	@Column(name = "NOM_PAYS_EN", nullable = false, length = 100)
	private String nomPaysEn;
	
	/** code iso alpha*/
	@Column(name = "CODE_ISO_ALPHA", nullable = true, length = 3)
	private String codeIsoAlpha;
	
	/** obsolete */
	@Column(name = "OBSOLETE", nullable = false, length = 1)
	private boolean obsolete;
	
	@ManyToMany
	@JoinTable(name = "NATIONALITE",
				joinColumns = @JoinColumn(name = "ID_PAYS", referencedColumnName = "CIO"),
				inverseJoinColumns = @JoinColumn(name = "ID_ATHELETE", referencedColumnName = "ID"))
	private List<Athelete> atheletes = new ArrayList<Athelete>();

	/** Constructeur
	 * 
	 */
	public Pays() {
		super();
	}

	/** Getter pour l'attribut cio 
	 * @return the cio
	 */
	public String getCio() {
		return cio;
	}

	/** Setter pour l'attribut cio 
	 * @param cio the cio to set
	 */
	public void setCio(String cio) {
		this.cio = cio;
	}

	/** Getter pour l'attribut nomPaysFr 
	 * @return the nomPaysFr
	 */
	public String getNomPaysFr() {
		return nomPaysFr;
	}

	/** Setter pour l'attribut nomPaysFr 
	 * @param nomPaysFr the nomPaysFr to set
	 */
	public void setNomPaysFr(String nomPaysFr) {
		this.nomPaysFr = nomPaysFr;
	}

	/** Getter pour l'attribut nomPaysEn 
	 * @return the nomPaysEn
	 */
	public String getNomPaysEn() {
		return nomPaysEn;
	}

	/** Setter pour l'attribut nomPaysEn 
	 * @param nomPaysEn the nomPaysEn to set
	 */
	public void setNomPaysEn(String nomPaysEn) {
		this.nomPaysEn = nomPaysEn;
	}

	/** Getter pour l'attribut codeIsoAlpha 
	 * @return the codeIsoAlpha
	 */
	public String getCodeIsoAlpha() {
		return codeIsoAlpha;
	}

	/** Setter pour l'attribut codeIsoAlpha 
	 * @param codeIsoAlpha the codeIsoAlpha to set
	 */
	public void setCodeIsoAlpha(String codeIsoAlpha) {
		this.codeIsoAlpha = codeIsoAlpha;
	}

	/** Getter pour l'attribut obsolete 
	 * @return the obsolete
	 */
	public boolean isObsolete() {
		return obsolete;
	}

	/** Setter pour l'attribut obsolete 
	 * @param obsolete the obsolete to set
	 */
	public void setObsolete(boolean obsolete) {
		this.obsolete = obsolete;
	}

	/** Getter pour l'attribut atheletes 
	 * @return the atheletes
	 */
	public List<Athelete> getAtheletes() {
		return atheletes;
	}

}
