package yycg.base.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import yycg.base.dao.mapper.SysuserMapper;
import yycg.base.pojo.po.Sysuser;
import yycg.base.service.UserService;

public class UserServiceImpl implements UserService
{
	@Autowired
	private SysuserMapper sysuserMapper;
	@Override
	public Sysuser findSysuserById(String id)
	{
		// TODO 自动生成的方法存根
		return sysuserMapper.selectByPrimaryKey(id);
	}

}
