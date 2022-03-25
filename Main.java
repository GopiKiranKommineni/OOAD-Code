package factory;

public class Main {
	public static void main(String[] args) {

		// creating organizer and attendee
		Organizer organizer = (Organizer) UserFactory.getUser("ORGANIZER");
		Attendee attendee = (Attendee) UserFactory.getUser("ATTENDEE");

		// creating events

		TrekkingAndCamping tc = (TrekkingAndCamping) EventFactory.getEvent("TrekkingAndCamping");
		MidnightEvents md = (MidnightEvents) EventFactory.getEvent("MidnightEvents");
		Photography p = (Photography) EventFactory.getEvent("Photography");
	}
}
