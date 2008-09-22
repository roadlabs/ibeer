package ecom.ibeer.entity.catalog;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/** 
 */
public class BeerCountry implements Serializable{

	/**
 *
 */
private Collection<Beer> beers;

	
	
	/*
 * (non-javadoc)
 */
private String name;

	/*
 * (non-javadoc)
 */
private String flag;






	/**
	 * Getter of the property <tt>beers</tt>
	 *
	 * @return Returns the beers.
	 * 
	 */
	
	public Collection<Beer> getBeers()
	{
		return beers;
	}

	
	
	 
	/**
	 * Returns an iterator over the elements in this collection. 
	 *
	 * @return an <tt>Iterator</tt> over the elements in this collection
	 * @see	java.util.Collection#iterator()
	 * 
	 */
	public Iterator<Beer> beersIterator(){
		return beers.iterator();
	}
	
	/**
	 * Returns <tt>true</tt> if this collection contains no elements.
	 *
	 * @return <tt>true</tt> if this collection contains no elements
	 * @see	java.util.Collection#isEmpty()
	 *
	 */
	public boolean isBeersEmpty(){
		return beers.isEmpty();
	}
	
	/**
	 * Returns <tt>true</tt> if this collection contains the specified element. 
	 *
	 * @param element whose presence in this collection is to be tested.
	 * @see	java.util.Collection#contains(Object)
	 *
	 */
	public boolean containsBeers(Beer beers){
		return this.beers.contains(beers);
	}
	
	/**
	 * Returns <tt>true</tt> if this collection contains all of the elements
	 * in the specified collection.
	 *
	 * @param elements collection to be checked for containment in this collection.
	 * @see	java.util.Collection#containsAll(Collection)
	 *
	 */
	public boolean containsAllBeers(Collection<Beer> beers){
		return this.beers.containsAll(beers);
	}
	
	/**
	 * Returns the number of elements in this collection.
	 *
	 * @return the number of elements in this collection
	 * @see	java.util.Collection#size()
	 *
	 */
	public int beersSize(){
		return beers.size();
	}
	
	/**
	 * Returns all elements of this collection in an array.
	 *
	 * @return an array containing all of the elements in this collection
	 * @see	java.util.Collection#toArray()
	 *
	 */
	public Beer[] beersToArray(){
		return beers.toArray(new Beer[beers.size()]);
	}
	 
	/**
	 * Setter of the property <tt>beers</tt>
	 *
	 * @param beers the beers to set.
	 *
	 */
	public void setBeers(Collection<Beer> beers){
		this.beers = beers;
	}
	
	
	/**
	 * Ensures that this collection contains the specified element (optional
	 * operation). 
	 *
	 * @param element whose presence in this collection is to be ensured.
	 * @see	java.util.Collection#add(Object)
	 *
	 */
	public boolean addBeers(Beer beers){
		return this.beers.add(beers);
	}
	
	/**
	 * Removes a single instance of the specified element from this
	 * collection, if it is present (optional operation).
	 *
	 * @param element to be removed from this collection, if present.
	 * @see	java.util.Collection#add(Object)
	 *
	 */
	public boolean removeBeers(Beer beers){
		return this.beers.remove(beers);
	}
	
	/**
	 * Removes all of the elements from this collection (optional operation).
	 *
	 * @see	java.util.Collection#clear()
	 *
	 */
	public void clearBeers(){
		this.beers.clear();
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




	
	 
	/**
	 * Getter of the property <tt>flag</tt>
	 *
	 * @return Returns the flag.
	 * 
	 */
	
	public String getFlag()
	{
		return flag;
	}




	
	
	/**
	 * Setter of the property <tt>flag</tt>
	 *
	 * @param flag The flag to set.
	 *
	 */
	public void setFlag(String flag ){
		this.flag = flag;
	}

}
