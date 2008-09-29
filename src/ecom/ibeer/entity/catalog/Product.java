package ecom.ibeer.entity.catalog;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Product implements Serializable {

	private static final long serialVersionUID = -5256365839879279605L;
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)	
	private long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "format_fk", nullable = false)
	private Format format = null;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "beer_fk", nullable = false)
	private Beer beer = null;
    
    /*
     * The link of table OrderLine
     * Added by Tianyi
     * start
     * */
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "product", nullable = false)
	private OrderLine orderLine = null;
    /*
     * finish
     * */

	private double sellPrice;

	private double buyPrice;

	private int stock;

	@Temporal(TemporalType.DATE)
	private Date creationDate;

	@Temporal(TemporalType.DATE)
	private Date modificationDate;

	private double weight;

	/**
	 * Getter of the property <tt>creationDate</tt>
	 * 
	 * @return Returns the creationDate.
	 * 
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/**
	 * Setter of the property <tt>creationDate</tt>
	 * 
	 * @param creationDate
	 *            The creationDate to set.
	 * 
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	/**
	 * Getter of the property <tt>stock</tt>
	 * 
	 * @return Returns the stock.
	 * 
	 */
	public int getStock() {
		return stock;
	}

	/**
	 * Setter of the property <tt>stock</tt>
	 * 
	 * @param stock
	 *            The stock to set.
	 * 
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}

	/**
	 * Getter of the property <tt>buyPrice</tt>
	 * 
	 * @return Returns the buyPrice.
	 * 
	 */
	public double getBuyPrice() {
		return buyPrice;
	}

	/**
	 * Setter of the property <tt>buyPrice</tt>
	 * 
	 * @param buyPrice
	 *            The buyPrice to set.
	 * 
	 */
	public void setBuyPrice(double buyPrice) {
		this.buyPrice = buyPrice;
	}

	/**
	 * Getter of the property <tt>format</tt>
	 * 
	 * @return Returns the format.
	 * 
	 */
	public Format getFormat() {
		return format;
	}

	/**
	 * Setter of the property <tt>format</tt>
	 * 
	 * @param format
	 *            The format to set.
	 * 
	 */
	public void setFormat(Format format) {
		this.format = format;
	}

	/**
	 * Getter of the property <tt>beer</tt>
	 * 
	 * @return Returns the beer.
	 * 
	 */
	public Beer getBeer() {
		return beer;
	}

	/**
	 * Setter of the property <tt>beer</tt>
	 * 
	 * @param beer
	 *            The beer to set.
	 * 
	 */
	public void setBeer(Beer beer) {
		this.beer = beer;
	}

	/**
	 * Getter of the property <tt>sellPrice</tt>
	 * 
	 * @return Returns the sellPrice.
	 * 
	 */
	public double getSellPrice() {
		return sellPrice;
	}

	/**
	 * Setter of the property <tt>sellPrice</tt>
	 * 
	 * @param sellPrice
	 *            The sellPrice to set.
	 * 
	 */
	public void setSellPrice(double sellPrice) {
		this.sellPrice = sellPrice;
	}

	/**
	 * Getter of the property <tt>modificationDate</tt>
	 * 
	 * @return Returns the modificationDate.
	 * 
	 */
	public Date getModificationDate() {
		return modificationDate;
	}

	/**
	 * Setter of the property <tt>modificationDate</tt>
	 * 
	 * @param modificationDate
	 *            The modificationDate to set.
	 * 
	 */
	public void setModificationDate(Date modificationDate) {
		this.modificationDate = modificationDate;
	}

	/**
	 * Getter of the property <tt>weight</tt>
	 * 
	 * @return Returns the weight.
	 * 
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * Setter of the property <tt>weight</tt>
	 * 
	 * @param weight
	 *            The weight to set.
	 * 
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
