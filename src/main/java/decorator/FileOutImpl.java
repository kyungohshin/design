package decorator;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 6. 3. initial creation
 */
public class FileOutImpl implements FileOut {

	@Override
	public void write(String data) {
		System.out.println(data);
	}

}
