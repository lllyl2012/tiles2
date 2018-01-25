package cn.yl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	public TestController() {
		System.out.println("controller");
	}
	@RequestMapping("/bb.do")
	public String testView(Model map) { 
		System.out.println("controller");
//		map.addAttribute("item", "introduction");
		return "baseTemplate"; //这里的myView为layout.xml中配置的视图名称，根据返回值，去匹配对应的jsp页面
	}
	@RequestMapping("/cc.do")
	public String testView2(Model Map) {
		return "firstTemplate";
	}
	@RequestMapping("/aa.do")
	public String testaa() {
		return "aa";
	}
}
