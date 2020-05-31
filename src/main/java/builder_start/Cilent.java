package builder_start;

import builder_start.Ticket.TicketBuilder;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 5. 31. initial creation
 */
public class Cilent {

	public static void main(String[] args) {
		Builder builder = new TicketBuilder();
		Director director = new Director(builder);
		Ticket ticket = director.construct();

		System.out.println(ticket.getTicket());

//		Ticket ticket = new TicketBuilder().event("50% discount").restaurant("ABC res").build();
//		System.out.println(ticket.getTicket());
	}

}
