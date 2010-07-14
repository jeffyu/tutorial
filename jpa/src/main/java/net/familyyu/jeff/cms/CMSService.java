/**
 * 
 */
package net.familyyu.jeff.cms;

import javax.persistence.EntityManager;

import net.familyyu.jeff.cms.model.Location;
import net.familyyu.jeff.cms.model.Vendor;

/**
 * @author jeffyu
 *
 */
public class CMSService {
	
	protected EntityManager em;
	
	public CMSService(EntityManager em) {
		this.em = em;
	}
	
	public Vendor createVendor(Location address, Vendor vendor) throws Exception {
		vendor.setLocation(address);
		em.persist(vendor);
		return vendor;
	}
	
	public Vendor getVendor(String name) throws Exception {
		return (Vendor)em.createNamedQuery(Vendor.FIND_BY_NAME).setParameter("name", name).getSingleResult();
	}

}
