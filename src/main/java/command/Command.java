package command;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 6. 21. initial creation
 */
public interface Command {
	public void execute();

	public void undo();
}
