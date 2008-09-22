package ecom.ibeer.entity.order;

import ecom.ibeer.entity.Adress;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

/** 
 */
public class Order implements Serializable {

	/*
 * (non-javadoc)
 */
private Date orderDate;

	
	 
	/**
 *
 */
private Collection<OrderLine> orderLine = null;



	/*
 * (non-javadoc)
 */
private int state;
 
/*
 * (non-javadoc)
 */
private String totalPrice;
 
/*
 * (non-javadoc)
 */
private Adress adress = null;

/**
 * Getter of the property <tt>totalPrice</tt>
 *
 * @return Returns the totalPrice.
 * 
 */

public String getTotalPrice()
{
	return totalPrice;
}

/**
 * Setter of the property <tt>totalPrice</tt>
 *
 * @param totalPrice The totalPrice to set.
 *
 */
public void setTotalPrice(String totalPrice ){
	this.totalPrice = totalPrice;
}



/**
 * Getter of the property <tt>state</tt>
 *
 * @return Returns the state.
 * 
 */

public int getState()
{
	return state;
}

/**
 * Setter of the property <tt>state</tt>
 *
 * @param state The state to set.
 *
 */
public void setState(int state ){
	this.state = state;
}

/**
	 * Getter of the property <tt>orderDate</tt>
	 *
	 * @return Returns the orderDate.
	 * 
	 */
	
	public Date getOrderDate()
	{
		return orderDate;
	}

	
	
	/**
	 * Setter of the property <tt>orderDate</tt>
	 *
	 * @param orderDate The orderDate to set.
	 *
	 */
	public void setOrderDate(Date orderDate ){
		this.orderDate = orderDate;
	}



	
	
	/**
	 * Getter of the property <tt>orderLine</tt>
	 *
	 * @return Returns the orderLine.
	 * 
	 */
	
	public Collection<OrderLine> getOrderLine()
	{
		return orderLine;
	}



	
	
	 
	/**
	 * Returns an iterator over the elements in this collection. 
	 *
	 * @return an <tt>Iterator</tt> over the elements in this collection
	 * @see	java.util.Collection#iterator()
	 * 
	 */
	public Iterator<OrderLine> orderLineIterator(){
		return orderLine.iterator();
	}
	
	/**
	 * Returns <tt>true</tt> if this collection contains no elements.
	 *
	 * @return <tt>true</tt> if this collection contains no elements
	 * @see	java.util.Collection#isEmpty()
	 *
	 */
	public boolean isOrderLineEmpty(){
		return orderLine.isEmpty();
	}
	
	/**
	 * Returns <tt>true</tt> if this collection contains the specified element. 
	 *
	 * @param element whose presence in this collection is to be tested.
	 * @see	java.util.Collection#contains(Object)
	 *
	 */
	public boolean containsOrderLine(OrderLine orderLine){
		return this.orderLine.contains(orderLine);
	}
	
	/**
	 * Returns <tt>true</tt> if this collection contains all of the elements
	 * in the specified collection.
	 *
	 * @param elements collection to be checked for containment in this collection.
	 * @see	java.util.Collection#containsAll(Collection)
	 *
	 */
	public boolean containsAllOrderLine(Collection<OrderLine> orderLine){
		return this.orderLine.containsAll(orderLine);
	}
	
	/**
	 * Returns the number of elements in this collection.
	 *
	 * @return the number of elements in this collection
	 * @see	java.util.Collection#size()
	 *
	 */
	public int orderLineSize(){
		return orderLine.size();
	}
	
	/**
	 * Returns all elements of this collection in an array.
	 *
	 * @return an array containing all of the elements in this collection
	 * @see	java.util.Collection#toArray()
	 *
	 */
	public OrderLine[] orderLineToArray(){
		return orderLine.toArray(new OrderLine[orderLine.size()]);
	}
	 
	/**
	 * Setter of the property <tt>orderLine</tt>
	 *
	 * @param orderLine the orderLine to set.
	 *
	 */
	public void setOrderLine(Collection<OrderLine> orderLine){
		this.orderLine = orderLine;
	}
	
	
	/**
	 * Ensures that this collection contains the specified element (optional
	 * operation). 
	 *
	 * @param element whose presence in this collection is to be ensured.
	 * @see	java.util.Collection#add(Object)
	 *
	 */
	public boolean addOrderLine(OrderLine orderLine){
		return this.orderLine.add(orderLine);
	}
	
	/**
	 * Removes a single instance of the specified element from this
	 * collection, if it is present (optional operation).
	 *
	 * @param element to be removed from this collection, if present.
	 * @see	java.util.Collection#add(Object)
	 *
	 */
	public boolean removeOrderLine(OrderLine orderLine){
		return this.orderLine.remove(orderLine);
	}
	
	/**
	 * Removes all of the elements from this collection (optional operation).
	 *
	 * @see	java.util.Collection#clear()
	 *
	 */
	public void clearOrderLine(){
		this.orderLine.clear();
	}

	
	 
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

}

///**
//	 * Getter of the property <tt>state</tt>
//	 *
//	 * @return Returns the state.
//	 * 
//	 */
//	
//	public int getState()
//	{
//		return state;
//	}
///**
//	 * Setter of the property <tt>state</tt>
//	 *
//	 * @param state The state to set.
//	 *
//	 */
//	public void setState(int state ){
//		this.state = state;
//	}
///**
// * Getter of the property <tt>state</tt>
// *
// * @return Returns the state.
// * 
// */
//
//public int getState()
//{
//	return state;
//}
///**
// * Setter of the property <tt>state</tt>
// *
// * @param state The state to set.
// *
// */
//public void setState(int state ){
//	this.state = state;
//}
///**
//	 * Setter of the property <tt>totalPrice</tt>
//	 *
//	 * @param totalPrice The totalPrice to set.
//	 *
//	 */
//	public void setTotalPrice(String totalPrice ){
//		this.totalPrice = totalPrice;
//	}
///**
//	 * Getter of the property <tt>totalPrice</tt>
//	 *
//	 * @return Returns the totalPrice.
//	 * 
//	 */
//	
//	public String getTotalPrice()
//	{
//		return totalPrice;
//	}