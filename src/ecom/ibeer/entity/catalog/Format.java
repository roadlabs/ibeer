package ecom.ibeer.entity.catalog;

import java.io.Serializable;
import java.util.Collection;

/**
 * Represent the selling format of a product
 */
public class Format implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3239749668881956785L;

	/**
	 * Describe in a string this selling format.
	 */
	private String description;

	private Collection<Product> products;

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

}
