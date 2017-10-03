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
	@Autowired
	private UserService userService;
	@RequestMapping("/first")
	public String first(Model model)
	{
		Sysuser sysuser = userService.findSysuserById("286");
		model.addAttribute("sysuser", sysuser);
		return "/base/first";
	}
	@RequestMapping("/welcome")
	public String welcome()
	{
		return "/base/welcome";
	}
}
