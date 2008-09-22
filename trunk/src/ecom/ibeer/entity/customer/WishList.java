package ecom.ibeer.entity.customer;

import ecom.ibeer.entity.catalog.Product;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/** 
 */
public class WishList implements Serializable {

	/**
 *
 */
private Collection<Product> products;

	
	
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

}
