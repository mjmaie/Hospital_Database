package JavaSrc.Data;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PatientTestInfo
{
	public final int id;
	//public final int testId;
	public String testperformed, testresults;
	
	private PatientTestInfo(int testId, int patientId)
	{
		id = testId;
	}

	
	PatientTestInfo(ResultSet r) throws SQLException
	{
		id = r.getInt(1);
		load(r);
		System.out.println(this);
	}
	
	private void load(ResultSet r) throws SQLException
	{
		throw new SQLException();
	}
}
