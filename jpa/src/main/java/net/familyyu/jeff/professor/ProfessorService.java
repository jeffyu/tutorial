package net.familyyu.jeff.professor;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import net.familyyu.jeff.professor.model.Address;
import net.familyyu.jeff.professor.model.Professor;
import net.familyyu.jeff.professor.model.State;

public class ProfessorService {
	
  protected EntityManager em;

  public ProfessorService(EntityManager em) {
    this.em = em;
  }
  
  public State createState(String name, String zip) {
	  State ostate = new State(name, zip);
	  
	  em.persist(ostate);
	  
	  return ostate;
  }
  
  public Address createAddress(String street, String city, State state) {
	  Address addr = new Address();
	  addr.setCity(city);
	  addr.setStreet(street);
	  addr.setState(state);
	  
	  em.persist(addr);
	  
	  return addr; 
  }
  
  
  public Professor createProfessor(String name, Address addr) {
	  Professor emp = new Professor();
	  emp.setName(name);
	  emp.setAddress(addr);
	  em.persist(emp);
	  return emp;
  }

  public Professor removeProfessor(Professor emp ) {
    em.remove(emp);
    return emp;
  }
  
  
  public Collection<Professor> findAllProfessors() {
    Query query = em.createQuery("SELECT e FROM Professor e");
    return (Collection<Professor>) query.getResultList();
  }
}
