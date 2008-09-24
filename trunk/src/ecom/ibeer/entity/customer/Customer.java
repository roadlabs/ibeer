package ecom.ibeer.entity.customer;

import java.io.Serializable;

import ecom.ibeer.entity.Address;

/** 
 */
public class Customer implements Serializable {

	private String lastName;

	private String firstName;

	private Address address = null;

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