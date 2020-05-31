package builder_start;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 5. 31. initial creation
 */
public class Director {
	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	public Ticket construct() {
		builder.hotel("ABC Hotel");
		builder.event("non even");
		return builder.build();
	}

}
