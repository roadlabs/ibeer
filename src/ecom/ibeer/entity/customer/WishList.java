package ecom.ibeer.entity.customer; 

import java.io.Serializable;
import java.util.Collection;
import java.util.Vector;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import ecom.ibeer.entity.catalog.Product;

/** 
 * 
 */
@Entity
@Table(name="WishList")
@NamedQuery(name = "allWishList", query = "select o FROM WishList o")
public class WishList implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9181454749991066506L;
	
	@OneToMany(mappedBy = "wishList", cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
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

	public boolean equals(WishList wishList){
		if(wishList.getProducts() == this.getProducts()){
			return true;
		}
		return false;
	}
	
	public String toString(WishList wishList){
		String s = "" ;
		for (int i=0; i<wishList.getProducts().size(); i++){
			s += "No."+i+" product of wishList is : " + ((Vector)wishList.getProducts()).get(i).toString() + "\n";
		}
		return s;
	}
}
