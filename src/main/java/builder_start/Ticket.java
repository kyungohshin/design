package builder_start;

public class Ticket {
	private String hotel;
	private String restaurant;
	private String event;
	private String park;

	public static class TicketBuilder implements Builder<TicketBuilder> {
		private String hotel;
		private String restaurant;
		private String event;
		private String park;

		@Override
		public TicketBuilder hotel(String hotel) {
			this.hotel = hotel;
			return this;
		}

		@Override
		public TicketBuilder restaurant(String restaurant) {
			this.restaurant = restaurant;
			return this;
		}

		@Override
		public TicketBuilder event(String event) {
			this.event = event;
			return this;
		}

		@Override
		public TicketBuilder park(String park) {
			this.park = park;
			return this;
		}

		@Override
		public Ticket build() {
			return new Ticket(this);
		}

	}

	private Ticket(TicketBuilder builder) {
		hotel = builder.hotel;
		restaurant = builder.restaurant;
		event = builder.event;
		park = builder.park;
	}

	public String getTicket() {
		return String.format("hotel: %s, restaurant: %s, event: %s, park: %s", hotel, restaurant, event, park);
	}
}
