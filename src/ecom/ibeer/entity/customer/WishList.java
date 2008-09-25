package ecom.ibeer.entity.customer;

import java.io.Serializable;
import java.util.Collection;

import ecom.ibeer.entity.catalog.Product;

/** 
 */
public class WishList implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9181454749991066506L;
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

}
