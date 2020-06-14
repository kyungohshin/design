package facade;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 6. 14. initial creation
 */
public class EmpReportDaoFacade {
	EmpDao empDao;
	ResumeDao resumeDao;
	EvaluationDao evaluationDao;

	public EmpReportDaoFacade(EmpDao empDao, ResumeDao resumeDao, EvaluationDao evaluationDao) {
		this.empDao = empDao;
		this.resumeDao = resumeDao;
		this.evaluationDao = evaluationDao;
	}

	public EmpReport select(String id) {
		Emp emp = empDao.select(id);
		Resume resume = resumeDao.select(id);
		Evaluation evaluation = evaluationDao.select(id);

		EmpReport empReport = new EmpReport();
		empReport.emp = emp;
		empReport.resume = resume;
		empReport.evaluation = evaluation;

		return empReport;
	}
}
