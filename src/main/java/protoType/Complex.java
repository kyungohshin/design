package protoType;

import java.util.Date;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 5. 25. initial creation
 */
public class Complex implements Cloneable {
	private String complexInfo;

	private Date date;

	public Complex(String complexInfo) {
		this.complexInfo = complexInfo;
	}

	public String getComplexInfo() {
		return complexInfo;
	}

	public void setDate(Date date) {
		this.date = new Date(date.getTime());
	}

	public Date getDate() {
		return date;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Complex tmp = (Complex) super.clone();
		return tmp;
	}
}
