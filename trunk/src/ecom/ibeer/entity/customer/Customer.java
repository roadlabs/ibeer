package ecom.ibeer.entity.customer;

import java.io.Serializable;

import ecom.ibeer.entity.Address;

/** 
 */
@Entity
@Table(name="Customer")
public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2289308495016380374L;
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)	
	private long id;
    
	@Column(nullable = false, length = 20)
	private String lastName;
	
	@Column(nullable = false, length = 20)
	private String firstName;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "customerAddress_fk", nullable = false)
	private Address address = null;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "customerWishList_fk")
	private WishList wishList = null;

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

}