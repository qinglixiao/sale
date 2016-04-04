package org.springframework.samples.mvc.lx;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(produces="charset=UTF-8")
public class S_Hello {
	@RequestMapping(value = "/lx")
	@ResponseBody
	public String name() {
		return "第一个后端接口成功调用";
	}
	
	@RequestMapping(value = "/second")
	@ResponseBody
	public String getSecond(){
		return "第二个也成功！";
	}
	
	@RequestMapping(value = "/p")
	@ResponseBody
	public String getParam(String name,int age){
		return name + age;
	}
}
