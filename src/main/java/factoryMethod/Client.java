package factoryMethod;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 5. 17. initial creation
 *
 *          팩토리 메서드패턴.
 *          Factory method는 조건에 따른 객체 생성을 팩토리 클래스로 위임하여 팩토르 클래스에서 객체를 생성하는 패턴이다.
 *          즉, 객체를 생성함에 있어서 상위 클래스가 직접 new 방식으로 생성하지않고, 팩토리를 통해서 하위클래스에게 생성권한을 위임하는 패턴으로,
 *          하위 클래스에서 객체를 생성하게 됨으로써 상위클래스 코드에 구체 클래스를 감출수 있으며 조건이 변경될때도 상위클래스 변경이 일어나지 않게한다.
 *
 */
public class Client {

	public static void main(String args[]) {
		Creator creator = new LGCreator();
		creator.anOperation();
	}
}
