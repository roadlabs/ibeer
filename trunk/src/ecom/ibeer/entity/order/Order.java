package ecom.ibeer.entity.order; 

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import ecom.ibeer.entity.Address;

/** 
 */
@Entity
@Table(name="Order")
public class Order implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8046227351655231729L;
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)	
	private long id;
	
	@Temporal(TemporalType.DATE)
	private Date orderDate = null;
	
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "orders_fk", nullable = false)
	private Customer customer = null;
    
	@OneToMany(mappedBy = "orderLines", cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
	private Collection<OrderLine> orderLines = null;

	private int state;
	
	private float totalPrice;
	
    @OneToOne(fetch = FetchType.EAGER, nullable = false)
    @JoinColumn(name = "address_fk", nullable = false)
	private Address address = null;

    
    @PrePersist
    private void setDefaultData(){
    	orderDate = new Date();
    }
    
	/**
	 * Getter of the property <tt>totalPrice</tt>
	 * 
	 * @return Returns the totalPrice.
	 * 
	 */
	public float getTotalPrice() {
		if(orderLines==null||orderLines.isEmpty()){
			return 0;
		}else{
			float price=0;
			for(int i=0; i<orderLines.size(); i++){
				price += orderLines.get(i).getPriceAtBuy();
			}
			totalPrice = price;
		}
		return totalPrice;
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
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public boolean equals(Order order){
		if(order.getId() == this.getId()
				&& order.getState() == this.getState()
				&& order.getOrderDate() == this.getOrderDate()
				&& order.getOrderLines() == this.getOrderLines()
				&& order.getAddress() == this.getAddress()){
			return true;
		}
		return false;
	}
	
	public String toString(Order order){
		String s = "Id of Order is : " + order.getId() + "\n" +
				"orderDate of Order is : " + order.getOrderDate().toString() + "\n" +
				"address of Order is : " + order.getAddress().toString() + "\n" +
				"state of Order is : " + order.getState();
		for (int i=0; i<order.getOrderLines().size(); i++){
			s += "No."+i+" orderLine is : " + order.getOrderLines().get(i).toString() + "\n" +
		}
		return s;
	}
}
