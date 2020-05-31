package builder;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 5. 31. initial creation
 */
public class ConcreteTicketBuilder implements TicketBuilder {
	Ticket ticket;

	@Override
	public Ticket getResult() {
		return ticket;
	}

	@Override
	public void create() {
		ticket = new Ticket();
	}

	@Override
	public Ticket hotel(String hotel) {
		this.ticket.setHotel(hotel);
		return this.ticket;
	}

	@Override
	public Ticket restaurant(String restaurant) {
		this.ticket.setRestaurant(restaurant);
		return this.ticket;
	}

	@Override
	public Ticket event(String event) {
		this.ticket.setEvent(event);
		return this.ticket;
	}

	@Override
	public Ticket park(String park) {
		this.ticket.setPark(park);
		return this.ticket;
	}

}
