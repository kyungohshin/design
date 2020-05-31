package builder;

import builder.ConcreteTicketBuilder;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 5. 31. initial creation
 */
public class Cilent {

	public static void main(String[] args) {
		TicketBuilder builder = new ConcreteTicketBuilder();
		Director director = new Director(builder);
		Ticket ticket = director.construct();

		System.out.println(ticket.getTicket());

//		Builder1 a = new Builder1();
//		Ticket t1 = new Ticket.Builder().event("50% discount").restaurant("ABC res").build();
//		System.out.println(t1.getTicket());
	}

}
