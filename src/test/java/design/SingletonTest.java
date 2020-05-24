package design;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.sql.SQLException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import singleton.UserDao;

/**
 *
 *
 * @author USER
 * @history
 *          애플리케이션이 시작될 때 어떤 클래스가 최초 한번만 메모리를 할당하고(Static) 그 메모리에 인스턴스를 만들어 사용하는 디자인패턴.
 *
 *          생성자가 여러 차례 호출되더라도 실제로 생성되는 객체는 하나고 최초 생성 이후에 호출된 생성자는 최초에 생성한 객체를 반환한다. (자바에선 생성자를
 *          private로 선언해서 생성 불가하게 하고 getInstance()로 받아쓰기도 함)
 *
 *          => 싱글톤 패턴은 단 하나의 인스턴스를 생성해 사용하는 디자인 패턴이다.
 *
 *          장점 : new 인스턴스 사용으로인한 메모리 낭비 방지, 데이터 공유하기 쉬움
 *          단점 : 싱글톤 인스턴스가 너무 많은 일을 하거나 많은 데이터를 공유시킬 경우 다른 클래스의 인스턴스들 간에 결합도가 높아져 "개방-폐쇄 원칙" 을 위배하게
 *          된다. (=객체 지향 설계 원칙에 어긋남) 따라서 수정이 어려워지고 테스트하기 어려워진다.
 *
 *
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/applicationContext.xml")
public class SingletonTest {

	@Test
	public void SingletonTest1() throws SQLException {
		UserDao userDao1 = UserDao.getInstatnce();
		UserDao userDao2 = UserDao.getInstatnce();

		assertThat(userDao1, is(userDao2));
	}
}
