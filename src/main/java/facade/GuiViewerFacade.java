package facade;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 6. 14. initial creation
 */
public class GuiViewerFacade {
	public void display() {
		String id = "R500";
		EmpDao empDao = new EmpDao();
		ResumeDao resumeDao = new ResumeDao();
		EvaluationDao evaluationDao = new EvaluationDao();

		EmpReportDaoFacade empReportDaoFacade = new EmpReportDaoFacade(empDao, resumeDao, evaluationDao);

		EmpReport rep = empReportDaoFacade.select(id);

		// ....
	}
}
