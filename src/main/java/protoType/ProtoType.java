package protoType;

import java.util.Date;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 5. 25. initial creation
 *          미리 만들어진 개체를 복사하여 개체를 생성하는 패턴.
 *          반적으로 객체를 새로 생성할 때는 new Object()와 같은 방법으로 생성을 합니다. 그러나 그렇게 생성할 경우 기존에 만들어진 것과 유사하다고 해도 결국
 *          모든 정보를 다시 세팅해주어야 합니다. 그러나, clone()을 이용할 경우에는 기존에 만들어진 것을 복사해서 바뀐 부분만 대체해 주면 인스턴스를 생성하기가
 *          쉽습니다
 */
public class ProtoType {

	/**
	 *
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Complex com = new Complex("매우 복잡한 정보");
		try {
			Complex cloned1 = (Complex) com.clone();
			cloned1.setDate(new Date(2008, 0, 1));

			Complex cloned2 = (Complex) com.clone();
			cloned2.setDate(new Date(2008, 2, 1));

			System.out.println(cloned1.getDate());
			System.out.println(cloned2.getDate());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
