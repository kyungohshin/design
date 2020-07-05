package memento;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 7. 5. initial creation
 */
public class Originator {
	private String date;
	private int level;
	private int power;
	private int money;

	public Originator(String date, int level, int power, int money) {
		this.date = date;
		this.level = level;
		this.power = power;
		this.money = money;
	}

	class Memento {

		private String date;
		private int level;
		private int power;
		private int money;

		public Memento(String date, int level, int power, int money) {
			this.date = date;
			this.level = level;
			this.power = power;
			this.money = money;
		}

		private String getDate() {
			return date;
		}

		private int getLevel() {
			return level;
		}

		private int getPower() {
			return power;
		}

		private int getMoney() {
			return money;
		}

	}

	public Memento CreateMemento() {
		return new Memento(date, level, power, money);
	}

	public void RestoreMemento(Memento memento) {
		this.date = memento.getDate();
		this.level = memento.getLevel();
		this.power = memento.getPower();
		this.money = memento.getMoney();
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * @param level the level to set
	 */
	public void setLevel(int level) {
		this.level = level;
	}

	/**
	 * @return the power
	 */
	public int getPower() {
		return power;
	}

	/**
	 * @param power the power to set
	 */
	public void setPower(int power) {
		this.power = power;
	}

	/**
	 * @return the money
	 */
	public int getMoney() {
		return money;
	}

	/**
	 * @param money the money to set
	 */
	public void setMoney(int money) {
		this.money = money;
	}

}
