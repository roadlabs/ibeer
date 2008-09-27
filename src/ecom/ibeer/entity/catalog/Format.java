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
public class Format implements Serializable {

	private static final long serialVersionUID = 3239749668881956785L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)	
	private long id;
	
	/**
	 * Describe in a string this selling format.
	 */
    @Column(nullable = false, length = 50)
	private String description;

    @OneToMany(mappedBy = "format", cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
