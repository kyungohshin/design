package proxy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 6. 7. initial creation
 */
public class Client {

	public static void main(String[] args) {
		List<Image> images = new ArrayList<Image>();

		images.add(new ProxyImage("그림1.txt"));
		images.add(new ProxyImage("그림2.txt"));
		images.add(new ProxyImage("그림3.txt"));
		images.add(new ProxyImage("그림4.txt"));
		images.add(new ProxyImage("그림5.txt"));
		images.add(new ProxyImage("그림6.txt"));

		for (int i = 0; i < 4; i++) {
			images.get(i).draw();
		}

	}

}
