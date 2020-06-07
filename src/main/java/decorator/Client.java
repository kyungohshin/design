package decorator;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 6. 3. initial creation
 */
public class Client {

	public static void main(String[] args) {
		FileOut delegate = new FileOutImpl();
		FileOut fileOut = new EncryptionOut(new ZipOut(delegate));
		fileOut.write("[데이터]");
	}

}
