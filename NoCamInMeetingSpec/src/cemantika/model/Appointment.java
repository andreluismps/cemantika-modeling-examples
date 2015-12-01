package cemantika.model;
 
import org.cemantika.metamodel.structure.ContextType; 
import org.cemantika.metamodel.structure.ContextualElement; 
import org.cemantika.metamodel.structure.ContextualEntity;
/**
 * This class implements a ContextualEntity with annotations 
 * A Contextual Entity is a class used to build context sensitive behaviors.
 */

public class Appointment {
 
	private String name; 
	private String date; 
	private String begin; 
	private String end; 
	@ContextualElement(type=ContextType.WHEN)
	private Meeting src;

	/**
	 * Returns the name.
	 *
	 * @return the name. 
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Get the name.
	 *
	 * @param name value. 
	 */		
	public void setName(String name) {
		this.name = name;
	}	
	/**
	 * Returns the date.
	 *
	 * @return the date. 
	 */
	public String getDate() {
		return date;
	}
	
	/**
	 * Get the date.
	 *
	 * @param date value. 
	 */		
	public void setDate(String date) {
		this.date = date;
	}	
	/**
	 * Returns the begin.
	 *
	 * @return the begin. 
	 */
	public String getBegin() {
		return begin;
	}
	
	/**
	 * Get the begin.
	 *
	 * @param begin value. 
	 */		
	public void setBegin(String begin) {
		this.begin = begin;
	}	
	/**
	 * Returns the end.
	 *
	 * @return the end. 
	 */
	public String getEnd() {
		return end;
	}
	
	/**
	 * Get the end.
	 *
	 * @param end value. 
	 */		
	public void setEnd(String end) {
		this.end = end;
	}	
	/**
	 * Returns the src.
	 *
	 * @return the src. 
	 */
	public Meeting getSrc() {
		return src;
	}
	
	/**
	 * Get the src.
	 *
	 * @param src value. 
	 */		
	public void setSrc(Meeting src) {
		this.src = src;
	}	
 
}