/**
 * 
 */
package net.familyyu.jeff.professor;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import junit.framework.Assert;
import net.familyyu.jeff.Database;
import net.familyyu.jeff.H2Database;
import net.familyyu.jeff.professor.model.Address;
import net.familyyu.jeff.professor.model.Professor;
import net.familyyu.jeff.professor.model.State;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author jeffyu
 *
 */
public class ProfessorServiceTest extends Assert{
	
	private static Database db;
	
	private static EntityManagerFactory emf;
	
	private static EntityManager em;
	
	@BeforeClass
	public static void setUp() throws Exception {
		db = new H2Database();
		db.start();
		emf = Persistence.createEntityManagerFactory("professor-unit", db.getProperties());
		em = emf.createEntityManager();
	}
	
	@AfterClass
	public static void tearDown() throws Exception {
		em.close();
		emf.close();
	}
	
	
	@Test
	public void testProfessorSvc() throws Exception {
	    ProfessorService service = new ProfessorService(em);

	    em.getTransaction().begin();
	    
	    State state = service.createState("NSW", "2122");    
	    Address addr = service.createAddress("May Street", "Eastwood", state);
	    
	    Professor jeff = service.createProfessor("Jeff", addr);
	    Professor eva = service.createProfessor("Eva", addr);
	    
	    System.out.println("========================================");
	    System.out.println(eva.getName());
	    System.out.println("========================================");
	 
    
	    em.getTransaction().commit();
	}

}
