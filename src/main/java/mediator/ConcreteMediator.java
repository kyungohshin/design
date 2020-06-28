package mediator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 6. 28. initial creation
 */
public class ConcreteMediator implements Mediator {

	private List<Colleague> list = new ArrayList<>();

	@Override
	public void addColleague(Colleague colleague) {
		list.add(colleague);
	}

	@Override
	public void selectVideo(String name) {

		// 하고싶은 로직..

		for (Colleague dto : list) {
			dto.receiveEvent(name);
		}
	}

}
