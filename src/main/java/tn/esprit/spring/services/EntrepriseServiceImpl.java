package tn.esprit.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.repository.EntrepriseRepository;
@Service

public class EntrepriseServiceImpl implements IEntrepriseService {
	@Autowired
	EntrepriseRepository entrepriseRepository;

	 
	private static final Logger l = LogManager.getLogger(EntrepriseServiceImpl.class);
	

	@Override
	public List<Entreprise> retrieveAllEntreprises() { 
		List<Entreprise> entreprise = null; 
		try {

			l.info("In Method retriveAllEntreprise");
			entreprise = (List<Entreprise>) entrepriseRepository.findAll(); 
			l.info("entreprise");
			l.debug("Connsxion Bd");


			for (Entreprise entreprise1 : entreprise) {
				l.info("entreprise"+entreprise1.getName());
			} 
			l.info("out with succes");

		}catch (Exception e) {
l.error("out of method with erro"+e);		}

		return entreprise;
	}


	@Override
	public Entreprise addEntreprise(Entreprise e) {
		l.info("In Method addEntreprise");
		Entreprise e_saved = entrepriseRepository.save(e); 
		l.info("out with succes");
		return e_saved; 
	}

	@Override 
	public Entreprise updateEntreprise(Entreprise  e) { 
		l.info("In Method updateEntreprise");	
		Entreprise e_saved = entrepriseRepository.save(e); 
		l.info("out with succes");	
		return e_saved; 
	}

	@Override
	public void deleteEntreprise(int id) {
		l.info("In Method deleteEntreprise");	
		entrepriseRepository.deleteById(id);
		l.info("out with succes");	

	}

	@Override
	public Entreprise retrieveEntreprise(int id) {
		l.info("In Method retrieveentreprise");	
		Entreprise e =  entrepriseRepository.findById(id).get(); 
		l.info("out with succes");	
		return e; 
	}

}
