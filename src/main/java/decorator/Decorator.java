package decorator;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 6. 3. initial creation
 */
public class Decorator implements FileOut {
	private FileOut delegate;

	public Decorator(FileOut delegate) {
		this.delegate = delegate;
	}

	protected void doDelegate(String data) {
		delegate.write(data);
	}

	@Override
	public void write(String data) {}
}
