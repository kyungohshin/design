package decorator;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 6. 3. initial creation
 */
public class ZipOut extends Decorator {

	public ZipOut(FileOut delegate) {
		super(delegate);
	}

	@Override
	public void write(String data) {
		String zipedData = zip(data);
		super.doDelegate(zipedData);
	}

	private String zip(String data) {
		String string = "[압축화" + data + "]";
		return string;
	}
}
