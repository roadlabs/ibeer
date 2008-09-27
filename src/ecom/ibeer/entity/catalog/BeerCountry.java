package ecom.ibeer.entity.catalog;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class BeerCountry implements Serializable {

	private static final long serialVersionUID = 85511991475505961L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)	
	private long id;
	
    @OneToMany(mappedBy = "beerCountry", cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
	private Collection<Beer> beers;

    @Column(nullable = false, length = 30)
	private String name;

    @Column(length = 150)
	private String flag;

	/**
	 * Getter of the property <tt>beers</tt>
	 * 
	 * @return Returns the beers.
	 * 
	 */
	public Collection<Beer> getBeers() {
		return beers;
	}

	/**
	 * Setter of the property <tt>beers</tt>
	 * 
	 * @param beers
	 *            the beers to set.
	 * 
	 */
	public void setBeers(Collection<Beer> beers) {
		this.beers = beers;
	}

	/**
	 * Getter of the property <tt>name</tt>
	 * 
	 * @return Returns the name.
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter of the property <tt>name</tt>
	 * 
	 * @param name
	 *            The name to set.
	 * 
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter of the property <tt>flag</tt>
	 * 
	 * @return Returns the flag.
	 * 
	 */
	public String getFlag() {
		return flag;
	}

	/**
	 * Setter of the property <tt>flag</tt>
	 * 
	 * @param flag
	 *            The flag to set.
	 * 
	 */
	public void setFlag(String flag) {
		this.flag = flag;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
