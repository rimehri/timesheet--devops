package tn.esprit.spring.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.entities.Role;
import tn.esprit.spring.entities.User;
@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
 class EntrepriseServiceImplTest {

	
	
	@Autowired 
	IEntrepriseService en;
	private static final Logger l = LogManager.getLogger(EntrepriseServiceImplTest.class);
	@Test
	@Order(2)
		 public void testRetrieveAllEntreprise()
		{
			List<Entreprise> listEntreprise = en.retrieveAllEntreprises();
	    //   Assertions.assertEquals(8, listEntreprise.size());
		}
	@Test
	@Order(1)
		public void testaddEntreprise() throws ParseException
		{
		
		Entreprise e = new Entreprise("eya","ff");
		Entreprise EntrepriseAdded = en.addEntreprise(e);

		 
		}
	
	@Test
	@Order(3)
		public void testupdateEntreprise() throws ParseException
		{
		
		Entreprise u = new Entreprise(31,"badelt","ff");
          Entreprise entrepriseAdded = en.updateEntreprise(u);

		 
		}
	@Test
	@Order(4)
	public void testDeleteEntreprise() throws ParseException
	{
    //en.deleteEntreprise(35);

//Assertions.assertNotEquals(en.retrieveEntreprise(35).getId(), 35);
	 
	}
	
	
	
}
