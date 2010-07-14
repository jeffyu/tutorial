/**
 * 
 */
package net.familyyu.jeff.cms;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import net.familyyu.jeff.Database;
import net.familyyu.jeff.H2Database;
import net.familyyu.jeff.cms.model.Location;
import net.familyyu.jeff.cms.model.Vendor;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

/**
 * @author jeffyu
 *
 */
public class CMSServiceTest extends Assert {
	
	private static Database db;
	
	private static EntityManagerFactory emf;
	
	private static EntityManager em;
	
	@BeforeClass
	public static void setUp() throws Exception {
		db = new H2Database();
		db.start();
		emf = Persistence.createEntityManagerFactory("cms-unit", db.getProperties());
		em = emf.createEntityManager();
	}
	
	@AfterClass
	public static void tearDown() throws Exception {
		em.close();
		emf.close();
	}
	
	@Test
	public void testCMSSvc() throws Exception {
		em.getTransaction().begin();
		
		CMSService svc = new CMSService(em);
		Location location = new Location();
		location.setCountry("Australia");
		location.setStreetName("May Street");
		location.setSurburb("Eastwood");
		location.setZipcode("2122");
		
		Vendor vendor = new Vendor();
		vendor.setName("vendor-name");
		vendor.setTelephone("0430000000");
		
		svc.createVendor(location, vendor);
		
		System.out.println(vendor.getId());
		System.out.println(vendor.getLocation().getId());
		
		em.getTransaction().commit();
		
	}

}
