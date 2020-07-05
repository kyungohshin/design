package memento;

import memento.Originator.Memento;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 7. 5. initial creation
 */
public class Client {

	public static void main(String[] args) {
		CareTaker caretaker = new CareTaker();
		Originator originator = new Originator("20200701", 10, 34, 32000);

		Memento memento = originator.CreateMemento();
		caretaker.push(memento);

		originator.setDate("20200702");
		originator.setLevel(27);
		originator.setPower(58);
		originator.setMoney(88000);
		System.out.println(originator.getDate() + " " + originator.getLevel() + " " + originator.getPower() + " "
		        + originator.getMoney());

		memento = caretaker.pop();
		originator.RestoreMemento(caretaker.pop());

		System.out.println(originator.getDate() + " " + originator.getLevel() + " " + originator.getPower() + " "
		        + originator.getMoney());
	}
}
