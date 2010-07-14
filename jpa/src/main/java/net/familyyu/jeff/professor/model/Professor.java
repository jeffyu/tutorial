package net.familyyu.jeff.professor.model;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="O_PROFESSORS")
@NamedQueries({@NamedQuery(name="REMOVE_BY_STATE", query = "delete from Professor as m where m.address._id in (:address) ")})
public class Professor {
	
	public static final String REMOVE_BY_STATE = "REMOVE_BY_STATE";
	
    @Id @Column(name="ID")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long _id;
    
    @Basic @Column(name="name")
    private String name;
    
    @ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
    @JoinColumn(name = "addr_ID")
    private Address address;


	public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }
    
    public void setAddress(Address address) {
        this.address = address; 
    }

    public String toString() {
        return "Professor id: " + _id + " name: " + getName() +
               " with " + getAddress();
    }

	public Long getId() {
		return _id;
	}

	public void setId(Long id) {
		this._id = id;
	}

}
