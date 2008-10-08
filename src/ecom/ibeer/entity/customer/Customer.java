package ecom.ibeer.entity.customer; 

import java.io.Serializable;

import ecom.ibeer.entity.Address;

/** 
 */
@Entity
@Table(name="Customer")
@NamedQuery(name = "allCustomers", query = "select o FROM Customer o")
public class Customer implements Serializable {

	private static final long serialVersionUID = 2289308495016380374L;
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)	
	private long id;
    
	@Column(nullable = false, length = 20)
	private String lastName;
	
	@Column(nullable = false, length = 20)
	private String firstName;

    @OneToOne
    @JoinColumn(name = "address_fk", nullable = false)
	private Address address = null;

    @OneToOne
    @JoinColumn(name = "customerWishList_fk", nullable = false)
	private WishList wishList = null;
    
	@OneToMany(mappedBy = "orders_fk", cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
	private Collection<Order> orders = null;

	
	@PrePersist
	@PreUpdate
	private void validateData(){
		if(firstName == null || "".equals(firstName)){
			throw new ValidationException("Invalid firstName");
		}
		if(lastName == null || "".equals(lastName)){
			throw new ValidationException("Invalid lastName");
		}
	}
	
	/*
	@PostLoad
	@PostPersist
	@PostUpdate
	public void calculateAge(){
		
	}*/
	
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

	/**
	 * Getter of the property <tt>firstName</tt>
	 * 
	 * @return Returns the firstName.
	 * 
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Setter of the property <tt>firstName</tt>
	 * 
	 * @param firstName
	 *            The firstName to set.
	 * 
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Getter of the property <tt>lastName</tt>
	 * 
	 * @return Returns the lastName.
	 * 
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Setter of the property <tt>lastName</tt>
	 * 
	 * @param lastName
	 *            The lastName to set.
	 * 
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Getter of the property <tt>wishList</tt>
	 * 
	 * @return Returns the wishList.
	 * 
	 */

	public WishList getWishList() {
		return wishList;
	}

	/**
	 * Setter of the property <tt>wishList</tt>
	 * 
	 * @param wishList
	 *            The wishList to set.
	 * 
	 */
	public void setWishList(WishList wishList) {
		this.wishList = wishList;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Collection<Order> getOrders() {
		return orders;
	}

	public void setOrders(Collection<Order> orders) {
		this.orders = orders;
	}
	
	public boolean equals(Customer customer){
		if(customer.getId() == this.getId()
				&& customer.getFirstName() == this.getFirstName()
				&& customer.getLastName() == this.getLastName()
				&& customer.getWishList() == this.getWishList()
				&& customer.getAddress() == this.getAddress()
				&& customer.getOrders() == this.getOrders()){
			return true;
		}
		return false;
	}
	
	public String toString(Customer customer){
		String s = "Id of customer is : " + customer.getId() + "\n" +
				"FirstName of customer is : " + customer.getFirstName() + "\n" +
				"LastName of customer is : " + customer.getLastName() + "\n" +
				"address of customer is : " + customer.getAddress() + "\n" +
				"wishList of customer is : " + customer.getWishList();
		for (int i=0; i<customer.getOrders().size(); i++){
			s += "No."+i+" order is : " + customer.getOrders().get(i).toString() + "\n" +
		}
		return s;
	}
}