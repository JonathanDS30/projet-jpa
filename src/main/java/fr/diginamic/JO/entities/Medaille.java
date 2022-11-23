package fr.diginamic.JO.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "MEDAILLE")
public class Medaille {
	
	
	/** Id d'une médaille */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	/** Type de médaille */
	@Column(name = "MEDAILLE_TYPE", nullable = true, unique = false)
	@Enumerated(EnumType.STRING)
	private MedailleType medailleType;
	
	@ManyToOne
	@JoinColumn(name="ID_ATHELETE")
	private Athelete athelete;
	
	/** Récupere la liste des epreuves  */
	@ManyToMany(mappedBy = "Medailles")
	private List<Epreuve> epreuves= new ArrayList<Epreuve>();

	/** Constructeur
	 * 
	 */
	public Medaille() {
		super();
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

	/** Getter pour l'attribut medailleType 
	 * @return the medailleType
	 */
	public MedailleType getMedailleType() {
		return medailleType;
	}

	/** Setter pour l'attribut medailleType 
	 * @param medailleType the medailleType to set
	 */
	public void setMedailleType(MedailleType medailleType) {
		this.medailleType = medailleType;
	}

	/** Getter pour l'attribut athelete 
	 * @return the athelete
	 */
	public Athelete getAthelete() {
		return athelete;
	}

	/** Setter pour l'attribut athelete 
	 * @param athelete the athelete to set
	 */
	public void setAthelete(Athelete athelete) {
		this.athelete = athelete;
	}

	/** Getter pour l'attribut epreuves 
	 * @return the epreuves
	 */
	public List<Epreuve> getEpreuves() {
		return epreuves;
	} 
	
	
	
}
