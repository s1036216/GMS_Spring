package com.gms.web.member;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gms.web.common.AuthController;

@Controller
@RequestMapping("/member")
public class MemberController {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	@RequestMapping("/member_add")
	public String memberAdd() {
		logger.info("MemberController!::::: memberAdd {}","진입" );
		
		return "member/member_add";
	}
	
	@RequestMapping("/member_list")
	public String memberList(){
		logger.info("MemberController!::::: memberList {}","진입" );
		return "member/member_list";
	}
	
	@RequestMapping("/member_detail")
	public String memberDetail() {
		logger.info("MemberController!::::: memberDetail {}","진입" );
		return "member/member_detail";
	}
	
	@RequestMapping("/member_update")
	public String memberUpdate() {
		logger.info("MemberController!::::: memberUpdate {}","진입" );
		return "member/member_update";
	}
}
