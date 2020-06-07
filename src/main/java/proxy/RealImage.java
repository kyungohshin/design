package proxy;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 6. 7. initial creation
 */
public class RealImage implements Image {
	String path;

	public RealImage(String path) {
		this.path = path;
	}

	@Override
	public void draw() {
		System.out.println("이미지 생성 : " + path);
	}

}
