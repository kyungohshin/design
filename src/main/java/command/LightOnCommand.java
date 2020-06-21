package command;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 6. 21. initial creation
 */
public class LightOnCommand implements Command {

	Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
	}

	@Override
	public void undo() {
		light.off();
	}

}
