package yycg.base.action;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import yycg.base.pojo.vo.SysuserCustom;
import yycg.base.pojo.vo.SysuserQueryVo;
import yycg.base.process.result.DataGridResultInfo;
import yycg.base.service.UserService;

@Controller
@RequestMapping("/user")
public class UserAction {
	
	@Autowired
	private UserService userService;
	
	//用户查询页面
	@RequestMapping("/queryuser")
	public String queryuser(Model model)throws Exception{
		//将页面所需要的数据取出，传到页面

		return "/base/user/queryuser";
	}
	
	//用户查询页面的结果集
	//最终DataGridResultInfo通过@ResponseBody将java对象转成json
	@RequestMapping("/queryuser_result")
	public @ResponseBody DataGridResultInfo queryuser_result(SysuserQueryVo sysuserQueryVo)throws Exception{
		
		
		//分页查询，向sysuserQueryVo中传入pageQuery
		List<SysuserCustom> list = userService.findSysuserList(sysuserQueryVo);
		System.out.println(list.size());
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充 total
		dataGridResultInfo.setTotal(list.size());
		System.out.println(list.size());
		//填充  rows
		dataGridResultInfo.setRows(list);
		
		return dataGridResultInfo;
	}
	


}
