package design;

import java.sql.SQLException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import templateMethod.UserDao;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 5. 10. initial creation
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/applicationContext.xml")
public class templateTest {

	@Autowired
	private UserDao userdao;

	@Test
	public void delete() throws SQLException {
		userdao.delete();
		// userdao.insert();
		// userdao.execute();
	}
}
