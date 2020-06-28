package mediator;

import java.util.ArrayList;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 6. 28. initial creation
 */
public class ListUI implements Colleague {
	private Mediator mediator;

	@Override
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	private ArrayList<VideoInfo> list = new ArrayList<>();

	public void onSelectItem(int selectId) {
		VideoInfo info = list.get(selectId);
		mediator.selectVideo(info.getName());
	}

	@Override
	public void receiveEvent(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eventOccured(int id) {
		list.add(new VideoInfo(0, "영화1"));
		list.add(new VideoInfo(1, "영화2"));
		onSelectItem(id);

	}
}
