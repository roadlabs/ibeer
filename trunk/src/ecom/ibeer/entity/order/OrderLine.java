package ecom.ibeer.entity.order;

import ecom.ibeer.entity.catalog.Product;
import java.io.Serializable;

/** 
 */
public class OrderLine implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3151196895710457340L;

	private int quantity;

	private double priceAtBuy;

	private Product product = null;

	private Order order = null;

	private int state;

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
	 * Getter of the property <tt>priceAtBuy</tt>
	 * 
	 * @return Returns the priceAtBuy.
	 * 
	 */
	public double getPriceAtBuy() {
		return priceAtBuy;
	}

	/**
	 * Setter of the property <tt>priceAtBuy</tt>
	 * 
	 * @param priceAtBuy
	 *            The priceAtBuy to set.
	 * 
	 */
	public void setPriceAtBuy(double priceAtBuy) {
		this.priceAtBuy = priceAtBuy;
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

}
