package templateMethod;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 5. 10. initial creation
 *
 *          템플릿 메소드 패턴
 *          상속을 통해 기능을 확장. 변하지않는 부분은 슈퍼클래스에두고 변하는부분은 추상메소드로 정의해둬서
 *          서브클래스에서 오버라이드하여 새롭게 정의해 사용하는 패턴.
 *
 *          클래스의 기능을 확장하고싶을때마다 상속을 통해 자유롭게 확장, 그 확장으로 인한 기존의 상위 DAO클래스의 변화가 필요하지않음.
 *          BUT, DAO로직마다 상속을 통해 새로운클래스를 만들어야함 / 확장구조가 이미 클래스를 설계하는 시점에서 고정되어버림.
 *          컴파일 시점에 이미 그 관계가 결정되어있어서 관계들에 관한 유연성이 떨어짐
 *
 *          참조 토비스프링
 */
public class UserDao {

	@Autowired
	DataSource dataSource;

	// protected abstract PreparedStatement makeStatement(Connection c) throws SQLException;

	public void delete() throws SQLException {
		Connection c = null;
		PreparedStatement ps = null;

		try {
			c = dataSource.getConnection();

			ps = c.prepareStatement("delete from users");
			// ps = makeStatement(c);

			ps.executeUpdate();
		} catch (SQLException e) {
			throw e;
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {}
			}
			if (c != null) {
				try {
					c.close();
				} catch (SQLException e) {}
			}
		}
	}

	public void insert() throws SQLException {
		Connection c = null;
		PreparedStatement ps = null;

		try {
			c = dataSource.getConnection();

			ps = c.prepareStatement(
			        "insert into users(id,name,password) values(?,?,?)");
			ps.setString(1, "1");
			ps.setString(2, "shin");
			ps.setString(3, "pass");

			ps.executeUpdate();
		} catch (SQLException e) {
			throw e;
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {}
			}
			if (c != null) {
				try {
					c.close();
				} catch (SQLException e) {}
			}
		}
	}
}
