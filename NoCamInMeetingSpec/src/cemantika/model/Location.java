package cemantika.model;
 
import org.cemantika.metamodel.structure.ContextType; 
import org.cemantika.metamodel.structure.ContextualElement; 
import org.cemantika.metamodel.structure.ContextualEntity;
/**
 * This class implements a ContextualEntity with annotations 
 * A Contextual Entity is a class used to build context sensitive behaviors.
 */

public class Location {
 
	private Object latitude; 
	private Object longitude; 
	private Object altitude; 
	private String name;

	/**
	 * Returns the latitude.
	 *
	 * @return the latitude. 
	 */
	public Object getLatitude() {
		return latitude;
	}
	
	/**
	 * Get the latitude.
	 *
	 * @param latitude value. 
	 */		
	public void setLatitude(Object latitude) {
		this.latitude = latitude;
	}	
	/**
	 * Returns the longitude.
	 *
	 * @return the longitude. 
	 */
	public Object getLongitude() {
		return longitude;
	}
	
	/**
	 * Get the longitude.
	 *
	 * @param longitude value. 
	 */		
	public void setLongitude(Object longitude) {
		this.longitude = longitude;
	}	
	/**
	 * Returns the altitude.
	 *
	 * @return the altitude. 
	 */
	public Object getAltitude() {
		return altitude;
	}
	
	/**
	 * Get the altitude.
	 *
	 * @param altitude value. 
	 */		
	public void setAltitude(Object altitude) {
		this.altitude = altitude;
	}	
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
 
}