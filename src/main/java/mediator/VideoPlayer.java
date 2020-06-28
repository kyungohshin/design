package mediator;

import java.util.ArrayList;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 6. 28. initial creation
 */
public class VideoPlayer implements Colleague {
	private Mediator mediator;

	private ArrayList<VideoInfo> list = new ArrayList<>();

	@Override
	public void receiveEvent(String name) {
		System.out.println(name + "비디오플레이어");
	}

	@Override
	public void eventOccured(int id) {
		VideoInfo info = list.get(id);
		mediator.selectVideo(info.getName());
	}

	@Override
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

}
