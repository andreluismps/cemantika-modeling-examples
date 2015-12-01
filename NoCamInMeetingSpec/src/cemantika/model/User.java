package cemantika.model;
 
import org.cemantika.metamodel.structure.ContextType; 
import org.cemantika.metamodel.structure.ContextualElement; 
import org.cemantika.metamodel.structure.ContextualEntity;
/**
 * This class implements a ContextualEntity with annotations 
 * A Contextual Entity is a class used to build context sensitive behaviors.
 */
@ContextualEntity
public class User {
 
	private String name; 
	@ContextualElement(type=ContextType.WHAT)
	private String currentSSID; 
	@ContextualElement(type=ContextType.WHEN)
	private String currentDateTIme; 
	@ContextualElement(type=ContextType.WHERE)
	private Location currentLocation;

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
	 * Returns the currentSSID.
	 *
	 * @return the currentSSID. 
	 */
	public String getCurrentSSID() {
		return currentSSID;
	}
	
	/**
	 * Get the currentSSID.
	 *
	 * @param currentSSID value. 
	 */		
	public void setCurrentSSID(String currentSSID) {
		this.currentSSID = currentSSID;
	}	
	/**
	 * Returns the currentDateTIme.
	 *
	 * @return the currentDateTIme. 
	 */
	public String getCurrentDateTIme() {
		return currentDateTIme;
	}
	
	/**
	 * Get the currentDateTIme.
	 *
	 * @param currentDateTIme value. 
	 */		
	public void setCurrentDateTIme(String currentDateTIme) {
		this.currentDateTIme = currentDateTIme;
	}	
	/**
	 * Returns the currentLocation.
	 *
	 * @return the currentLocation. 
	 */
	public Location getCurrentLocation() {
		return currentLocation;
	}
	
	/**
	 * Get the currentLocation.
	 *
	 * @param currentLocation value. 
	 */		
	public void setCurrentLocation(Location currentLocation) {
		this.currentLocation = currentLocation;
	}	
 
}