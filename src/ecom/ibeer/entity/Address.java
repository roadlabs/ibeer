package ecom.ibeer.entity;

import java.io.Serializable;

/** 
 */
@Entity
@Table(name="Address")
public class Address implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4757308364712448492L;
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)	
	private long id;
    
    @Column(nullable = false)
	private int number;
	
	@Column(nullable = false, length = 20)
	private String street;

	@Column(nullable = false, length = 7)
	private String zipcode;

	@Column(nullable = false, length = 30)
	private String city;

	@Column(nullable = false, length = 20)
	private String country;

	/**
	 * Getter of the property <tt>number</tt>
	 * 
	 * @return Returns the number.
	 * 
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * Setter of the property <tt>number</tt>
	 * 
	 * @param number
	 *            The number to set.
	 * 
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/**
	 * Getter of the property <tt>street</tt>
	 * 
	 * @return Returns the street.
	 * 
	 */

	public String getStreet() {
		return street;
	}

	/**
	 * Setter of the property <tt>street</tt>
	 * 
	 * @param street
	 *            The street to set.
	 * 
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * Getter of the property <tt>zipcode</tt>
	 * 
	 * @return Returns the zipcode.
	 * 
	 */
	public String getZipcode() {
		return zipcode;
	}

	/**
	 * Setter of the property <tt>zipcode</tt>
	 * 
	 * @param zipcode
	 *            The zipcode to set.
	 * 
	 */
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	/**
	 * Getter of the property <tt>city</tt>
	 * 
	 * @return Returns the city.
	 * 
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Setter of the property <tt>city</tt>
	 * 
	 * @param city
	 *            The city to set.
	 * 
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Getter of the property <tt>country</tt>
	 * 
	 * @return Returns the country.
	 * 
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * Setter of the property <tt>country</tt>
	 * 
	 * @param country
	 *            The country to set.
	 * 
	 */
	public void setCountry(String country) {
		this.country = country;
	}

}
