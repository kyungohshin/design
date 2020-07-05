package interpreter;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 7. 5. initial creation
 */
public class AndExpression implements Expression {
	Expression expr1;
	Expression expr2;

	public AndExpression(Expression expr1, Expression expr2) {
		this.expr1 = expr1;
		this.expr2 = expr2;
	}

	@Override
	public boolean interpreter(String con) {
		return expr1.interpreter(con) && expr2.interpreter(con);
	}
}
