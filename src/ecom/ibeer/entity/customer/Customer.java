package ecom.ibeer.entity.customer;

import ecom.ibeer.entity.Adress;
import java.io.Serializable;

/** 
 */
public class Customer implements Serializable{

	/*
 * (non-javadoc)
 */
private String lastName;



	/*
 * (non-javadoc)
 */
private String firstName;
 
/*
 * (non-javadoc)
 */
private Adress adress = null;
 
/*
 * (non-javadoc)
 */
private WishList wishList = null;





/**
 * Getter of the property <tt>adress</tt>
 *
 * @return Returns the adress.
 * 
 */

public Adress getAdress()
{
	return adress;
}

/**
 * Setter of the property <tt>adress</tt>
 *
 * @param adress The adress to set.
 *
 */
public void setAdress(Adress adress ){
	this.adress = adress;
}



/**
 * Getter of the property <tt>firstName</tt>
 *
 * @return Returns the firstName.
 * 
 */

public String getFirstName()
{
	return firstName;
}

/**
 * Setter of the property <tt>firstName</tt>
 *
 * @param firstName The firstName to set.
 *
 */
public void setFirstName(String firstName ){
	this.firstName = firstName;
}





	/**
	 * Getter of the property <tt>lastName</tt>
	 *
	 * @return Returns the lastName.
	 * 
	 */
	
	public String getLastName()
	{
		return lastName;
	}



	
	
	/**
	 * Setter of the property <tt>lastName</tt>
	 *
	 * @param lastName The lastName to set.
	 *
	 */
	public void setLastName(String lastName ){
		this.lastName = lastName;
	}

	
	 
	/**
	 * Getter of the property <tt>wishList</tt>
	 *
	 * @return Returns the wishList.
	 * 
	 */
	
	public WishList getWishList()
	{
		return wishList;
	}

	
	
	/**
	 * Setter of the property <tt>wishList</tt>
	 *
	 * @param wishList The wishList to set.
	 *
	 */
	public void setWishList(WishList wishList ){
		this.wishList = wishList;
	}

}

///**
//	 * Setter of the property <tt>name</tt>
//	 *
//	 * @param name The name to set.
//	 *
//	 */
//	public void setName(String name ){
//		this.name = name;
//	}
///**
//	 * Getter of the property <tt>name</tt>
//	 *
//	 * @return Returns the name.
//	 * 
//	 */
//	
//	public String getName()
//	{
//		return name;
//	}
///**
//	 * Getter of the property <tt>adress</tt>
//	 *
//	 * @return Returns the adress.
//	 * 
//	 */
//	
//	public Adress getAdress()
//	{
//		return adress;
//	}
///**
//	 * Setter of the property <tt>adress</tt>
//	 *
//	 * @param adress The adress to set.
//	 *
//	 */
//	public void setAdress(Adress adress ){
//		this.adress = adress;
//	}