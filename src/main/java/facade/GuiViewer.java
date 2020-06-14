package facade;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 6. 13. initial creation
 */
public class GuiViewer {

	public void display() {
		String id = "R500";
		EmpDao empDao = new EmpDao();
		ResumeDao resumeDao = new ResumeDao();
		EvaluationDao evaluationDao = new EvaluationDao();

		Emp emp = empDao.select(id);
		Resume resume = resumeDao.select(id);
		Evaluation evaluation = evaluationDao.select(id);

		// ....
	}
}
