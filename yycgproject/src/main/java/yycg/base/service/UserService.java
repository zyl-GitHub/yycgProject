package yycg.base.service;

import java.util.List;

import yycg.base.pojo.po.Sysuser;
import yycg.base.pojo.vo.SysuserCustom;
import yycg.base.pojo.vo.SysuserQueryVo;

public interface UserService
{
	//根据条件查询用户信息
	public List<SysuserCustom> findSysuserList(SysuserQueryVo sysuserQueryVo);
}
