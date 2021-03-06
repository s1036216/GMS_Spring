package com.gms.web.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth") /*witch case 구문이 내부적으로 가지고 있다 */
public class AuthController {
	/*log를 찍는것 이다 */
	private static final Logger logger = LoggerFactory.getLogger(AuthController.class);
	@RequestMapping ("/login_view")
	public String goLogin() {
		logger.info("AuthController!::::: goLogin {}","진입" );
	/*	model.addAttribute("test","test"); request.setAttribute("test","test");*/
		/*model.addAttribute(model);*/
		return "common/login";
	}
	@RequestMapping("/lgoin")
	public String login(Model model) {
		logger.info("AuthController!:::::login-- {}","진입" );
		model.addAttribute("input_id","hong");
		model.addAttribute("input_password","1");
		return "common/main";
	}
	@RequestMapping("/go_main")
	public String goMain(){
		logger.info("AuthController!:::::login-- {}","진입" );
		return "common/main";
	}

}
