package builder;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 5. 31. initial creation
 */
public class Ticket {
	private String hotel;
	private String restaurant;
	private String event;
	private String park;

	/**
	 * @return the hotel
	 */
	String getHotel() {
		return hotel;
	}

	/**
	 * @param hotel the hotel to set
	 */
	void setHotel(String hotel) {
		this.hotel = hotel;
	}

	/**
	 * @return the restaurant
	 */
	String getRestaurant() {
		return restaurant;
	}

	/**
	 * @param restaurant the restaurant to set
	 */
	void setRestaurant(String restaurant) {
		this.restaurant = restaurant;
	}

	/**
	 * @return the event
	 */
	String getEvent() {
		return event;
	}

	/**
	 * @param event the event to set
	 */
	void setEvent(String event) {
		this.event = event;
	}

	/**
	 * @return the park
	 */
	String getPark() {
		return park;
	}

	/**
	 * @param park the park to set
	 */
	void setPark(String park) {
		this.park = park;
	}

	public String getTicket() {
		return String.format("hotel: %s, restaurant: %s, event: %s, park: %s", hotel, restaurant, event, park);
	}
}
