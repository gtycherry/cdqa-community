package IntegrationTest;

import com.qtl.DAO.DBUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.List;

/**
 * Created by tlqiao on 2/19/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={
		"classpath:applicationContext.xml"
})
public class TestDB {
	@Autowired
	DBUtil dbUtil;
	@Test
	public void getDBUserDetail()
	{
	List list=	dbUtil.getUserDetails("qtl");
		int i=0;
		if (list.size()>0)
		{
			System.out.println("the user datails is :"+ list.get(i).toString());
			i++;
		}
	}
}
