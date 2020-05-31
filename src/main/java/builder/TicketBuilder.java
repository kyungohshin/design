package builder;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 5. 31. initial creation
 */
public interface TicketBuilder {
	Ticket hotel(String hotel);

	Ticket restaurant(String restaurant);

	Ticket event(String event);

	Ticket park(String park);

	Ticket getResult();

	void create();
}
