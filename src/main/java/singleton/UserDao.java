package singleton;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 5. 24. initial creation
 */
public class UserDao {
//	private static UserDao INSTANCE;
//
//	private UserDao() {
//
//	}
//
//	public static synchronized UserDao getInstatnce() {
//		if (INSTANCE == null) {
//			INSTANCE = new UserDao();
//		}
//		return INSTANCE;
//	};

//	private static UserDao INSTANCE;
//
//	private UserDao() {
//
//	}
//
//	public static UserDao getInstatnce() {
//		if (INSTANCE == null) {
//			synchronized (UserDao.class) {
//				if (INSTANCE == null) {
//					INSTANCE = new UserDao();
//				}
//			}
//		}
//		return INSTANCE;
//	};

	private UserDao() {

	}

	private static class Holder {
		private static final UserDao INSTANCE = new UserDao();
	}

	public static UserDao getInstatnce() {
		return Holder.INSTANCE;
	};

//	private static UserDao INSTANCE = new UserDao();
//
//	private UserDao() {
//
//	}
//
//	public static UserDao getInstatnce() {
//		return INSTANCE;
//	};

}
