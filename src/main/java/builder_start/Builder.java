package builder_start;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 5. 31. initial creation
 */
public interface Builder<T> {
	T hotel(String hotel);

	T restaurant(String restaurant);

	T event(String event);

	T park(String park);

	Ticket build();
}
