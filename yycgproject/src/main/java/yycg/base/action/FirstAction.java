package yycg.base.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import yycg.base.pojo.po.Sysuser;
import yycg.base.service.UserService;

@Controller
public class FirstAction
{
	
	@RequestMapping("/first")
	public String first()
	{
		System.out.println(12312);
		return "/base/first";
	}
	@RequestMapping("/welcome")
	public String welcome()
	{
		return "/base/welcome";
	}
}
