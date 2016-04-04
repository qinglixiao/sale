package org.springframework.samples.mvc.lx;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class S_Hello {
	@RequestMapping(value = "/lx")
	@ResponseBody
	public String name() {
		return "第一个后端接口成功调用";
	}
	
	@RequestMapping(value = "/seond")
	@ResponseBody
	public String getSecond(){
		return "second";
	}
}
