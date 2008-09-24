package ecom.ibeer.entity.catalog;

import java.io.Serializable;
import java.util.Collection;

/** 
 */
public class BeerType implements Serializable {

	private Collection<Beer> beers;

	private String name;

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

}
