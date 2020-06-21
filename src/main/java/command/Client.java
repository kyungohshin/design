package command;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 6. 21. initial creation
 */
public class Client {

	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();

		Light light = new Light();
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		LightOffCommand lightOffCommand = new LightOffCommand(light);
		Stereo stereo = new Stereo();
		StereoOffCommand streroOffCommand = new StereoOffCommand(stereo);
		StereoOnCommand streroOnCommand = new StereoOnCommand(stereo);

		remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
		remoteControl.setCommand(1, streroOnCommand, streroOffCommand);

//		remoteControl.getString();
//		remoteControl.onButtonWasPushed(0);
//		remoteControl.offButtonWasPushed(0);
//		remoteControl.undoButtonWasPushed();
//
//		remoteControl.onButtonWasPushed(1);
//		remoteControl.offButtonWasPushed(1);
//		remoteControl.undoButtonWasPushed();

		Command[] macroOn = { lightOnCommand, streroOnCommand };
		Command[] macroOff = { lightOffCommand, streroOffCommand };

		MacroCommand commandMacroOn = new MacroCommand(macroOn);
		MacroCommand commandMacroOff = new MacroCommand(macroOff);

		remoteControl.setCommand(2, commandMacroOn, commandMacroOff);

		remoteControl.getString();
		remoteControl.onButtonWasPushed(2);
	}

}
