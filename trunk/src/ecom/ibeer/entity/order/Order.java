package ecom.ibeer.entity.order;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import ecom.ibeer.entity.Address;

/** 
 */
public class Order implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8046227351655231729L;
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)	
	private long id;
	
	@Temporal(TemporalType.DATE)
	private Date orderDate;
	
	@OneToMany(mappedBy = "orderLines", cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
	private Collection<OrderLine> orderLines = null;

	private int state;
	
	@Column(length = 8)
	private String totalPrice;
	
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "orderAddress_fk", nullable = false)
	private Address address = null;

	/**
	 * Getter of the property <tt>totalPrice</tt>
	 * 
	 * @return Returns the totalPrice.
	 * 
	 */
	public String getTotalPrice() {
		return totalPrice;
	}

	/**
	 * Setter of the property <tt>totalPrice</tt>
	 * 
	 * @param totalPrice
	 *            The totalPrice to set.
	 * 
	 */
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
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

	/**
	 * Getter of the property <tt>orderDate</tt>
	 * 
	 * @return Returns the orderDate.
	 * 
	 */
	public Date getOrderDate() {
		return orderDate;
	}

	/**
	 * Setter of the property <tt>orderDate</tt>
	 * 
	 * @param orderDate
	 *            The orderDate to set.
	 * 
	 */
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	/**
	 * Getter of the property <tt>orderLine</tt>
	 * 
	 * @return Returns the orderLine.
	 * 
	 */
	public Collection<OrderLine> getOrderLines() {
		return orderLines;
	}

	/**
	 * Setter of the property <tt>orderLine</tt>
	 * 
	 * @param orderLine
	 *            the orderLine to set.
	 * 
	 */
	public void setOrderLines(Collection<OrderLine> orderLine) {
		this.orderLines = orderLine;
	}

	/**
	 * Getter of the property <tt>address</tt>
	 * 
	 * @return Returns the adress.
	 * 
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * Setter of the property <tt>address</tt>
	 * 
	 * @param adress
	 *            The adress to set.
	 * 
	 */
	public void setAddress(Address adress) {
		this.address = adress;
	}

}
