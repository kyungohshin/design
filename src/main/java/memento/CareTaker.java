package memento;

import java.util.Stack;

import memento.Originator.Memento;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 7. 5. initial creation
 */
public class CareTaker {

	Stack<Memento> mementos = new Stack<>();

	public void push(Memento memento) {
		mementos.push(memento);
	}

	public Memento pop() {
		return mementos.pop();
	}
}
