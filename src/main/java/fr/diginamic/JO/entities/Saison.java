package fr.diginamic.JO.entities;

public enum Saison {
	ETE("Eté"), 
	HIVER("Hiver"),
	SUMMER("Summer"), 
	WINTER("Winter");
	
	private String libelle;
	
	/** Constructeur
	 * @param nomSaison
	 */
	private Saison(String nomSaison) {
		this.libelle = nomSaison;
	}

	/** Getter pour l'attribut libelle 
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/** Setter pour l'attribut libelle 
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
}
