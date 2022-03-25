package factory;

import java.util.Date;

public class Event {

	private int eventID;
	private String eventName;
	private String eventDescription;
	private String location;
	private String eventType;
	private int noOfSlots;
	private int attendes;

	public int getEventID() {
		return eventID;
	}

	public void setEventID(int eventID) {
		this.eventID = eventID;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getEventDescription() {
		return eventDescription;
	}

	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public int getNoOfSlots() {
		return noOfSlots;
	}

	public void setNoOfSlots(int noOfSlots) {
		this.noOfSlots = noOfSlots;
	}

	public int getAttendes() {
		return attendes;
	}

	public void setAttendes(int attendes) {
		this.attendes = attendes;
	}

	String getDetails() {
		return null;
	};

	Date getStartDate() {
		return null;
	};

	String getWhere() {
		return "";
	};

}
