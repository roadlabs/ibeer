package ecom.ibeer.entity.order; 

import ecom.ibeer.entity.catalog.Product;
import ecom.ibeer.entity.exceptions.ValidationException;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

/** 
 */
@Entity
@Table(name="OrderLine")
@NamedQuery(name = "allOrderLine", query = "select o FROM OrderLine o")
public class OrderLine implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3151196895710457340L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)	
	private long id;
    
    @Column(nullable = false)
	private int quantity;

    @OneToOne
    @JoinColumn(name = "product_fk", nullable = false)
	private Product product = null;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "orderLines_fk", nullable = false)
	private Order order = null;

	private int state;

	
	@PrePersist
	@PreUpdate
	private void validateData(){
		if(quantity<0){
			throw new ValidationException("Invalid quantity for the order");
		}
	}
	
	/**
	 * Getter of the property <tt>priceAtBuy</tt>
	 * 
	 * @return Returns the priceAtBuy.
	 * 
	 */
	public double getPriceAtBuy() {
		return product.getSellPrice()*quantity;
	}
	
	/**
	 * Getter of the property <tt>quantity</tt>
	 * 
	 * @return Returns the quantity.
	 * 
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * Setter of the property <tt>quantity</tt>
	 * 
	 * @param quantity
	 *            The quantity to set.
	 * 
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * Getter of the property <tt>product</tt>
	 * 
	 * @return Returns the product.
	 * 
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * Setter of the property <tt>product</tt>
	 * 
	 * @param product
	 *            The product to set.
	 * 
	 */
	public void setProduct(Product product) {
		this.product = product;
	}

	/**
	 * Getter of the property <tt>order</tt>
	 * 
	 * @return Returns the order.
	 * 
	 */

	public Order getOrder() {
		return order;
	}

	/**
	 * Setter of the property <tt>order</tt>
	 * 
	 * @param order
	 *            The order to set.
	 * 
	 */
	public void setOrder(Order order) {
		this.order = order;
	}

	/**
	 * Getter of the property <tt>state</tt>
	 * 
	 * @return Returns the state.
	 * 
	 */
	public int getState() {
		return state;
	}

	/**
	 * Setter of the property <tt>state</tt>
	 * 
	 * @param state
	 *            The state to set.
	 * 
	 */
	public void setState(int state) {
		this.state = state;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public boolean equals(OrderLine orderLine){
		if(orderLine.getId() == this.getId()
				&& orderLine.getQuantity() == this.getQuantity()
				&& orderLine.getProduct() == this.getProduct()
				&& orderLine.getOrder() == this.getOrder()
				&& orderLine.getState() == this.getState()){
			return true;
		}
		return false;
	}
	
	public String toString(OrderLine orderLine){
		String s = "Id of OrderLine is : " + orderLine.getId() + "\n" +
				"quantity of OrderLine is : " + orderLine.getQuantity() + "\n" +
				"product of OrderLine is : " + orderLine.getProduct().toString() + "\n" +
				"order of OrderLine is : " + orderLine.getOrder().toString() + "\n" +
				"state of OrderLine is : " + orderLine.getState();
		return s;
	}
}
