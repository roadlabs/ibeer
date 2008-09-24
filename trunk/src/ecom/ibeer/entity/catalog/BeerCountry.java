package ecom.ibeer.entity.catalog;

import java.io.Serializable;
import java.util.Collection;

/** 
 */
public class BeerCountry implements Serializable {

	private Collection<Beer> beers;

	private String name;

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

}
