package command;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 6. 21. initial creation
 */
public class LightOffCommand implements Command {

	Light light;

	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
	}

	@Override
	public void undo() {
		light.on();
	}
}
