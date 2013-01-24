package veristrat;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement(name="current_observation")
public class CurrentObservation {

  String farhTemp;

	DisplayLocation displayLocation; 
	
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlElement(name="temp_f")
	public String getFarhTemp() {
		return farhTemp;
	}

	public void setFarhTemp(String farhTemp) {
		this.farhTemp = farhTemp;
	}

	@XmlElement(name="display_location")
	public DisplayLocation getDisplayLocation() {
		return displayLocation;
	}

	public void setDisplayLocation(DisplayLocation displayLocation) {
		this.displayLocation = displayLocation;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
}
