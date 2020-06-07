package decorator;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 6. 3. initial creation
 */

public class EncryptionOut extends Decorator {
	public EncryptionOut(FileOut delegate) {
		super(delegate);
	}

	@Override
	public void write(String data) {
		String encryptedData = encrypt(data);
		super.doDelegate(encryptedData);
	}

	private String encrypt(String data) {
		String string = "[암호화" + data + "]";
		return string;
	}
}
