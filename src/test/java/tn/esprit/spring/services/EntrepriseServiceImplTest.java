package tn.esprit.spring.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.entities.Role;
import tn.esprit.spring.entities.User;
@SpringBootTest
 class EntrepriseServiceImplTest {

	
	
	@Autowired 
	IEntrepriseService en;
	private static final Logger l = LogManager.getLogger(EntrepriseServiceImplTest.class);

		 public void testRetrieveAllEntreprise()
		{
			List<Entreprise> listEntreprise = en.retrieveAllEntreprises();
	       Assertions.assertEquals(1, listEntreprise.size());
		}
		
		public void testaddEntreprise() throws ParseException
		{
		
		Entreprise e = new Entreprise("hhh","ff");
		Entreprise EntrepriseAdded = en.addEntreprise(e);

		 
		}
		
		public void testupdateEntreprise() throws ParseException
		{
		
		Entreprise u = new Entreprise(2,"hhh","ff");
          Entreprise entrepriseAdded = en.updateEntreprise(u);

		 
		}
		
		public void testDeleteEntreprise() throws ParseException
		{
	en.deleteEntreprise(2);

		 
		}
		@Test 
		public void testAll(){

			try {
				l.info("In method");
				testaddEntreprise();
				testRetrieveAllEntreprise();
				l.info("Out method");

			
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
}
