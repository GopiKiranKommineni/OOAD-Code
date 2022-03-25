package factory;

public class EventFactory {

	public static Event getEvent(String Event) {
		if (Event == null) {
			return null;
		}
		if (Event.equalsIgnoreCase("TrekkingAndCamping ")) {
			return new TrekkingAndCamping();
		} else if (Event.equalsIgnoreCase("MidnightEvents ")) {
			return new MidnightEvents();
		} else if (Event.equalsIgnoreCase("Photography ")) {
			return new Photography();
		}
		return null;
	}

}
