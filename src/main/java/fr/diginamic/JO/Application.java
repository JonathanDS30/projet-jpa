package fr.diginamic.JO;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import fr.diginamic.JO.entities.TraductionSport;

/**
 * Application de mise en base de donnée de fichier excel
 * 
 * @author jonat
 *
 */
public class Application {

	public static void main(String[] args) throws IOException {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jeuolympique");
		EntityManager em = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = em.getTransaction();

		// Lecture fichier liste des sports
		Path path = Paths.get("D:\\DIGINAMIC\\Cours\\spring-project\\projet-jpa\\src\\main\\resources\\liste-des-sports.csv");
		List<String> lignes = Files.readAllLines(path, StandardCharsets.UTF_8);

		// supression de la première ligne avec les titres
		lignes.remove(0);
		List<TraductionSport> traductionSports = new ArrayList<TraductionSport>();

		for (String lecture : lignes) {
			transaction.begin();
			String[] morceaux = lecture.split(";");
			String libelleEN = morceaux[0];
			String libelleFR = morceaux[1];
		
			TraductionSport traductionSport = new TraductionSport();
			traductionSport.setLibelleSportEN(libelleEN);
			traductionSport.setLibelleSportFR(libelleFR);
			
			traductionSports.add(traductionSport);
			em.persist(traductionSport);
			transaction.commit();
		}

	}
}
