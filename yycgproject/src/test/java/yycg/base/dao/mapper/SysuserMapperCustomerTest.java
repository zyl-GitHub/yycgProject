package yycg.base.dao.mapper;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import yycg.base.pojo.po.Sysuser;
import junit.framework.TestCase;

public class SysuserMapperCustomerTest extends TestCase
{
	private ApplicationContext applicationContext;

	@Override
	protected void setUp() throws Exception
	{
		applicationContext = new ClassPathXmlApplicationContext(new String[]{
				"spring/applicationContext.xml",
				"spring/applicationContext-base-dao.xml"
		});
	}

	@Override
	protected void tearDown() throws Exception
	{
		// TODO 自动生成的方法存根
		super.tearDown();
	}
	public void testFindSysuserById() throws Exception
	{
		SysuserCustomMapper sysuserCustomMapper = (SysuserCustomMapper) applicationContext
				.getBean("sysuserCustomMapper");
		Sysuser sysuser =  sysuserCustomMapper.findSysuserById("286");
		System.out.println(sysuser);
	}
}
