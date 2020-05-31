package builder;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 5. 31. initial creation
 */
public class Director {
	private TicketBuilder builder;

	public Director(TicketBuilder builder) {
		this.builder = builder;
	}

	public Ticket construct() {
		builder.create();
		builder.park("ABC Park");
		builder.restaurant("ABC REST");
		builder.event("30% DISCOUNT");
		// this.builder.hotel("BB HOTEL");
		return builder.getResult();
	}

}
