package cemantika.model;
 
import org.cemantika.metamodel.structure.ContextType; 
import org.cemantika.metamodel.structure.ContextualElement; 
import org.cemantika.metamodel.structure.ContextualEntity;
/**
 * This class implements a ContextualEntity with annotations 
 * A Contextual Entity is a class used to build context sensitive behaviors.
 */
@ContextualEntity
public class Meeting {
 
	private String name; 
	@ContextualElement(type=ContextType.WHERE)
	private Location meetingLocation; 
	@ContextualElement(type=ContextType.WHEN)
	private Appointment meetingAppointment;

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
	 * Returns the meetingLocation.
	 *
	 * @return the meetingLocation. 
	 */
	public Location getMeetingLocation() {
		return meetingLocation;
	}
	
	/**
	 * Get the meetingLocation.
	 *
	 * @param meetingLocation value. 
	 */		
	public void setMeetingLocation(Location meetingLocation) {
		this.meetingLocation = meetingLocation;
	}	
	/**
	 * Returns the meetingAppointment.
	 *
	 * @return the meetingAppointment. 
	 */
	public Appointment getMeetingAppointment() {
		return meetingAppointment;
	}
	
	/**
	 * Get the meetingAppointment.
	 *
	 * @param meetingAppointment value. 
	 */		
	public void setMeetingAppointment(Appointment meetingAppointment) {
		this.meetingAppointment = meetingAppointment;
	}
	public boolean isOccurring(Appointment meetingAppointment){
		return true;
	}
 
}