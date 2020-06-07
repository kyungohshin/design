package proxy;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 6. 7. initial creation
 */
public class ProxyImage implements Image {
	private String path;
	private RealImage image;

	public ProxyImage(String path) {
		this.path = path;
	}

	@Override
	public void draw() {
		if (image == null) {
			image = new RealImage(path);
		}
		image.draw();
	}

}
