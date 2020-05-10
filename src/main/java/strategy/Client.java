package strategy;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 5. 10. initial creation
 *
 *          스트래티지 패턴이란
 *          행위를 클래스로 캡슐화해 동적으로 행위를 자유롭게 바꿀 수 있게 해주는 패턴
 *          같은 문제를 해결하는 여러 알고리즘이 클래스별로 캡슐화되어 있고 이들이 필요할 때 교체할 수 있도록 함으로써 동일한 문제를 다른 알고리즘으로 해결할 수
 *          있게하는 디자인 패턴
 *          즉, 전략을 쉽게 바꿀 수 있도록 해주는 디자인 패턴이다.
 *
 *
 *          Strategy
 *          인터페이스를 통해서 외부에서 동일한 방식으로 알고리즘을 호출하는 방법을 명시
 *
 *          ConcreteStrategy
 *          스트래티지 패턴에서 명시한 알고리즘을 실제로 구현한 클래스
 *
 *          Context
 *          스트래티지 패턴을 이용하는 역할을 수행한다.
 *          필요에 따라 동적으로 구체적인 전략을 바꿀 수 있도록 setter 메서드(‘집약 관계’)를 제공한다.
 *
 *          자신이 처한 상황에 따라 공격이나 행동하는 방식을 바꾸고 싶을 때 스트래티지 패턴은 매우 유용하다.
 *
 *          참고 : https://gmlwjd9405.github.io/2018/07/06/strategy-pattern.html
 */
public class Client {
	public static void main(String[] args) {
		Robot teakwonV = new TeakwonV("TaekwonV");
//		teakwonV.setAttackStrategy(new MissleStrategy());
//		teakwonV.setMoveStrategy(new flyStrategy());
		Robot atom = new Atom("Atom");
//		atom.setAttackStrategy(new MissleStrategy());
//		atom.setMoveStrategy(new flyStrategy());

		System.out.println("My name is " + teakwonV.getName());
		teakwonV.move();
		teakwonV.attack();

		System.out.println();
		System.out.println("My name is " + atom.getName());
		atom.move();
		atom.attack();
	}
}
