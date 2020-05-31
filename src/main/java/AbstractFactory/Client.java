package abstractFactory;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 5. 17. initial creation
 *
 *          추상 팩토리 패턴.
 *          서로 관련이 있는 객체들을 통째로 묶어서 팩토리 클래스로 만들고, 이들 팩토리를 조건에 따라 생성하도록 다시 팩토리를 만들어서 객체를 생성하는 패턴
 *
 *          추상 팩토리 패턴은 어떻게 보면, 팩토리 메서드 패턴을 좀 더 캡슐화한 방식이라고 볼 수 있습니다.
 *
 */
public class Client {

	public static void main(String args[]) {
		FactoryOfComputerFactory factoryOfComputerFactory = new FactoryOfComputerFactory();
		factoryOfComputerFactory.createComputer("LG");
	}
}
