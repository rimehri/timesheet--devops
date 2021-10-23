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
import org.springframework.core.Ordered;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Role;
import tn.esprit.spring.entities.User;
import tn.esprit.spring.services.IUserService;

@SpringBootTest
class UserServiceImplTest {
@Autowired 
IUserService us;
private static final Logger l = LogManager.getLogger(UserServiceImplTest.class);

	 public void testRetrieveAllUser()
	{
		List<User> listUser = us.retrieveAllUsers();
       Assertions.assertEquals(4, listUser.size());
	}
	
	public void testAddUser() throws ParseException
	{
	SimpleDateFormat dateFormat = new SimpleDateFormat ("yyyy-MM-dd");
	Date d =dateFormat.parse("2015-03-23");
	User u = new User("hhh","ff",d,Role.INGENIEUR);
	User userAdded = us.addUser(u);

	 
	}
	
	public void testUpdateUser() throws ParseException
	{
	SimpleDateFormat dateFormat = new SimpleDateFormat ("yyyy-MM-dd");
	Date d =dateFormat.parse("2015-03-23");
	User u = new User(2L,"hhh","ff",d,Role.INGENIEUR);
	User userAdded = us.updateUser(u);

	 
	}
	
	public void testDeleteUser() throws ParseException
	{
us.deleteUser("2L");

	 
	}
	@Test 
	public void testAll(){

		try {
			l.info("In method");
			testAddUser();
		//	testRetrieveAllUser();
			l.info("Out method");

		
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}