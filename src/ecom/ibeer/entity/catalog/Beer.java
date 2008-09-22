package ecom.ibeer.entity.catalog;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

public class Beer implements Serializable {

	/*
 * (non-javadoc)
 */
private BeerCountry beerCountry = null;

	
	 
	/*
 * (non-javadoc)
 */
private BeerType beerType = null;



	/*
 * (non-javadoc)
 */
private BeerBrand beerBrand = null;





	/*
 * (non-javadoc)
 */
private BeerCategory beerCategory = null;





	/**
 *
 */
private Collection<Product> products;





	/*
 * (non-javadoc)
 */
private double alcool;

	/*
 * (non-javadoc)
 */
private String description;





	/*
 * (non-javadoc)
 */
private String picture;





	/*
 * (non-javadoc)
 */
private String name;





	/**
	 * Getter of the property <tt>beerCountry</tt>
	 *
	 * @return Returns the beerCountry.
	 * 
	 */
	
	public BeerCountry getBeerCountry()
	{
		return beerCountry;
	}

	
	
	/**
	 * Setter of the property <tt>beerCountry</tt>
	 *
	 * @param beerCountry The beerCountry to set.
	 *
	 */
	public void setBeerCountry(BeerCountry beerCountry ){
		this.beerCountry = beerCountry;
	}



	
	 
	/**
	 * Getter of the property <tt>beerType</tt>
	 *
	 * @return Returns the beerType.
	 * 
	 */
	
	public BeerType getBeerType()
	{
		return beerType;
	}



	
	
	/**
	 * Setter of the property <tt>beerType</tt>
	 *
	 * @param beerType The beerType to set.
	 *
	 */
	public void setBeerType(BeerType beerType ){
		this.beerType = beerType;
	}



	
	 
	/**
	 * Getter of the property <tt>beerBrand</tt>
	 *
	 * @return Returns the beerBrand.
	 * 
	 */
	
	public BeerBrand getBeerBrand()
	{
		return beerBrand;
	}



	
	
	/**
	 * Setter of the property <tt>beerBrand</tt>
	 *
	 * @param beerBrand The beerBrand to set.
	 *
	 */
	public void setBeerBrand(BeerBrand beerBrand ){
		this.beerBrand = beerBrand;
	}



	
	 
	/**
	 * Getter of the property <tt>beerCategory</tt>
	 *
	 * @return Returns the beerCategory.
	 * 
	 */
	
	public BeerCategory getBeerCategory()
	{
		return beerCategory;
	}



	
	
	/**
	 * Setter of the property <tt>beerCategory</tt>
	 *
	 * @param beerCategory The beerCategory to set.
	 *
	 */
	public void setBeerCategory(BeerCategory beerCategory ){
		this.beerCategory = beerCategory;
	}



	
	
	/**
	 * Getter of the property <tt>products</tt>
	 *
	 * @return Returns the products.
	 * 
	 */
	
	public Collection<Product> getProducts()
	{
		return products;
	}



	
	
	 
	/**
	 * Returns an iterator over the elements in this collection. 
	 *
	 * @return an <tt>Iterator</tt> over the elements in this collection
	 * @see	java.util.Collection#iterator()
	 * 
	 */
	public Iterator<Product> productsIterator(){
		return products.iterator();
	}
	
	/**
	 * Returns <tt>true</tt> if this collection contains no elements.
	 *
	 * @return <tt>true</tt> if this collection contains no elements
	 * @see	java.util.Collection#isEmpty()
	 *
	 */
	public boolean isProductsEmpty(){
		return products.isEmpty();
	}
	
	/**
	 * Returns <tt>true</tt> if this collection contains the specified element. 
	 *
	 * @param element whose presence in this collection is to be tested.
	 * @see	java.util.Collection#contains(Object)
	 *
	 */
	public boolean containsProducts(Product products){
		return this.products.contains(products);
	}
	
	/**
	 * Returns <tt>true</tt> if this collection contains all of the elements
	 * in the specified collection.
	 *
	 * @param elements collection to be checked for containment in this collection.
	 * @see	java.util.Collection#containsAll(Collection)
	 *
	 */
	public boolean containsAllProducts(Collection<Product> products){
		return this.products.containsAll(products);
	}
	
	/**
	 * Returns the number of elements in this collection.
	 *
	 * @return the number of elements in this collection
	 * @see	java.util.Collection#size()
	 *
	 */
	public int productsSize(){
		return products.size();
	}
	
	/**
	 * Returns all elements of this collection in an array.
	 *
	 * @return an array containing all of the elements in this collection
	 * @see	java.util.Collection#toArray()
	 *
	 */
	public Product[] productsToArray(){
		return products.toArray(new Product[products.size()]);
	}
	 
	/**
	 * Setter of the property <tt>products</tt>
	 *
	 * @param products the products to set.
	 *
	 */
	public void setProducts(Collection<Product> products){
		this.products = products;
	}
	
	
	/**
	 * Ensures that this collection contains the specified element (optional
	 * operation). 
	 *
	 * @param element whose presence in this collection is to be ensured.
	 * @see	java.util.Collection#add(Object)
	 *
	 */
	public boolean addProducts(Product products){
		return this.products.add(products);
	}
	
	/**
	 * Removes a single instance of the specified element from this
	 * collection, if it is present (optional operation).
	 *
	 * @param element to be removed from this collection, if present.
	 * @see	java.util.Collection#add(Object)
	 *
	 */
	public boolean removeProducts(Product products){
		return this.products.remove(products);
	}
	
	/**
	 * Removes all of the elements from this collection (optional operation).
	 *
	 * @see	java.util.Collection#clear()
	 *
	 */
	public void clearProducts(){
		this.products.clear();
	}



	
	 
	/**
	 * Getter of the property <tt>alcool</tt>
	 *
	 * @return Returns the alcool.
	 * 
	 */
	
	public double getAlcool()
	{
		return alcool;
	}



	
	
	/**
	 * Setter of the property <tt>alcool</tt>
	 *
	 * @param alcool The alcool to set.
	 *
	 */
	public void setAlcool(double alcool ){
		this.alcool = alcool;
	}



	
	 
	/**
	 * Getter of the property <tt>description</tt>
	 *
	 * @return Returns the description.
	 * 
	 */
	
	public String getDescription()
	{
		return description;
	}



	
	
	/**
	 * Setter of the property <tt>description</tt>
	 *
	 * @param description The description to set.
	 *
	 */
	public void setDescription(String description ){
		this.description = description;
	}



	
	 
	/**
	 * Getter of the property <tt>picture</tt>
	 *
	 * @return Returns the picture.
	 * 
	 */
	
	public String getPicture()
	{
		return picture;
	}



	
	
	/**
	 * Setter of the property <tt>picture</tt>
	 *
	 * @param picture The picture to set.
	 *
	 */
	public void setPicture(String picture ){
		this.picture = picture;
	}



	
	 
	/**
	 * Getter of the property <tt>name</tt>
	 *
	 * @return Returns the name.
	 * 
	 */
	
	public String getName()
	{
		return name;
	}



	
	
	/**
	 * Setter of the property <tt>name</tt>
	 *
	 * @param name The name to set.
	 *
	 */
	public void setName(String name ){
		this.name = name;
	}

}
