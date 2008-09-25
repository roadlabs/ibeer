package ecom.ibeer.entity.catalog;

import java.io.Serializable;
import java.util.Collection;

public class Beer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5375703535249391646L;

	private BeerCountry beerCountry = null;

	private BeerType beerType = null;

	private BeerBrand beerBrand = null;

	private BeerCategory beerCategory = null;

	private Collection<Product> products;

	private double alcohol;

	private String description;

	private String picture;

	private String name;

	/**
	 * Getter of the property <tt>beerCountry</tt>
	 * 
	 * @return Returns the beerCountry.
	 * 
	 */
	public BeerCountry getBeerCountry() {
		return beerCountry;
	}

	/**
	 * Setter of the property <tt>beerCountry</tt>
	 * 
	 * @param beerCountry
	 *            The beerCountry to set.
	 * 
	 */
	public void setBeerCountry(BeerCountry beerCountry) {
		this.beerCountry = beerCountry;
	}

	/**
	 * Getter of the property <tt>beerType</tt>
	 * 
	 * @return Returns the beerType.
	 * 
	 */
	public BeerType getBeerType() {
		return beerType;
	}

	/**
	 * Setter of the property <tt>beerType</tt>
	 * 
	 * @param beerType
	 *            The beerType to set.
	 * 
	 */
	public void setBeerType(BeerType beerType) {
		this.beerType = beerType;
	}

	/**
	 * Getter of the property <tt>beerBrand</tt>
	 * 
	 * @return Returns the beerBrand.
	 * 
	 */
	public BeerBrand getBeerBrand() {
		return beerBrand;
	}

	/**
	 * Setter of the property <tt>beerBrand</tt>
	 * 
	 * @param beerBrand
	 *            The beerBrand to set.
	 * 
	 */
	public void setBeerBrand(BeerBrand beerBrand) {
		this.beerBrand = beerBrand;
	}

	/**
	 * Getter of the property <tt>beerCategory</tt>
	 * 
	 * @return Returns the beerCategory.
	 * 
	 */
	public BeerCategory getBeerCategory() {
		return beerCategory;
	}

	/**
	 * Setter of the property <tt>beerCategory</tt>
	 * 
	 * @param beerCategory
	 *            The beerCategory to set.
	 * 
	 */
	public void setBeerCategory(BeerCategory beerCategory) {
		this.beerCategory = beerCategory;
	}

	/**
	 * Getter of the property <tt>products</tt>
	 * 
	 * @return Returns the products.
	 * 
	 */
	public Collection<Product> getProducts() {
		return products;
	}

	/**
	 * Setter of the property <tt>products</tt>
	 * 
	 * @param products
	 *            the products to set.
	 * 
	 */
	public void setProducts(Collection<Product> products) {
		this.products = products;
	}

	/**
	 * Getter of the property <tt>alcool</tt>
	 * 
	 * @return Returns the alcool.
	 * 
	 */
	public double getAlcohol() {
		return alcohol;
	}

	/**
	 * Setter of the property <tt>alcool</tt>
	 * 
	 * @param alcool
	 *            The alcool to set.
	 * 
	 */
	public void setAlcool(double alcohol) {
		this.alcohol = alcohol;
	}

	/**
	 * Getter of the property <tt>description</tt>
	 * 
	 * @return Returns the description.
	 * 
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Setter of the property <tt>description</tt>
	 * 
	 * @param description
	 *            The description to set.
	 * 
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Getter of the property <tt>picture</tt>
	 * 
	 * @return Returns the picture.
	 * 
	 */
	public String getPicture() {
		return picture;
	}

	/**
	 * Setter of the property <tt>picture</tt>
	 * 
	 * @param picture
	 *            The picture to set.
	 * 
	 */
	public void setPicture(String picture) {
		this.picture = picture;
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
