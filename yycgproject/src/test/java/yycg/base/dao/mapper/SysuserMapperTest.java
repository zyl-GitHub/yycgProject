package yycg.base.dao.mapper;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import yycg.base.pojo.po.Sysuser;
import yycg.base.pojo.po.SysuserExample;
import junit.framework.TestCase;

public class SysuserMapperTest extends TestCase
{
	private SysuserMapper sysuserMapper;
	private ApplicationContext applicationContext;
	protected void setUp() throws Exception
	{
		applicationContext = new ClassPathXmlApplicationContext(new String[]{
				"spring/applicationContext.xml",
				"spring/applicationContext-base-dao.xml"
		});
		sysuserMapper = (SysuserMapper) applicationContext.getBean("sysuserMapper");
	}

	protected void tearDown() throws Exception
	{
		super.tearDown();
	}

	public void testDeleteByPrimaryKey()
	{
		fail("尚未实现");
	}

	public void testInsert()
	{
		fail("尚未实现");
	}

	public void testSelectByExample()
	{
		SysuserExample sysuserExample = new SysuserExample();
		SysuserExample.Criteria criteria = sysuserExample.createCriteria();
		criteria.andUsernameEqualTo("test009");
		List<Sysuser> sList = sysuserMapper.selectByExample(sysuserExample);
		System.out.println(sList.size());
	}
	
	public void testSelectByPrimaryKey()
	{
		Sysuser sysuser = sysuserMapper.selectByPrimaryKey("286");
		System.out.println(sysuser.getUsername());
	}

	public void testUpdateByPrimaryKeySelective()
	{
		fail("尚未实现");
	}

	public void testUpdateByPrimaryKey()
	{
		fail("尚未实现");
	}

}
