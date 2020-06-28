package mediator;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 6. 28. initial creation
 */
public class Client {
	public static void main(String[] args) {
		Mediator mediator = new ConcreteMediator();
		Colleague listUi = new ListUI();
		listUi.setMediator(mediator);
		Colleague titleUi = new TitleUI();
		titleUi.setMediator(mediator);
		Colleague videoPlayer = new VideoPlayer();
		videoPlayer.setMediator(mediator);
		Colleague mediaController = new MediaController();
		mediaController.setMediator(mediator);
		mediator.addColleague(listUi);
		mediator.addColleague(titleUi);
		mediator.addColleague(videoPlayer);
		mediator.addColleague(mediaController);

		listUi.eventOccured(0);
	}
}
